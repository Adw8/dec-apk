package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: btA  reason: default package */
/* loaded from: classes.dex */
public final class btA {
    public final ArrayList R;

    public /* synthetic */ btA(int i) {
        this.R = new ArrayList(i);
    }

    public final Object[] O(Object[] objArr) {
        return this.R.toArray(objArr);
    }

    public final void R(Object obj) {
        this.R.add(obj);
    }

    public final int X() {
        return this.R.size();
    }

    public final Object c() {
        ArrayList arrayList = this.R;
        return arrayList.remove(arrayList.size() - 1);
    }

    public final void e(Object obj) {
        this.R.add(obj);
    }

    public final void v(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList arrayList = this.R;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.R, objArr);
                }
            } else if (obj instanceof Collection) {
                this.R.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object obj2 : (Iterable) obj) {
                    this.R.add(obj2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.R.add(it.next());
                }
            } else {
                StringBuilder U = opT.U("Don't know how to spread ");
                U.append(obj.getClass());
                throw new UnsupportedOperationException(U.toString());
            }
        }
    }

    public /* synthetic */ btA() {
        this.R = new ArrayList();
    }
}
