package dev.kdrag0n.app.ui.drm;

import android.content.Intent;
import android.os.Bundle;
import dev.kdrag0n.virtcontainer.ui.main.MainActivity;

/* loaded from: classes.dex */
public final class LicenseInvalidActivity extends fNG {
    public F4 R;

    /* renamed from: R  reason: collision with other field name */
    public final pr9 f2717R = new pr9(g8d.R(LicenseInvalidViewModel.class), new j4w(this, 1), new j4w(this, 0), new ket(this, 0));

    public LicenseInvalidActivity() {
        super(0);
    }

    @Override // defpackage.Zh
    public final void K(boolean z) {
        if (z) {
            F4 f4 = this.R;
            if (f4 == null) {
                f4 = null;
            }
            f4.getClass();
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }

    @Override // defpackage.Zh, defpackage.hm9, androidx.activity.d, defpackage.cMB, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Y5.e) {
            getWindow().setDecorFitsSystemWindows(true);
        }
        oer.c(this, aH9.u(new bkx(8, this), true, -623448721));
        mxC.V(this, new bws(this, null));
    }
}
