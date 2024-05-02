package defpackage;

import android.view.FrameMetrics;
import android.view.Window;

/* renamed from: elc  reason: default package */
/* loaded from: classes.dex */
public final class elc implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ gme R;

    public elc(gme gme) {
        this.R = gme;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        gme gme = this.R;
        if ((gme.e & 1) != 0) {
            gme.Q(gme.f3928R[0], frameMetrics.getMetric(8));
        }
        gme gme2 = this.R;
        if ((gme2.e & 2) != 0) {
            gme.Q(gme2.f3928R[1], frameMetrics.getMetric(1));
        }
        gme gme3 = this.R;
        if ((gme3.e & 4) != 0) {
            gme.Q(gme3.f3928R[2], frameMetrics.getMetric(3));
        }
        gme gme4 = this.R;
        if ((gme4.e & 8) != 0) {
            gme.Q(gme4.f3928R[3], frameMetrics.getMetric(4));
        }
        gme gme5 = this.R;
        if ((gme5.e & 16) != 0) {
            gme.Q(gme5.f3928R[4], frameMetrics.getMetric(5));
        }
        gme gme6 = this.R;
        if ((gme6.e & 64) != 0) {
            gme.Q(gme6.f3928R[6], frameMetrics.getMetric(7));
        }
        gme gme7 = this.R;
        if ((gme7.e & 32) != 0) {
            gme.Q(gme7.f3928R[5], frameMetrics.getMetric(6));
        }
        gme gme8 = this.R;
        if ((gme8.e & 128) != 0) {
            gme.Q(gme8.f3928R[7], frameMetrics.getMetric(0));
        }
        gme gme9 = this.R;
        if ((gme9.e & 256) != 0) {
            gme.Q(gme9.f3928R[8], frameMetrics.getMetric(2));
        }
    }
}
