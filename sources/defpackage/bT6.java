package defpackage;

import android.graphics.Color;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* renamed from: bT6  reason: default package */
/* loaded from: classes.dex */
public final class bT6 implements h2V {
    public final /* synthetic */ TerminalViewModel R;
    public final /* synthetic */ int e;

    public /* synthetic */ bT6(TerminalViewModel terminalViewModel, int i) {
        this.e = i;
        this.R = terminalViewModel;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                doT dot = this.R.f2795R;
                dot.L.R(dot, doT.v[6], Float.valueOf(floatValue));
                return o8s.R;
            case 1:
                return v((String) obj);
            case 2:
                return v((String) obj);
            default:
                ihm ihm = (ihm) obj;
                this.R.f2801v = false;
                return o8s.R;
        }
    }

    public final Object v(String str) {
        oI0 oi0;
        switch (this.e) {
            case 1:
                oMs oms = oI0.R;
                Properties properties = new Properties();
                properties.load(new ByteArrayInputStream(str.getBytes(O1.R)));
                boolean z = false;
                System.arraycopy(oMs.v, 0, oms.R, 0, 260);
                Iterator it = properties.entrySet().iterator();
                while (true) {
                    int i = 258;
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        if (str2.equals("foreground")) {
                            i = 256;
                        } else if (str2.equals("background")) {
                            i = 257;
                        } else if (str2.equals("selection")) {
                            i = 259;
                        } else if (str2.equals("cursor")) {
                            z = true;
                        } else if (str2.startsWith("color")) {
                            try {
                                i = Integer.parseInt(str2.substring(5));
                            } catch (NumberFormatException unused) {
                                throw new IllegalArgumentException(jQ.C("Invalid property: '", str2, "'"));
                            }
                        } else {
                            throw new IllegalArgumentException(jQ.C("Invalid property: '", str2, "'"));
                        }
                        int R = oI0.R(str3);
                        if (R != 0) {
                            oms.R[i] = R;
                        } else {
                            throw new IllegalArgumentException("Property '" + str2 + "' has invalid color: '" + str3 + "'");
                        }
                    } else {
                        if (!z) {
                            int i2 = oms.R[257];
                            int floor = (int) Math.floor(Math.sqrt((Math.pow((double) Color.blue(i2), 2.0d) * 0.068d) + (Math.pow((double) Color.green(i2), 2.0d) * 0.691d) + (Math.pow((double) Color.red(i2), 2.0d) * 0.241d)));
                            if (floor > 0) {
                                if (floor < 130) {
                                    oms.R[258] = -1;
                                } else {
                                    oms.R[258] = -16777216;
                                }
                            }
                        }
                        for (ihm ihm : (Iterable) this.R.f2796R.getValue()) {
                            gje gje = ihm.R.f2413R;
                            if (!(gje == null || (oi0 = gje.f3898R) == null)) {
                                oi0.v();
                            }
                        }
                        return o8s.R;
                    }
                }
                break;
            default:
                TerminalViewModel terminalViewModel = this.R;
                pby[] pbyArr = kxm.R;
                List list = (List) terminalViewModel.f2796R.getValue();
                TerminalViewModel terminalViewModel2 = this.R;
                ivW ivw = terminalViewModel2.f2800v;
                ihm ihm2 = (ihm) dF.q(terminalViewModel2.e() - 1, list);
                if (ihm2 == null && (ihm2 = (ihm) dF.q(this.R.e() + 1, list)) == null) {
                    ihm2 = (ihm) dF.w(list);
                }
                ivw.H(ihm2);
                this.R.f2799R.v(str);
                return o8s.R;
        }
    }
}
