package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.e;
import dev.kdrag0n.virtcontainer.R;
import java.util.LinkedHashMap;

/* renamed from: ur  reason: default package */
/* loaded from: classes.dex */
public abstract class ur {
    public static final kPU R = new kPU(d6b.R, fme.L);

    /* renamed from: R  reason: collision with other field name */
    public static final owM f7428R = new owM(fme.Z);
    public static final owM v = new owM(fme.m);
    public static final owM c = new owM(fme.x);
    public static final owM e = new owM(fme.H);
    public static final owM X = new owM(fme.U);

    public static final void R(AndroidComposeView androidComposeView, iv7 iv7, m88 m88, int i) {
        boolean z;
        jr_ jr_ = (jr_) m88;
        jr_.q(1396852028);
        Context context = androidComposeView.getContext();
        jr_.w(-492369756);
        Object I = jr_.I();
        f1A f1a = ppN.R;
        if (I == f1a) {
            oST ost = new oST(context.getResources().getConfiguration(), d6b.R);
            jr_.ZW(ost);
            I = ost;
        }
        jr_.g(false);
        h0T h0t = (h0T) I;
        jr_.w(1157296644);
        boolean O = jr_.O(h0t);
        Object I2 = jr_.I();
        if (O || I2 == f1a) {
            I2 = new n2R(h0t, 4);
            jr_.ZW(I2);
        }
        jr_.g(false);
        androidComposeView.setConfigurationChangeObserver((kg9) I2);
        jr_.w(-492369756);
        Object I3 = jr_.I();
        if (I3 == f1a) {
            I3 = new WH();
            jr_.ZW(I3);
        }
        jr_.g(false);
        WH wh = (WH) I3;
        Mj viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            jr_.w(-492369756);
            Object I4 = jr_.I();
            if (I4 == f1a) {
                adL adl = viewTreeOwners.R;
                Class[] clsArr = bfz.R;
                View view = (View) androidComposeView.getParent();
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = e9w.class.getSimpleName() + ':' + str;
                bhK c2 = adl.c();
                Bundle R2 = c2.R(str2);
                if (R2 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : R2.keySet()) {
                        linkedHashMap.put(str3, R2.getParcelableArrayList(str3));
                    }
                }
                lBz lbz = lBz.J;
                owM owm = hcN.R;
                mMG mmg = new mMG(linkedHashMap, lbz);
                try {
                    c2.c(str2, new IK(1, mmg));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                oHC ohc = new oHC(mmg, new eOg(z, c2, str2));
                jr_.ZW(ohc);
                I4 = ohc;
            }
            jr_.g(false);
            oHC ohc2 = (oHC) I4;
            caw.v(o8s.R, new mox(5, ohc2), jr_);
            Configuration configuration = (Configuration) h0t.getValue();
            Object x = jQ.x(jr_, -485908294, -492369756);
            f1A f1a2 = ppN.R;
            if (x == f1a2) {
                x = new g22();
                jr_.ZW(x);
            }
            jr_.g(false);
            g22 g22 = (g22) x;
            jr_.w(-492369756);
            Object I5 = jr_.I();
            Configuration configuration2 = I5;
            if (I5 == f1a2) {
                Configuration configuration3 = new Configuration();
                if (configuration != null) {
                    configuration3.setTo(configuration);
                }
                jr_.ZW(configuration3);
                configuration2 = configuration3;
            }
            jr_.g(false);
            Configuration configuration4 = (Configuration) configuration2;
            jr_.w(-492369756);
            Object I6 = jr_.I();
            if (I6 == f1a2) {
                I6 = new k9(configuration4, g22);
                jr_.ZW(I6);
            }
            jr_.g(false);
            caw.v(g22, new e(context, 1, (k9) I6), jr_);
            jr_.g(false);
            l6.R(new bkv[]{R.v((Configuration) h0t.getValue()), f7428R.v(context), c.v(viewTreeOwners.f294R), e.v(viewTreeOwners.R), hcN.R.v(ohc2), X.v(androidComposeView.getView()), v.v(g22)}, aH9.I(jr_, 1471621628, new dR(androidComposeView, wh, iv7, i, 7)), jr_, 56);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new _a(androidComposeView, iv7, i, 11);
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    public static final void v(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
