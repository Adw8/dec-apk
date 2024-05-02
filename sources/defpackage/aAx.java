package defpackage;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;

/* renamed from: aAx  reason: default package */
/* loaded from: classes.dex */
public final class aAx {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f774R;
    public Object v;

    public /* synthetic */ aAx() {
        this.R = new Object();
    }

    public /* synthetic */ aAx(LinkedHashMap linkedHashMap, pcs pcs) {
        this.R = linkedHashMap;
        this.v = pcs;
    }

    public final boolean R(long j) {
        Object obj;
        List list = ((pcs) this.v).f7127R;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (k8q.R(((cWa) obj).f2114R, j)) {
                break;
            }
            i++;
        }
        cWa cwa = (cWa) obj;
        if (cwa != null) {
            return cwa.f2117v;
        }
        return false;
    }

    public final void c(b1t b1t) {
        drd drd;
        synchronized (this.R) {
            if (((Queue) this.v) != null && !this.f774R) {
                this.f774R = true;
                while (true) {
                    synchronized (this.R) {
                        drd = (drd) ((Queue) this.v).poll();
                        if (drd == null) {
                            this.f774R = false;
                            return;
                        }
                    }
                    ((kVh) drd).R(b1t);
                }
            }
        }
    }

    public final void v(kVh kvh) {
        synchronized (this.R) {
            if (((Queue) this.v) == null) {
                this.v = new ArrayDeque();
            }
            ((Queue) this.v).add(kvh);
        }
    }
}
