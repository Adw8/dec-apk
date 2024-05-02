package defpackage;

import android.graphics.Canvas;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: jh  reason: default package */
/* loaded from: classes.dex */
public final class jh extends k8G implements kg9 {
    public final /* synthetic */ fue R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ qc f5001R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh(qc qcVar, fue fue, int i) {
        super(1);
        this.X = i;
        this.f5001R = qcVar;
        this.R = fue;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                h57 h57 = (h57) obj;
                gvP.c(this.f5001R, this.R);
                break;
            case 1:
                fue fue = this.R;
                qc qcVar = this.f5001R;
                Gp R = ((fiv) obj).G().R();
                gzG gzg = fue.f3595R;
                AndroidComposeView androidComposeView = gzg instanceof AndroidComposeView ? (AndroidComposeView) gzg : null;
                if (androidComposeView != null) {
                    Canvas canvas = dO.R;
                    Canvas canvas2 = ((W3) R).R;
                    androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                    qcVar.draw(canvas2);
                }
                return o8s.R;
            default:
                hjM hjm = (hjM) obj;
                gvP.c(this.f5001R, this.R);
                break;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jh(fue fue, gJ8 gj8) {
        super(1);
        this.X = 1;
        this.R = fue;
        this.f5001R = gj8;
    }
}
