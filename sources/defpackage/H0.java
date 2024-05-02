package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.chip.Chip;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;

/* renamed from: H0  reason: default package */
/* loaded from: classes.dex */
public final class H0 extends dMS {
    public final /* synthetic */ Chip R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public H0(Chip chip, Chip chip2) {
        super(chip2);
        this.R = chip;
    }

    @Override // defpackage.dMS
    public final int N(float f, float f2) {
        Chip chip = this.R;
        Rect rect = Chip.v;
        return (!chip.e() || !this.R.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
    }

    @Override // defpackage.dMS
    public final void P(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        Chip chip = this.R;
        Rect rect = Chip.v;
        if (chip.e()) {
            Chip chip2 = this.R;
            OW ow = chip2.f2307R;
            if (ow != null && ow.f359X) {
                z = true;
            }
            if (z && chip2.f2312R != null) {
                arrayList.add(1);
            }
        }
    }

    @Override // defpackage.dMS
    public final void V(int i, jG jGVar) {
        String str = "";
        if (i == 1) {
            CharSequence closeIconContentDescription = this.R.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                jGVar.f4895R.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = this.R.getText();
                Context context = this.R.getContext();
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    str = text;
                }
                objArr[0] = str;
                jGVar.f4895R.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            jGVar.f4895R.setBoundsInParent(this.R.getCloseIconTouchBoundsInt());
            jGVar.v(Ex.R);
            jGVar.f4895R.setEnabled(this.R.isEnabled());
            return;
        }
        jGVar.f4895R.setContentDescription(str);
        jGVar.f4895R.setBoundsInParent(Chip.v);
    }

    @Override // defpackage.dMS
    public final void i(jG jGVar) {
        OW ow = this.R.f2307R;
        jGVar.f4895R.setCheckable(ow != null && ow.f339O);
        jGVar.f4895R.setClickable(this.R.isClickable());
        jGVar.L(this.R.getAccessibilityClassName());
        jGVar.H(this.R.getText());
    }

    @Override // defpackage.dMS
    public final void o(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.R;
            chip.f2318e = z;
            chip.refreshDrawableState();
        }
    }

    @Override // defpackage.dMS
    public final boolean t(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            if (i == 0) {
                return this.R.performClick();
            }
            if (i == 1) {
                Chip chip = this.R;
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f2312R;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.O) {
                    chip.f2306R.J(1, 1);
                }
            }
        }
        return z;
    }
}
