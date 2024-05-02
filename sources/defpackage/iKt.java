package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: iKt  reason: default package */
/* loaded from: classes.dex */
public final class iKt implements Comparator {
    public static final iKt R = new iKt();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        pi1 pi1 = (pi1) obj;
        pi1 pi12 = (pi1) obj2;
        if (pi1 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (pi12 != null) {
            int i = 0;
            if (!msU.q(pi1) || !msU.q(pi12)) {
                return 0;
            }
            poS pos = pi1.f7195R;
            fue fue = null;
            fue fue2 = pos != null ? pos.f7272R : null;
            if (fue2 != null) {
                poS pos2 = pi12.f7195R;
                if (pos2 != null) {
                    fue = pos2.f7272R;
                }
                if (fue == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                } else if (n3x.v(fue2, fue)) {
                    return 0;
                } else {
                    Object[] objArr = new fue[16];
                    int i2 = 0;
                    while (fue2 != null) {
                        int i3 = i2 + 1;
                        if (objArr.length < i3) {
                            objArr = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
                        }
                        if (i2 != 0) {
                            System.arraycopy(objArr, 0, objArr, 0 + 1, i2 + 0);
                        }
                        objArr[0] = fue2;
                        i2++;
                        fue2 = fue2.N();
                    }
                    Object[] objArr2 = new fue[16];
                    int i4 = 0;
                    while (fue != null) {
                        int i5 = i4 + 1;
                        if (objArr2.length < i5) {
                            objArr2 = Arrays.copyOf(objArr2, Math.max(i5, objArr2.length * 2));
                        }
                        if (i4 != 0) {
                            System.arraycopy(objArr2, 0, objArr2, 0 + 1, i4 + 0);
                        }
                        objArr2[0] = fue;
                        i4++;
                        fue = fue.N();
                    }
                    int min = Math.min(i2 - 1, i4 - 1);
                    if (min >= 0) {
                        while (n3x.v(objArr[i], objArr2[i])) {
                            if (i != min) {
                                i++;
                            }
                        }
                        return n3x.O(((fue) objArr[i]).L, ((fue) objArr2[i]).L);
                    }
                    throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
