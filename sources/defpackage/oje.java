package defpackage;

import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: oje  reason: default package */
/* loaded from: classes.dex */
public final class oje implements nxu {
    public static final oje R = new oje();

    @Override // defpackage.nxu
    public final k49 R(Type type, Set set, k_Z k_z) {
        if (!n3x.v(type, Object.class)) {
            return null;
        }
        Type O = mzK.O(mzK.R(Object.class));
        int indexOf = k_z.f5357R.indexOf(this);
        if (indexOf != -1) {
            int size = k_z.f5357R.size();
            for (int i = indexOf + 1; i < size; i++) {
                k49 R2 = ((nxu) k_z.f5357R.get(i)).R(O, set, k_z);
                if (R2 != null) {
                    return new nvD(R2);
                }
            }
            StringBuilder U = opT.U("No next JsonAdapter for ");
            U.append(mzK.m(O, set));
            throw new IllegalArgumentException(U.toString());
        }
        throw new IllegalArgumentException("Unable to skip past unknown factory " + this);
    }
}
