package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: bhK  reason: default package */
/* loaded from: classes.dex */
public final class bhK {
    public IK R;

    /* renamed from: R  reason: collision with other field name */
    public Bundle f1768R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1770R;
    public boolean v;

    /* renamed from: R  reason: collision with other field name */
    public final cWy f1769R = new cWy();
    public boolean c = true;

    public final Bundle R(String str) {
        if (this.v) {
            Bundle bundle = this.f1768R;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f1768R;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f1768R;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f1768R = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final void c(String str, kod kod) {
        Object obj;
        cWy cwy = this.f1769R;
        lVU R = cwy.R(str);
        boolean z = true;
        if (R != null) {
            obj = R.v;
        } else {
            lVU lvu = new lVU(str, kod);
            cwy.e++;
            lVU lvu2 = cwy.v;
            if (lvu2 == null) {
                cwy.f2123R = lvu;
                cwy.v = lvu;
            } else {
                lvu2.f5763R = lvu;
                lvu.f5764v = lvu2;
                cwy.v = lvu;
            }
            obj = null;
        }
        if (((kod) obj) != null) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void e() {
        if (this.c) {
            IK ik = this.R;
            if (ik == null) {
                ik = new IK(this);
            }
            this.R = ik;
            try {
                hEm.class.getDeclaredConstructor(new Class[0]);
                IK ik2 = this.R;
                if (ik2 != null) {
                    ((Set) ik2.f183R).add(hEm.class.getName());
                }
            } catch (NoSuchMethodException e) {
                StringBuilder U = opT.U("Class ");
                U.append(hEm.class.getSimpleName());
                U.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(U.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }

    public final kod v() {
        Map.Entry entry;
        kod kod;
        Iterator it = this.f1769R.iterator();
        do {
            m9g m9g = (m9g) it;
            if (!m9g.hasNext()) {
                return null;
            }
            entry = (Map.Entry) m9g.next();
            kod = (kod) entry.getValue();
        } while (!n3x.v((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return kod;
    }
}
