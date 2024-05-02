package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: doZ  reason: default package */
/* loaded from: classes.dex */
public final class doZ extends LinearLayout {
    public final TC R;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f2867R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f2868R;

    /* renamed from: R  reason: collision with other field name */
    public View.OnLongClickListener f2869R;

    /* renamed from: R  reason: collision with other field name */
    public final CheckableImageButton f2870R;

    /* renamed from: R  reason: collision with other field name */
    public final TextInputLayout f2871R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f2872R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2873R;

    public doZ(TextInputLayout textInputLayout, CV cv) {
        super(textInputLayout.getContext());
        CharSequence V;
        this.f2871R = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f2870R = checkableImageButton;
        CharSequence charSequence = null;
        TC tc = new TC(getContext(), null);
        this.R = tc;
        if (lTs.N(getContext())) {
            j2q.L((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f2869R;
        checkableImageButton.setOnClickListener(null);
        mxC.h(checkableImageButton, onLongClickListener);
        this.f2869R = null;
        checkableImageButton.setOnLongClickListener(null);
        mxC.h(checkableImageButton, null);
        if (cv.o(62)) {
            this.f2867R = lTs.Z(getContext(), cv, 62);
        }
        if (cv.o(63)) {
            this.f2868R = vd.u(cv.P(63, -1), null);
        }
        if (cv.o(61)) {
            R(cv.U(61));
            if (cv.o(60) && checkableImageButton.getContentDescription() != (V = cv.V(60))) {
                checkableImageButton.setContentDescription(V);
            }
            checkableImageButton.setCheckable(cv.Z(59, true));
        }
        tc.setVisibility(8);
        tc.setId(R.id.textinput_prefix_text);
        tc.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = of5.f6887R;
        d6y.O(tc, 1);
        tc.setTextAppearance(cv.y(55, 0));
        if (cv.o(56)) {
            tc.setTextColor(cv.m(56));
        }
        CharSequence V2 = cv.V(54);
        this.f2872R = !TextUtils.isEmpty(V2) ? V2 : charSequence;
        tc.setText(V2);
        e();
        addView(checkableImageButton);
        addView(tc);
    }

    public final void R(Drawable drawable) {
        this.f2870R.setImageDrawable(drawable);
        if (drawable != null) {
            mxC.Z(this.f2871R, this.f2870R, this.f2867R, this.f2868R);
            v(true);
            mxC.Y(this.f2871R, this.f2870R, this.f2867R);
            return;
        }
        v(false);
        CheckableImageButton checkableImageButton = this.f2870R;
        View.OnLongClickListener onLongClickListener = this.f2869R;
        checkableImageButton.setOnClickListener(null);
        mxC.h(checkableImageButton, onLongClickListener);
        this.f2869R = null;
        CheckableImageButton checkableImageButton2 = this.f2870R;
        checkableImageButton2.setOnLongClickListener(null);
        mxC.h(checkableImageButton2, null);
        if (this.f2870R.getContentDescription() != null) {
            this.f2870R.setContentDescription(null);
        }
    }

    public final void c() {
        EditText editText = this.f2871R.f2356R;
        if (editText != null) {
            int i = 0;
            if (!(this.f2870R.getVisibility() == 0)) {
                WeakHashMap weakHashMap = of5.f6887R;
                i = eHQ.O(editText);
            }
            TC tc = this.R;
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = of5.f6887R;
            eHQ.H(tc, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i = 8;
        int i2 = (this.f2872R == null || this.f2873R) ? 8 : 0;
        if (this.f2870R.getVisibility() == 0 || i2 == 0) {
            i = 0;
        }
        setVisibility(i);
        this.R.setVisibility(i2);
        this.f2871R.P();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        c();
    }

    public final void v(boolean z) {
        int i = 0;
        if ((this.f2870R.getVisibility() == 0) != z) {
            CheckableImageButton checkableImageButton = this.f2870R;
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            c();
            e();
        }
    }
}
