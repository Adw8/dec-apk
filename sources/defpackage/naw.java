package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: naw  reason: default package */
/* loaded from: classes.dex */
public final class naw extends kvj {
    public static final gUZ R = new gUZ(0);

    /* renamed from: v  reason: collision with other field name */
    public final boolean f6475v;
    public final HashMap v = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap e = new HashMap();

    /* renamed from: c  reason: collision with other field name */
    public boolean f6473c = false;

    /* renamed from: e  reason: collision with other field name */
    public boolean f6474e = false;

    public naw(boolean z) {
        this.f6475v = z;
    }

    public final void O(pm2 pm2) {
        if (!this.f6474e) {
            if ((this.v.remove(pm2.f7238R) != null) && hAW.W(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + pm2);
            }
        } else if (hAW.W(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public final void X(String str) {
        naw naw = (naw) this.c.get(str);
        if (naw != null) {
            naw.v();
            this.c.remove(str);
        }
        ns8 ns8 = (ns8) this.e.get(str);
        if (ns8 != null) {
            ns8.R();
            this.e.remove(str);
        }
    }

    public final void e(pm2 pm2) {
        if (hAW.W(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + pm2);
        }
        X(pm2.f7238R);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || naw.class != obj.getClass()) {
            return false;
        }
        naw naw = (naw) obj;
        return this.v.equals(naw.v) && this.c.equals(naw.c) && this.e.equals(naw.e);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.e.hashCode() + ((hashCode + (this.v.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.v.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.kvj
    public final void v() {
        if (hAW.W(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f6473c = true;
    }
}
