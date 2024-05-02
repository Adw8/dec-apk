package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.material.slider.Slider;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pV  reason: default package */
/* loaded from: classes.dex */
public final class pV extends dMS {
    public final oN R;
    public final Rect X = new Rect();

    public pV(Slider slider) {
        super(slider);
        this.R = slider;
    }

    @Override // defpackage.dMS
    public final int N(float f, float f2) {
        for (int i = 0; i < this.R.getValues().size(); i++) {
            this.R.V(i, this.X);
            if (this.X.contains((int) f, (int) f2)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.dMS
    public final void P(ArrayList arrayList) {
        for (int i = 0; i < this.R.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.dMS
    public final void V(int i, jG jGVar) {
        jGVar.v(Ex.C);
        List<Float> values = this.R.getValues();
        float floatValue = values.get(i).floatValue();
        float valueFrom = this.R.getValueFrom();
        float valueTo = this.R.getValueTo();
        if (this.R.isEnabled()) {
            if (floatValue > valueFrom) {
                jGVar.R(8192);
            }
            if (floatValue < valueTo) {
                jGVar.R(4096);
            }
        }
        jGVar.f4895R.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new h89(12, AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue)).R);
        jGVar.L(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (this.R.getContentDescription() != null) {
            sb.append(this.R.getContentDescription());
            sb.append(",");
        }
        if (values.size() > 1) {
            sb.append(i == this.R.getValues().size() + -1 ? this.R.getContext().getString(R.string.material_slider_range_end) : i == 0 ? this.R.getContext().getString(R.string.material_slider_range_start) : "");
            sb.append(this.R.O(floatValue));
        }
        jGVar.f4895R.setContentDescription(sb.toString());
        this.R.V(i, this.X);
        jGVar.f4895R.setBoundsInParent(this.X);
    }

    @Override // defpackage.dMS
    public final boolean t(int i, int i2, Bundle bundle) {
        if (!this.R.isEnabled()) {
            return false;
        }
        if (i2 == 4096 || i2 == 8192) {
            oN oNVar = this.R;
            float f = oNVar.e;
            if (f == 0.0f) {
                f = 1.0f;
            }
            float f2 = (oNVar.c - oNVar.v) / f;
            float f3 = (float) 20;
            if (f2 > f3) {
                f *= (float) Math.round(f2 / f3);
            }
            if (i2 == 8192) {
                f = -f;
            }
            if (this.R.H()) {
                f = -f;
            }
            float floatValue = this.R.getValues().get(i).floatValue() + f;
            float valueFrom = this.R.getValueFrom();
            float valueTo = this.R.getValueTo();
            if (floatValue < valueFrom) {
                floatValue = valueFrom;
            } else if (floatValue > valueTo) {
                floatValue = valueTo;
            }
            if (!this.R.t(i, floatValue)) {
                return false;
            }
            this.R.o();
            this.R.postInvalidate();
            j(i);
            return true;
        }
        if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
            if (this.R.t(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                this.R.o();
                this.R.postInvalidate();
                j(i);
                return true;
            }
        }
        return false;
    }
}
