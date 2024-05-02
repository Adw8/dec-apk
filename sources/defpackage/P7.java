package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: P7  reason: default package */
/* loaded from: classes.dex */
public abstract class P7 extends gvP {
    public static final ArrayList B(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List E(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new x7(objArr, false)) : Collections.singletonList(objArr[0]) : fcD.R;
    }

    public static void G(Object[] objArr, lmI lmi) {
        Arrays.fill(objArr, 0, objArr.length, lmi);
    }

    public static final byte[] M(byte[] bArr, heu heu) {
        if (heu.isEmpty()) {
            return new byte[0];
        }
        int intValue = Integer.valueOf(heu.e).intValue();
        int intValue2 = Integer.valueOf(heu.X).intValue() + 1;
        gvP.j(intValue2, bArr.length);
        return Arrays.copyOfRange(bArr, intValue, intValue2);
    }

    public static void T(int[] iArr, int[] iArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, 0, i - 0);
    }

    public static final float[] k(float[] fArr, int i, int i2) {
        gvP.j(i2, fArr.length);
        return Arrays.copyOfRange(fArr, i, i2);
    }

    public static final int l(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (n3x.v(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void p(File file) {
        fAG fag = new fAG(new kSQ(file));
        boolean z = true;
        while (true) {
            while (fag.hasNext()) {
                File file2 = (File) fag.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return;
        }
    }

    public static void r(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void s(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }
}
