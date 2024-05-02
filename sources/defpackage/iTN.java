package defpackage;

import java.util.List;
import java.util.Optional;

/* renamed from: iTN  reason: default package */
/* loaded from: classes.dex */
public final class iTN implements lXY {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final fMX f4604R;

    /* renamed from: R  reason: collision with other field name */
    public final mGN f4605R;

    public iTN(fMX fmx, mGN mgn, int i) {
        this.f4604R = fmx;
        this.f4605R = mgn;
        this.R = i;
    }

    @Override // defpackage.lXY
    public final Object get() {
        int i = this.R;
        if (i == 0) {
            return new g1p(mSI.R(this.f4604R.R), Optional.of((List) this.f4605R.f5989R.get()));
        }
        if (i == 1) {
            return pdD.Y(new lzd(gvP.V(-3881549943266600851L), gvP.V(-3881550059230717843L)), new lzd(gvP.V(-3881550265389148051L), gvP.V(-3881550364173395859L)), new lzd(gvP.V(-3881550570331826067L), gvP.V(-3881550630461368211L)), new lzd(gvP.V(-3881550892454373267L), gvP.V(-3881550918224177043L)), new lzd(gvP.V(-3881551236051756947L), gvP.V(-3881551270411495315L)), new lzd(gvP.V(-3881551412145416083L), gvP.V(-3881551485159860115L)), new lzd(gvP.V(-3881551691318290323L), gvP.V(-3881551708498159507L)), new lzd(gvP.V(-3881551914656589715L), gvP.V(-3881551931836458899L)));
        }
        throw new AssertionError(this.R);
    }
}
