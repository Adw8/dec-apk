package defpackage;

import java.util.ArrayList;

/* renamed from: hqD  reason: default package */
/* loaded from: classes.dex */
public abstract class hqD extends kwo {
    public ArrayList v = new ArrayList();

    @Override // defpackage.kwo
    public void I() {
        this.v.clear();
        super.I();
    }

    public abstract void p();

    @Override // defpackage.kwo
    public final void z(piu piu) {
        super.z(piu);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            ((kwo) this.v.get(i)).z(piu);
        }
    }
}
