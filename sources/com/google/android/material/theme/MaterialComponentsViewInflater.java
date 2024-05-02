package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends Qj {
    @Override // defpackage.Qj
    public final yp R(Context context, AttributeSet attributeSet) {
        return new h6c(context, attributeSet);
    }

    @Override // defpackage.Qj
    public final TC X(Context context, AttributeSet attributeSet) {
        return new jDM(context, attributeSet);
    }

    @Override // defpackage.Qj
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new ggH(context, attributeSet);
    }

    @Override // defpackage.Qj
    public final ri e(Context context, AttributeSet attributeSet) {
        return new ao7(context, attributeSet);
    }

    @Override // defpackage.Qj
    public final GV v(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }
}
