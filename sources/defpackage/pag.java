package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: pag  reason: default package */
/* loaded from: classes.dex */
public class pag {
    public static final /* synthetic */ AtomicIntegerFieldUpdater R = AtomicIntegerFieldUpdater.newUpdater(pag.class, "_handled");

    /* renamed from: R  reason: collision with other field name */
    public final Throwable f7100R;
    private volatile /* synthetic */ int _handled;

    public pag(Throwable th, boolean z) {
        this.f7100R = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public final boolean R() {
        return this._handled;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f7100R + ']';
    }
}
