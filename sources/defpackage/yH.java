package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yH  reason: default package */
/* loaded from: classes.dex */
public final class yH implements kJx {
    public final f_c R;

    /* renamed from: R  reason: collision with other field name */
    public Throwable f7485R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f7484R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public List f7486R = new ArrayList();
    public List v = new ArrayList();

    public yH(fwW fww) {
        this.R = fww;
    }

    @Override // defpackage.nbD
    public final nbD H(e86 e86) {
        return dTl.d(this, e86);
    }

    @Override // defpackage.nbD
    public final nbD M(nbD nbd) {
        return jjU.t(this, nbd);
    }

    @Override // defpackage.hdJ, defpackage.nbD
    public final hdJ O(e86 e86) {
        return dTl.J(this, e86);
    }

    @Override // defpackage.kJx
    public final Object W(kg9 kg9, aOO aoo) {
        f_c f_c;
        xx xxVar = new xx(1, n3x.U(aoo));
        xxVar.j();
        nWW nww = new nWW();
        synchronized (this.f7484R) {
            try {
                Throwable th = this.f7485R;
                if (th != null) {
                    xxVar.Y(new bvw(th));
                } else {
                    nww.R = new _v(kg9, xxVar);
                    boolean z = !this.f7486R.isEmpty();
                    List list = this.f7486R;
                    Object obj = nww.R;
                    list.add(obj == null ? null : (_v) obj);
                    boolean z2 = !z;
                    xxVar.y(new V4(this, 13, nww));
                    if (z2 && (f_c = this.R) != null) {
                        try {
                            f_c.g();
                        } catch (Throwable th2) {
                            synchronized (this.f7484R) {
                                try {
                                    if (this.f7485R == null) {
                                        this.f7485R = th2;
                                        List list2 = this.f7486R;
                                        int size = list2.size();
                                        for (int i = 0; i < size; i++) {
                                            ((_v) list2.get(i)).R.Y(new bvw(th2));
                                        }
                                        this.f7486R.clear();
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return xxVar.P();
    }

    public final void e(long j) {
        synchronized (this.f7484R) {
            List list = this.f7486R;
            this.f7486R = this.v;
            this.v = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                _v _vVar = (_v) list.get(i);
                _vVar.R.Y(_vVar.f709R.x(Long.valueOf(j)));
            }
            list.clear();
        }
    }

    @Override // defpackage.nbD
    public final Object o(Object obj, iv7 iv7) {
        return iv7.J(obj, this);
    }

    public final boolean v() {
        boolean z;
        synchronized (this.f7484R) {
            z = !this.f7486R.isEmpty();
        }
        return z;
    }
}
