package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fi4  reason: default package */
/* loaded from: classes.dex */
public final class fi4 extends hwQ {
    public static final Class R = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    public static List e(int i, long j, Object obj) {
        fZs fzs;
        List list = (List) hU3.P(j, obj);
        if (list.isEmpty()) {
            List fzs2 = list instanceof c1n ? new fZs(i) : (!(list instanceof o43) || !(list instanceof aFq)) ? new ArrayList(i) : ((aFq) list).e(i);
            hU3.Y(j, obj, fzs2);
            return fzs2;
        }
        if (R.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            hU3.Y(j, obj, arrayList);
            fzs = arrayList;
        } else if (list instanceof efZ) {
            fZs fzs3 = new fZs(list.size() + i);
            fzs3.addAll((efZ) list);
            hU3.Y(j, obj, fzs3);
            fzs = fzs3;
        } else if (!(list instanceof o43) || !(list instanceof aFq)) {
            return list;
        } else {
            aFq afq = (aFq) list;
            if (((vB) afq).R) {
                return list;
            }
            aFq e = afq.e(list.size() + i);
            hU3.Y(j, obj, e);
            return e;
        }
        return fzs;
    }

    @Override // defpackage.hwQ
    public final void R(long j, Object obj) {
        Object obj2;
        List list = (List) hU3.P(j, obj);
        if (list instanceof c1n) {
            obj2 = ((c1n) list).N();
        } else if (!R.isAssignableFrom(list.getClass())) {
            if (!(list instanceof o43) || !(list instanceof aFq)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                vB vBVar = (vB) ((aFq) list);
                if (vBVar.R) {
                    vBVar.R = false;
                    return;
                }
                return;
            }
        } else {
            return;
        }
        hU3.Y(j, obj, obj2);
    }

    @Override // defpackage.hwQ
    public final List c(long j, Object obj) {
        return e(10, j, obj);
    }

    @Override // defpackage.hwQ
    public final void v(long j, Object obj, Object obj2) {
        List list = (List) hU3.P(j, obj2);
        List e = e(list.size(), j, obj);
        int size = e.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            e.addAll(list);
        }
        if (size > 0) {
            list = e;
        }
        hU3.Y(j, obj, list);
    }
}
