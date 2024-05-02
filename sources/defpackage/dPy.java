package defpackage;

import dev.kdrag0n.virtcontainer.ui.terminal.TerminalFragment;
import java.util.List;

/* renamed from: dPy  reason: default package */
/* loaded from: classes.dex */
public final class dPy implements h2V {
    public final /* synthetic */ TerminalFragment R;
    public final /* synthetic */ int e;

    public /* synthetic */ dPy(TerminalFragment terminalFragment, int i) {
        this.e = i;
        this.R = terminalFragment;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                String str = (String) obj;
                TerminalFragment terminalFragment = this.R;
                int i = TerminalFragment.x;
                ihm ihm = (ihm) terminalFragment.a().f2800v.getValue();
                if (n3x.v(str, ihm != null ? ihm.f4698R : null)) {
                    iTI.Z(this.R).C();
                }
                return o8s.R;
            default:
                if (((List) obj).isEmpty()) {
                    TerminalFragment terminalFragment2 = this.R;
                    int i2 = TerminalFragment.x;
                    if (!terminalFragment2.a().f2801v) {
                        iTI.Z(this.R).C();
                    }
                }
                return o8s.R;
        }
    }
}
