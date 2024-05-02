package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: Xb  reason: default package */
/* loaded from: classes.dex */
public abstract class Xb {
    public final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public Object f620R;
    public final Object v;

    public Xb(Class cls, int i) {
        this.f620R = cls;
        this.v = new c_x(i);
    }

    public abstract void H();

    public O L(nP9 np9) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public O O(q qVar) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public final void R(O o) {
        if (!((Class) this.f620R).isInstance(o)) {
            StringBuilder U = opT.U("unexpected object: ");
            U.append(o.getClass().getName());
            throw new IllegalStateException(U.toString());
        }
    }

    public final void U() {
        v();
        IntentFilter e = e();
        if (e != null && e.countActions() != 0) {
            if (((BroadcastReceiver) this.f620R) == null) {
                this.f620R = new Kw(0, this);
            }
            ((Q8) this.v).f400R.registerReceiver((BroadcastReceiver) this.f620R, e);
        }
    }

    public final O X(byte[] bArr) {
        O I = O.I(bArr);
        R(I);
        return I;
    }

    public abstract int Z();

    public final void c() {
        kuA kua = (kuA) this.f620R;
        if (kua.f5472R.remove((a3) this.v) && kua.f5472R.isEmpty()) {
            kua.v();
        }
    }

    public abstract IntentFilter e();

    public final boolean equals(Object obj) {
        switch (this.R) {
            case 2:
                return this == obj;
            default:
                return super.equals(obj);
        }
    }

    public final int hashCode() {
        switch (this.R) {
            case 2:
                return super.hashCode();
            default:
                return super.hashCode();
        }
    }

    public final O m(Vz vz, boolean z) {
        O o;
        if (128 == vz.X) {
            if (z) {
                if (vz.Q()) {
                    o = vz.R.v();
                    R(o);
                } else {
                    throw new IllegalStateException("object explicit - implicit expected.");
                }
            } else if (1 != vz.e) {
                O v = vz.R.v();
                int i = vz.e;
                if (i == 3) {
                    o = O(vz.A(v));
                } else if (i != 4) {
                    R(v);
                    o = v;
                } else {
                    o = v instanceof q ? O((q) v) : L((nP9) v);
                }
            } else {
                throw new IllegalStateException("object explicit - implicit expected.");
            }
            R(o);
            return o;
        }
        throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public final void v() {
        Object obj = this.f620R;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((Q8) this.v).f400R.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f620R = null;
        }
    }

    public final boolean x() {
        int c = opT.c(((kuA) this.f620R).f5473R.f7228R);
        int i = ((kuA) this.f620R).R;
        return c == i || !(c == 2 || i == 2);
    }

    public Xb(kuA kua, a3 a3Var) {
        this.f620R = kua;
        this.v = a3Var;
    }

    public Xb(Q8 q8) {
        this.v = q8;
    }
}
