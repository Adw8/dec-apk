package dev.kdrag0n.virtcontainer.ui.settings.forward.create;

import dev.kdrag0n.virt.vm.ForwardedPort;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class PortForwardCreateViewModel extends kvj {
    public final ivW L;
    public final ivW O;
    public final aME R;

    /* renamed from: R  reason: collision with other field name */
    public final gkP f2775R;

    /* renamed from: R  reason: collision with other field name */
    public final i4m f2776R;
    public final ivW X;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f2777R = g4x.O(null);
    public final ivW v = g4x.O(null);
    public final ivW c = g4x.O("");
    public final ivW e = g4x.O("");

    /* renamed from: R  reason: collision with other field name */
    public final iyL f2778R = new iyL();

    public PortForwardCreateViewModel(gkP gkp, aME ame) {
        this.f2775R = gkp;
        this.R = ame;
        this.f2776R = gkp.f3917R;
        Boolean bool = Boolean.FALSE;
        this.X = g4x.O(bool);
        this.O = g4x.O(bool);
        this.L = g4x.O(bool);
        l6.z(gvP.o(this), null, 0, new jVR(this, null), 3);
        l6.z(gvP.o(this), null, 0, new pvP(this, null), 3);
    }

    public static final void e(PortForwardCreateViewModel portForwardCreateViewModel) {
        portForwardCreateViewModel.O.H(Boolean.valueOf(portForwardCreateViewModel.X() != null));
    }

    public final ForwardedPort X() {
        boolean z;
        try {
            String str = (String) this.v.getValue();
            if (str == null) {
                return null;
            }
            int parseInt = Integer.parseInt((String) this.c.getValue());
            int parseInt2 = Integer.parseInt((String) this.e.getValue());
            ForwardedPort forwardedPort = new ForwardedPort(str, parseInt, parseInt2, ((Boolean) this.X.getValue()).booleanValue());
            boolean z2 = false;
            if (!(1 <= parseInt && parseInt < 65536)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (1024 <= parseInt2 && parseInt2 < 65536) {
                Iterable<ForwardedPort> iterable = (Iterable) this.f2776R.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (ForwardedPort forwardedPort2 : iterable) {
                        if (forwardedPort2.v == forwardedPort.v) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                } else if (!((List) this.f2776R.getValue()).contains(forwardedPort)) {
                    return forwardedPort;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
