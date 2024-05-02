package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: lyr  reason: default package */
/* loaded from: classes.dex */
public final class lyr extends rS {
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(lyr.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    @Override // defpackage.rS
    public final boolean R(lo loVar) {
        ivW ivw = (ivW) loVar;
        if (this._state != null) {
            return false;
        }
        this._state = g4x.f3669R;
        return true;
    }

    @Override // defpackage.rS
    public final aOO[] v(lo loVar) {
        ivW ivw = (ivW) loVar;
        this._state = null;
        return vd.f7443R;
    }
}
