package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* renamed from: zt  reason: default package */
/* loaded from: classes.dex */
public final class zt extends n1P {
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;

    public /* synthetic */ zt(int i, Object obj) {
        this.O = i;
        this.R = obj;
    }

    @Override // defpackage.n1P
    public final void V(Typeface typeface, boolean z) {
        switch (this.O) {
            case 0:
                Chip chip = (Chip) this.R;
                OW ow = chip.f2307R;
                chip.setText(ow.f380x ? ow.f352R : chip.getText());
                ((Chip) this.R).requestLayout();
                ((Chip) this.R).invalidate();
                return;
            default:
                if (!z) {
                    ovn ovn = (ovn) this.R;
                    ovn.f7028R = true;
                    joe joe = (joe) ovn.f7026R.get();
                    if (joe != null) {
                        joe.R();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.n1P
    public final void t(int i) {
        switch (this.O) {
            case 0:
                return;
            default:
                ovn ovn = (ovn) this.R;
                ovn.f7028R = true;
                joe joe = (joe) ovn.f7026R.get();
                if (joe != null) {
                    joe.R();
                    return;
                }
                return;
        }
    }
}
