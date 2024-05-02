package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: imt  reason: default package */
/* loaded from: classes.dex */
public abstract class imt {
    public Object R;

    public /* synthetic */ imt(Object obj) {
        this.R = obj;
    }

    public abstract void O(qN qNVar);

    public abstract csA R(qN qNVar);

    public abstract csA X(b0 b0Var);

    public final boolean c(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        lFL lfl = (lFL) this.R;
        if (lfl == null) {
            return v();
        }
        int e = lfl.e(charSequence, i);
        if (e == 0) {
            return true;
        }
        if (e != 1) {
            return v();
        }
        return false;
    }

    public Map e() {
        return Collections.emptyMap();
    }

    public abstract boolean v();
}
