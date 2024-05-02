package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* renamed from: iOp  reason: default package */
/* loaded from: classes.dex */
public final class iOp extends LinearLayout {
    public static final /* synthetic */ int X = 0;
    public P_ R;

    /* renamed from: R  reason: collision with other field name */
    public final TC f4561R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f4562R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f4563R;

    /* renamed from: R  reason: collision with other field name */
    public View.OnLongClickListener f4564R;

    /* renamed from: R  reason: collision with other field name */
    public EditText f4566R;

    /* renamed from: R  reason: collision with other field name */
    public final FrameLayout f4567R;

    /* renamed from: R  reason: collision with other field name */
    public final car f4568R;

    /* renamed from: R  reason: collision with other field name */
    public final CheckableImageButton f4569R;

    /* renamed from: R  reason: collision with other field name */
    public final TextInputLayout f4570R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f4572R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4574R;
    public ColorStateList v;

    /* renamed from: v  reason: collision with other field name */
    public PorterDuff.Mode f4575v;

    /* renamed from: v  reason: collision with other field name */
    public View.OnLongClickListener f4576v;

    /* renamed from: v  reason: collision with other field name */
    public final CheckableImageButton f4577v;
    public int e = 0;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f4573R = new LinkedHashSet();

    /* renamed from: R  reason: collision with other field name */
    public final hHZ f4571R = new hHZ(this);

    /* renamed from: R  reason: collision with other field name */
    public final AccessibilityManager f4565R = (AccessibilityManager) getContext().getSystemService("accessibility");

    public iOp(TextInputLayout textInputLayout, CV cv) {
        super(textInputLayout.getContext());
        CharSequence V;
        iOh ioh = new iOh(this);
        this.f4570R = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f4567R = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton R = R(this, from, R.id.text_input_error_icon);
        this.f4569R = R;
        CheckableImageButton R2 = R(frameLayout, from, R.id.text_input_end_icon);
        this.f4577v = R2;
        this.f4568R = new car(this, cv);
        CharSequence charSequence = null;
        TC tc = new TC(getContext(), null);
        this.f4561R = tc;
        if (cv.o(33)) {
            this.f4562R = lTs.Z(getContext(), cv, 33);
        }
        if (cv.o(34)) {
            this.f4563R = vd.u(cv.P(34, -1), null);
        }
        if (cv.o(32)) {
            Z(cv.U(32));
        }
        R.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = of5.f6887R;
        mHC.t(R, 2);
        R.setClickable(false);
        R.setPressable(false);
        R.setFocusable(false);
        if (!cv.o(48)) {
            if (cv.o(28)) {
                this.v = lTs.Z(getContext(), cv, 28);
            }
            if (cv.o(29)) {
                this.f4575v = vd.u(cv.P(29, -1), null);
            }
        }
        if (cv.o(27)) {
            O(cv.P(27, 0));
            if (cv.o(25) && R2.getContentDescription() != (V = cv.V(25))) {
                R2.setContentDescription(V);
            }
            R2.setCheckable(cv.Z(24, true));
        } else if (cv.o(48)) {
            if (cv.o(49)) {
                this.v = lTs.Z(getContext(), cv, 49);
            }
            if (cv.o(50)) {
                this.f4575v = vd.u(cv.P(50, -1), null);
            }
            O(cv.Z(48, false) ? 1 : 0);
            CharSequence V2 = cv.V(46);
            if (R2.getContentDescription() != V2) {
                R2.setContentDescription(V2);
            }
        }
        tc.setVisibility(8);
        tc.setId(R.id.textinput_suffix_text);
        tc.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        d6y.O(tc, 1);
        tc.setTextAppearance(cv.y(65, 0));
        if (cv.o(66)) {
            tc.setTextColor(cv.m(66));
        }
        CharSequence V3 = cv.V(64);
        this.f4572R = !TextUtils.isEmpty(V3) ? V3 : charSequence;
        tc.setText(V3);
        C();
        frameLayout.addView(R2);
        addView(tc);
        addView(frameLayout);
        addView(R);
        textInputLayout.f2364R.add(ioh);
        if (textInputLayout.f2356R != null) {
            ioh.R(textInputLayout);
        }
        addOnAttachStateChangeListener(new V1(5, this));
    }

