package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: bow  reason: default package */
/* loaded from: classes.dex */
public final class bow extends g9t {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(bow.class, "_invoked");

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f1813R;
    private volatile /* synthetic */ int _invoked = 0;

    public bow(kg9 kg9) {
        this.f1813R = kg9;
    }

    @Override // defpackage.pbU
    public final void h(Throwable th) {
        if (R.compareAndSet(this, 0, 1)) {
            this.f1813R.x(th);
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        h((Throwable) obj);
        return o8s.R;
    }
}
