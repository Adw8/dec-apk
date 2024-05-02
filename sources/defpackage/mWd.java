package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: mWd  reason: default package */
/* loaded from: classes.dex */
public final class mWd extends AbstractMap implements bNA {
    public e76 R;

    /* renamed from: R  reason: collision with other field name */
    public ift f6051R = new ift(19);

    /* renamed from: R  reason: collision with other field name */
    public Object f6052R;

    /* renamed from: R  reason: collision with other field name */
    public pgk f6053R;
    public int X;
    public int e;

    public mWd(e76 e76) {
        this.R = e76;
        this.f6053R = e76.f2983R;
        this.X = e76.e;
    }

    public final e76 R() {
        pgk pgk = this.f6053R;
        e76 e76 = this.R;
        if (pgk != e76.f2983R) {
            this.f6051R = new ift(19);
            e76 = new e76(this.f6053R, this.X);
        }
        this.R = e76;
        return e76;
    }

    /* renamed from: c */
    public final Set keySet() {
        return new lQE(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        pgk pgk = pgk.R;
        this.f6053R = pgk.R;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f6053R.e(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final void e(int i) {
        this.X = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.f6053R.L(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f6052R = null;
        this.f6053R = this.f6053R.U(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f6052R;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        e76 e76 = null;
        e76 e762 = map instanceof e76 ? (e76) map : null;
        if (e762 == null) {
            mWd mwd = map instanceof mWd ? (mWd) map : null;
            if (mwd != null) {
                e76 = mwd.R();
            }
        } else {
            e76 = e762;
        }
        if (e76 != null) {
            gBy gby = new gBy();
            int i = this.X;
            this.f6053R = this.f6053R.C(e76.f2983R, 0, gby, this);
            int i2 = (e76.e + i) - gby.R;
            if (i != i2) {
                e(i2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.X;
        pgk P = this.f6053R.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (P == null) {
            pgk pgk = pgk.R;
            P = pgk.R;
        }
        this.f6053R = P;
        if (i != this.X) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.X;
    }

    /* renamed from: v */
    public final Set entrySet() {
        return new lQE(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new n_E(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.f6052R = null;
        pgk N = this.f6053R.N(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (N == null) {
            pgk pgk = pgk.R;
            N = pgk.R;
        }
        this.f6053R = N;
        return this.f6052R;
    }
}
