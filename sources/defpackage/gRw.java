package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: gRw  reason: default package */
/* loaded from: classes.dex */
public final class gRw implements Map.Entry, i1l {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pjN f3763R;
    public Object v;

    public gRw(pjN pjn) {
        this.f3763R = pjn;
        this.R = ((p30) pjn).f7061R.getKey();
        this.v = ((p30) pjn).f7061R.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.R;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.v;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        pjN pjn = this.f3763R;
        if (((p30) pjn).R.R().v == pjn.e) {
            Object obj2 = this.v;
            ((p30) pjn).R.put(this.R, obj);
            this.v = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
