package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;

/* renamed from: bfz  reason: default package */
/* loaded from: classes.dex */
public abstract class bfz {
    public static final Class[] R = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean R(Object obj) {
        if (obj instanceof i4H) {
            i4H i4h = (i4H) obj;
            dqr dqr = i4h.R;
            if (!(dqr == d6b.R || dqr == bHa.R || dqr == bYG.R)) {
                return false;
            }
            Object value = i4h.getValue();
            if (value == null) {
                return true;
            }
            return R(value);
        } else if ((obj instanceof aAC) && (obj instanceof Serializable)) {
            return false;
        } else {
            Class[] clsArr = R;
            for (int i = 0; i < 7; i++) {
                if (clsArr[i].isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }
}
