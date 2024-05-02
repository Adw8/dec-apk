package defpackage;

import java.util.Iterator;
import java.util.Set;

/* renamed from: oYW  reason: default package */
/* loaded from: classes.dex */
public abstract class oYW extends dNA implements Set {
    public transient aOn R;

    @Override // defpackage.dNA
    public aOn H() {
        aOn aon = this.R;
        if (aon != null) {
            return aon;
        }
        aOn t = t();
        this.R = t;
        return t;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Object, java.util.Set
    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public aOn t() {
        Object[] array = toArray();
        m3m m3m = aOn.R;
        int length = array.length;
        return length == 0 ? mzR.R : new mzR(length, array);
    }
}
