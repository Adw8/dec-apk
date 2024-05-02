package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: igQ  reason: default package */
/* loaded from: classes.dex */
public final class igQ implements h2V {
    public final /* synthetic */ eJw R;
    public final /* synthetic */ int e;

    public /* synthetic */ igQ(eJw ejw, int i) {
        this.e = i;
        this.R = ejw;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        int i = this.e;
        switch (i) {
            case 0:
                o8s o8s = (o8s) obj;
                if (((Boolean) this.R.f3057R.getValue()).booleanValue()) {
                    eJw ejw = this.R;
                    pby[] pbyArr = kxm.R;
                    cG cGVar = ejw.f3054R;
                    if (cGVar != null) {
                        try {
                            i = 3;
                            cGVar.f2039R.h();
                            if (cGVar.f2042R != null) {
                                oZ5 oz5 = cGVar.f2042R;
                                synchronized (oz5.f6848R) {
                                    oz5.f6847R = null;
                                    oz5.f6849R = true;
                                }
                            }
                            if (!(cGVar.f2042R == null || cGVar.f2043R == null)) {
                                fgm.X("BillingClient", "Unbinding from service.");
                                cGVar.f2037R.unbindService(cGVar.f2042R);
                                cGVar.f2042R = null;
                            }
                            cGVar.f2043R = null;
                            ExecutorService executorService = cGVar.f2041R;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                cGVar.f2041R = null;
                            }
                        } catch (Exception e) {
                            fgm.L("BillingClient", "There was an exception while ending connection!", e);
                        } finally {
                            cGVar.R = i;
                        }
                    }
                    this.R.f3057R.H(Boolean.FALSE);
                    this.R.f3054R = null;
                }
                return o8s.R;
            case 1:
                return v((bYR) obj, aoo);
            default:
                return v((bYR) obj, aoo);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(defpackage.bYR r10, defpackage.aOO r11) {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igQ.v(bYR, aOO):java.lang.Object");
    }
}
