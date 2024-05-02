package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: oA2  reason: default package */
/* loaded from: classes.dex */
public final class oA2 extends kst {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final D8 f6696R = new D8(2, this);

    /* renamed from: R  reason: collision with other field name */
    public EditText f6697R;

    public oA2(iOp iop, int i) {
        super(iop);
        this.R = R.drawable.design_password_eye;
        if (i != 0) {
            this.R = i;
        }
    }

    @Override // defpackage.kst
    public final void C(EditText editText) {
        this.f6697R = editText;
        g();
    }

    @Override // defpackage.kst
    public final boolean H() {
        return true;
    }

    @Override // defpackage.kst
    public final View.OnClickListener O() {
        return this.f6696R;
    }

    @Override // defpackage.kst
    public final boolean U() {
        EditText editText = this.f6697R;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.kst
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.kst
    public final int e() {
        return this.R;
    }

    @Override // defpackage.kst
    public final void t() {
        EditText editText = this.f6697R;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // defpackage.kst
    public final void v() {
        g();
    }

    @Override // defpackage.kst
    public final void y() {
        EditText editText = this.f6697R;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            this.f6697R.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
