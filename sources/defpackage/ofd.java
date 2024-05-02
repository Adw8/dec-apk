package defpackage;

import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.termux.terminal.Y;
import com.termux.view.TerminalView;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ofd  reason: default package */
/* loaded from: classes.dex */
public final class ofd extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ofd(jy_ jy_, j__ j__, dH9 dh9) {
        super(1);
        this.X = 13;
        this.v = jy_;
        this.c = j__;
        this.R = dh9;
    }

    public final nRn R() {
        switch (this.X) {
            case 1:
                return new jc((h0T) this.R, (Map) this.v, (p2E) this.c, 0);
            case 16:
                return new acE(8, ((e9w) this.R).R((String) this.v, new q4(22, (eGS) this.c)));
            default:
                return new jc((Y) this.R, (TerminalViewModel) this.v, (h0T) this.c);
        }
    }

    public final void c(h57 h57) {
        switch (this.X) {
            case 3:
                long j = ((dU5) ((i1b) this.R).R.x((mZf) this.v)).f2628R;
                ((i1b) this.R).getClass();
                h57.O(h57, (l0f) this.c, (int) (j >> 32), dU5.v(j));
                return;
            case 4:
                ((mP0) this.R).getClass();
                h57.X(h57, (l0f) this.v, ((mZf) this.c).B(((mP0) this.R).R), ((mZf) this.c).B(((mP0) this.R).v));
                return;
            default:
                mZf mzf = (mZf) this.v;
                h57.v(h57, (l0f) this.R, mzf.B(((btN) this.c).R.e(mzf.getLayoutDirection())), ((mZf) this.v).B(((btN) this.c).R.v()));
                return;
        }
    }

    public final void e(h7_ h7_) {
        switch (this.X) {
            case 0:
                h7_.c = ((Number) ((dH9) this.R).getValue()).floatValue();
                h7_.R = ((Number) ((dH9) this.v).getValue()).floatValue();
                h7_.v = ((Number) ((dH9) this.v).getValue()).floatValue();
                h7_.f4082c = ((b3a) ((dH9) this.c).getValue()).f1515R;
                return;
            default:
                float f = a4b.R;
                h7_.R = ((Number) ((dH9) this.R).getValue()).floatValue();
                h7_.v = ((Number) ((dH9) this.R).getValue()).floatValue();
                h7_.c = ((Number) ((dH9) this.v).getValue()).floatValue();
                h7_.f4082c = ((b3a) ((h0T) this.c).getValue()).f1515R;
                return;
        }
    }

    public final void v(Hd hd) {
        switch (this.X) {
            case 2:
                float floatValue = ((Number) hd.v()).floatValue() - ((eLb) this.R).R;
                float R = ((gAN) this.v).R(floatValue);
                ((eLb) this.R).R = ((Number) hd.v()).floatValue();
                ((eLb) this.c).R = ((Number) hd.c()).floatValue();
                if (Math.abs(floatValue - R) > 0.5f) {
                    hd.R();
                    return;
                }
                return;
            default:
                float floatValue2 = ((Number) hd.v()).floatValue() - ((eLb) this.R).R;
                float R2 = ((lqA) this.v).R();
                ((lqA) this.v).c(R2 + floatValue2);
                float abs = Math.abs(R2 - ((lqA) this.v).R());
                ((eLb) this.R).R = ((Number) hd.v()).floatValue();
                ((eLb) this.c).R = ((Number) hd.c()).floatValue();
                if (Math.abs(floatValue2 - abs) > 0.5f) {
                    hd.R();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        iRR irr;
        int Z;
        int Z2;
        dm dmVar;
        iRR irr2;
        iRR irr3;
        mjp mjp;
        mjp mjp2;
        iRR irr4;
        iRR irr5;
        mjp mjp3;
        mjp mjp4;
        h5 h5Var;
        e9E c;
        d5M d5m = null;
        AndroidComposeView androidComposeView = null;
        d5M d5m2 = null;
        d5m = null;
        boolean z = false;
        boolean z2 = true;
        switch (this.X) {
            case 0:
                e((h7_) obj);
                return o8s.R;
            case 1:
                dlc dlc = (dlc) obj;
                return R();
            case 2:
                v((Hd) obj);
                return o8s.R;
            case 3:
                c((h57) obj);
                return o8s.R;
            case 4:
                c((h57) obj);
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                c((h57) obj);
                return o8s.R;
            case 6:
                int intValue = ((Number) obj).intValue();
                if (intValue < 0 || intValue >= ((cRR) this.R).L()) {
                    z2 = false;
                }
                cRR crr = (cRR) this.R;
                if (z2) {
                    l6.z((jy_) this.v, null, 0, new aEf((o_d) this.c, intValue, null), 3);
                    return Boolean.TRUE;
                }
                StringBuilder C = opT.C("Can't scroll to index ", intValue, ", it is out of bounds [0, ");
                C.append(crr.L());
                C.append(')');
                throw new IllegalArgumentException(C.toString().toString());
            case 7:
                d5M d5m3 = (d5M) obj;
                ((h0T) this.v).R(d5m3);
                boolean z3 = !n3x.v((String) ((h0T) this.c).getValue(), d5m3.f2488R.R);
                ((h0T) this.c).R(d5m3.f2488R.R);
                if (z3) {
                    ((kg9) this.R).x(d5m3.f2488R.R);
                }
                return o8s.R;
            case VmNativeCallback.$stable:
                fiv fiv = (fiv) obj;
                mjp c2 = ((kY5) this.R).c();
                if (c2 != null) {
                    d5M d5m4 = (d5M) this.v;
                    c71 c71 = (c71) this.c;
                    Gp R = fiv.G().R();
                    iRR irr6 = c2.f6140R;
                    gw gwVar = ((kY5) this.R).f5337R;
                    if (odN.v(d5m4.R) || (Z = c71.Z(odN.X(d5m4.R))) == (Z2 = c71.Z(odN.e(d5m4.R)))) {
                        irr = irr6;
                    } else {
                        pm5 pm5 = irr6.f4592R;
                        pm5.getClass();
                        if (((Z < 0 || Z > Z2) ? null : 1) != null && Z2 <= pm5.f7258R.R.R.length()) {
                            z = true;
                        }
                        if (z) {
                            if (Z == Z2) {
                                dmVar = g4x.L();
                                irr = irr6;
                            } else {
                                dm L = g4x.L();
                                int size = pm5.f7261v.size();
                                for (int X = cU5.X(Z, pm5.f7261v); X < size; X++) {
                                    pps pps = (pps) pm5.f7261v.get(X);
                                    int i = pps.f7287R;
                                    if (i < Z2) {
                                        if (i != pps.f7289v) {
                                            lz lzVar = pps.f7288R;
                                            int R2 = pps.R(Z);
                                            int R3 = pps.R(Z2);
                                            lzVar.getClass();
                                            if (R2 >= 0 && R2 <= R3) {
                                                size = size;
                                                if (R3 <= lzVar.f5877R.length()) {
                                                    Path path = new Path();
                                                    nUF nuf = lzVar.f5879R;
                                                    irr6 = irr6;
                                                    nuf.f6399R.getSelectionPath(R2, R3, path);
                                                    if (nuf.f6406v != 0 && !path.isEmpty()) {
                                                        path.offset(0.0f, (float) nuf.f6406v);
                                                    }
                                                    dm dmVar2 = new dm(path);
                                                    long N = aH9.N(0.0f, pps.R);
                                                    dmVar2.R.reset();
                                                    dmVar2.R.setTranslate(aWo.e(N), aWo.X(N));
                                                    path.transform(dmVar2.R);
                                                    cnO.R(L, dmVar2);
                                                }
                                            }
                                            StringBuilder y = jQ.y("Start(", R2, ") or End(", R3, ") is out of Range(0..");
                                            y.append(lzVar.f5877R.length());
                                            y.append("), or start > end!");
                                            throw new AssertionError(y.toString());
                                        }
                                        irr6 = irr6;
                                        size = size;
                                    } else {
                                        irr = irr6;
                                        dmVar = L;
                                    }
                                }
                                irr = irr6;
                                dmVar = L;
                            }
                            R.X(dmVar, gwVar);
                        } else {
                            StringBuilder y2 = jQ.y("Start(", Z, ") or End(", Z2, ") is out of range [0..");
                            y2.append(pm5.f7258R.R.R.length());
                            y2.append("), or start > end!");
                            throw new IllegalArgumentException(y2.toString().toString());
                        }
                    }
                    jy3.v(R, irr);
                }
                return o8s.R;
            case 9:
                gXZ gxz = (gXZ) this.R;
                kg9 kg9 = (kg9) this.v;
                mQD mqd = (mQD) ((nWW) this.c).R;
                d5M R4 = gxz.R((List) obj);
                if (mqd != null) {
                    mqd.R(null, R4);
                }
                kg9.x(R4);
                return o8s.R;
            case 10:
                n4U n4u = (n4U) obj;
                switch (((aaz) this.R).ordinal()) {
                    case 0:
                        ih ihVar = ih.P;
                        n4u.f6286R.R = null;
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            if (!odN.v(n4u.v)) {
                                if (n4u.O()) {
                                    int X2 = odN.X(n4u.v);
                                    n4u.Y(X2, X2);
                                    break;
                                } else {
                                    int e = odN.e(n4u.v);
                                    n4u.Y(e, e);
                                    break;
                                }
                            } else {
                                ihVar.x(n4u);
                                break;
                            }
                        }
                        break;
                    case 1:
                        ih ihVar2 = ih.j;
                        n4u.f6286R.R = null;
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            if (!odN.v(n4u.v)) {
                                if (n4u.O()) {
                                    int e2 = odN.e(n4u.v);
                                    n4u.Y(e2, e2);
                                    break;
                                } else {
                                    int X3 = odN.X(n4u.v);
                                    n4u.Y(X3, X3);
                                    break;
                                }
                            } else {
                                ihVar2.x(n4u);
                                break;
                            }
                        }
                        break;
                    case 2:
                        n4u.y();
                        break;
                    case 3:
                        n4u.x();
                        break;
                    case 4:
                        n4u.U();
                        break;
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                        n4u.P();
                        break;
                    case 6:
                        n4u.K();
                        break;
                    case 7:
                        n4u.i();
                        break;
                    case VmNativeCallback.$stable:
                        n4u.V();
                        break;
                    case 9:
                        n4u.o();
                        break;
                    case 10:
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z && (irr2 = n4u.f6284R) != null) {
                            int L2 = n4u.L(irr2, -1);
                            n4u.Y(L2, L2);
                            break;
                        }
                        break;
                    case lVo.HKDF_SALT_FIELD_NUMBER:
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z && (irr3 = n4u.f6284R) != null) {
                            int L3 = n4u.L(irr3, 1);
                            n4u.Y(L3, L3);
                            break;
                        }
                        break;
                    case 12:
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z && (mjp = n4u.f6285R) != null) {
                            int Z3 = n4u.Z(mjp, -1);
                            n4u.Y(Z3, Z3);
                            break;
                        }
                        break;
                    case 13:
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z && (mjp2 = n4u.f6285R) != null) {
                            int Z4 = n4u.Z(mjp2, 1);
                            n4u.Y(Z4, Z4);
                            break;
                        }
                        break;
                    case 14:
                        n4u.f6286R.R = null;
                        if (n4u.f6287v.R.length() <= 0) {
                            z2 = false;
                        }
                        if (z2) {
                            n4u.Y(0, 0);
                            break;
                        }
                        break;
                    case 15:
                        n4u.t();
                        break;
                    case 16:
                        ((gWD) this.v).f3774R.e(false);
                        break;
                    case 17:
                        ((gWD) this.v).f3774R.U();
                        break;
                    case 18:
                        ((gWD) this.v).f3774R.O();
                        break;
                    case 19:
                        List R5 = n4u.R(ih.g);
                        if (R5 != null) {
                            ((gWD) this.v).R(R5);
                            break;
                        }
                        break;
                    case 20:
                        List R6 = n4u.R(ih.y);
                        if (R6 != null) {
                            ((gWD) this.v).R(R6);
                            break;
                        }
                        break;
                    case 21:
                        List R7 = n4u.R(ih.t);
                        if (R7 != null) {
                            ((gWD) this.v).R(R7);
                            break;
                        }
                        break;
                    case 22:
                        List R8 = n4u.R(ih.i);
                        if (R8 != null) {
                            ((gWD) this.v).R(R8);
                            break;
                        }
                        break;
                    case 23:
                        List R9 = n4u.R(ih.V);
                        if (R9 != null) {
                            ((gWD) this.v).R(R9);
                            break;
                        }
                        break;
                    case 24:
                        List R10 = n4u.R(ih.o);
                        if (R10 != null) {
                            ((gWD) this.v).R(R10);
                            break;
                        }
                        break;
                    case 25:
                        n4u.f6286R.R = null;
                        if (n4u.f6287v.R.length() <= 0) {
                            z2 = false;
                        }
                        if (z2) {
                            n4u.Y(0, n4u.f6287v.R.length());
                            break;
                        }
                        break;
                    case 26:
                        n4u.m();
                        n4u.J();
                        break;
                    case 27:
                        n4u.g();
                        n4u.J();
                        break;
                    case 28:
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z && (irr4 = n4u.f6284R) != null) {
                            int L4 = n4u.L(irr4, -1);
                            n4u.Y(L4, L4);
                        }
                        n4u.J();
                        break;
                    case 29:
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z && (irr5 = n4u.f6284R) != null) {
                            int L5 = n4u.L(irr5, 1);
                            n4u.Y(L5, L5);
                        }
                        n4u.J();
                        break;
                    case 30:
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z && (mjp3 = n4u.f6285R) != null) {
                            int Z5 = n4u.Z(mjp3, -1);
                            n4u.Y(Z5, Z5);
                        }
                        n4u.J();
                        break;
                    case 31:
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z && (mjp4 = n4u.f6285R) != null) {
                            int Z6 = n4u.Z(mjp4, 1);
                            n4u.Y(Z6, Z6);
                        }
                        n4u.J();
                        break;
                    case 32:
                        n4u.f6286R.R = null;
                        if (n4u.f6287v.R.length() <= 0) {
                            z2 = false;
                        }
                        if (z2) {
                            n4u.Y(0, 0);
                        }
                        n4u.J();
                        break;
                    case 33:
                        n4u.t();
                        n4u.J();
                        break;
                    case 34:
                        n4u.x();
                        n4u.J();
                        break;
                    case 35:
                        n4u.y();
                        n4u.J();
                        break;
                    case 36:
                        n4u.U();
                        n4u.J();
                        break;
                    case 37:
                        n4u.P();
                        n4u.J();
                        break;
                    case 38:
                        n4u.K();
                        n4u.J();
                        break;
                    case 39:
                        n4u.i();
                        n4u.J();
                        break;
                    case 40:
                        n4u.V();
                        n4u.J();
                        break;
                    case 41:
                        n4u.o();
                        n4u.J();
                        break;
                    case 42:
                        n4u.f6286R.R = null;
                        if (n4u.f6287v.R.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            int c3 = odN.c(n4u.v);
                            n4u.Y(c3, c3);
                            break;
                        }
                        break;
                    case 43:
                        gWD gwd = (gWD) this.v;
                        if (!gwd.v) {
                            gwd.R(Collections.singletonList(new k77("\n", 1)));
                            break;
                        } else {
                            ((oJx) this.c).R = false;
                            break;
                        }
                    case 44:
                        gWD gwd2 = (gWD) this.v;
                        if (!gwd2.v) {
                            gwd2.R(Collections.singletonList(new k77("\t", 1)));
                            break;
                        } else {
                            ((oJx) this.c).R = false;
                            break;
                        }
                    case 45:
                        d5K d5k = ((gWD) this.v).f3772R;
                        if (d5k != null) {
                            d5k.R(d5M.R(n4u.f6283R, n4u.f6287v, n4u.v, 4));
                        }
                        d5K d5k2 = ((gWD) this.v).f3772R;
                        if (d5k2 != null) {
                            h5 h5Var2 = d5k2.f2484R;
                            if (!(h5Var2 == null || (h5Var = (h5) h5Var2.R) == null)) {
                                d5k2.f2484R = h5Var;
                                d5k2.v -= ((d5M) h5Var2.v).f2488R.R.length();
                                d5k2.f2487v = new h5(d5k2.f2487v, (d5M) h5Var2.v);
                                d5m = (d5M) h5Var.v;
                            }
                            if (d5m != null) {
                                ((gWD) this.v).f3776R.x(d5m);
                                break;
                            }
                        }
                        break;
                    case 46:
                        d5K d5k3 = ((gWD) this.v).f3772R;
                        if (d5k3 != null) {
                            h5 h5Var3 = d5k3.f2487v;
                            if (h5Var3 != null) {
                                d5k3.f2487v = (h5) h5Var3.R;
                                d5M d5m5 = (d5M) h5Var3.v;
                                d5k3.f2484R = new h5(d5k3.f2484R, d5m5);
                                d5k3.v = d5m5.f2488R.R.length() + d5k3.v;
                                d5m2 = (d5M) h5Var3.v;
                            }
                            if (d5m2 != null) {
                                ((gWD) this.v).f3776R.x(d5m2);
                                break;
                            }
                        }
                        break;
                }
                return o8s.R;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                v((Hd) obj);
                return o8s.R;
            case 12:
                e((h7_) obj);
                return o8s.R;
            case 13:
                long j = ((aWo) obj).f906R;
                l6.z((jy_) this.v, null, 0, new n7x((j__) this.c, (dH9) this.R, null), 3);
                return o8s.R;
            case 14:
            default:
                Throwable th = (Throwable) obj;
                Object obj2 = this.v;
                nbD nbd = (nbD) this.c;
                cPP P = l6.P((kg9) this.R, obj2, null);
                if (P != null) {
                    pdD.o(nbd, P);
                }
                return o8s.R;
            case 15:
                gzG gzg = (gzG) obj;
                if (gzg instanceof AndroidComposeView) {
                    androidComposeView = (AndroidComposeView) gzg;
                }
                if (androidComposeView != null) {
                    qc qcVar = (qc) this.R;
                    fue fue = (fue) this.v;
                    androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(qcVar, fue);
                    androidComposeView.getAndroidViewsHandler$ui_release().addView(qcVar);
                    androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(fue, qcVar);
                    WeakHashMap weakHashMap = of5.f6887R;
                    mHC.t(qcVar, 1);
                    of5.O(qcVar, new G8(fue, androidComposeView, androidComposeView));
                }
                Object obj3 = ((nWW) this.c).R;
                if (obj3 != null) {
                    ((qc) this.R).setView$ui_release((View) obj3);
                }
                return o8s.R;
            case 16:
                dlc dlc2 = (dlc) obj;
                return R();
            case 17:
                j5B j5b = (j5B) obj;
                e9E e9e = j5b.f4822R;
                if (!(e9e instanceof e9E)) {
                    e9e = null;
                }
                if (e9e == null || (c = ((jFk) this.R).c(e9e, j5b.f4820R, (ixU) this.v)) == null) {
                    return null;
                }
                if (n3x.v(c, e9e)) {
                    return j5b;
                }
                ebT v = ((jFk) this.R).v();
                Bundle v2 = c.v(j5b.f4820R);
                int i2 = j5B.e;
                mpr mpr = v.f3159R;
                return aYa.m(mpr.f6176R, c, v2, mpr.m(), v.f3159R.f6179R);
            case 18:
                String str = (String) obj;
                ((nWW) this.R).R = str;
                pby[] pbyArr = kxm.R;
                ((kg9) this.c).x(str);
                return o8s.R;
            case 19:
                dlc dlc3 = (dlc) obj;
                return R();
            case 20:
                MotionEvent motionEvent = (MotionEvent) obj;
                pq5 pq5 = (pq5) this.v;
                if (motionEvent.getY() >= ((float) ((jJj) this.R).B(iqx.R))) {
                    z = true;
                }
                nCn ncn = pq5.R;
                if (ncn != null) {
                    ncn.f6352R = z;
                }
                TerminalView terminalView = (TerminalView) ((h0T) this.c).getValue();
                if (terminalView != null) {
                    terminalView.onTouchEvent(motionEvent);
                }
                return Boolean.TRUE;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ofd(h0T h0t, c0y c0y, c0y c0y2) {
        super(1);
        this.X = 12;
        this.c = h0t;
        this.R = c0y;
        this.v = c0y2;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofd(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.X = i;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
    }
}
