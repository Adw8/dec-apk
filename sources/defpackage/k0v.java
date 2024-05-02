package defpackage;

import java.util.Iterator;

/* renamed from: k0v  reason: default package */
/* loaded from: classes.dex */
public final class k0v implements pvc {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5179R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f5180R;

    public k0v(pvc pvc, kg9 kg9, int i) {
        this.R = i;
        if (i == 1) {
            this.f5179R = pvc;
            this.f5180R = kg9;
        } else if (i != 2) {
            this.f5179R = pvc;
            this.f5180R = kg9;
        } else {
            this.f5179R = pvc;
            this.f5180R = kg9;
        }
    }

    @Override // defpackage.pvc
    public final Iterator iterator() {
        switch (this.R) {
            case 0:
                return new e4a(((pvc) this.f5179R).iterator(), this.f5180R);
            case 1:
                return new bQO(this);
            case 2:
                return new d6i(this);
            default:
                return new nY8(this);
        }
    }

    public k0v(bBd bbd, kg9 kg9) {
        this.R = 3;
        this.f5179R = bbd;
        this.f5180R = kg9;
    }
}
