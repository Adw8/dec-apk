package defpackage;

import android.transition.Transition;

/* renamed from: pxy  reason: default package */
/* loaded from: classes.dex */
public final class pxy extends Xb {
    public final boolean R;
    public final Object c;
    public final Object e;

    public pxy(kuA kua, a3 a3Var, boolean z, boolean z2) {
        super(kua, a3Var);
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = null;
        if (kua.R == 2) {
            if (z) {
                mfw mfw = kua.f5473R.f7243R;
                if (mfw != null) {
                    obj3 = mfw.f6122e;
                    if (obj3 == pm2.R) {
                        obj3 = mfw != null ? mfw.f6121c : obj3;
                    }
                }
                obj3 = null;
            } else {
                mfw mfw2 = kua.f5473R.f7243R;
                if (mfw2 != null) {
                    obj3 = mfw2.f6117R;
                }
                obj3 = null;
            }
            this.c = obj3;
            if (z) {
                mfw mfw3 = kua.f5473R.f7243R;
            } else {
                mfw mfw4 = kua.f5473R.f7243R;
            }
            this.R = true;
        } else {
            if (z) {
                mfw mfw5 = kua.f5473R.f7243R;
                if (mfw5 != null) {
                    obj2 = mfw5.f6123v;
                    if (obj2 == pm2.R) {
                        obj2 = mfw5 != null ? mfw5.f6117R : obj2;
                    }
                }
                obj2 = null;
            } else {
                mfw mfw6 = kua.f5473R.f7243R;
                if (mfw6 != null) {
                    obj2 = mfw6.f6121c;
                }
                obj2 = null;
            }
            this.c = obj2;
            this.R = true;
        }
        if (!z2) {
            this.e = null;
        } else if (z) {
            mfw mfw7 = kua.f5473R.f7243R;
            if (!(mfw7 == null || (obj = mfw7.f6120X) == pm2.R)) {
                obj4 = obj;
            }
            this.e = obj4;
        } else {
            kua.f5473R.getClass();
            this.e = null;
        }
    }

    public final oE_ C(Object obj) {
        if (obj == null) {
            return null;
        }
        b8r b8r = ojP.R;
        if (obj instanceof Transition) {
            return b8r;
        }
        oE_ oe_ = ojP.f6898R;
        if (oe_ != null && oe_.X(obj)) {
            return oe_;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((kuA) ((Xb) this).f620R).f5473R + " is not a valid framework Transition or AndroidX Transition");
    }
}
