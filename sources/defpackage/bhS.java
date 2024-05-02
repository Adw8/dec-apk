package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: bhS  reason: default package */
/* loaded from: classes.dex */
public final class bhS extends lVC {
    public long R;
    public final /* synthetic */ oIS v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bhS(oIS ois, long j) {
        super(ois);
        this.v = ois;
        this.R = j;
        if (j == 0) {
            R();
        }
    }

    @Override // defpackage.lVC, defpackage.fGn
    public final long Y(ME me, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(opT.x("byteCount < 0: ", j).toString());
        } else if (!((lVC) this).f5762R) {
            long j2 = this.R;
            if (j2 == 0) {
                return -1;
            }
            long Y = super.Y(me, Math.min(j2, j));
            if (Y != -1) {
                long j3 = this.R - Y;
                this.R = j3;
                if (j3 == 0) {
                    R();
                }
                return Y;
            }
            this.v.f6733R.c();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            R();
            throw protocolException;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (!((lVC) this).f5762R) {
            if (this.R != 0) {
                try {
                    z = khE.O(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    this.v.f6733R.c();
                    R();
                }
            }
            ((lVC) this).f5762R = true;
        }
    }
}
