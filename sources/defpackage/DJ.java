package defpackage;

import androidx.activity.d;

/* renamed from: DJ  reason: default package */
/* loaded from: classes.dex */
public final class DJ implements iLf {
    public final Object c;
    public volatile Object v;
    public final /* synthetic */ int e = 1;
    public final Object R = new Object();

    public DJ(Zz zz) {
        this.c = zz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:0:?, code lost:
        r1 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.content.Context c(dagger.hilt.android.internal.managers.d r1) {
        /*
        L_0x0000:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 != 0) goto L_0x000f
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0000
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.DJ.c(dagger.hilt.android.internal.managers.d):android.content.Context");
    }

    @Override // defpackage.iLf
    public final Object R() {
        switch (this.e) {
            case 0:
                if (((xg) this.v) == null) {
                    synchronized (this.R) {
                        if (((xg) this.v) == null) {
                            this.v = ((hw) ((CV) this.c).O(hw.class)).R;
                        }
                    }
                }
                return (xg) this.v;
            case 1:
                if (this.v == null) {
                    synchronized (this.R) {
                        if (this.v == null) {
                            this.v = new fMX(new cr((lOp) ((Zz) this.c).R));
                        }
                    }
                }
                return this.v;
            default:
                if (this.v == null) {
                    synchronized (this.R) {
                        if (this.v == null) {
                            this.v = v();
                        }
                    }
                }
                return this.v;
        }
    }

    public final Object v() {
        Object obj = this.c;
        eAj eaj = ((pm2) obj).f7232R;
        hm9 hm9 = null;
        if ((eaj == null ? null : eaj.f3007R) != null) {
            eAj eaj2 = ((pm2) obj).f7232R;
            boolean z = (eaj2 == null ? null : eaj2.f3007R) instanceof iLf;
            Object[] objArr = new Object[1];
            eAj eaj3 = ((pm2) obj).f7232R;
            objArr[0] = (eaj3 == null ? null : eaj3.f3007R).getClass();
            hDC.L(z, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", objArr);
            eAj eaj4 = ((pm2) this.c).f7232R;
            if (eaj4 != null) {
                hm9 = eaj4.f3007R;
            }
            ktS kts = (ktS) ((lQB) hDC.C(lQB.class, hm9));
            piu piu = new piu(kts.f5456R, kts.R, kts.f5457R, 0);
            pm2 pm2 = (pm2) this.c;
            pm2.getClass();
            piu.e = pm2;
            return new mGN((fMX) piu.f7202R, (dYv) piu.f7203v, (ktS) piu.c);
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    public DJ(pm2 pm2) {
        this.c = pm2;
    }

    public DJ(d dVar) {
        this.c = new CV(dVar, new wP(dVar));
    }
}
