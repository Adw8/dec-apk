package defpackage;

/* renamed from: hcI  reason: default package */
/* loaded from: classes.dex */
public abstract class hcI {
    public static final bsy R = new bsy(fzi.h);

    public static final void R(pi1 pi1) {
        pcP snapshotObserver;
        poS pos = pi1.f7195R;
        if (pos != null) {
            cX2 cx2 = pi1.f7188R;
            cx2.f2125R = true;
            jzQ jzq = jzQ.R;
            cx2.R = jzq;
            cx2.v = jzq;
            cx2.c = jzq;
            cx2.e = jzq;
            cx2.X = jzq;
            cx2.O = jzq;
            cx2.L = jzq;
            cx2.Z = jzq;
            cx2.f2124R = nqF.N;
            cx2.f2126v = nqF.P;
            gzG gzg = pos.f7272R.f3595R;
            if (!(gzg == null || (snapshotObserver = gzg.getSnapshotObserver()) == null)) {
                snapshotObserver.R(pi1, nqF.H, new lud(pi1, 1));
            }
            if (pi1.f7188R.f2125R) {
                int ordinal = pi1.f7192R.ordinal();
                if (ordinal == 3) {
                    pi1.U(mgi.Inactive);
                } else if (ordinal == 4) {
                    pi1.U(mgi.ActiveParent);
                }
            } else {
                msU.Q(pi1);
            }
        }
    }
}
