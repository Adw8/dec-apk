package defpackage;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import dev.kdrag0n.app.ui.drm.LicenseInvalidActivity;

/* renamed from: Zh  reason: default package */
/* loaded from: classes.dex */
public abstract class Zh extends pJ {
    public m5f R;

    /* renamed from: R  reason: collision with other field name */
    public oSF f670R;

    public void K(boolean z) {
        if (!(this instanceof LicenseInvalidActivity) && !z) {
            oSF osf = this.f670R;
            if (osf == null) {
                osf = null;
            }
            osf.R.H(null);
            setContentView(new View(this));
            startActivity(new Intent(this, LicenseInvalidActivity.class));
            finish();
        }
    }

    @Override // defpackage.hm9, androidx.activity.d, defpackage.cMB, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!(this instanceof LicenseInvalidActivity)) {
            m5f m5f = this.R;
            if (m5f == null) {
                m5f = null;
            }
            if (!((Boolean) m5f.e.getValue()).booleanValue()) {
                K(false);
                return;
            }
        }
        mxC.V(this, new Hh(this, null));
        if (Y5.e) {
            getWindow().setDecorFitsSystemWindows(false);
        }
        oSF osf = this.f670R;
        if (osf == null) {
            osf = null;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) osf.R.getValue();
        if (sparseIntArray != null) {
            kaR.v.invoke(kaR.R.invoke(null, this, sparseIntArray), this);
        }
        mxC.V(this, new dhd(osf, this, null));
        TypedArray obtainStyledAttributes = obtainStyledAttributes(cUF.f2105R);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        setTheme(resourceId);
    }

    @Override // defpackage.hm9, android.app.Activity
    public void onResume() {
        super.onResume();
        m5f m5f = this.R;
        if (m5f == null) {
            m5f = null;
        }
        K(((Boolean) m5f.e.getValue()).booleanValue());
    }
}
