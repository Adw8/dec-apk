package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: bJ3  reason: default package */
/* loaded from: classes.dex */
public final class bJ3 extends kvj implements jTo {
    public static final gUZ R = new gUZ(2);

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f1587R = new LinkedHashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f1587R.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.kvj
    public final void v() {
        for (ns8 ns8 : this.f1587R.values()) {
            ns8.R();
        }
        this.f1587R.clear();
    }
}
