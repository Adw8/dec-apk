package defpackage;

import dev.kdrag0n.virt.vm.ForwardedPort;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: mox  reason: default package */
/* loaded from: classes.dex */
public final class mox extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mox(int i, Object obj) {
        super(1);
        this.X = i;
        this.R = obj;
    }

    public final void R(NV nv) {
        switch (this.X) {
            case 13:
                nv.m(64);
                nv.F(((c1p) this.R).f1930R, StandardCharsets.UTF_8);
                return;
            default:
                nv.m(((byte[]) this.R).length);
                nv.i((byte[]) this.R);
                return;
        }
    }

    public final void v(Throwable th) {
        switch (this.X) {
            case lVo.HKDF_SALT_FIELD_NUMBER:
                if (th == null) {
                    ((eTg) this.R).getClass();
                    throw null;
                } else if (!(th instanceof CancellationException)) {
                    ((eTg) this.R).getClass();
                    th.getCause();
                    throw null;
                } else {
                    ((eTg) this.R).getClass();
                    throw null;
                }
            case 12:
                ((boolean[]) this.R)[0] = true;
                return;
            case 13:
            case 14:
            default:
                try {
                    ((lMx) ((r2) this.R)).cancel();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 15:
                ((f7N) this.R).v();
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        int i;
        String str;
        switch (this.X) {
            case 1:
                oE oEVar = (oE) obj;
                if (oEVar.n()) {
                    if (((lt) oEVar.e()).f5851R) {
                        oEVar.F();
                    }
                    HashMap hashMap = ((lt) oEVar.e()).R;
                    lt ltVar = (lt) this.R;
                    for (Map.Entry entry : hashMap.entrySet()) {
                        lt.R(ltVar, (XI) entry.getKey(), ((Number) entry.getValue()).intValue(), oEVar.i());
                    }
                    for (poS pos = ((poS) oEVar.i()).f7284v; !n3x.v(pos, ((lt) this.R).f5850R.i()); pos = pos.f7284v) {
                        Set<XI> keySet = ((lt) this.R).v(pos).keySet();
                        lt ltVar2 = (lt) this.R;
                        for (XI xi : keySet) {
                            switch (((k5m) ltVar2).R) {
                                case 0:
                                    i = pos.P(xi);
                                    break;
                                default:
                                    i = pos.f7279R.P(xi);
                                    break;
                            }
                            lt.R(ltVar2, xi, i, pos);
                        }
                    }
                }
                return o8s.R;
            case 2:
            default:
                return iH_.mL((CharSequence) this.R, (heu) obj);
            case 3:
                ((biT) this.R).v((eo1) obj);
                return Boolean.TRUE;
            case 4:
                gqK gqk = (gqK) obj;
                gd gdVar = (gd) this.R;
                int[] iArr = gd.R;
                gdVar.getClass();
                if (gqk.isValid()) {
                    gdVar.f3814R.getSnapshotObserver().R(gqk, gdVar.f3821R, new im(gqk, 1, gdVar));
                }
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                dlc dlc = (dlc) obj;
                return new acE(7, (oHC) this.R);
            case 6:
                o8s o8s = o8s.R;
                ((gn) this.R).e(o8s);
                return o8s;
            case 7:
                onS.v((bNL) obj, ((fzf) this.R).R);
                return o8s.R;
            case VmNativeCallback.$stable:
                nlN nln = (nlN) obj;
                return ((bYd) this.R).R(new nlN(null, nln.f6575R, nln.R, nln.v, nln.f6574R)).getValue();
            case 9:
                b9g b9g = (b9g) obj;
                return '\'' + b9g.v() + "' " + b9g.R();
            case 10:
                ((fue) this.R).G((jJj) obj);
                return o8s.R;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                v((Throwable) obj);
                return o8s.R;
            case 12:
                v((Throwable) obj);
                return o8s.R;
            case 13:
                R((NV) obj);
                return o8s.R;
            case 14:
                R((NV) obj);
                return o8s.R;
            case 15:
                v((Throwable) obj);
                return o8s.R;
            case 16:
                v((Throwable) obj);
                return o8s.R;
            case 17:
                Set<String> set = (Set) obj;
                gkP gkp = (gkP) this.R;
                ArrayList arrayList = new ArrayList(a6.B(set, 10));
                for (String str2 : set) {
                    arrayList.add((ForwardedPort) gkp.f3921R.v(str2));
                }
                return dF.ZW(arrayList, new gvk(9));
            case 18:
                ((Boolean) obj).booleanValue();
                ((RootSettingsViewModel) this.R).e();
                return o8s.R;
            case 19:
                return obj == ((U1) this.R) ? "(this Collection)" : String.valueOf(obj);
            case 20:
                Map.Entry entry2 = (Map.Entry) obj;
                Oa oa = (Oa) this.R;
                oa.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry2.getKey();
                String str3 = "(this Map)";
                sb.append(key == oa ? str3 : String.valueOf(key));
                sb.append('=');
                Object value = entry2.getValue();
                if (value != oa) {
                    str3 = String.valueOf(value);
                }
                sb.append(str3);
                return sb.toString();
            case 21:
                kMB kmb = (kMB) obj;
                ((byj) this.R).getClass();
                if (kmb.R == 0) {
                    return "*";
                }
                ooI ooi = kmb.f5275R;
                byj byj = ooi instanceof byj ? (byj) ooi : null;
                if (byj == null || (str = byj.R(true)) == null) {
                    str = String.valueOf(kmb.f5275R);
                }
                int I = jQ.I(kmb.R);
                if (I == 0) {
                    return str;
                }
                if (I == 1) {
                    return opT.H("in ", str);
                }
                if (I == 2) {
                    return opT.H("out ", str);
                }
                throw new j8f((Object) null);
            case 22:
                return ((aqS) this.R).v(((Number) obj).intValue());
        }
    }
}
