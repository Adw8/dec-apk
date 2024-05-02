package defpackage;

import android.os.Bundle;
import java.util.Map;

/* renamed from: ahX  reason: default package */
/* loaded from: classes.dex */
public final class ahX implements kod {
    public Bundle R;

    /* renamed from: R  reason: collision with other field name */
    public final bV5 f979R;

    /* renamed from: R  reason: collision with other field name */
    public final bhK f980R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f981R;

    public ahX(bhK bhk, ly1 ly1) {
        this.f980R = bhk;
        this.f979R = new bV5(new q4(25, ly1));
    }

    @Override // defpackage.kod
    public final Bundle R() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.R;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((avO) this.f979R.getValue()).R.entrySet()) {
            String str = (String) entry.getKey();
            Bundle R = ((nmx) entry.getValue()).f6584R.R();
            if (!n3x.v(R, Bundle.EMPTY)) {
                bundle.putBundle(str, R);
            }
        }
        this.f981R = false;
        return bundle;
    }
}
