package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import dev.kdrag0n.virtcontainer.R;
import java.util.WeakHashMap;

/* renamed from: heD  reason: default package */
/* loaded from: classes.dex */
public final class heD extends kst {

    /* renamed from: R  reason: collision with other field name */
    public ValueAnimator f4330R;

    /* renamed from: R  reason: collision with other field name */
    public AccessibilityManager f4331R;

    /* renamed from: R  reason: collision with other field name */
    public AutoCompleteTextView f4332R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4335R;
    public boolean c;
    public ValueAnimator v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f4336v;

    /* renamed from: R  reason: collision with other field name */
    public final D8 f4329R = new D8(1, this);

    /* renamed from: R  reason: collision with other field name */
    public final gC f4333R = new gC(this, 1);

    /* renamed from: R  reason: collision with other field name */
    public final nxC f4334R = new nxC(1, this);
    public long R = Long.MAX_VALUE;

    public heD(iOp iop) {
        super(iop);
    }

    @Override // defpackage.kst
    public final void C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f4332R = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: aZ9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    heD hed = heD.this;
                    hed.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - hed.R;
                        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                            hed.f4336v = false;
                        }
                        hed.V();
                        hed.f4336v = true;
                        hed.R = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f4332R.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: oSL
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    heD hed = heD.this;
                    hed.f4336v = true;
                    hed.R = System.currentTimeMillis();
                    hed.i(false);
                }
            });
            boolean z = false;
            this.f4332R.setThreshold(0);
            ((kst) this).f5454R.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z = true;
            }
            if (!z && this.f4331R.isTouchExplorationEnabled()) {
                CheckableImageButton checkableImageButton = ((kst) this).f5453R;
                WeakHashMap weakHashMap = of5.f6887R;
                mHC.t(checkableImageButton, 2);
            }
            ((kst) this).f5454R.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // defpackage.kst
    public final void N(jG jGVar) {
        if (!(this.f4332R.getInputType() != 0)) {
            jGVar.L(Spinner.class.getName());
        }
        if (jGVar.f4895R.isShowingHintText()) {
            jGVar.f4895R.setHintText(null);
        }
    }

    @Override // defpackage.kst
    public final View.OnClickListener O() {
        return this.f4329R;
    }

    @Override // defpackage.kst
    public final void P(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f4331R.isEnabled()) {
            if (!(this.f4332R.getInputType() != 0)) {
                V();
                this.f4336v = true;
                this.R = System.currentTimeMillis();
            }
        }
    }

    @Override // defpackage.kst
    public final void R() {
        if (this.f4331R.isTouchExplorationEnabled()) {
            if ((this.f4332R.getInputType() != 0) && !((kst) this).f5453R.hasFocus()) {
                this.f4332R.dismissDropDown();
            }
        }
        this.f4332R.post(new mBn(10, this));
    }

    @Override // defpackage.kst
    public final boolean U() {
        return this.c;
    }

    public final void V() {
        if (this.f4332R != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.R;
            if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                this.f4336v = false;
            }
            if (!this.f4336v) {
                i(!this.c);
                if (this.c) {
                    this.f4332R.requestFocus();
                    this.f4332R.showDropDown();
                    return;
                }
                this.f4332R.dismissDropDown();
                return;
            }
            this.f4336v = false;
        }
    }

    @Override // defpackage.kst
    public final View.OnFocusChangeListener X() {
        return this.f4333R;
    }

    @Override // defpackage.kst
    public final P_ Z() {
        return this.f4334R;
    }

    @Override // defpackage.kst
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.kst
    public final int e() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    public final void i(boolean z) {
        if (this.c != z) {
            this.c = z;
            this.v.cancel();
            this.f4330R.start();
        }
    }

    @Override // defpackage.kst
    public final boolean m(int i) {
        return i != 0;
    }

    @Override // defpackage.kst
    public final void t() {
        AutoCompleteTextView autoCompleteTextView = this.f4332R;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f4332R.setOnDismissListener(null);
        }
    }

    @Override // defpackage.kst
    public final boolean x() {
        return this.f4335R;
    }

    @Override // defpackage.kst
    public final void y() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = My.f298R;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new P8(this, 2));
        this.v = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new P8(this, 2));
        this.f4330R = ofFloat2;
        ofFloat2.addListener(new XM(7, this));
        this.f4331R = (AccessibilityManager) ((kst) this).R.getSystemService("accessibility");
    }
}
