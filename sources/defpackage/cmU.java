package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cmU  reason: default package */
/* loaded from: classes.dex */
public final class cmU implements giw {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public Pc f2190R;

    /* renamed from: R  reason: collision with other field name */
    public final Map f2191R;
    public Pc v;

    public cmU(LinkedHashMap linkedHashMap, int i) {
        this.f2191R = linkedHashMap;
        this.R = i;
    }

    @Override // defpackage.giw
    public final int L() {
        return 0;
    }

    @Override // defpackage.giw
    public final int O() {
        return this.R;
    }

    @Override // defpackage.iHW
    public final boolean R() {
        return false;
    }

    @Override // defpackage.iHW
    public final long X(Pc pc, Pc pc2, Pc pc3) {
        return ((long) (O() + 0)) * 1000000;
    }

    @Override // defpackage.iHW
    public final Pc c(long j, Pc pc, Pc pc2, Pc pc3) {
        int i = 0;
        long H = caw.H((j / 1000000) - ((long) 0), (long) O());
        if (H <= 0) {
            return pc3;
        }
        Pc v = v((H - 1) * 1000000, pc, pc2, pc3);
        Pc v2 = v(H * 1000000, pc, pc2, pc3);
        if (this.f2190R == null) {
            this.f2190R = pc.c();
            this.v = pc.c();
        }
        int v3 = v.v();
        while (true) {
            Pc pc4 = null;
            if (i >= v3) {
                break;
            }
            i++;
            Pc pc5 = this.v;
            if (pc5 != null) {
                pc4 = pc5;
            }
            pc4.X(i, (v.R(i) - v2.R(i)) * 1000.0f);
        }
        Pc pc6 = this.v;
        if (pc6 == null) {
            return null;
        }
        return pc6;
    }

    @Override // defpackage.iHW
    public final Pc e(Pc pc, Pc pc2, Pc pc3) {
        return o02.P(this, pc, pc2, pc3);
    }

    @Override // defpackage.iHW
    public final Pc v(long j, Pc pc, Pc pc2, Pc pc3) {
        int i = 0;
        int H = (int) caw.H((j / 1000000) - ((long) 0), (long) O());
        if (this.f2191R.containsKey(Integer.valueOf(H))) {
            return (Pc) ((kSh) mHQ.K(Integer.valueOf(H), this.f2191R)).R;
        }
        int i2 = this.R;
        if (H >= i2) {
            return pc2;
        }
        if (H <= 0) {
            return pc;
        }
        oUk ouk = hiK.R;
        Pc pc4 = pc;
        int i3 = 0;
        for (Map.Entry entry : this.f2191R.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            kSh ksh = (kSh) entry.getValue();
            if (H > intValue && intValue >= i3) {
                pc4 = (Pc) ksh.R;
                ouk = (oUk) ksh.v;
                i3 = intValue;
            } else if (H < intValue && intValue <= i2) {
                pc2 = (Pc) ksh.R;
                i2 = intValue;
            }
        }
        float R = ouk.R(((float) (H - i3)) / ((float) (i2 - i3)));
        if (this.f2190R == null) {
            this.f2190R = pc.c();
            this.v = pc.c();
        }
        int v = pc4.v();
        while (true) {
            Pc pc5 = null;
            if (i >= v) {
                break;
            }
            i++;
            Pc pc6 = this.f2190R;
            if (pc6 != null) {
                pc5 = pc6;
            }
            float R2 = pc4.R(i);
            float R3 = pc2.R(i);
            oHg ohg = kYZ.R;
            pc5.X(i, (R3 * R) + ((((float) 1) - R) * R2));
        }
        Pc pc7 = this.f2190R;
        if (pc7 == null) {
            return null;
        }
        return pc7;
    }
}
