package defpackage;

import java.util.Iterator;

/* renamed from: iKS  reason: default package */
/* loaded from: classes.dex */
public final class iKS extends U1 {
    public final e76 R;

    public iKS(e76 e76) {
        this.R = e76;
    }

    @Override // defpackage.U1
    public final int R() {
        e76 e76 = this.R;
        e76.getClass();
        return e76.e;
    }

    @Override // defpackage.U1, java.util.Collection
    public final boolean contains(Object obj) {
        return this.R.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new gah(this.R.f2983R, 2);
    }
}
