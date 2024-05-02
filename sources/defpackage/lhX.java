package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: lhX  reason: default package */
/* loaded from: classes.dex */
public class lhX extends AbstractSet {
    public final /* synthetic */ AbstractMap R;
    public final /* synthetic */ int e;

    public /* synthetic */ lhX(AbstractMap abstractMap, int i) {
        this.e = i;
        this.R = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((fGq) this.R).e((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.e) {
            case 0:
                ((aDS) this.R).clear();
                return;
            case 1:
                ((aDS) this.R).clear();
                return;
            default:
                ((fGq) this.R).v();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return (obj instanceof Map.Entry) && ((aDS) this.R).v((Map.Entry) obj) != null;
            case 1:
                return ((aDS) this.R).containsKey(obj);
            default:
                Map.Entry entry = (Map.Entry) obj;
                Object c = ((fGq) this.R).c(entry.getKey());
                Object value = entry.getValue();
                if (c != value) {
                    return c != null && c.equals(value);
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator iterator() {
        switch (this.e) {
            case 0:
                return new bSW(this);
            case 1:
                return new bSW(this, 0);
            default:
                return new lkQ((fGq) this.R);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        hGV v;
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry) || (v = ((aDS) this.R).v((Map.Entry) obj)) == null) {
                    return false;
                }
                ((aDS) this.R).e(v, true);
                return true;
            case 1:
                aDS ads = (aDS) this.R;
                ads.getClass();
                hGV hgv = null;
                if (obj != null) {
                    try {
                        hgv = ads.R(obj, false);
                    } catch (ClassCastException unused) {
                    }
                }
                if (hgv != null) {
                    ads.e(hgv, true);
                }
                return hgv != null;
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((fGq) this.R).X(entry.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.e) {
            case 0:
                return ((aDS) this.R).e;
            case 1:
                return ((aDS) this.R).e;
            default:
                return ((fGq) this.R).L();
        }
    }
}
