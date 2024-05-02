package defpackage;

import java.util.Iterator;

/* renamed from: lXf  reason: default package */
/* loaded from: classes.dex */
public final class lXf implements pvc, fai {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final pvc f5766R;

    public lXf(pvc pvc, int i) {
        this.f5766R = pvc;
        this.R = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @Override // defpackage.fai
    public final pvc R(int i) {
        int i2 = this.R + i;
        return i2 < 0 ? new lXf(this, i) : new lXf(this.f5766R, i2);
    }

    @Override // defpackage.pvc
    public final Iterator iterator() {
        return new o7s(this);
    }
}
