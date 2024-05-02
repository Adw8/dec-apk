package defpackage;

import java.util.List;

/* renamed from: aB_  reason: default package */
/* loaded from: classes.dex */
public final class aB_ {
    public final oey R;

    public aB_(oey oey) {
        this.R = oey;
    }

    public final int R() {
        return this.R.O();
    }

    public final Integer v(int i) {
        Object obj;
        List L = this.R.L().L();
        int size = L.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = L.get(i2);
            if (((iFC) obj).v == i) {
                break;
            }
            i2++;
        }
        iFC ifc = (iFC) obj;
        if (ifc != null) {
            return Integer.valueOf(ifc.R);
        }
        return null;
    }
}
