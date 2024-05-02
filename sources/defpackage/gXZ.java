package defpackage;

import java.util.List;

/* renamed from: gXZ  reason: default package */
/* loaded from: classes.dex */
public final class gXZ {
    public d5M R;

    /* renamed from: R  reason: collision with other field name */
    public p3R f3786R;

    public gXZ() {
        bz bzVar = Tf.R;
        d5M d5m = new d5M(bzVar, odN.v, (odN) null);
        this.R = d5m;
        this.f3786R = new p3R(bzVar, d5m.R);
    }

    public final d5M R(List list) {
        Exception e;
        mKb mkb = null;
        try {
            int size = list.size();
            int i = 0;
            mkb = null;
            while (i < size) {
                try {
                    mkb = (mKb) list.get(i);
                } catch (Exception e2) {
                    e = e2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder U = opT.U("Error while applying EditCommand batch to buffer (length=");
                    U.append(this.f3786R.e());
                    U.append(", composition=");
                    U.append(this.f3786R.c());
                    U.append(", selection=");
                    p3R p3r = this.f3786R;
                    U.append((Object) odN.L(dtx.e(p3r.R, p3r.v)));
                    U.append("):");
                    sb.append(U.toString());
                    sb.append('\n');
                    dF._(list, sb, (r12 & 2) != 0 ? ", " : "\n", (r12 & 4) != 0 ? "" : null, (r12 & 8) != 0 ? "" : null, (r12 & 16) != 0 ? -1 : 0, (r12 & 32) != 0 ? "..." : null, (r12 & 64) != 0 ? null : new V4(mkb, 27, this));
                    throw new RuntimeException(sb.toString(), e);
                }
                try {
                    mkb.R(this.f3786R);
                    i++;
                    mkb = mkb;
                } catch (Exception e3) {
                    e = e3;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder U = opT.U("Error while applying EditCommand batch to buffer (length=");
                    U.append(this.f3786R.e());
                    U.append(", composition=");
                    U.append(this.f3786R.c());
                    U.append(", selection=");
                    p3R p3r = this.f3786R;
                    U.append((Object) odN.L(dtx.e(p3r.R, p3r.v)));
                    U.append("):");
                    sb.append(U.toString());
                    sb.append('\n');
                    dF._(list, sb, (r12 & 2) != 0 ? ", " : "\n", (r12 & 4) != 0 ? "" : null, (r12 & 8) != 0 ? "" : null, (r12 & 16) != 0 ? -1 : 0, (r12 & 32) != 0 ? "..." : null, (r12 & 64) != 0 ? null : new V4(mkb, 27, this));
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            bz bzVar = new bz(this.f3786R.toString(), null, 6);
            p3R p3r2 = this.f3786R;
            d5M d5m = new d5M(bzVar, dtx.e(p3r2.R, p3r2.v), this.f3786R.c());
            this.R = d5m;
            return d5m;
        } catch (Exception e4) {
            e = e4;
        }
    }
}
