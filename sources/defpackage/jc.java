package defpackage;

import com.termux.terminal.Y;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.Map;

/* renamed from: jc  reason: default package */
/* loaded from: classes.dex */
public final class jc implements nRn {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4976R;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    public jc(Y y, TerminalViewModel terminalViewModel, h0T h0t) {
        this.R = 2;
        this.v = y;
        this.c = terminalViewModel;
        this.f4976R = h0t;
    }

    @Override // defpackage.nRn
    public final void R() {
        switch (this.R) {
            case 0:
                oDO odo = (oDO) ((h0T) this.f4976R).getValue();
                if (odo != null) {
                    ((p2E) this.c).v(new hPn(odo));
                    ((h0T) this.f4976R).R(null);
                }
                for (oDO odo2 : ((Map) this.v).values()) {
                    ((p2E) this.c).v(new hPn(odo2));
                }
                ((Map) this.v).clear();
                return;
            case 1:
                ((nKg) this.f4976R).R(((oVq) this.v).f6837R);
                ((oVq) this.v).f6836R.remove(this.c);
                return;
            default:
                float f = iqx.R;
                ((h0T) this.f4976R).R(null);
                Y y = (Y) this.v;
                B3 b3 = ((TerminalViewModel) this.c).R;
                y.f2416R = b3;
                gje gje = y.f2413R;
                if (gje != null) {
                    gje.f3897R = b3;
                    gje.z();
                    gje.f3908m = true;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jc(Object obj, Object obj2, Object obj3, int i) {
        this.R = i;
        this.f4976R = obj;
        this.v = obj2;
        this.c = obj3;
    }
}
