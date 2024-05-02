package defpackage;

/* renamed from: l0f  reason: default package */
/* loaded from: classes.dex */
public abstract class l0f implements kgQ {
    public int X;
    public int e;
    public long R = iTI.R(0, 0);
    public long v = aQy.f869R;

    public int JD() {
        return ltH.v(this.R);
    }

    public abstract void KZ(long j, float f, kg9 kg9);

    public final void Qg(long j) {
        if (!ltH.R(this.R, j)) {
            this.R = j;
            ve();
        }
    }

    public int mh() {
        return (int) (this.R >> 32);
    }

    public final void np(long j) {
        if (!oys.v(this.v, j)) {
            this.v = j;
            ve();
        }
    }

    public final void ve() {
        this.e = caw.x((int) (this.R >> 32), oys.x(this.v), oys.Z(this.v));
        this.X = caw.x(ltH.v(this.R), oys.m(this.v), oys.L(this.v));
    }

    public final long yf() {
        int i = this.e;
        long j = this.R;
        return cU5.v((i - ((int) (j >> 32))) / 2, (this.X - ltH.v(j)) / 2);
    }
}
