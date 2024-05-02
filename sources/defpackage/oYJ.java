package defpackage;

import java.io.OutputStream;

/* renamed from: oYJ  reason: default package */
/* loaded from: classes.dex */
public class oYJ extends Zz {
    public oYJ(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.Zz
    public void V(O o) {
        o.z().K(this, true);
    }

    @Override // defpackage.Zz
    public final oYJ Z() {
        return this;
    }

    @Override // defpackage.Zz
    public void j(b[] bVarArr) {
        for (b bVar : bVarArr) {
            bVar.v().z().K(this, true);
        }
    }

    @Override // defpackage.Zz
    public void o(O[] oArr) {
        for (O o : oArr) {
            o.z().K(this, true);
        }
    }
}
