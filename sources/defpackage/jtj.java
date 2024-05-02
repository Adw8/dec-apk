package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* renamed from: jtj  reason: default package */
/* loaded from: classes.dex */
public final class jtj extends jEL {
    public final /* synthetic */ int R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jtj(krG krg, cqI cqi, int i) {
        super(krg, cqi);
        this.R = i;
    }

    @Override // defpackage.jEL, defpackage.nWA
    public final void e(Bundle bundle, Bundle bundle2) {
        switch (this.R) {
            case 1:
                super.e(bundle, bundle2);
                ((jEL) this).R.v((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
                return;
            default:
                super.e(bundle, bundle2);
                return;
        }
    }
}
