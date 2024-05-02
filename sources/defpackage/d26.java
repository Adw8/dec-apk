package defpackage;

import androidx.activity.c;

/* renamed from: d26  reason: default package */
/* loaded from: classes.dex */
public final class d26 implements hS {
    public final /* synthetic */ c R;

    /* renamed from: R  reason: collision with other field name */
    public final jnM f2471R;

    public d26(c cVar, jnM jnm) {
        this.R = cVar;
        this.f2471R = jnm;
    }

    @Override // defpackage.hS
    public final void cancel() {
        this.R.f1008R.remove(this.f2471R);
        this.f2471R.f5016R.remove(this);
        this.f2471R.R = null;
        this.R.c();
    }
}
