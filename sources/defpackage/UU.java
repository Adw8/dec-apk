package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: UU  reason: default package */
/* loaded from: classes.dex */
public final class UU extends kst {

    /* renamed from: R  reason: collision with other field name */
    public AnimatorSet f559R;

    /* renamed from: R  reason: collision with other field name */
    public ValueAnimator f560R;

    /* renamed from: R  reason: collision with other field name */
    public EditText f561R;
    public final D8 R = new D8(0, this);

    /* renamed from: R  reason: collision with other field name */
    public final gC f562R = new gC(this, 0);

    public UU(iOp iop) {
        super(iop);
    }

    @Override // defpackage.kst
    public final void C(EditText editText) {
        this.f561R = editText;
        ((kst) this).f5454R.setEndIconVisible(V());
    }

    @Override // defpackage.kst
    public final View.OnFocusChangeListener L() {
        return this.f562R;
    }

    @Override // defpackage.kst
    public final View.OnClickListener O() {
        return this.R;
    }

    @Override // defpackage.kst
    public final void R() {
        if (((kst) this).f5455R.f4572R == null) {
            i(V());
        }
    }

    public final boolean V() {
        EditText editText = this.f561R;
        return editText != null && (editText.hasFocus() || ((kst) this).f5453R.hasFocus()) && this.f561R.getText().length() > 0;
    }

    @Override // defpackage.kst
    public final View.OnFocusChangeListener X() {
        return this.f562R;
    }

    @Override // defpackage.kst
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.kst
    public final int e() {
        return R.drawable.mtrl_ic_cancel;
    }

    public final void i(boolean z) {
        boolean z2 = ((kst) this).f5455R.c() == z;
        if (z && !this.f559R.isRunning()) {
            this.f560R.cancel();
            this.f559R.start();
            if (z2) {
                this.f559R.end();
            }
        } else if (!z) {
            this.f559R.cancel();
            this.f560R.start();
            if (z2) {
                this.f560R.end();
            }
        }
    }

    @Override // defpackage.kst
    public final void j(boolean z) {
        if (((kst) this).f5455R.f4572R != null) {
            i(z);
        }
    }

    @Override // defpackage.kst
    public final void t() {
        EditText editText = this.f561R;
        if (editText != null) {
            editText.post(new mBn(9, this));
        }
    }

    @Override // defpackage.kst
    public final void y() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(My.f299R);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new P8(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = My.f298R;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new P8(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f559R = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f559R.addListener(new Z3(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new P8(this, 1));
        this.f560R = ofFloat3;
        ofFloat3.addListener(new Z3(this, 1));
    }
}
