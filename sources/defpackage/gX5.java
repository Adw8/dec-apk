package defpackage;

/* renamed from: gX5  reason: default package */
/* loaded from: classes.dex */
public final class gX5 extends kE9 {
    public final hyi R = new hyi();

    @Override // defpackage.kE9
    public final void mL(nbD nbd, Runnable runnable) {
        hyi hyi = this.R;
        hyi.getClass();
        h8R h8r = iFn.R;
        hBL hbl = ((hBL) hJr.R).f4160R;
        if (!hbl.zw(nbd)) {
            if (!(hyi.v || !hyi.f4429R)) {
                if (hyi.R.offer(runnable)) {
                    hyi.R();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
        }
        hbl.mL(nbd, new hAh(hyi, 3, runnable));
    }

    @Override // defpackage.kE9
    public final boolean zw(nbD nbd) {
        h8R h8r = iFn.R;
        if (((hBL) hJr.R).f4160R.zw(nbd)) {
            return true;
        }
        hyi hyi = this.R;
        return !(hyi.v || !hyi.f4429R);
    }
}
