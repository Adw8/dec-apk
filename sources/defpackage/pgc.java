package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pgc  reason: default package */
/* loaded from: classes.dex */
public final class pgc {
    public final List R = new ArrayList();

    public final void R(int i) {
        if (!this.R.isEmpty()) {
            if (((Number) this.R.get(0)).intValue() != i) {
                List list = this.R;
                if (((Number) list.get(list.size() - 1)).intValue() == i) {
                    return;
                }
            } else {
                return;
            }
        }
        int size = this.R.size();
        this.R.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) this.R.get(i2)).intValue();
            if (i <= intValue) {
                break;
            }
            this.R.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.R.set(size, Integer.valueOf(i));
    }

    public final int v() {
        int intValue;
        if (this.R.size() > 0) {
            int intValue2 = ((Number) this.R.get(0)).intValue();
            while ((!this.R.isEmpty()) && ((Number) this.R.get(0)).intValue() == intValue2) {
                List list = this.R;
                list.set(0, dF.zw(list));
                List list2 = this.R;
                list2.remove(list2.size() - 1);
                int size = this.R.size();
                int size2 = this.R.size() >>> 1;
                int i = 0;
                while (i < size2) {
                    int intValue3 = ((Number) this.R.get(i)).intValue();
                    int i2 = (i + 1) * 2;
                    int i3 = i2 - 1;
                    int intValue4 = ((Number) this.R.get(i3)).intValue();
                    if (i2 >= size || (intValue = ((Number) this.R.get(i2)).intValue()) <= intValue4) {
                        if (intValue4 > intValue3) {
                            this.R.set(i, Integer.valueOf(intValue4));
                            this.R.set(i3, Integer.valueOf(intValue3));
                            i = i3;
                        }
                    } else if (intValue > intValue3) {
                        this.R.set(i, Integer.valueOf(intValue));
                        this.R.set(i2, Integer.valueOf(intValue3));
                        i = i2;
                    }
                }
            }
            return intValue2;
        }
        vC.e("Set is empty".toString());
        throw null;
    }
}
