package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: ctg  reason: default package */
/* loaded from: classes.dex */
public final class ctg extends lVC {

    /* renamed from: R  reason: collision with other field name */
    public final a7_ f2448R;
    public final /* synthetic */ oIS v;
    public long R = -1;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2449v = true;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ctg(oIS ois, a7_ a7_) {
        super(ois);
        this.v = ois;
        this.f2448R = a7_;
    }

    @Override // defpackage.lVC, defpackage.fGn
    public final long Y(ME me, long j) {
        boolean z = true;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(opT.x("byteCount < 0: ", j).toString());
        } else if (!(!((lVC) this).f5762R)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f2449v) {
            return -1;
        } else {
            long j2 = this.R;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    this.v.f6729R.E();
                }
                try {
                    this.R = this.v.f6729R.D();
                    String obj = iH_.vr(this.v.f6729R.E()).toString();
                    if (this.R >= 0) {
                        if (obj.length() <= 0) {
                            z = false;
                        }
                        if (!z || iH_._(obj, ";", false)) {
                            if (this.R == 0) {
                                this.f2449v = false;
                                oIS ois = this.v;
                                ois.f6732R = ois.f6731R.R();
                                oIS ois2 = this.v;
                                nIq.v(ois2.f6734R.f6448R, this.f2448R, ois2.f6732R);
                                R();
                            }
                            if (!this.f2449v) {
                                return -1;
                            }
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.R + obj + '\"');
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long Y = super.Y(me, Math.min(j, this.R));
            if (Y != -1) {
                this.R -= Y;
                return Y;
            }
            this.v.f6733R.c();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            R();
            throw protocolException;
        }
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (!((lVC) this).f5762R) {
            if (this.f2449v) {
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
