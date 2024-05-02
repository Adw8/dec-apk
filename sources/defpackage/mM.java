package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: mM  reason: default package */
/* loaded from: classes.dex */
public final class mM {
    public final TextView R;

    /* renamed from: R  reason: collision with other field name */
    public final h89 f6008R;

    public mM(TextView textView) {
        this.R = textView;
        this.f6008R = new h89(textView);
    }

    public final InputFilter[] R(InputFilter[] inputFilterArr) {
        return ((dq) this.f6008R.R).i(inputFilterArr);
    }

    public final void c(boolean z) {
        ((dq) this.f6008R.R).I(z);
    }

    public final void e(boolean z) {
        ((dq) this.f6008R.R).u(z);
    }

    /* JADX INFO: finally extract failed */
    public final void v(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.R.getContext().obtainStyledAttributes(attributeSet, iTI.m, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
