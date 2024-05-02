package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: iWA  reason: default package */
/* loaded from: classes.dex */
public final class iWA implements f8n {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final dH9 f4623R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4624R;

    public iWA(boolean z, float f, h0T h0t) {
        this.f4624R = z;
        this.R = f;
        this.f4623R = h0t;
    }

    @Override // defpackage.f8n
    public final kN5 R(j4B j4b, m88 m88) {
        dVV dvv;
        View view;
        jr_ jr_ = (jr_) m88;
        jr_.w(988743187);
        mWx mwx = (mWx) jr_.x(e5_.f2973R);
        jr_.w(-1524341038);
        long R = (((n3) this.f4623R.getValue()).f6279R > n3.O ? 1 : (((n3) this.f4623R.getValue()).f6279R == n3.O ? 0 : -1)) != 0 ? ((n3) this.f4623R.getValue()).f6279R : mwx.R(jr_);
        jr_.g(false);
        h0T s = l6.s(new n3(R), jr_);
        h0T s2 = l6.s(mwx.v(jr_), jr_);
        boolean z = this.f4624R;
        float f = this.R;
        jr_.w(331259447);
        jr_.w(-1737891121);
        Object x = jr_.x(ur.X);
        while (!(x instanceof ViewGroup)) {
            ViewParent parent = ((View) x).getParent();
            if (parent instanceof View) {
                x = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + x + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) x;
        jr_.g(false);
        jr_.w(1643267286);
        if (viewGroup.isInEditMode()) {
            jr_.w(-3686552);
            boolean O = jr_.O(this) | jr_.O(j4b);
            Object I = jr_.I();
            if (O || I == ppN.R) {
                I = new nJ6(z, f, s, s2);
                jr_.ZW(I);
            }
            jr_.g(false);
            dvv = (nJ6) I;
            jr_.g(false);
            jr_.g(false);
        } else {
            jr_.g(false);
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    view = null;
                    break;
                }
                view = viewGroup.getChildAt(i);
                if (view instanceof cuR) {
                    break;
                }
                i++;
            }
            if (view == null) {
                view = new cuR(viewGroup.getContext());
                viewGroup.addView(view);
            }
            jr_.w(-3686095);
            boolean O2 = jr_.O(this) | jr_.O(j4b) | jr_.O(view);
            Object I2 = jr_.I();
            if (O2 || I2 == ppN.R) {
                I2 = new zq(z, f, s, s2, (cuR) view);
                jr_.ZW(I2);
            }
            jr_.g(false);
            dvv = (zq) I2;
            jr_.g(false);
        }
        caw.X(dvv, j4b, new a95(j4b, dvv, null), jr_);
        jr_.g(false);
        return dvv;
    }

    /* renamed from: c */
    public final int hashCode() {
        return this.f4623R.hashCode() + jQ.c(this.R, Boolean.hashCode(this.f4624R) * 31, 31);
    }

    /* renamed from: v */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iWA)) {
            return false;
        }
        iWA iwa = (iWA) obj;
        return this.f4624R == iwa.f4624R && hoI.R(this.R, iwa.R) && n3x.v(this.f4623R, iwa.f4623R);
    }
}
