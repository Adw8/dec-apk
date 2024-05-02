package defpackage;

import android.view.MotionEvent;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.List;

/* renamed from: pdm  reason: default package */
/* loaded from: classes.dex */
public final class pdm {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final aAx f7139R;

    /* renamed from: R  reason: collision with other field name */
    public final List f7140R;

    public pdm(List list, aAx aax) {
        this.f7140R = list;
        this.f7139R = aax;
        MotionEvent R = R();
        int i = 0;
        if (R != null) {
            R.getButtonState();
        }
        MotionEvent R2 = R();
        if (R2 != null) {
            R2.getMetaState();
        }
        MotionEvent R3 = R();
        i = 3;
        if (R3 == null) {
            int size = list.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                phU phu = (phU) list.get(i);
                if (n1P.H(phu)) {
                    i = 2;
                    break;
                } else if (n1P.m(phu)) {
                    i = 1;
                    break;
                } else {
                    i++;
                }
            }
        } else {
            int actionMasked = R3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case VmNativeCallback.$stable:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        }
        this.R = i;
    }

    public final MotionEvent R() {
        aAx aax = this.f7139R;
        if (aax != null) {
            return ((pcs) aax.v).R;
        }
        return null;
    }
}
