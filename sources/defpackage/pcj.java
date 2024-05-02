package defpackage;

import android.os.Trace;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: pcj  reason: default package */
/* loaded from: classes.dex */
public final class pcj {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lGT f7126R;

    public pcj(lGT lgt, Object obj) {
        this.f7126R = lgt;
        this.R = obj;
    }

    /* JADX INFO: finally extract failed */
    public final void R(long j, int i) {
        fue fue = (fue) this.f7126R.f5642c.get(this.R);
        if (fue != null && fue.K()) {
            int size = fue.H().size();
            if (i < 0 || i >= size) {
                throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
            } else if (!fue.f3608X) {
                fue fue2 = this.f7126R.f5637R;
                fue2.c = true;
                gzG Kl = msU.Kl(fue);
                fue fue3 = (fue) fue.H().get(i);
                AndroidComposeView androidComposeView = (AndroidComposeView) Kl;
                Trace.beginSection("AndroidOwner:measureAndLayout");
                try {
                    androidComposeView.f1209R.L(fue3, j);
                    androidComposeView.f1209R.R(false);
                    Trace.endSection();
                    fue2.c = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }
}
