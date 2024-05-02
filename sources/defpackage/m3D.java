package defpackage;

/* renamed from: m3D  reason: default package */
/* loaded from: classes.dex */
public final class m3D implements jy_ {
    public final nbD R;

    public m3D(nbD nbd) {
        this.R = nbd;
    }

    @Override // defpackage.jy_
    public final nbD C() {
        return this.R;
    }

    public final String toString() {
        StringBuilder U = opT.U("CoroutineScope(coroutineContext=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
