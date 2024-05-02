package defpackage;

import java.util.Set;

/* renamed from: kJe  reason: default package */
/* loaded from: classes.dex */
public final class kJe implements hv5 {
    public final hv5 R;

    /* renamed from: R  reason: collision with other field name */
    public final iqE f5253R;

    /* renamed from: R  reason: collision with other field name */
    public final Set f5254R;

    public kJe(Set set, hv5 hv5, pkd pkd) {
        this.f5254R = set;
        this.R = hv5;
        this.f5253R = new iqE(pkd);
    }

    @Override // defpackage.hv5
    public final kvj R(Class cls) {
        return this.f5254R.contains(cls.getName()) ? this.f5253R.R(cls) : this.R.R(cls);
    }

    @Override // defpackage.hv5
    public final kvj v(Class cls, o0y o0y) {
        return this.f5254R.contains(cls.getName()) ? this.f5253R.v(cls, o0y) : this.R.v(cls, o0y);
    }
}
