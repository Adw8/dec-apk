package defpackage;

import java.util.ArrayList;

/* renamed from: s8  reason: default package */
/* loaded from: classes.dex */
public abstract class s8 implements Su {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f7407R = new ArrayList();
    public Object v;

    public s8(Object obj) {
        this.R = obj;
        this.v = obj;
    }

    @Override // defpackage.Su
    public final void O(Object obj) {
        this.f7407R.add(this.v);
        this.v = obj;
    }

    @Override // defpackage.Su
    public final Object c() {
        return this.v;
    }

    @Override // defpackage.Su
    public final void clear() {
        this.f7407R.clear();
        this.v = this.R;
        m();
    }

    @Override // defpackage.Su
    public final void e() {
        if (!this.f7407R.isEmpty()) {
            ArrayList arrayList = this.f7407R;
            this.v = arrayList.remove(arrayList.size() - 1);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public abstract void m();
}
