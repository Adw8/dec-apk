package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: jhx  reason: default package */
/* loaded from: classes.dex */
public final class jhx extends c2D {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f5002R;
    public final /* synthetic */ Object v;

    public /* synthetic */ jhx(Object obj, int i, Object obj2) {
        this.R = i;
        this.v = obj;
        this.f5002R = obj2;
    }

    @Override // defpackage.lpP
    public final void c(hFt hft) {
        switch (this.R) {
            case 0:
                mZP mzp = kkY.R;
                ((View) this.f5002R).setTransitionAlpha(1.0f);
                hft.h(this);
                return;
            case 1:
                ((ArrayList) ((FK) this.f5002R).getOrDefault(((l5K) this.v).R, null)).remove(hft);
                hft.h(this);
                return;
            default:
                ((hFt) this.f5002R).z();
                hft.h(this);
                return;
        }
    }
}
