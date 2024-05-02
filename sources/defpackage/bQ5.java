package defpackage;

/* renamed from: bQ5  reason: default package */
/* loaded from: classes.dex */
public final class bQ5 extends lVC {
    public boolean v;

    public bQ5(oIS ois) {
        super(ois);
    }

    @Override // defpackage.lVC, defpackage.fGn
    public final long Y(ME me, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(opT.x("byteCount < 0: ", j).toString());
        } else if (!(!((lVC) this).f5762R)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.v) {
            return -1;
        } else {
            long Y = super.Y(me, j);
            if (Y != -1) {
                return Y;
            }
            this.v = true;
            R();
            return -1;
        }
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!((lVC) this).f5762R) {
            if (!this.v) {
                R();
            }
            ((lVC) this).f5762R = true;
        }
    }
}
