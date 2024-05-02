package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: dTl  reason: default package */
/* loaded from: classes.dex */
public abstract class dTl {

    /* renamed from: R  reason: collision with other field name */
    public static nUO f2623R;

    /* renamed from: R  reason: collision with other field name */
    public static final lmI f2621R = new lmI("COMPLETING_ALREADY");

    /* renamed from: v  reason: collision with other field name */
    public static final lmI f2624v = new lmI("COMPLETING_WAITING_CHILDREN");
    public static final lmI c = new lmI("COMPLETING_RETRY");
    public static final lmI e = new lmI("TOO_LATE_TO_CANCEL");
    public static final lmI X = new lmI("SEALED");

    /* renamed from: R  reason: collision with other field name */
    public static final f1O f2619R = new f1O(false);
    public static final f1O v = new f1O(true);
    public static final aYa R = new aYa(8);

    /* renamed from: R  reason: collision with other field name */
    public static final n2G f2622R = new n2G(8, null);

    /* renamed from: R  reason: collision with other field name */
    public static final gvk f2620R = new gvk(5);

    public static final boolean A(nbD nbd) {
        int i = pd2.v;
        pd2 pd2 = (pd2) nbd.O(hw1.O);
        return pd2 != null && pd2.X();
    }

    public static ncu B(ncu ncu, hNI hni) {
        return g4x.g(ncu, lBz.Y, new knS(hni, null, false, true));
    }

