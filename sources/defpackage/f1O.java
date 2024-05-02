package defpackage;

/* renamed from: f1O  reason: default package */
/* loaded from: classes.dex */
public final class f1O implements cav {
    public final boolean R;

    public f1O(boolean z) {
        this.R = z;
    }

    @Override // defpackage.cav
    public final boolean X() {
        return this.R;
    }

    @Override // defpackage.cav
    public final npH Z() {
        return null;
    }

    public final String toString() {
        StringBuilder U = opT.U("Empty{");
        U.append(this.R ? "Active" : "New");
        U.append('}');
        return U.toString();
    }
}
