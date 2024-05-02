package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: hnT  reason: default package */
/* loaded from: classes.dex */
public final class hnT extends dq {
    public final TextView R;

    /* renamed from: R  reason: collision with other field name */
    public final e54 f4381R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4382R = true;

    public hnT(TextView textView) {
        super((Object) null);
        this.R = textView;
        this.f4381R = new e54(textView);
    }

    @Override // defpackage.dq
    public final void I(boolean z) {
        if (z) {
            this.R.setTransformationMethod(n(this.R.getTransformationMethod()));
        }
    }

    @Override // defpackage.dq
    public final boolean J() {
        return this.f4382R;
    }

    @Override // defpackage.dq
    public final InputFilter[] i(InputFilter[] inputFilterArr) {
        if (!this.f4382R) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof e54) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        for (InputFilter inputFilter2 : inputFilterArr) {
            if (inputFilter2 == this.f4381R) {
                return inputFilterArr;
            }
        }
        InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
        System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
        inputFilterArr3[length2] = this.f4381R;
        return inputFilterArr3;
    }

    @Override // defpackage.dq
    public final TransformationMethod n(TransformationMethod transformationMethod) {
        return this.f4382R ? (!(transformationMethod instanceof hHA) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new hHA(transformationMethod) : transformationMethod : transformationMethod instanceof hHA ? ((hHA) transformationMethod).R : transformationMethod;
    }

    @Override // defpackage.dq
    public final void u(boolean z) {
        this.f4382R = z;
        this.R.setTransformationMethod(n(this.R.getTransformationMethod()));
        this.R.setFilters(i(this.R.getFilters()));
    }
}
