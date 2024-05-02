package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: fGd  reason: default package */
/* loaded from: classes.dex */
public abstract class fGd extends oLj implements jZi {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(fGd.class, "isTaken");

    /* renamed from: R  reason: collision with other field name */
    public final Object f3367R;
    private volatile /* synthetic */ int isTaken = 0;

    public fGd(Object obj) {
        this.f3367R = obj;
    }

    @Override // defpackage.jZi
    public final void R() {
        V();
    }

    public abstract void Y();

    public abstract boolean h();
}
