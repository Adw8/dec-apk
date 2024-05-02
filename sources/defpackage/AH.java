package defpackage;

import android.content.ClipDescription;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: AH  reason: default package */
/* loaded from: classes.dex */
public class AH extends AccessibilityNodeProvider {
    public final /* synthetic */ int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final Object f0R;

    public AH(Zz zz) {
        this.f0R = zz;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        oIb oib;
        String str2;
        RectF rectF;
        switch (this.R) {
            case 0:
                gd gdVar = (gd) this.f0R;
                bNN bnn = (bNN) gdVar.j().get(Integer.valueOf(i));
                if (bnn != null && (oib = bnn.f1612R) != null) {
                    String g = gd.g(oib);
                    kEW kew = oib.f6738R;
                    b_t b_t = jGN.R;
                    if (!kew.R(b_t) || bundle == null || !n3x.v(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                        kEW kew2 = oib.f6738R;
                        b_t b_t2 = dwC.y;
                        if (kew2.R(b_t2) && bundle != null && n3x.v(str, "androidx.compose.ui.semantics.testTag") && (str2 = (String) gvP.i(oib.f6738R, b_t2)) != null) {
                            accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                            return;
                        }
                        return;
                    }
                    int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i3 > 0 && i2 >= 0) {
                        if (i2 < (g != null ? g.length() : Integer.MAX_VALUE)) {
                            ArrayList arrayList = new ArrayList();
                            kg9 kg9 = (kg9) ((Tp) oib.f6738R.v(b_t)).R;
                            boolean z = false;
                            if (n3x.v(kg9 != null ? (Boolean) kg9.x(arrayList) : null, Boolean.TRUE)) {
                                iRR irr = (iRR) arrayList.get(0);
                                ArrayList arrayList2 = new ArrayList();
                                int i4 = 0;
                                while (i4 < i3) {
                                    int i5 = i2 + i4;
                                    if (i5 >= irr.f4590R.f4165R.length()) {
                                        arrayList2.add(z);
                                    } else {
                                        gIA e = irr.v(i5).e(!oib.f6736R.K() ? aWo.v : ooA.i(oib.v()));
                                        gIA e2 = oib.e();
                                        gIA gia = e.v(e2) ? new gIA(Math.max(e.f3720R, e2.f3720R), Math.max(e.v, e2.v), Math.min(e.c, e2.c), Math.min(e.e, e2.e)) : null;
                                        if (gia != null) {
                                            long H = gdVar.f3814R.H(aH9.N(gia.f3720R, gia.v));
                                            long H2 = gdVar.f3814R.H(aH9.N(gia.c, gia.e));
                                            rectF = new RectF(aWo.e(H), aWo.X(H), aWo.e(H2), aWo.X(H2));
                                        } else {
                                            rectF = null;
                                        }
                                        arrayList2.add(rectF);
                                    }
                                    i4++;
                                    z = false;
                                }
                                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
                return;
            default:
                super.addExtraDataToAccessibilityNodeInfo(i, accessibilityNodeInfo, str, bundle);
                return;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        poS pos;
        boolean z;
        bz bzVar;
        nu_ nu_;
        m4i O;
        mdz mdz = mdz.Rtl;
        switch (this.R) {
            case 0:
                gd gdVar = (gd) this.f0R;
                Mj viewTreeOwners = gdVar.f3814R.getViewTreeOwners();
                if (((viewTreeOwners == null || (nu_ = viewTreeOwners.f294R) == null || (O = nu_.O()) == null) ? null : O.f5900R) != iMP.DESTROYED) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                    jG jGVar = new jG(obtain);
                    bNN bnn = (bNN) gdVar.j().get(Integer.valueOf(i));
                    if (bnn == null) {
                        obtain.recycle();
                    } else {
                        oIb oib = bnn.f1612R;
                        int i2 = -1;
                        if (i == -1) {
                            AndroidComposeView androidComposeView = gdVar.f3814R;
                            WeakHashMap weakHashMap = of5.f6887R;
                            ViewParent O2 = mHC.O(androidComposeView);
                            View view = O2 instanceof View ? (View) O2 : null;
                            jGVar.R = -1;
                            obtain.setParent(view);
                        } else if (oib.L() != null) {
                            int i3 = oib.L().R;
                            if (i3 != gdVar.f3814R.getSemanticsOwner().R().R) {
                                i2 = i3;
                            }
                            AndroidComposeView androidComposeView2 = gdVar.f3814R;
                            jGVar.R = i2;
                            obtain.setParent(androidComposeView2, i2);
                        } else {
                            throw new IllegalStateException(opT.m("semanticsNode ", i, " has null parent"));
                        }
                        AndroidComposeView androidComposeView3 = gdVar.f3814R;
                        jGVar.v = i;
                        obtain.setSource(androidComposeView3, i);
                        Rect rect = bnn.R;
                        long H = gdVar.f3814R.H(aH9.N((float) rect.left, (float) rect.top));
                        long H2 = gdVar.f3814R.H(aH9.N((float) rect.right, (float) rect.bottom));
                        obtain.setBoundsInScreen(new Rect((int) ((float) Math.floor((double) aWo.e(H))), (int) ((float) Math.floor((double) aWo.X(H))), (int) ((float) Math.ceil((double) aWo.e(H2))), (int) ((float) Math.ceil((double) aWo.X(H2)))));
                        boolean z2 = true;
                        boolean z3 = !oib.v && oib.X(false).isEmpty() && g4x.J(oib.f6736R, lBz.t) == null;
                        jGVar.L("android.view.View");
                        fzf fzf = (fzf) gvP.i(oib.f6738R, dwC.g);
                        if (fzf != null) {
                            int i4 = fzf.R;
                            if (oib.v || oib.X(false).isEmpty()) {
                                int i5 = fzf.R;
                                if (i5 == 4) {
                                    obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", gdVar.f3814R.getContext().getResources().getString(R.string.tab));
                                } else {
                                    String str = i4 == 0 ? "android.widget.Button" : i4 == 1 ? "android.widget.CheckBox" : i4 == 2 ? "android.widget.Switch" : i4 == 3 ? "android.widget.RadioButton" : i4 == 5 ? "android.widget.ImageView" : null;
                                    if (!(i5 == 5) || z3 || oib.f6738R.f5221R) {
                                        jGVar.L(str);
                                    }
                                }
                            }
                        }
                        if (g4x.h(oib)) {
                            jGVar.L("android.widget.EditText");
                        }
                        if (oib.O().R(dwC.t)) {
                            jGVar.L("android.widget.TextView");
                        }
                        obtain.setPackageName(gdVar.f3814R.getContext().getPackageName());
                        obtain.setImportantForAccessibility(true);
                        List X = oib.X(true);
                        int size = X.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            oIb oib2 = (oIb) X.get(i6);
                            if (gdVar.j().containsKey(Integer.valueOf(oib2.R))) {
                                qc qcVar = gdVar.f3814R.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(oib2.f6736R);
                                if (qcVar != null) {
                                    jGVar.f4895R.addChild(qcVar);
                                } else {
                                    jGVar.f4895R.addChild(gdVar.f3814R, oib2.R);
                                }
                            }
                        }
                        if (gdVar.v == i) {
                            jGVar.f4895R.setAccessibilityFocused(true);
                            jGVar.v(Ex.c);
                        } else {
                            jGVar.f4895R.setAccessibilityFocused(false);
                            jGVar.v(Ex.v);
                        }
                        gdVar.f3814R.getFontFamilyResolver();
                        bz y = gd.y(oib.f6738R);
                        SpannableString spannableString = (SpannableString) gd.d(y != null ? cU5.y(y, gdVar.f3814R.getDensity()) : null);
                        List list = (List) gvP.i(oib.f6738R, dwC.t);
                        spannableString = (SpannableString) gd.d((list == null || (bzVar = (bz) dF.w(list)) == null) ? null : cU5.y(bzVar, gdVar.f3814R.getDensity()));
                        if (spannableString == null) {
                        }
                        jGVar.H(spannableString);
                        kEW kew = oib.f6738R;
                        b_t b_t = dwC.h;
                        if (kew.R(b_t)) {
                            jGVar.f4895R.setContentInvalid(true);
                            jGVar.f4895R.setError((CharSequence) gvP.i(oib.f6738R, b_t));
                        }
                        jGVar.x((CharSequence) gvP.i(oib.f6738R, dwC.v));
                        aJk ajk = (aJk) gvP.i(oib.f6738R, dwC.J);
                        if (ajk != null) {
                            jGVar.f4895R.setCheckable(true);
                            int ordinal = ajk.ordinal();
                            if (ordinal == 0) {
                                jGVar.f4895R.setChecked(true);
                                if ((fzf != null && fzf.R == 2) && jGVar.X() == null) {
                                    jGVar.x(gdVar.f3814R.getContext().getResources().getString(R.string.on));
                                }
                            } else if (ordinal == 1) {
                                jGVar.f4895R.setChecked(false);
                                if ((fzf != null && fzf.R == 2) && jGVar.X() == null) {
                                    jGVar.x(gdVar.f3814R.getContext().getResources().getString(R.string.off));
                                }
                            } else if (ordinal == 2 && jGVar.X() == null) {
                                jGVar.x(gdVar.f3814R.getContext().getResources().getString(R.string.indeterminate));
                            }
                        }
                        Boolean bool = (Boolean) gvP.i(oib.f6738R, dwC.K);
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            if (fzf != null && fzf.R == 4) {
                                jGVar.f4895R.setSelected(booleanValue);
                            } else {
                                jGVar.f4895R.setCheckable(true);
                                jGVar.f4895R.setChecked(booleanValue);
                                if (jGVar.X() == null) {
                                    jGVar.x(booleanValue ? gdVar.f3814R.getContext().getResources().getString(R.string.selected) : gdVar.f3814R.getContext().getResources().getString(R.string.not_selected));
                                }
                            }
                        }
                        if (!oib.f6738R.f5221R || oib.X(false).isEmpty()) {
                            List list2 = (List) gvP.i(oib.f6738R, dwC.R);
                            jGVar.f4895R.setContentDescription(list2 != null ? (String) dF.w(list2) : null);
                        }
                        String str2 = (String) gvP.i(oib.f6738R, dwC.y);
                        if (str2 != null) {
                            oIb oib3 = oib;
                            while (true) {
                                if (oib3 != null) {
                                    kEW kew2 = oib3.f6738R;
                                    b_t b_t2 = cIK.R;
                                    if (kew2.R(b_t2)) {
                                        z = ((Boolean) oib3.f6738R.v(b_t2)).booleanValue();
                                    } else {
                                        oib3 = oib3.L();
                                    }
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                jGVar.f4895R.setViewIdResourceName(str2);
                            }
                        }
                        if (((o8s) gvP.i(oib.f6738R, dwC.Z)) != null) {
                            jGVar.f4895R.setHeading(true);
                        }
                        jGVar.f4895R.setPassword(oib.O().R(dwC.Y));
                        jGVar.f4895R.setEditable(g4x.h(oib));
                        jGVar.f4895R.setEnabled(g4x.H(oib));
                        kEW kew3 = oib.f6738R;
                        b_t b_t3 = dwC.H;
                        jGVar.f4895R.setFocusable(kew3.R(b_t3));
                        if (jGVar.f4895R.isFocusable()) {
                            jGVar.f4895R.setFocused(((Boolean) oib.f6738R.v(b_t3)).booleanValue());
                            if (jGVar.f4895R.isFocused()) {
                                jGVar.R(2);
                            } else {
                                jGVar.R(1);
                            }
                        }
                        if (oib.v) {
                            oIb L = oib.L();
                            pos = L != null ? L.v() : null;
                        } else {
                            pos = oib.v();
                        }
                        jGVar.f4895R.setVisibleToUser(!(pos != null ? pos.HK() : false) && gvP.i(oib.f6738R, dwC.U) == null);
                        jQ.Y(gvP.i(oib.f6738R, dwC.x));
                        jGVar.f4895R.setClickable(false);
                        Tp tp = (Tp) gvP.i(oib.f6738R, jGN.v);
                        if (tp != null) {
                            boolean v = n3x.v(gvP.i(oib.f6738R, dwC.K), Boolean.TRUE);
                            jGVar.f4895R.setClickable(!v);
                            if (g4x.H(oib) && !v) {
                                jGVar.v(new Ex(16, tp.f537R));
                            }
                        }
                        jGVar.f4895R.setLongClickable(false);
                        Tp tp2 = (Tp) gvP.i(oib.f6738R, jGN.c);
                        if (tp2 != null) {
                            jGVar.f4895R.setLongClickable(true);
                            if (g4x.H(oib)) {
                                jGVar.v(new Ex(32, tp2.f537R));
                            }
                        }
                        Tp tp3 = (Tp) gvP.i(oib.f6738R, jGN.m);
                        if (tp3 != null) {
                            jGVar.v(new Ex(16384, tp3.f537R));
                        }
                        if (g4x.H(oib)) {
                            Tp tp4 = (Tp) gvP.i(oib.f6738R, jGN.Z);
                            if (tp4 != null) {
                                jGVar.v(new Ex(2097152, tp4.f537R));
                            }
                            Tp tp5 = (Tp) gvP.i(oib.f6738R, jGN.x);
                            if (tp5 != null) {
                                jGVar.v(new Ex(65536, tp5.f537R));
                            }
                            Tp tp6 = (Tp) gvP.i(oib.f6738R, jGN.H);
                            if (tp6 != null && jGVar.f4895R.isFocused()) {
                                ClipDescription primaryClipDescription = gdVar.f3814R.getClipboardManager().R.getPrimaryClipDescription();
                                if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/plain") : false) {
                                    jGVar.v(new Ex(32768, tp6.f537R));
                                }
                            }
                        }
                        String g = gd.g(oib);
                        if (!(g == null || g.length() == 0)) {
                            jGVar.f4895R.setTextSelection(gdVar.P(oib), gdVar.N(oib));
                            Tp tp7 = (Tp) gvP.i(oib.f6738R, jGN.L);
                            jGVar.v(new Ex(131072, tp7 != null ? tp7.f537R : null));
                            jGVar.R(256);
                            jGVar.R(512);
                            jGVar.f4895R.setMovementGranularities(11);
                            List list3 = (List) gvP.i(oib.f6738R, dwC.R);
                            if ((list3 == null || list3.isEmpty()) && oib.f6738R.R(jGN.R) && !g4x.U(oib)) {
                                jGVar.f4895R.setMovementGranularities(jGVar.f4895R.getMovementGranularities() | 4 | 16);
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        CharSequence O3 = jGVar.O();
                        if (!(O3 == null || O3.length() == 0) && oib.f6738R.R(jGN.R)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (oib.f6738R.R(dwC.y)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (!arrayList.isEmpty()) {
                            uh.R.R(jGVar.f4895R, arrayList);
                        }
                        j07 j07 = (j07) gvP.i(oib.f6738R, dwC.c);
                        if (j07 != null) {
                            kEW kew4 = oib.f6738R;
                            b_t b_t4 = jGN.O;
                            if (kew4.R(b_t4)) {
                                jGVar.L("android.widget.SeekBar");
                            } else {
                                jGVar.L("android.widget.ProgressBar");
                            }
                            if (j07 != j07.R) {
                                jGVar.f4895R.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new h89(12, AccessibilityNodeInfo.RangeInfo.obtain(1, ((Number) j07.f4789R.v()).floatValue(), ((Number) j07.f4789R.R()).floatValue(), j07.f4787R)).R);
                                if (jGVar.X() == null) {
                                    p6 p6Var = j07.f4789R;
                                    float m = caw.m(((((Number) p6Var.R()).floatValue() - ((Number) p6Var.v()).floatValue()) > 0.0f ? 1 : ((((Number) p6Var.R()).floatValue() - ((Number) p6Var.v()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (j07.f4787R - ((Number) p6Var.v()).floatValue()) / (((Number) p6Var.R()).floatValue() - ((Number) p6Var.v()).floatValue()), 0.0f, 1.0f);
                                    int i7 = 100;
                                    if (m == 0.0f) {
                                        i7 = 0;
                                    } else if (!(m == 1.0f)) {
                                        i7 = caw.x(mLz.t(m * ((float) 100)), 1, 99);
                                    }
                                    jGVar.x(gdVar.f3814R.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i7)));
                                }
                            } else if (jGVar.X() == null) {
                                jGVar.x(gdVar.f3814R.getContext().getResources().getString(R.string.in_progress));
                            }
                            if (oib.f6738R.R(b_t4) && g4x.H(oib)) {
                                float f = j07.f4787R;
                                float floatValue = ((Number) j07.f4789R.R()).floatValue();
                                float floatValue2 = ((Number) j07.f4789R.v()).floatValue();
                                if (floatValue < floatValue2) {
                                    floatValue = floatValue2;
                                }
                                if (f < floatValue) {
                                    jGVar.v(Ex.e);
                                }
                                float f2 = j07.f4787R;
                                float floatValue3 = ((Number) j07.f4789R.v()).floatValue();
                                float floatValue4 = ((Number) j07.f4789R.R()).floatValue();
                                if (floatValue3 > floatValue4) {
                                    floatValue3 = floatValue4;
                                }
                                if (f2 > floatValue3) {
                                    jGVar.v(Ex.X);
                                }
                            }
                        }
                        Zc.R(jGVar, oib);
                        gvP.n(jGVar, oib);
                        gvP.Q(jGVar, oib);
                        aD4 ad4 = (aD4) gvP.i(oib.f6738R, dwC.C);
                        Tp tp8 = (Tp) gvP.i(oib.f6738R, jGN.e);
                        if (!(ad4 == null || tp8 == null)) {
                            if (!gvP.Y(oib)) {
                                jGVar.L("android.widget.HorizontalScrollView");
                            }
                            if (((Number) ad4.v.g()).floatValue() > 0.0f) {
                                jGVar.m(true);
                            }
                            if (g4x.H(oib)) {
                                if (gd.J(ad4)) {
                                    jGVar.v(Ex.e);
                                    jGVar.v(!(oib.f6736R.f3603R == mdz) ? Ex.U : Ex.x);
                                }
                                if (gd.K(ad4)) {
                                    jGVar.v(Ex.X);
                                    jGVar.v(!(oib.f6736R.f3603R == mdz) ? Ex.x : Ex.U);
                                }
                            }
                        }
                        aD4 ad42 = (aD4) gvP.i(oib.f6738R, dwC.N);
                        if (!(ad42 == null || tp8 == null)) {
                            if (!gvP.Y(oib)) {
                                jGVar.L("android.widget.ScrollView");
                            }
                            if (((Number) ad42.v.g()).floatValue() > 0.0f) {
                                jGVar.m(true);
                            }
                            if (g4x.H(oib)) {
                                if (gd.J(ad42)) {
                                    jGVar.v(Ex.e);
                                    jGVar.v(Ex.H);
                                }
                                if (gd.K(ad42)) {
                                    jGVar.v(Ex.X);
                                    jGVar.v(Ex.m);
                                }
                            }
                        }
                        jGVar.f4895R.setPaneTitle((CharSequence) gvP.i(oib.f6738R, dwC.e));
                        if (g4x.H(oib)) {
                            Tp tp9 = (Tp) gvP.i(oib.f6738R, jGN.U);
                            if (tp9 != null) {
                                jGVar.v(new Ex(262144, tp9.f537R));
                            }
                            Tp tp10 = (Tp) gvP.i(oib.f6738R, jGN.C);
                            if (tp10 != null) {
                                jGVar.v(new Ex(524288, tp10.f537R));
                            }
                            Tp tp11 = (Tp) gvP.i(oib.f6738R, jGN.N);
                            if (tp11 != null) {
                                jGVar.v(new Ex(1048576, tp11.f537R));
                            }
                            kEW kew5 = oib.f6738R;
                            b_t b_t5 = jGN.j;
                            if (kew5.R(b_t5)) {
                                List list4 = (List) oib.f6738R.v(b_t5);
                                int size2 = list4.size();
                                int[] iArr = gd.R;
                                if (size2 < 32) {
                                    eSi esi = new eSi();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    if (gdVar.f3826v.X(i)) {
                                        Map map = (Map) gdVar.f3826v.L(i, null);
                                        ArrayList arrayList2 = new ArrayList(32);
                                        for (int i8 = 0; i8 < 32; i8++) {
                                            arrayList2.add(Integer.valueOf(iArr[i8]));
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        if (list4.size() > 0) {
                                            jQ.Y(list4.get(0));
                                            throw null;
                                        } else if (arrayList3.size() > 0) {
                                            jQ.Y(arrayList3.get(0));
                                            ((Number) arrayList2.get(0)).intValue();
                                            throw null;
                                        }
                                    } else if (list4.size() > 0) {
                                        jQ.Y(list4.get(0));
                                        throw null;
                                    }
                                    gdVar.f3815R.Z(i, esi);
                                    gdVar.f3826v.Z(i, linkedHashMap);
                                } else {
                                    throw new IllegalStateException("Can't have more than 32 custom actions for one widget");
                                }
                            }
                        }
                        boolean z4 = (jGVar.f4895R.getContentDescription() == null && jGVar.O() == null && jGVar.f4895R.getHintText() == null && jGVar.X() == null && !jGVar.f4895R.isCheckable()) ? false : true;
                        if (!oib.f6738R.f5221R && (!z3 || !z4)) {
                            z2 = false;
                        }
                        jGVar.f4895R.setScreenReaderFocusable(z2);
                        return jGVar.f4895R;
                    }
                }
                return null;
            default:
                jG X2 = ((Zz) this.f0R).X(i);
                if (X2 == null) {
                    return null;
                }
                return X2.f4895R;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        switch (this.R) {
            case 1:
                ((Zz) this.f0R).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:280:0x04f0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [qe] */
    /* JADX WARN: Type inference failed for: r12v3, types: [k1] */
    /* JADX WARN: Type inference failed for: r12v4, types: [O3] */
    /* JADX WARN: Type inference failed for: r12v5, types: [iB, fd] */
    /* JADX WARN: Type inference failed for: r12v6, types: [ST, fd] */
    /* JADX WARN: Type inference failed for: r12v7, types: [y0, fd] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0501, code lost:
        if (r11 != 16) goto L_0x05b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARNING: Unknown variable types count: 10 */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean performAction(int r17, int r18, android.os.Bundle r19) {
        /*
        // Method dump skipped, instructions count: 1704
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AH.performAction(int, int, android.os.Bundle):boolean");
    }

    public AH(gd gdVar) {
        this.f0R = gdVar;
    }
}
