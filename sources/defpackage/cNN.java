package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: cNN  reason: default package */
/* loaded from: classes.dex */
public final class cNN implements Map, nmZ, bNA {
    public d39 R = new d39(e76.R);

    /* renamed from: R  reason: collision with other field name */
    public final i35 f2079R = new i35(this, 0);
    public final i35 v = new i35(this, 1);
    public final i35 c = new i35(this, 2);

    @Override // defpackage.nmZ
    public final jJG C() {
        return this.R;
    }

    @Override // defpackage.nmZ
    public final void H(jJG jjg) {
        this.R = (d39) jjg;
    }

    public final d39 R() {
        return (d39) jwU.C(this.R, this);
    }

    @Override // java.util.Map
    public final void clear() {
        dR6 L;
        e76 e76 = e76.R;
        if (e76 != ((d39) jwU.O(this.R)).R) {
            synchronized (fk4.R) {
                d39 d39 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    d39 d392 = (d39) jwU.j(d39, this, L);
                    d392.R = e76;
                    d392.v++;
                }
                jwU.x(L, this);
            }
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return ((e76) R().R).containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((Oa) R().R).containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f2079R;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return ((e76) R().R).get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((Oa) R().R).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.v;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        g2d g2d;
        int i;
        Object put;
        dR6 L;
        boolean z;
        do {
            Object obj3 = fk4.R;
            synchronized (obj3) {
                d39 d39 = (d39) jwU.O(this.R);
                g2d = d39.R;
                i = d39.v;
            }
            mWd mwd = new mWd((e76) g2d);
            put = mwd.put(obj, obj2);
            e76 R = mwd.R();
            if (n3x.v(R, g2d)) {
                break;
            }
            synchronized (obj3) {
                d39 d392 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    d39 d393 = (d39) jwU.j(d392, this, L);
                    int i2 = d393.v;
                    if (i2 == i) {
                        d393.R = R;
                        d393.v = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                jwU.x(L, this);
            }
        } while (!z);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        g2d g2d;
        int i;
        dR6 L;
        boolean z;
        do {
            Object obj = fk4.R;
            synchronized (obj) {
                d39 d39 = (d39) jwU.O(this.R);
                g2d = d39.R;
                i = d39.v;
            }
            mWd mwd = new mWd((e76) g2d);
            mwd.putAll(map);
            e76 R = mwd.R();
            if (!n3x.v(R, g2d)) {
                synchronized (obj) {
                    d39 d392 = this.R;
                    synchronized (jwU.f5150R) {
                        L = jwU.L();
                        d39 d393 = (d39) jwU.j(d392, this, L);
                        int i2 = d393.v;
                        if (i2 == i) {
                            d393.R = R;
                            d393.v = i2 + 1;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    jwU.x(L, this);
                }
            } else {
                return;
            }
        } while (!z);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        g2d g2d;
        int i;
        Object remove;
        dR6 L;
        boolean z;
        do {
            Object obj2 = fk4.R;
            synchronized (obj2) {
                d39 d39 = (d39) jwU.O(this.R);
                g2d = d39.R;
                i = d39.v;
            }
            mWd mwd = new mWd((e76) g2d);
            remove = mwd.remove(obj);
            e76 R = mwd.R();
            if (n3x.v(R, g2d)) {
                break;
            }
            synchronized (obj2) {
                d39 d392 = this.R;
                synchronized (jwU.f5150R) {
                    L = jwU.L();
                    d39 d393 = (d39) jwU.j(d392, this, L);
                    int i2 = d393.v;
                    if (i2 == i) {
                        d393.R = R;
                        d393.v = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                jwU.x(L, this);
            }
        } while (!z);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        Oa oa = (Oa) R().R;
        oa.getClass();
        return ((e76) oa).e;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.c;
    }
}
