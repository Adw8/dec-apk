package defpackage;

import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: ax8  reason: default package */
/* loaded from: classes.dex */
public final class ax8 implements nxu {
    public final /* synthetic */ Type R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ k49 f1492R;

    public ax8(Type type) {
        lN_ ln_ = lN_.R;
        this.R = type;
        this.f1492R = ln_;
    }

    @Override // defpackage.nxu
    public final k49 R(Type type, Set set, k_Z k_z) {
        if (set.isEmpty()) {
            Type type2 = this.R;
            Set set2 = mzK.f6263R;
            if (cpc.I(type2, type)) {
                return this.f1492R;
            }
        }
        return null;
    }
}
