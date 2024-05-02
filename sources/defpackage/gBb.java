package defpackage;

/* renamed from: gBb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gBb implements b6E {
    public final /* synthetic */ nt4 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int e = 0;

    public /* synthetic */ gBb(nt4 nt4, int i) {
        this.R = nt4;
        this.X = i;
    }

    @Override // defpackage.b6E
    public final Object R() {
        switch (this.e) {
            case 0:
                nt4 nt4 = this.R;
                int i = this.X;
                aKF v = nt4.v(i);
                n9N n9n = v.f839R;
                int i2 = n9n.R;
                if (i2 == 5 || i2 == 6 || i2 == 4) {
                    dRx drx = nt4.f6617R;
                    String str = n9n.f6323R;
                    int i3 = v.v;
                    long j = n9n.f6322R;
                    if (drx.c(i3, j, str).exists()) {
                        dRx.L(drx.c(i3, j, str));
                    }
                    n9N n9n2 = v.f839R;
                    int i4 = n9n2.R;
                    if (i4 == 5 || i4 == 6) {
                        dRx drx2 = nt4.f6617R;
                        String str2 = n9n2.f6323R;
                        int i5 = v.v;
                        long j2 = n9n2.f6322R;
                        if (drx2.x(i5, j2, str2).exists()) {
                            dRx.L(drx2.x(i5, j2, str2));
                        }
                    }
                    return null;
                }
                throw new bRU(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
            default:
                this.R.v(this.X).f839R.R = 5;
                return null;
        }
    }

    public /* synthetic */ gBb(nt4 nt4, int i, int i2) {
        this.R = nt4;
        this.X = i;
    }
}
