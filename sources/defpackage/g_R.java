package defpackage;

import java.util.Iterator;

/* renamed from: g_R  reason: default package */
/* loaded from: classes.dex */
public final class g_R implements pvc {
    public final kg9 R;

    /* renamed from: R  reason: collision with other field name */
    public final pvc f3793R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3794R;

    public g_R(pvc pvc, boolean z, g5M g5m) {
        this.f3793R = pvc;
        this.f3794R = z;
        this.R = g5m;
    }

    @Override // defpackage.pvc
    public final Iterator iterator() {
        return new bQO(this);
    }
}
