package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: oNy  reason: default package */
/* loaded from: classes.dex */
public final class oNy {
    public View R;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f6812R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f6811R = new ArrayList();

    public oNy(View view) {
        this.R = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oNy)) {
            return false;
        }
        oNy ony = (oNy) obj;
        return this.R == ony.R && this.f6812R.equals(ony.f6812R);
    }

    public final int hashCode() {
        return this.f6812R.hashCode() + (this.R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("TransitionValues@");
        U.append(Integer.toHexString(hashCode()));
        U.append(":\n");
        StringBuilder t = jQ.t(U.toString(), "    view = ");
        t.append(this.R);
        t.append("\n");
        String H = opT.H(t.toString(), "    values:");
        for (String str : this.f6812R.keySet()) {
            H = H + "    " + str + ": " + this.f6812R.get(str) + "\n";
        }
        return H;
    }
}
