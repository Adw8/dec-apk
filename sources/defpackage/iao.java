package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import dev.kdrag0n.app.arch.ProcessLifecycleEvents;
import dev.kdrag0n.app.data.debug.CrashInfo;
import dev.kdrag0n.app.debug.DebugInfo;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.lang.reflect.Type;
import java.security.KeyStore;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: iao  reason: default package */
/* loaded from: classes.dex */
public final class iao implements lXY {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final fMX f4660R;

    public iao(fMX fmx, int i) {
        this.f4660R = fmx;
        this.R = i;
    }

    @Override // defpackage.lXY
    public final Object get() {
        boolean z = false;
        switch (this.R) {
            case 0:
                Context R = mSI.R(this.f4660R.R);
                F4 f4 = (F4) this.f4660R.f3397R.get();
                gcd gcd = (gcd) this.f4660R.m.get();
                kUC kuc = (kUC) this.f4660R.H.get();
                eNg eng = (eNg) this.f4660R.C.get();
                k2z k2z = (k2z) this.f4660R.Z.get();
                dq dqVar = new dq(mSI.R(this.f4660R.R));
                fMX fmx = this.f4660R;
                nax nax = new nax(mSI.R(fmx.R), (F4) fmx.f3397R.get());
                cr crVar = new cr(mSI.R(this.f4660R.R));
                eJw ejw = (eJw) this.f4660R.y.get();
                fMX fmx2 = this.f4660R;
                nak.R(this.f4660R.X);
                return new m5f(R, f4, gcd, kuc, eng, k2z, dqVar, nax, crVar, ejw, new cGy((F4) fmx2.f3397R.get(), (k2z) fmx2.Z.get(), (ao9) fmx2.U.get(), (k49) fmx2.t.get()), (ao9) this.f4660R.U.get(), (k49) this.f4660R.t.get());
            case 1:
                return new F4(gvP.V(-3881549651208824723L), gvP.V(-3881549883137058707L));
            case 2:
                return new gcd((Tq) this.f4660R.c.get(), (k2z) this.f4660R.Z.get());
            case 3:
                return new doT(mSI.R(this.f4660R.R), (SharedPreferences) this.f4660R.v.get());
            case 4:
                return mSI.R(this.f4660R.R).getSharedPreferences("dev.kdrag0n.virtcontainer_preferences", 0);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                Context R2 = mSI.R(this.f4660R.R);
                nak.R(this.f4660R.X);
                eDt edt = (eDt) this.f4660R.L.get();
                return new k2z(R2);
            case 6:
                return new ium((SharedPreferences) this.f4660R.e.get());
            case 7:
                Context R3 = mSI.R(this.f4660R.R);
                F4 f42 = (F4) this.f4660R.f3397R.get();
                try {
                    return dip.R(R3, f42);
                } catch (Exception unused) {
                    List list = dip.R;
                    try {
                        Context applicationContext = R3.getApplicationContext();
                        String str = f42.R + "_preferences2";
                        SharedPreferences.Editor edit = applicationContext.getSharedPreferences(str, 0).edit();
                        edit.clear();
                        edit.apply();
                        if (Y5.f623R) {
                            applicationContext.deleteSharedPreferences(str);
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        KeyStore instance = KeyStore.getInstance(afN.R(-32809282032524L));
                        instance.load(null);
                        instance.deleteEntry(afN.R(-32878001509260L));
                    } catch (Throwable unused3) {
                    }
                    try {
                        return dip.R(R3, f42);
                    } catch (Throwable unused4) {
                        return new iIX();
                    }
                }
            case VmNativeCallback.$stable:
                mSI.R(this.f4660R.R);
                UserManager userManager = (UserManager) this.f4660R.O.get();
                return new eDt();
            case 9:
                Application m = cUF.m(this.f4660R.R.R);
                if (m != null) {
                    Object obj = C1.R;
                    return (UserManager) dmD.v(m, UserManager.class);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 10:
                return new kUC((nZz) this.f4660R.x.get());
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                jwR jwr = new jwR();
                jwr.f5146v = true;
                nZz nzz = new nZz(jwr);
                jwR R4 = nzz.R();
                String R5 = afN.R(-45024169022348L);
                hro hro = new hro();
                hro.X(null, R5);
                a7_ v = hro.v();
                cB6 cb6 = new cB6(afN.R(-45170197910412L), dip.R);
                jwR R6 = nzz.R();
                oFB ofb = jcw.R;
                if (!n3x.v(cb6, R6.f5138R)) {
                    R6.f5139R = null;
                }
                R6.f5138R = cb6;
                a50 a50 = new a50(new jcw(new nZz(R6), v, true, false));
                if (!n3x.v(a50, R4.f5138R)) {
                    R4.f5139R = null;
                }
                R4.f5138R = a50;
                return new nZz(R4);
            case 12:
                Context R7 = mSI.R(this.f4660R.R);
                ao9 ao9 = (ao9) this.f4660R.U.get();
                return new eNg(R7);
            case 13:
                Context R8 = mSI.R(this.f4660R.R);
                List list2 = dip.v;
                long j = fgL.c;
                long j2 = fgL.v;
                long j3 = fgL.R;
                long j4 = fgL.e;
                dq dqVar2 = new dq();
                aQM aqm = new aQM(R8.getSharedPreferences("com.lyft.kronos.shared_preferences", 0));
                if (!(dqVar2 instanceof ao9)) {
                    return new ao9(new hRP(new dQF(dqVar2, new dq(), new hw1()), dqVar2, new iB4(aqm, dqVar2), null, list2, j, j2, j3, j4), dqVar2);
                }
                throw new IllegalArgumentException("Local clock should implement Clock instead of KronosClock");
            case 14:
                return new eJw(mSI.R(this.f4660R.R), nak.R(this.f4660R.N), (hBv) this.f4660R.j.get(), (F4) this.f4660R.f3397R.get(), (ProcessLifecycleEvents) this.f4660R.g.get());
            case 15:
                k_Z k_z = (k_Z) this.f4660R.P.get();
                nZz nzz2 = (nZz) this.f4660R.x.get();
                pir R9 = nak.R(this.f4660R.N);
                F4 f43 = (F4) this.f4660R.f3397R.get();
                f9I f9i = new f9I();
                f9i.R("https://licensing-patreon.kdrag0n.dev/api/");
                if (k_z != null) {
                    f9i.f3330R.add(new hIS(k_z));
                    jwR R10 = nzz2.R();
                    R10.f5129R.add(new dzI(R9));
                    f9i.R = new nZz(R10);
                    return (hBv) f9i.v().e(hBv.class);
                }
                throw new NullPointerException("moshi == null");
            case 16:
                bq4 bq4 = new bq4();
                oje oje = oje.R;
                List list3 = bq4.f1822R;
                int i = bq4.R;
                bq4.R = i + 1;
                list3.add(i, oje);
                if (Y5.v) {
                    j3H j3h = g8d.R;
                    x_ R11 = g8d.R(Instant.class);
                    List emptyList = Collections.emptyList();
                    j3h.getClass();
                    Type i2 = gQc.i(new byj(R11, emptyList), false);
                    ArrayList arrayList = k_Z.R;
                    ax8 ax8 = new ax8(i2);
                    List list4 = bq4.f1822R;
                    int i3 = bq4.R;
                    bq4.R = i3 + 1;
                    list4.add(i3, ax8);
                }
                return new k_Z(bq4);
            case 17:
                return new ProcessLifecycleEvents();
            case 18:
                return ((k_Z) this.f4660R.P.get()).R(Map.class);
            case 19:
                return new mYo(this);
            case 20:
                return new hVj();
            case 21:
                return new kdp(mSI.R(this.f4660R.R), (doT) this.f4660R.c.get(), (iKP) this.f4660R.K.get());
            case 22:
                mSI.R(this.f4660R.R);
                return new iKP((oLT) this.f4660R.o.get());
            case 23:
                return new oLT(mSI.R(this.f4660R.R), new IO());
            case 24:
                return new oSF();
            case 25:
                return new DT((oLT) this.f4660R.o.get());
            case 26:
                return new gh(mSI.R(this.f4660R.R), (F4) this.f4660R.f3397R.get(), new IO(), (bf5) this.f4660R.I.get(), (oLT) this.f4660R.o.get(), (yd) this.f4660R.u.get(), (Tq) this.f4660R.c.get(), (SharedPreferences) this.f4660R.v.get());
            case 27:
                return new bf5();
            case 28:
                return new yd();
            case 29:
                return new aME(mSI.R(this.f4660R.R), (k_Z) this.f4660R.P.get(), (doT) this.f4660R.c.get(), (iHI) this.f4660R.A.get(), (m5f) this.f4660R.N.get());
            case 30:
                return new iHI(mSI.R(this.f4660R.R), (oo3) this.f4660R.n.get(), (m5f) this.f4660R.N.get(), nak.R(this.f4660R.d), (j2f) this.f4660R.S.get());
            case 31:
                return new oo3(mSI.R(this.f4660R.R), (doT) this.f4660R.c.get(), (m5f) this.f4660R.N.get());
            case 32:
                return new gkP((aME) this.f4660R.Q.get(), (iHI) this.f4660R.A.get(), (doT) this.f4660R.c.get(), (k_Z) this.f4660R.P.get(), (j2f) this.f4660R.S.get());
            case 33:
                k_Z k_z2 = (k_Z) this.f4660R.P.get();
                nZz nzz3 = (nZz) this.f4660R.x.get();
                f9I f9i2 = new f9I();
                f9i2.R("http://127.0.0.1:31978/");
                if (k_z2 != null) {
                    f9i2.f3330R.add(new hIS(k_z2));
                    jwR R12 = nzz3.R();
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    bd4 bd4 = khE.R;
                    long millis = timeUnit.toMillis(30);
                    if (millis <= 2147483647L) {
                        if (millis != 0) {
                            z = true;
                        }
                        if (z) {
                            R12.c = (int) millis;
                            R12.f5129R.add(new eB());
                            f9i2.R = new nZz(R12);
                            return (j2f) f9i2.v().e(j2f.class);
                        }
                        throw new IllegalArgumentException("timeout too small.".toString());
                    }
                    throw new IllegalArgumentException("timeout too large.".toString());
                }
                throw new NullPointerException("moshi == null");
            case 34:
                return new eD0(mSI.R(this.f4660R.R), (Tq) this.f4660R.c.get());
            case 35:
                return new mMh(mSI.R(this.f4660R.R), (hVj) this.f4660R.V.get(), (doT) this.f4660R.c.get(), (iKP) this.f4660R.K.get(), (k49) this.f4660R.s.get(), (k49) this.f4660R.T.get(), (m5f) this.f4660R.N.get(), (iHI) this.f4660R.A.get());
            case 36:
                return new mQq(((k_Z) this.f4660R.P.get()).R(DebugInfo.class));
            case 37:
                return new mQq(((k_Z) this.f4660R.P.get()).R(CrashInfo.class));
            case 38:
                return new m_e((aME) this.f4660R.Q.get(), (m5f) this.f4660R.N.get());
            case 39:
                return new dkr(mSI.R(this.f4660R.R));
            case 40:
                m5f m5f = (m5f) this.f4660R.N.get();
                return new f1X((eJw) this.f4660R.y.get());
            case 41:
                return new lP2(mSI.R(this.f4660R.R), (iHI) this.f4660R.A.get(), (j2f) this.f4660R.S.get(), (aME) this.f4660R.Q.get());
            default:
                throw new AssertionError(this.R);
        }
    }
}
