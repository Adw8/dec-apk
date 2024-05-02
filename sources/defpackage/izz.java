package defpackage;

import java.util.Iterator;

/* renamed from: izz  reason: default package */
/* loaded from: classes.dex */
public final class izz implements iHW {
    public Pc R;

    /* renamed from: R  reason: collision with other field name */
    public final us f4785R;
    public Pc c;
    public Pc v;

    public izz(us usVar) {
        this.f4785R = usVar;
    }

    @Override // defpackage.iHW
    public final boolean R() {
        return false;
    }

    @Override // defpackage.iHW
    public final long X(Pc pc, Pc pc2, Pc pc3) {
        Iterator it = caw.V(0, pc.v()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int nextInt = ((jrc) it).nextInt();
            j = Math.max(j, this.f4785R.R(nextInt).X(pc.R(nextInt), pc2.R(nextInt), pc3.R(nextInt)));
        }
        return j;
    }

    @Override // defpackage.iHW
    public final Pc c(long j, Pc pc, Pc pc2, Pc pc3) {
        if (this.v == null) {
            this.v = pc3.c();
        }
        int i = 0;
        Pc pc4 = this.v;
        if (pc4 == null) {
            pc4 = null;
        }
        int v = pc4.v();
        while (i < v) {
            i++;
            Pc pc5 = this.v;
            if (pc5 == null) {
                pc5 = null;
            }
            pc5.X(i, this.f4785R.R(i).v(j, pc.R(i), pc2.R(i), pc3.R(i)));
        }
        Pc pc6 = this.v;
        if (pc6 == null) {
            return null;
        }
        return pc6;
    }

    @Override // defpackage.iHW
    public final Pc e(Pc pc, Pc pc2, Pc pc3) {
        if (this.c == null) {
            this.c = pc3.c();
        }
        int i = 0;
        Pc pc4 = this.c;
        if (pc4 == null) {
            pc4 = null;
        }
        int v = pc4.v();
        while (i < v) {
            i++;
            Pc pc5 = this.c;
            if (pc5 == null) {
                pc5 = null;
            }
            pc5.X(i, this.f4785R.R(i).R(pc.R(i), pc2.R(i), pc3.R(i)));
        }
        Pc pc6 = this.c;
        if (pc6 == null) {
            return null;
        }
        return pc6;
    }

    @Override // defpackage.iHW
    public final Pc v(long j, Pc pc, Pc pc2, Pc pc3) {
        if (this.R == null) {
            this.R = pc.c();
        }
        int i = 0;
        Pc pc4 = this.R;
        if (pc4 == null) {
            pc4 = null;
        }
        int v = pc4.v();
        while (i < v) {
            i++;
            Pc pc5 = this.R;
            if (pc5 == null) {
                pc5 = null;
            }
            pc5.X(i, this.f4785R.R(i).e(j, pc.R(i), pc2.R(i), pc3.R(i)));
        }
        Pc pc6 = this.R;
        if (pc6 == null) {
            return null;
        }
        return pc6;
    }

    public izz(lDA lda) {
        this(new k1Q(lda));
    }
}
