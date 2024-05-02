package defpackage;

import android.provider.Settings;
import dev.kdrag0n.app.debug.DebugInfo;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

/* renamed from: aLl  reason: default package */
/* loaded from: classes.dex */
public final class aLl extends k8G implements f_c {
    public final /* synthetic */ ZipOutputStream R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mMh f842R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aLl(mMh mmh, ZipOutputStream zipOutputStream, int i) {
        super(0);
        this.X = i;
        this.f842R = mmh;
        this.R = zipOutputStream;
    }

    public final void R() {
        String str;
        switch (this.X) {
            case 0:
                String packageName = this.f842R.f6018R.getPackageName();
                String V = gvP.V(-3881547954696742803L);
                String format = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
                iGi igi = (iGi) this.f842R.f6021R.e.getValue();
                oLT olt = this.f842R.f6022R.R;
                boolean z = C1.R(olt.f6770R, olt.R.R) == 0;
                boolean R = this.f842R.f6022R.R.R();
                boolean booleanValue = ((Boolean) l6.T(aIH.R, new dUx(this.f842R, null))).booleanValue();
                List<kSh> list = dKq.f2564R;
                mMh mmh = this.f842R;
                int y = jjU.y(a6.B(list, 10));
                if (y < 16) {
                    y = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(y);
                for (kSh ksh : list) {
                    String str2 = (String) ksh.R;
                    String str3 = (String) ksh.v;
                    String C = jQ.C(str2, "/", str3);
                    int hashCode = str2.hashCode();
                    if (hashCode != -1243020381) {
                        if (hashCode != -906273929) {
                            if (hashCode == -887328209 && str2.equals(gvP.V(-3881548220984715155L))) {
                                str = Settings.System.getString(mmh.f6018R.getContentResolver(), str3);
                                linkedHashMap.put(C, str);
                            }
                            throw new IllegalArgumentException(opT.H("Invalid type ", str2));
                        } else if (str2.equals(gvP.V(-3881548281114257299L))) {
                            str = Settings.Secure.getString(mmh.f6018R.getContentResolver(), str3);
                            linkedHashMap.put(C, str);
                        } else {
                            throw new IllegalArgumentException(opT.H("Invalid type ", str2));
                        }
                    } else if (str2.equals(gvP.V(-3881548251049486227L))) {
                        str = Settings.Global.getString(mmh.f6018R.getContentResolver(), str3);
                        linkedHashMap.put(C, str);
                    } else {
                        throw new IllegalArgumentException(opT.H("Invalid type ", str2));
                    }
                }
                Map<String, ?> all = this.f842R.f6019R.R.getAll();
                String str4 = (String) this.f842R.f6025R.f5923v.getValue();
                String str5 = (String) this.f842R.f6025R.c.getValue();
                boolean booleanValue2 = ((Boolean) this.f842R.f6025R.e.getValue()).booleanValue();
                boolean X = this.f842R.f6025R.X();
                int i = ((i65) this.f842R.f6025R.X.getValue()).R;
                cYD cyd = (cYD) this.f842R.f6025R.O.getValue();
                this.R.write(iH_.z(this.f842R.f6024R.X(new DebugInfo(1, packageName, 999957, V, format, igi, z, R, booleanValue, linkedHashMap, all, str4, str5, booleanValue2, X, i, cyd != null ? Integer.valueOf(cyd.R) : null))));
                return;
            default:
                hVj hvj = this.f842R.f6020R;
                ZipOutputStream zipOutputStream = this.R;
                Iterator it = hvj.f4289R.iterator();
                while (it.hasNext()) {
                    zipOutputStream.write(iH_.z(((hUp) it.next()).toString()));
                }
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
