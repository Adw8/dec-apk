package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: m9V  reason: default package */
/* loaded from: classes.dex */
public abstract class m9V {
    public d72 R;

    /* renamed from: R  reason: collision with other field name */
    public gvZ f5950R;

    /* renamed from: R  reason: collision with other field name */
    public Object f5951R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f5952R = new ArrayList();

    public m9V(d72 d72) {
        this.R = d72;
    }

    public abstract boolean R(l3L l3l);

    public final void c(Collection collection) {
        this.f5952R.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            l3L l3l = (l3L) it.next();
            if (R(l3l)) {
                this.f5952R.add(l3l.f5562R);
            }
        }
        if (this.f5952R.isEmpty()) {
            d72 d72 = this.R;
            synchronized (d72.f2493R) {
                if (d72.f2494R.remove(this) && d72.f2494R.isEmpty()) {
                    d72.e();
                }
            }
        } else {
            d72 d722 = this.R;
            synchronized (d722.f2493R) {
                try {
                    if (d722.f2494R.add(this)) {
                        if (d722.f2494R.size() == 1) {
                            d722.v = d722.R();
                            kfk.U().x(d72.R, String.format("%s: initial state = %s", d722.getClass().getSimpleName(), d722.v), new Throwable[0]);
                            d722.c();
                        }
                        Object obj = d722.v;
                        this.f5951R = obj;
                        e(this.f5950R, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e(this.f5950R, this.f5951R);
    }

    public final void e(gvZ gvz, Object obj) {
        if (!this.f5952R.isEmpty() && gvz != null) {
            if (obj == null || v(obj)) {
                ArrayList arrayList = this.f5952R;
                idW idw = (idW) gvz;
                synchronized (idw.f4674R) {
                    kOC koc = idw.f4675R;
                    if (koc != null) {
                        koc.c(arrayList);
                    }
                }
                return;
            }
            ArrayList arrayList2 = this.f5952R;
            idW idw2 = (idW) gvz;
            synchronized (idw2.f4674R) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (idw2.R(str)) {
                        kfk.U().x(idW.R, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                kOC koc2 = idw2.f4675R;
                if (koc2 != null) {
                    koc2.R(arrayList3);
                }
            }
        }
    }

    public abstract boolean v(Object obj);
}