    public static final void C(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final Object G(Object obj) {
        cav cav;
        do8 do8 = obj instanceof do8 ? (do8) obj : null;
        return (do8 == null || (cav = do8.R) == null) ? obj : cav;
    }

    public static final void H(fBS fbs, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-1436003720);
        kY5 ky5 = fbs.f3345R;
        if (ky5 != null && ((Boolean) ky5.L.getValue()).booleanValue()) {
            jr_.w(1157296644);
            boolean O = jr_.O(fbs);
            Object I = jr_.I();
            if (O || I == ppN.R) {
                I = new ghh(fbs, 0);
                jr_.ZW(I);
            }
            jr_.g(false);
            ojR ojr = (ojR) I;
            jJj jjj = (jJj) jr_.x(lnF.X);
            c71 c71 = fbs.f3338R;
            long j = fbs.x().R;
            int i2 = odN.R;
            int Z = c71.Z((int) (j >> 32));
            kY5 ky52 = fbs.f3345R;
            iRR irr = (ky52 != null ? ky52.c() : null).f6140R;
            gIA c2 = irr.c(caw.x(Z, 0, irr.f4590R.f4165R.length()));
            long N = aH9.N((jjj.mZ(pk5.R) / ((float) 2)) + c2.f3720R, c2.e);
            ncu R2 = lCG.R(aff.R, ojr, new aWl(ojr, null));
            aWo awo = new aWo(N);
            jr_.w(1157296644);
            boolean O2 = jr_.O(awo);
            Object I2 = jr_.I();
            if (O2 || I2 == ppN.R) {
                I2 = new Qi(N, 1);
                jr_.ZW(I2);
            }
            jr_.g(false);
            iq.R(N, cU5.N(R2, false, (kg9) I2), null, jr_, 384);
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 2, fbs);
        }
    }

    public static final long I(KeyEvent keyEvent) {
        return aH9.x(keyEvent.getKeyCode());
    }

    public static hdJ J(hdJ hdj, e86 e86) {
        if (n3x.v(hdj.R(), e86)) {
            return hdj;
        }
        return null;
    }

    public static final void K(nbD nbd) {
        pd2 pd2 = (pd2) nbd.O(hw1.O);
        if (pd2 != null && !pd2.X()) {
            throw pd2.Z();
        }
    }

    public static lC L(int i, int i2, int i3, int i4) {
        boolean z = false;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        dHi dhi = (i4 & 16) != 0 ? K6.R : null;
        gQc.a(i3);
        return new lC(Xl.c(i, i2, i3, z, dhi));
    }

    public static final void N(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException(opT.m("fromIndex (", i, ") is less than 0."));
        } else if (i2 > size) {
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
        }
    }

    public static final void O(ncu ncu, fBS fbs, iv7 iv7, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-20551815);
        int i2 = (i & 14) | 384;
        jr_.w(733328855);
        bF9 e2 = PO.e(dq.R, true, jr_);
        jr_.w(-1323940314);
        jJj jjj = (jJj) jr_.x(lnF.X);
        mdz mdz = (mdz) jr_.x(lnF.H);
        bUo buo = (bUo) jr_.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(ncu);
        int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            l6.p(jr_, e2, igT.c);
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            b.y(jQ.m(jr_, buo, igT.X, jr_), jr_, Integer.valueOf((i3 >> 3) & 112));
            jr_.w(2058660585);
            jr_.w(-2137368960);
            if (((i3 >> 9) & 14 & 11) != 2 || !jr_.J()) {
                jr_.w(1524757375);
                if (((((i2 >> 6) & 112) | 6) & 81) != 16 || !jr_.J()) {
                    msU.v(fbs, iv7, jr_, ((i >> 3) & 112) | 8);
                } else {
                    jr_.E();
                }
                jr_.g(false);
            } else {
                jr_.E();
            }
            jQ.K(jr_, false, false, true, false);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new dR(ncu, fbs, iv7, i, 3);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static final void P(kY5 ky5, jzQ jzq, boolean z) {
        mQD mqd;
        if (!ky5.v()) {
            jzq.v();
        } else if (z && (mqd = ky5.f5340R) != null && n3x.v((mQD) mqd.f6031R.f5384R.get(), mqd)) {
            ((egg) mqd.R).f3178R.e(dx5.ShowKeyboard);
        }
    }

    public static final void Q(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            if (charAt != '\t') {
                if (!(' ' <= charAt && charAt < 127)) {
                    z = false;
                }
            }
            if (!z) {
                StringBuilder U = opT.U("Unexpected char 0x");
                U.append(y(charAt));
                U.append(" at ");
                U.append(i);
                U.append(" in ");
                U.append(str2);
                U.append(" value");
                U.append(asb.x(str2) ? "" : opT.H(": ", str));
                throw new IllegalArgumentException(U.toString().toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a0, code lost:
        if (r9 == defpackage.ppN.R) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        if (r12 == defpackage.ppN.R) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0146, code lost:
        if (r15 == defpackage.ppN.R) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bb, code lost:
        if (r7 == defpackage.ppN.R) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020b, code lost:
        if (r10 == defpackage.ppN.R) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x027c, code lost:
        if (r9 == defpackage.ppN.R) goto L_0x027e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.h5L r23, defpackage.kg9 r24, defpackage.ncu r25, defpackage.kIU r26, defpackage.h4f r27, defpackage.lR3 r28, defpackage.m88 r29, int r30) {
        /*
        // Method dump skipped, instructions count: 1662
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dTl.R(h5L, kg9, ncu, kIU, h4f, lR3, m88, int):void");
    }

    public static final boolean S(bwp bwp) {
        if (buB.v(bwp.f1859R) == buB.c(bwp.f1859R)) {
            if (buB.v(bwp.f1859R) == buB.v(bwp.f1862v)) {
                if (buB.v(bwp.f1859R) == buB.c(bwp.f1862v)) {
                    if (buB.v(bwp.f1859R) == buB.v(bwp.f1860c)) {
                        if (buB.v(bwp.f1859R) == buB.c(bwp.f1860c)) {
                            if (buB.v(bwp.f1859R) == buB.v(bwp.f1861e)) {
                                if (buB.v(bwp.f1859R) == buB.c(bwp.f1861e)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final ncu T(float f) {
        aff aff = aff.R;
        return !((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? msU.a(aff, 0.0f, f, null, false, 65279) : aff;
    }

    public static final void U(fBS fbs, boolean z, m88 m88, int i) {
        mjp c2;
        iRR irr;
        jr_ jr_ = (jr_) m88;
        jr_.q(626339208);
        if (z) {
            kY5 ky5 = fbs.f3345R;
            iRR irr2 = null;
            if (!(ky5 == null || (c2 = ky5.c()) == null || (irr = c2.f6140R) == null)) {
                kY5 ky52 = fbs.f3345R;
                if (!(ky52 != null ? ky52.f5344v : true)) {
                    irr2 = irr;
                }
            }
            if (irr2 != null) {
                if (!odN.v(fbs.x().R)) {
                    int Z = fbs.f3338R.Z((int) (fbs.x().R >> 32));
                    int Z2 = fbs.f3338R.Z(odN.c(fbs.x().R));
                    bSG R2 = irr2.R(Z);
                    bSG R3 = irr2.R(Math.max(Z2 - 1, 0));
                    jr_.w(-498393098);
                    kY5 ky53 = fbs.f3345R;
                    if (ky53 != null && ((Boolean) ky53.X.getValue()).booleanValue()) {
                        n1P.X(true, R2, fbs, jr_, 518);
                    }
                    jr_.g(false);
                    kY5 ky54 = fbs.f3345R;
                    if (ky54 != null && ((Boolean) ky54.O.getValue()).booleanValue()) {
                        n1P.X(false, R3, fbs, jr_, 518);
                    }
                }
                kY5 ky55 = fbs.f3345R;
                if (ky55 != null) {
                    if (!n3x.v(fbs.f3340R.f2488R.R, fbs.x().f2488R.R)) {
                        ky55.f5342R = false;
                    }
                    if (ky55.v()) {
                        if (ky55.f5342R) {
                            fbs.N();
                        } else {
                            fbs.H();
                        }
                    }
                }
            }
        } else {
            fbs.H();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new nWm(fbs, z, i, 0);
        }
    }

    public static final void V(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            l6.U(th, th2);
        }
    }

    public static final void W(kY5 ky5) {
        mQD mqd = ky5.f5340R;
        if (mqd != null) {
            ky5.f5335R.x(d5M.R(ky5.f5336R.R, null, 0, 3));
            kef kef = mqd.f6031R;
            if (kef.f5384R.compareAndSet(mqd, null)) {
                egg egg = (egg) kef.R;
                egg.f3179R = false;
                egg.f3176R = i5D.t;
                egg.v = i5D.i;
                egg.f3178R.e(dx5.StopInput);
            }
        }
        ky5.f5340R = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0569, code lost:
        if (r4 > ((r7 != null ? r7.longValue() : 0) + ((long) 5000))) goto L_0x056b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x02e1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x031b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0515 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x05db  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0659 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x069a  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x06f7  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0780  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x078d  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x07aa  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0835  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void X(defpackage.d5M r57, defpackage.kg9 r58, defpackage.ncu r59, defpackage.kMk r60, defpackage.iuk r61, defpackage.kg9 r62, defpackage.p2E r63, defpackage.a1 r64, boolean r65, int r66, defpackage.djV r67, defpackage.eIr r68, boolean r69, boolean r70, defpackage.lR3 r71, defpackage.m88 r72, int r73, int r74, int r75) {
        /*
        // Method dump skipped, instructions count: 2113
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dTl.X(d5M, kg9, ncu, kMk, iuk, kg9, p2E, a1, boolean, int, djV, eIr, boolean, boolean, lR3, m88, int, int, int):void");
    }

    public static Date Y() {
        return Calendar.getInstance(pnL.R).getTime();
    }

    public static final void Z(p2E p2e, h0T h0t, Map map, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(1297229208);
        caw.v(p2e, new ofd(h0t, map, p2e, 1), jr_);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new dR(p2e, h0t, map, i, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(defpackage.kM4 r17, boolean r18, defpackage.ncu r19, defpackage.kIU r20, defpackage.h4f r21, java.lang.String r22, defpackage.lR3 r23, defpackage.m88 r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dTl.c(kM4, boolean, ncu, kIU, h4f, java.lang.String, lR3, m88, int, int):void");
    }

    public static nbD d(hdJ hdj, e86 e86) {
        return n3x.v(hdj.R(), e86) ? aIH.R : hdj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(defpackage.ncu r23, defpackage.n76 r24, defpackage.kJ r25, defpackage.Lq r26, defpackage.lf r27, defpackage.lR3 r28, defpackage.m88 r29, int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 592
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dTl.e(ncu, n76, kJ, Lq, lf, lR3, m88, int, int):void");
    }

    public static final void g(aZq azq, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th);
            }
        }
        azq.c(cancellationException);
    }

    public static final pd2 h(nbD nbd) {
        int i = pd2.v;
        pd2 pd2 = (pd2) nbd.O(hw1.O);
        if (pd2 != null) {
            return pd2;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + nbd).toString());
    }

    public static ncu i(ncu ncu, boolean z, f_c f_c, int i) {
        return g4x.g(ncu, lBz.Y, new w6((i & 1) != 0 ? true : z, null, null, f_c, 0));
    }

    public static final void j(nbD nbd, CancellationException cancellationException) {
        int i = pd2.v;
        pd2 pd2 = (pd2) nbd.O(hw1.O);
        if (pd2 != null) {
            pd2.c(cancellationException);
        }
    }

    public static final Set k(Object... objArr) {
        int length;
        if (objArr.length > 0 && (length = objArr.length) != 0) {
            if (length == 1) {
                return Collections.singleton(objArr[0]);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(jjU.y(objArr.length));
            for (Object obj : objArr) {
                linkedHashSet.add(obj);
            }
            return linkedHashSet;
        }
        return lsA.R;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(android.content.Context r12, defpackage.i2_ r13, defpackage.aoz r14, boolean r15) {
        /*
            android.content.Context r0 = r12.getApplicationContext()
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r2.sourceDir
            r0.<init>(r2)
            java.lang.String r7 = r0.getName()
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: NameNotFoundException -> 0x00b9
            java.io.File r3 = r12.getFilesDir()
            java.lang.String r5 = "ProfileInstaller"
            if (r15 != 0) goto L_0x007f
            java.io.File r15 = new java.io.File
            java.lang.String r6 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r15.<init>(r3, r6)
            boolean r3 = r15.exists()
            if (r3 != 0) goto L_0x003a
            goto L_0x0066
        L_0x003a:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: IOException -> 0x0066
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: IOException -> 0x0066
            r6.<init>(r15)     // Catch: IOException -> 0x0066
            r3.<init>(r6)     // Catch: IOException -> 0x0066
            long r8 = r3.readLong()     // Catch: all -> 0x005c
            r3.close()     // Catch: IOException -> 0x0066
            long r10 = r0.lastUpdateTime
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 != 0) goto L_0x0053
            r15 = 1
            goto L_0x0054
        L_0x0053:
            r15 = r2
        L_0x0054:
            if (r15 == 0) goto L_0x0067
            r0 = 2
            r3 = 0
            r14.L(r0, r3)
            goto L_0x0067
        L_0x005c:
            r15 = move-exception
            r3.close()     // Catch: all -> 0x0061
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            r15.addSuppressed(r0)     // Catch: IOException -> 0x0066
        L_0x0065:
            throw r15     // Catch: IOException -> 0x0066
        L_0x0066:
            r15 = r2
        L_0x0067:
            if (r15 != 0) goto L_0x006a
            goto L_0x007f
        L_0x006a:
            java.lang.String r13 = "Skipping profile installation for "
            java.lang.StringBuilder r13 = defpackage.opT.U(r13)
            java.lang.String r12 = r12.getPackageName()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            android.util.Log.d(r5, r12)
            goto L_0x00b8
        L_0x007f:
            java.lang.String r15 = "Installing profile for "
            java.lang.StringBuilder r15 = defpackage.opT.U(r15)
            java.lang.String r12 = r12.getPackageName()
            r15.append(r12)
            java.lang.String r12 = r15.toString()
            android.util.Log.d(r5, r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            java.io.File r8 = new java.io.File
            java.io.File r15 = new java.io.File
            java.lang.String r0 = "/data/misc/profiles/cur/0"
            r15.<init>(r0, r1)
            java.lang.String r0 = "primary.prof"
            r8.<init>(r15, r0)
            hmW r15 = new hmW
            r3 = r15
            r5 = r13
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            r14 = 3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            lff r0 = new lff
            r0.<init>(r15, r14, r12, r2)
            r13.execute(r0)
        L_0x00b8:
            return
        L_0x00b9:
            r12 = move-exception
            r13 = 7
            r14.L(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dTl.l(android.content.Context, i2_, aoz, boolean):void");
    }

    public static final bwp m(float f, float f2, float f3, float f4, long j) {
        long R2 = g4x.R(buB.v(j), buB.c(j));
        return new bwp(f, f2, f3, f4, R2, R2, R2, R2);
    }

    public static final void n(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!('!' <= charAt && charAt < 127)) {
                    StringBuilder U = opT.U("Unexpected char 0x");
                    U.append(y(charAt));
                    U.append(" at ");
                    U.append(i);
                    U.append(" in header name: ");
                    U.append(str);
                    throw new IllegalArgumentException(U.toString().toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    public static final void o(iRl irl, String str, String str2) {
        irl.R.add(str);
        irl.R.add(iH_.vr(str2).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        if (((java.lang.Boolean) r3.getValue()).booleanValue() != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (((java.lang.Boolean) r7.x(r6.v())).booleanValue() != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.aMr p(defpackage.h5L r6, defpackage.kg9 r7, java.lang.Object r8, defpackage.m88 r9) {
        /*
            aMr r0 = defpackage.aMr.PostExit
            aMr r1 = defpackage.aMr.PreEnter
            aMr r2 = defpackage.aMr.Visible
            jr_ r9 = (defpackage.jr_) r9
            r3 = -721837653(0xffffffffd4f9a1ab, float:-8.5772736E12)
            r9.w(r3)
            r3 = 0
            r4 = -721837546(0xffffffffd4f9a216, float:-8.5773297E12)
            r5 = 0
            r9.f(r4, r6, r3, r5)
            boolean r3 = r6.X()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r8 = r7.x(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0029
            goto L_0x0077
        L_0x0029:
            java.lang.Object r6 = r6.v()
            java.lang.Object r6 = r7.x(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0086
            goto L_0x0087
        L_0x003a:
            r3 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r9.w(r3)
            java.lang.Object r3 = r9.I()
            f1A r4 = defpackage.ppN.R
            if (r3 != r4) goto L_0x0051
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            oST r3 = defpackage.l6.n(r3)
            r9.ZW(r3)
        L_0x0051:
            r9.g(r5)
            h0T r3 = (defpackage.h0T) r3
            java.lang.Object r6 = r6.v()
            java.lang.Object r6 = r7.x(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x006b
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r3.R(r6)
        L_0x006b:
            java.lang.Object r6 = r7.x(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0079
        L_0x0077:
            r0 = r2
            goto L_0x0087
        L_0x0079:
            java.lang.Object r6 = r3.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r0 = r1
        L_0x0087:
            r9.g(r5)
            r9.g(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dTl.p(h5L, kg9, java.lang.Object, m88):aMr");
    }

    public static final int r(m62 m62, int i) {
        int i2;
        int[] iArr = m62.R;
        int i3 = i + 1;
        int i4 = 0;
        int length = m62.f5925R.length - 1;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = iArr[i2];
                if (i5 >= i3) {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static final hNI s(m88 m88) {
        k_s k_s;
        jr_ jr_ = (jr_) m88;
        jr_.w(-1464256199);
        Object[] objArr = new Object[0];
        switch (hNI.R.R) {
            case 4:
                k_s = hNI.f4218R;
                break;
            default:
                k_s = oVq.f6834R;
                break;
        }
        jr_.w(1157296644);
        boolean O = jr_.O(0);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            I = new iQW(0, 0);
            jr_.ZW(I);
        }
        jr_.g(false);
        hNI hni = (hNI) cpc.T(objArr, k_s, (f_c) I, jr_, 4);
        jr_.g(false);
        return hni;
    }

    public static ncu t(ncu ncu, p2E p2e, f8n f8n, boolean z, fzf fzf, f_c f_c, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        fzf fzf2 = null;
        if ((i & 16) == 0) {
            fzf2 = fzf;
        }
        boolean z2 = mWb.R;
        return g4x.g(ncu, lBz.Y, new pk(f8n, p2e, fzf2, null, f_c, z));
    }

    public static ArrayList u(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(defpackage.FI r18, boolean r19, defpackage.ncu r20, defpackage.kIU r21, defpackage.h4f r22, java.lang.String r23, defpackage.lR3 r24, defpackage.m88 r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dTl.v(FI, boolean, ncu, kIU, h4f, java.lang.String, lR3, m88, int, int):void");
    }

    public static final void x(ncu ncu, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.w(-72882467);
        buX bux = buX.R;
        jr_.w(-1323940314);
        jJj jjj = (jJj) jr_.x(lnF.X);
        mdz mdz = (mdz) jr_.x(lnF.H);
        bUo buo = (bUo) jr_.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(ncu);
        int i2 = (((((i << 3) & 112) | 384) << 9) & 7168) | 6;
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            l6.p(jr_, bux, igT.c);
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            b.y(jQ.m(jr_, buo, igT.X, jr_), jr_, Integer.valueOf((i2 >> 3) & 112));
            jr_.w(2058660585);
            jr_.w(1142320198);
            if (((i2 >> 9) & 14 & 11) == 2 && jr_.J()) {
                jr_.E();
            }
            jQ.K(jr_, false, false, true, false);
            jr_.g(false);
            return;
        }
        l6.u();
        throw null;
    }

    public static final String y(char c2) {
        jjU.X(16);
        String num = Integer.toString(c2, 16);
        if (num.length() >= 2) {
            return num;
        }
        return '0' + num;
    }

    public static final int z(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
