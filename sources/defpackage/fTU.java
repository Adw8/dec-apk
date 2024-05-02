package defpackage;

import java.io.OutputStream;

/* renamed from: fTU  reason: default package */
/* loaded from: classes.dex */
public final class fTU extends oYJ {
    public fTU(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.Zz
    public final fTU L() {
        return this;
    }

    @Override // defpackage.oYJ, defpackage.Zz
    public final void V(O o) {
        o.u().K(this, true);
    }

    @Override // defpackage.oYJ, defpackage.Zz
    public final void j(b[] bVarArr) {
        for (b bVar : bVarArr) {
            bVar.v().u().K(this, true);
        }
    }

    @Override // defpackage.oYJ, defpackage.Zz
    public final void o(O[] oArr) {
        for (O o : oArr) {
            o.u().K(this, true);
        }
    }
}
