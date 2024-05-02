package defpackage;

/* renamed from: cqt  reason: default package */
/* loaded from: classes.dex */
public final class cqt implements gBU {
    public gBU[] R;

    public cqt(gBU... gbuArr) {
        this.R = gbuArr;
    }

    @Override // defpackage.gBU
    public final bWV R(Class cls) {
        gBU[] gbuArr = this.R;
        for (gBU gbu : gbuArr) {
            if (gbu.v(cls)) {
                return gbu.R(cls);
            }
        }
        StringBuilder U = opT.U("No factory is available for message type: ");
        U.append(cls.getName());
        throw new UnsupportedOperationException(U.toString());
    }

    @Override // defpackage.gBU
    public final boolean v(Class cls) {
        for (gBU gbu : this.R) {
            if (gbu.v(cls)) {
                return true;
            }
        }
        return false;
    }
}
