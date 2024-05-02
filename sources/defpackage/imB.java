package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: imB  reason: default package */
/* loaded from: classes.dex */
public final class imB {
    public static final imB R;

    /* renamed from: R  reason: collision with other field name */
    public final Map f4720R;

    static {
        h89 h89 = new h89(27);
        HashMap hashMap = (HashMap) h89.R;
        if (hashMap != null) {
            imB imb = new imB(Collections.unmodifiableMap(hashMap));
            h89.R = null;
            R = imb;
            return;
        }
        throw new IllegalStateException("cannot call build() twice");
    }

    public imB(Map map) {
        this.f4720R = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof imB)) {
            return false;
        }
        return this.f4720R.equals(((imB) obj).f4720R);
    }

    public final int hashCode() {
        return this.f4720R.hashCode();
    }

    public final String toString() {
        return this.f4720R.toString();
    }
}
