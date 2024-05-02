package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gWD  reason: default package */
/* loaded from: classes.dex */
public final class gWD {
    public final c71 R;

    /* renamed from: R  reason: collision with other field name */
    public final cmW f3771R;

    /* renamed from: R  reason: collision with other field name */
    public final d5K f3772R;

    /* renamed from: R  reason: collision with other field name */
    public final d5M f3773R;

    /* renamed from: R  reason: collision with other field name */
    public final fBS f3774R;

    /* renamed from: R  reason: collision with other field name */
    public final kY5 f3775R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f3776R;

    /* renamed from: R  reason: collision with other field name */
    public final o4E f3777R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3778R;
    public final boolean v;

    public gWD(kY5 ky5, fBS fbs, d5M d5m, boolean z, boolean z2, o4E o4e, c71 c71, d5K d5k, kg9 kg9) {
        qy qyVar = hrF.R;
        this.f3775R = ky5;
        this.f3774R = fbs;
        this.f3773R = d5m;
        this.f3778R = z;
        this.v = z2;
        this.f3777R = o4e;
        this.R = c71;
        this.f3772R = d5k;
        this.f3771R = qyVar;
        this.f3776R = kg9;
    }

    public final void R(List list) {
        gXZ gxz = this.f3775R.f5336R;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new dbq());
        this.f3776R.x(gxz.R(arrayList));
    }
}
