package defpackage;

import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.create.CreateFragment;

/* renamed from: nYR  reason: default package */
/* loaded from: classes.dex */
public final class nYR implements h2V {
    public final /* synthetic */ CreateFragment R;
    public final /* synthetic */ int e;

    public /* synthetic */ nYR(CreateFragment createFragment, int i) {
        this.e = i;
        this.R = createFragment;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                iTI.Z(this.R).N();
                iTI.Z(this.R).H(R.id.terminal, hDC.X(new kSh("container_id", (String) obj)), null);
                break;
            default:
                kSh ksh = (kSh) obj;
                iTI.Z(this.R).N();
                iTI.Z(this.R).H(R.id.terminal, hDC.X(new kSh("container_id", (String) ksh.v), new kSh("force_new", Boolean.TRUE), new kSh("initial_command", (String[]) ksh.R)), null);
                break;
        }
        return o8s.R;
    }
}
