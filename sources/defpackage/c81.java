package defpackage;

/* renamed from: c81  reason: default package */
/* loaded from: classes.dex */
public final class c81 extends abW {
    public volatile Object owner;

    public c81(Object obj) {
        this.owner = obj;
    }

    @Override // defpackage.oLj
    public final String toString() {
        StringBuilder U = opT.U("LockedQueue[");
        U.append(this.owner);
        U.append(']');
        return U.toString();
    }
}
