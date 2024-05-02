package defpackage;

/* renamed from: b69  reason: default package */
/* loaded from: classes.dex */
public final class b69 implements oFh {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public pcj f1533R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1534R;
    public final int e;

    public b69(int i, long j) {
        this.e = i;
        this.R = j;
    }

    @Override // defpackage.oFh
    public final void cancel() {
        if (!this.f1534R) {
            this.f1534R = true;
            pcj pcj = this.f1533R;
            if (pcj != null) {
                pcj.f7126R.v();
                fue fue = (fue) pcj.f7126R.f5642c.remove(pcj.R);
                if (fue != null) {
                    lGT lgt = pcj.f7126R;
                    if (lgt.c > 0) {
                        int indexOf = lgt.f5637R.U().indexOf(fue);
                        int size = pcj.f7126R.f5637R.U().size();
                        lGT lgt2 = pcj.f7126R;
                        int i = lgt2.c;
                        if (indexOf >= size - i) {
                            lgt2.v++;
                            lgt2.c = i - 1;
                            int size2 = lgt2.f5637R.U().size();
                            lGT lgt3 = pcj.f7126R;
                            int i2 = (size2 - lgt3.c) - lgt3.v;
                            fue fue2 = lgt3.f5637R;
                            fue2.c = true;
                            fue2.u(indexOf, i2, 1);
                            fue2.c = false;
                            pcj.f7126R.R(i2);
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f1533R = null;
        }
    }
}
