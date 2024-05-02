package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* renamed from: jFk  reason: default package */
/* loaded from: classes.dex */
public abstract class jFk {
    public ebT R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4894R;

    public void L(Bundle bundle) {
    }

    public void O(j5B j5b) {
        e9E e9e = j5b.f4822R;
        if (!(e9e instanceof e9E)) {
            e9e = null;
        }
        if (e9e != null) {
            c(e9e, null, cU5.x(g5M.e));
            v().v(j5b);
        }
    }

    public abstract e9E R();

    public void X(ebT ebt) {
        this.R = ebt;
        this.f4894R = true;
    }

    public Bundle Z() {
        return null;
    }

    public e9E c(e9E e9e, Bundle bundle, ixU ixu) {
        return e9e;
    }

    public void e(List list, ixU ixu) {
        bQO bqo = new bQO(new g_R(iOY.a(dF.a(list), new ofd(this, ixu, null, 17)), false, g5M.J));
        while (bqo.hasNext()) {
            v().X((j5B) bqo.next());
        }
    }

    public void m(j5B j5b, boolean z) {
        List list = (List) v().R.getValue();
        if (list.contains(j5b)) {
            ListIterator listIterator = list.listIterator(list.size());
            j5B j5b2 = null;
            while (x()) {
                j5b2 = (j5B) listIterator.previous();
                if (n3x.v(j5b2, j5b)) {
                    break;
                }
            }
            if (j5b2 != null) {
                v().c(j5b2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + j5b + " which does not exist in back stack " + list).toString());
    }

    public final ebT v() {
        ebT ebt = this.R;
        if (ebt != null) {
            return ebt;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public boolean x() {
        return true;
    }
}
