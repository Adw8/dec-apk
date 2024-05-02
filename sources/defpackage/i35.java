package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: i35  reason: default package */
/* loaded from: classes.dex */
public final class i35 extends n4_ {
    public final /* synthetic */ int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public i35(cNN cnn, int i) {
        super(cnn);
        this.e = i;
        if (i == 1) {
            super(cnn);
        } else if (i != 2) {
        } else {
            super(cnn);
        }
    }

    private boolean c(Collection collection) {
        g2d g2d;
        int i;
        boolean z;
        dR6 L;
        Set wm = dF.wm(collection);
        cNN cnn = this.R;
        boolean z2 = false;
        do {
            synchronized (fk4.R) {
                d39 d39 = (d39) jwU.O(cnn.R);
                g2d = d39.R;
                i = d39.v;
            }
            mWd mwd = new mWd((e76) g2d);
            Iterator it = cnn.f2079R.iterator();
            z = true;
            while (((p30) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((pjN) it).next();
                if (!wm.contains(entry.getValue())) {
                    mwd.remove(entry.getKey());
                    z2 = true;
                }
            }
            e76 R = mwd.R();
            if (n3x.v(R, g2d)) {
                break;
            }
            synchronized (fk4.R) {
                d39 d392 = cnn.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    d39 d393 = (d39) jwU.j(d392, cnn, L);
                    int i2 = d393.v;
                    if (i2 == i) {
                        d393.R = R;
                        d393.v = i2 + 1;
                    } else {
                        z = false;
                    }
                }
                jwU.x(L, cnn);
            }
        } while (!z);
        return z2;
    }

    private boolean v(Collection collection) {
        g2d g2d;
        int i;
        boolean z;
        dR6 L;
        Set wm = dF.wm(collection);
        cNN cnn = this.R;
        boolean z2 = false;
        do {
            synchronized (fk4.R) {
                d39 d39 = (d39) jwU.O(cnn.R);
                g2d = d39.R;
                i = d39.v;
            }
            mWd mwd = new mWd((e76) g2d);
            Iterator it = cnn.f2079R.iterator();
            z = true;
            while (((p30) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((pjN) it).next();
                if (!wm.contains(entry.getKey())) {
                    mwd.remove(entry.getKey());
                    z2 = true;
                }
            }
            e76 R = mwd.R();
            if (n3x.v(R, g2d)) {
                break;
            }
            synchronized (fk4.R) {
                d39 d392 = cnn.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    d39 d393 = (d39) jwU.j(d392, cnn, L);
                    int i2 = d393.v;
                    if (i2 == i) {
                        d393.R = R;
                        d393.v = i2 + 1;
                    } else {
                        z = false;
                    }
                }
                jwU.x(L, cnn);
            }
        } while (!z);
        return z2;
    }