    public final void C() {
        int visibility = this.f4561R.getVisibility();
        boolean z = false;
        int i = (this.f4572R == null || this.f4574R) ? 8 : 0;
        if (visibility != i) {
            kst v = v();
            if (i == 0) {
                z = true;
            }
            v.j(z);
        }
        x();
        this.f4561R.setVisibility(i);
        this.f4570R.P();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H() {
        /*
            r4 = this;
            com.google.android.material.internal.CheckableImageButton r0 = r4.f4569R
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            com.google.android.material.textfield.TextInputLayout r0 = r4.f4570R
            nje r3 = r0.f2365R
            boolean r3 = r3.f6528R
            if (r3 == 0) goto L_0x001a
            boolean r0 = r0.U()
            if (r0 == 0) goto L_0x001a
            r0 = r1
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            com.google.android.material.internal.CheckableImageButton r3 = r4.f4569R
            if (r0 == 0) goto L_0x0021
            r0 = r2
            goto L_0x0023
        L_0x0021:
            r0 = 8
        L_0x0023:
            r3.setVisibility(r0)
            r4.x()
            r4.U()
            int r0 = r4.e
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            if (r1 != 0) goto L_0x0039
            com.google.android.material.textfield.TextInputLayout r4 = r4.f4570R
            r4.P()
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iOp.H():void");
    }

    public final void L(boolean z) {
        if (c() != z) {
            this.f4577v.setVisibility(z ? 0 : 8);
            x();
            U();
            this.f4570R.P();
        }
    }

    public final void O(int i) {
        AccessibilityManager accessibilityManager;
        if (this.e != i) {
            kst v = v();
            P_ p_ = this.R;
            if (!(p_ == null || (accessibilityManager = this.f4565R) == null)) {
                Rw.v(accessibilityManager, p_);
            }
            CharSequence charSequence = null;
            this.R = null;
            v.t();
            this.e = i;
            Iterator it = this.f4573R.iterator();
            while (it.hasNext()) {
                ((bb3) it.next()).R();
            }
            L(i != 0);
            kst v2 = v();
            int i2 = this.f4568R.R;
            if (i2 == 0) {
                i2 = v2.e();
            }
            Drawable p = i2 != 0 ? aH9.p(getContext(), i2) : null;
            this.f4577v.setImageDrawable(p);
            if (p != null) {
                mxC.Z(this.f4570R, this.f4577v, this.v, this.f4575v);
                mxC.Y(this.f4570R, this.f4577v, this.v);
            }
            int c = v2.c();
            if (c != 0) {
                charSequence = getResources().getText(c);
            }
            if (this.f4577v.getContentDescription() != charSequence) {
                this.f4577v.setContentDescription(charSequence);
            }
            this.f4577v.setCheckable(v2.H());
            if (v2.m(this.f4570R.getBoxBackgroundMode())) {
                v2.y();
                P_ Z = v2.Z();
                this.R = Z;
                if (!(Z == null || this.f4565R == null)) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    if (d6y.v(this)) {
                        Rw.R(this.f4565R, this.R);
                    }
                }
                View.OnClickListener O = v2.O();
                CheckableImageButton checkableImageButton = this.f4577v;
                View.OnLongClickListener onLongClickListener = this.f4576v;
                checkableImageButton.setOnClickListener(O);
                mxC.h(checkableImageButton, onLongClickListener);
                EditText editText = this.f4566R;
                if (editText != null) {
                    v2.C(editText);
                    m(v2);
                }
                mxC.Z(this.f4570R, this.f4577v, this.v, this.f4575v);
                X(true);
                return;
            }
            StringBuilder U = opT.U("The current box background mode ");
            U.append(this.f4570R.getBoxBackgroundMode());
            U.append(" is not supported by the end icon mode ");
            U.append(i);
            throw new IllegalStateException(U.toString());
        }
    }

    public final CheckableImageButton R(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (lTs.N(getContext())) {
            j2q.Z((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final void U() {
        int i;
        if (this.f4570R.f2356R != null) {
            if (c() || e()) {
                i = 0;
            } else {
                EditText editText = this.f4570R.f2356R;
                WeakHashMap weakHashMap = of5.f6887R;
                i = eHQ.X(editText);
            }
            TC tc = this.f4561R;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f4570R.f2356R.getPaddingTop();
            int paddingBottom = this.f4570R.f2356R.getPaddingBottom();
            WeakHashMap weakHashMap2 = of5.f6887R;
            eHQ.H(tc, dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    public final void X(boolean z) {
        boolean isActivated;
        boolean isChecked;
        kst v = v();
        boolean z2 = true;
        if (!v.H() || (isChecked = this.f4577v.isChecked()) == v.U()) {
            z2 = false;
        } else {
            this.f4577v.setChecked(!isChecked);
            z2 = true;
        }
        if ((v instanceof heD) && (isActivated = this.f4577v.isActivated()) != v.x()) {
            this.f4577v.setActivated(!isActivated);
        }
        if (z || z2) {
            mxC.Y(this.f4570R, this.f4577v, this.v);
        }
    }

    public final void Z(Drawable drawable) {
        this.f4569R.setImageDrawable(drawable);
        H();
        mxC.Z(this.f4570R, this.f4569R, this.f4562R, this.f4563R);
    }

    public final boolean c() {
        return this.f4567R.getVisibility() == 0 && this.f4577v.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f4569R.getVisibility() == 0;
    }

    public final void m(kst kst) {
        if (this.f4566R != null) {
            if (kst.X() != null) {
                this.f4566R.setOnFocusChangeListener(kst.X());
            }
            if (kst.L() != null) {
                this.f4577v.setOnFocusChangeListener(kst.L());
            }
        }
    }

    public final kst v() {
        car car = this.f4568R;
        int i = this.e;
        kst kst = (kst) ((SparseArray) car.f2152R).get(i);
        if (kst == null) {
            if (i == -1) {
                kst = new jvD((iOp) car.f2153v, 0);
            } else if (i == 0) {
                kst = new jvD((iOp) car.f2153v, 1);
            } else if (i == 1) {
                kst = new oA2((iOp) car.f2153v, car.v);
            } else if (i == 2) {
                kst = new UU((iOp) car.f2153v);
            } else if (i == 3) {
                kst = new heD((iOp) car.f2153v);
            } else {
                throw new IllegalArgumentException(opT.Z("Invalid end icon mode: ", i));
            }
            ((SparseArray) car.f2152R).append(i, kst);
        }
        return kst;
    }

    public final void x() {
        int i = 8;
        this.f4567R.setVisibility((this.f4577v.getVisibility() != 0 || e()) ? 8 : 0);
        if (c() || e() || !((this.f4572R == null || this.f4574R) ? true : false)) {
            i = 0;
        }
        setVisibility(i);
    }
}