    public final void R() {
        switch (this.e) {
            case 0:
                fk4.R();
                throw null;
            case 1:
                fk4.R();
                throw null;
            default:
                fk4.R();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.e;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                fk4.R();
                throw null;
            case 1:
                switch (i) {
                    case 1:
                        fk4.R();
                        throw null;
                    default:
                        fk4.R();
                        throw null;
                }
            default:
                switch (i) {
                    case 1:
                        fk4.R();
                        throw null;
                    default:
                        fk4.R();
                        throw null;
                }
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        switch (this.e) {
            case 0:
                R();
                throw null;
            case 1:
                R();
                throw null;
            default:
                R();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (!((obj instanceof Map.Entry) && (!(obj instanceof dsi) || (obj instanceof i1l)))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return n3x.v(this.R.get(entry.getKey()), entry.getValue());
            case 1:
                return this.R.containsKey(obj);
            default:
                return this.R.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                if (!collection.isEmpty()) {
                    for (Object obj : collection) {
                        if (!this.R.containsKey(obj)) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                if (!collection.isEmpty()) {
                    for (Object obj2 : collection) {
                        if (!this.R.containsValue(obj2)) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                cNN cnn = this.R;
                return new pjN(cnn, ((mfM) ((Oa) cnn.R().R).entrySet()).iterator(), 0);
            case 1:
                cNN cnn2 = this.R;
                return new pjN(cnn2, ((mfM) ((Oa) cnn2.R().R).entrySet()).iterator(), 1);
            default:
                cNN cnn3 = this.R;
                return new pjN(cnn3, ((mfM) ((Oa) cnn3.R().R).entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.e) {
            case 0:
                return ((obj instanceof Map.Entry) && (!(obj instanceof dsi) || (obj instanceof i1l))) && this.R.remove(((Map.Entry) obj).getKey()) != null;
            case 1:
                return this.R.remove(obj) != null;
            default:
                cNN cnn = this.R;
                Iterator it = cnn.f2079R.iterator();
                while (true) {
                    if (((p30) it).hasNext()) {
                        obj2 = ((pjN) it).next();
                        if (n3x.v(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry == null) {
                    return false;
                }
                cnn.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        g2d g2d;
        int i;
        dR6 L;
        boolean z;
        switch (this.e) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.R.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
            case 1:
                while (true) {
                    boolean z3 = false;
                    for (Object obj : collection) {
                        if (this.R.remove(obj) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
            default:
                Set wm = dF.wm(collection);
                cNN cnn = this.R;
                boolean z4 = false;
                do {
                    synchronized (fk4.R) {
                        d39 d39 = (d39) jwU.O(cnn.R);
                        g2d = d39.R;
                        i = d39.v;
                    }
                    mWd mwd = new mWd((e76) g2d);
                    Iterator it2 = cnn.f2079R.iterator();
                    while (((p30) it2).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((pjN) it2).next();
                        if (wm.contains(entry.getValue())) {
                            mwd.remove(entry.getKey());
                            z4 = true;
                        }
                    }
                    e76 R = mwd.R();
                    if (!n3x.v(R, g2d)) {
                        synchronized (fk4.R) {
                            d39 d392 = cnn.R;
                            synchronized (jwU.f5150R) {
                                L = jwU.L();
                                d39 d393 = (d39) jwU.j(d392, cnn, L);
                                int i2 = d393.v;
                                if (i2 == i) {
                                    d393.R = R;
                                    d393.v = i2 + 1;
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            jwU.x(L, cnn);
                        }
                    }
                    return z4;
                } while (!z);
                return z4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        g2d g2d;
        int i;
        boolean z;
        dR6 L;
        switch (this.e) {
            case 0:
                int y = jjU.y(a6.B(collection, 10));
                if (y < 16) {
                    y = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(y);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                cNN cnn = this.R;
                boolean z2 = false;
                do {
                    synchronized (fk4.R) {
                        d39 d39 = (d39) jwU.O(cnn.R);
                        g2d = d39.R;
                        i = d39.v;
                    }
                    mWd mwd = new mWd((e76) g2d);
                    Iterator it2 = cnn.f2079R.iterator();
                    z = true;
                    while (((p30) it2).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((pjN) it2).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !n3x.v(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            mwd.remove(entry2.getKey());
                            z2 = true;
                        }
                    }
                    e76 R = mwd.R();
                    if (!n3x.v(R, g2d)) {
                        synchronized (fk4.R) {
                            d39 d392 = cnn.R;
                            synchronized (jwU.f5150R) {
                                L = jwU.L();
                                d39 d393 = (d39) jwU.j(d392, cnn, L);
                                int i2 = d393.v;
                                if (i2 == i) {
                                    d393.R = R;
                                    d393.v = i2 + 1;
                                } else {
                                    z = false;
                                }
                            }
                            jwU.x(L, cnn);
                        }
                    }
                    return z2;
                } while (!z);
                return z2;
            case 1:
                return v(collection);
            default:
                return c(collection);
        }
    }
}
