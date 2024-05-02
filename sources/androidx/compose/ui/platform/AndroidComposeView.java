package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements gzG, iAM, oaS, DefaultLifecycleObserver {
    public static Class R;

    /* renamed from: R  reason: collision with other field name */
    public static Method f1183R;
    public boolean O;

    /* renamed from: R  reason: collision with other field name */
    public final AT f1185R;

    /* renamed from: R  reason: collision with other field name */
    public Cm f1186R;

    /* renamed from: R  reason: collision with other field name */
    public final Gf f1187R;

    /* renamed from: R  reason: collision with other field name */
    public MotionEvent f1192R;

    /* renamed from: R  reason: collision with other field name */
    public final bLT f1195R;

    /* renamed from: R  reason: collision with other field name */
    public final biT f1196R;

    /* renamed from: R  reason: collision with other field name */
    public final ci f1197R;

    /* renamed from: R  reason: collision with other field name */
    public final czM f1198R;

    /* renamed from: R  reason: collision with other field name */
    public final egg f1199R;

    /* renamed from: R  reason: collision with other field name */
    public fi6 f1200R;

    /* renamed from: R  reason: collision with other field name */
    public final fue f1201R;

    /* renamed from: R  reason: collision with other field name */
    public final gd f1202R;

    /* renamed from: R  reason: collision with other field name */
    public final h5 f1203R;

    /* renamed from: R  reason: collision with other field name */
    public final i2A f1205R;

    /* renamed from: R  reason: collision with other field name */
    public i4B f1206R;

    /* renamed from: R  reason: collision with other field name */
    public final k0f f1211R;

    /* renamed from: R  reason: collision with other field name */
    public final kef f1212R;

    /* renamed from: R  reason: collision with other field name */
    public final l_5 f1215R;

    /* renamed from: R  reason: collision with other field name */
    public final mBn f1217R;

    /* renamed from: R  reason: collision with other field name */
    public final o3Z f1218R;

    /* renamed from: R  reason: collision with other field name */
    public oys f1220R;

    /* renamed from: R  reason: collision with other field name */
    public final pt f1222R;

    /* renamed from: R  reason: collision with other field name */
    public final q4 f1223R;

    /* renamed from: R  reason: collision with other field name */
    public final w5 f1225R;

    /* renamed from: R  reason: collision with other field name */
    public final wK f1226R;
    public long X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f1231X;
    public boolean Z;

    /* renamed from: c  reason: collision with other field name */
    public final oST f1232c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1233c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f1235e;
    public boolean m;

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f1236v;

    /* renamed from: v  reason: collision with other field name */
    public kg9 f1237v;

    /* renamed from: v  reason: collision with other field name */
    public final oST f1238v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1239v;

    /* renamed from: R  reason: collision with other field name */
    public long f1184R = aWo.e;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1227R = true;

    /* renamed from: R  reason: collision with other field name */
    public final jDh f1207R = new jDh();

    /* renamed from: R  reason: collision with other field name */
    public final lTD f1214R = new lTD();

    /* renamed from: R  reason: collision with other field name */
    public final h89 f1204R = new h89(4);

    /* renamed from: R  reason: collision with other field name */
    public final AndroidComposeView f1193R = this;

    /* renamed from: R  reason: collision with other field name */
    public final jRV f1208R = new jRV(getRoot());

    /* renamed from: R  reason: collision with other field name */
    public final TZ f1189R = new TZ();

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f1210R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final m7z f1216R = new m7z();

    /* renamed from: R  reason: collision with other field name */
    public final b1t f1194R = new b1t(getRoot());

    /* renamed from: R  reason: collision with other field name */
    public kg9 f1213R = lBz.j;

    /* renamed from: R  reason: collision with other field name */
    public final Zv f1191R = new Zv(this, getAutofillTree());

    /* renamed from: R  reason: collision with other field name */
    public final pcP f1221R = new pcP(new eV(this, 2));

    /* renamed from: R  reason: collision with other field name */
    public final jU3 f1209R = new jU3(getRoot());
    public long v = cU5.v(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: R  reason: collision with other field name */
    public final int[] f1229R = {0, 0};

    /* renamed from: R  reason: collision with other field name */
    public final float[] f1228R = l1r.R();

    /* renamed from: v  reason: collision with other field name */
    public final float[] f1240v = l1r.R();
    public long c = -1;

    /* renamed from: e  reason: collision with other field name */
    public long f1234e = aWo.c;
    public boolean L = true;

    /* renamed from: R  reason: collision with other field name */
    public final oST f1219R = l6.n(null);

    /* renamed from: R  reason: collision with other field name */
    public final R_ f1188R = new R_(this);

    /* renamed from: R  reason: collision with other field name */
    public final WF f1190R = new WF(this);

    /* renamed from: R  reason: collision with other field name */
    public final r7 f1224R = new r7(this);

    /* renamed from: X  reason: collision with other field name */
    public final ppN f1230X = new ppN();

    static {
        new dq();
    }

    public AndroidComposeView(Context context) {
        super(context);
        this.f1206R = gQc.v(context);
        b2X b2x = new b2X(false, false, lBz.y, lBz.Y);
        o3Z o3z = new o3Z();
        this.f1218R = o3z;
        czM czm = new czM(new eV(this, 1), null);
        this.f1198R = czm;
        aff aff = aff.R;
        lBz lbz = lBz.g;
        bsy bsy = eD_.R;
        ncu R2 = mWb.R(aff, new ivi(new kmL(18, lbz)));
        fue fue = new fue(3, false, 0);
        fue.B(ml0.R);
        fue.G(getDensity());
        fue.l(b2x.I(R2).I(o3z.f6660R).I(czm));
        this.f1201R = fue;
        gd gdVar = new gd(this);
        this.f1202R = gdVar;
        this.f1197R = new ci(context);
        this.f1185R = new AT(context);
        int i = 2;
        this.f1222R = new pt(ViewConfiguration.get(context));
        egg egg = new egg(this);
        this.f1199R = egg;
        this.f1212R = (kef) lBz.K.x(egg);
        this.f1238v = new oST(gQc.o(context), bYG.R);
        this.e = context.getResources().getConfiguration().fontWeightAdjustment;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        mdz mdz = mdz.Ltr;
        if (layoutDirection != 0 && layoutDirection == 1) {
            mdz = mdz.Rtl;
        }
        this.f1232c = l6.n(mdz);
        this.f1215R = new l_5(this);
        this.f1205R = new i2A(isInTouchMode() ? 1 : i);
        this.f1195R = new bLT(this);
        this.f1226R = new wK(this);
        this.f1203R = new h5(8);
        this.f1196R = new biT(new f_c[16]);
        this.f1211R = new k0f(4, this);
        this.f1217R = new mBn(5, this);
        this.f1223R = new q4(16, this);
        this.f1225R = new w5();
        setWillNotDraw(false);
        setFocusable(true);
        en.R.R(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        of5.O(this, gdVar);
        getRoot().c(this);
        hc.R.R(this);
        this.f1187R = new Gf(this);
    }

    public static void O(fue fue) {
        fue.i();
        biT j = fue.j();
        int i = j.e;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = j.f1772R;
            do {
                O((fue) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    public static boolean Z(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (!(!Float.isInfinite(x) && !Float.isNaN(x))) {
            return true;
        }
        float y = motionEvent.getY();
        if (!(!Float.isInfinite(y) && !Float.isNaN(y))) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (!(!Float.isInfinite(rawX) && !Float.isNaN(rawX))) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        return !(!Float.isInfinite(rawY) && !Float.isNaN(rawY));
    }

    public static kSh c(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return new kSh(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new kSh(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return new kSh(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private void setFontFamilyResolver(gP7 gp7) {
        this.f1238v.R(gp7);
    }

    private void setLayoutDirection(mdz mdz) {
        this.f1232c.R(mdz);
    }

    private final void setViewTreeOwners(Mj mj) {
        this.f1219R.R(mj);
    }

    public static void v(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).N();
            } else if (childAt instanceof ViewGroup) {
                v((ViewGroup) childAt);
            }
        }
    }

    public final void C(lYW lyw, boolean z) {
        if (!z) {
            if (!this.f1239v && !this.f1210R.remove(lyw)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.f1239v) {
            this.f1210R.add(lyw);
        } else {
            ArrayList arrayList = this.f1236v;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1236v = arrayList;
            }
            arrayList.add(lyw);
        }
    }

    public final long H(long j) {
        g();
        long v = l1r.v(this.f1228R, j);
        return aH9.N(aWo.e(this.f1234e) + aWo.e(v), aWo.X(this.f1234e) + aWo.X(v));
    }

    public final void K() {
        getLocationOnScreen(this.f1229R);
        long j = this.v;
        int i = (int) (j >> 32);
        int v = dU5.v(j);
        int[] iArr = this.f1229R;
        boolean z = false;
        int i2 = iArr[0];
        if (!(i == i2 && v == iArr[1])) {
            this.v = cU5.v(i2, iArr[1]);
            if (!(i == Integer.MAX_VALUE || v == Integer.MAX_VALUE)) {
                getRoot().f3606R.f7296R.PN();
                z = true;
            }
        }
        this.f1209R.R(z);
    }

    public final void L(fue fue) {
        int i = 0;
        this.f1209R.P(fue, false);
        biT j = fue.j();
        int i2 = j.e;
        if (i2 > 0) {
            Object[] objArr = j.f1772R;
            do {
                L((fue) objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public final void N() {
        if (this.f1233c) {
            jE4 je4 = getSnapshotObserver().R;
            synchronized (je4.f4859R) {
                biT bit = je4.f4859R;
                int i = bit.e;
                if (i > 0) {
                    Object[] objArr = bit.f1772R;
                    int i2 = 0;
                    do {
                        ((nog) objArr[i2]).e();
                        i2++;
                    } while (i2 < i);
                }
            }
            this.f1233c = false;
        }
        Cm cm = this.f1186R;
        if (cm != null) {
            v(cm);
        }
        while (this.f1196R.H()) {
            int i3 = this.f1196R.e;
            for (int i4 = 0; i4 < i3; i4++) {
                Object[] objArr2 = this.f1196R.f1772R;
                f_c f_c = (f_c) objArr2[i4];
                objArr2[i4] = null;
                if (f_c != null) {
                    f_c.g();
                }
            }
            this.f1196R.P(0, i3);
        }
    }

    public final void P(fue fue) {
        gd gdVar = this.f1202R;
        gdVar.f3824R = true;
        if (gdVar.t()) {
            gdVar.i(fue);
        }
    }

    public final void U(boolean z) {
        q4 q4Var;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                q4Var = this.f1223R;
            } finally {
                Trace.endSection();
            }
        } else {
            q4Var = null;
        }
        if (this.f1209R.O(q4Var)) {
            requestLayout();
        }
        this.f1209R.R(false);
    }

    public final int V(MotionEvent motionEvent) {
        Object obj;
        boolean z = false;
        if (this.m) {
            this.m = false;
            lTD ltd = this.f1214R;
            int metaState = motionEvent.getMetaState();
            ltd.getClass();
            lTD.v.R(new dh_(metaState));
        }
        pcs R2 = this.f1216R.R(motionEvent, this);
        if (R2 != null) {
            List list = R2.f7127R;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((cWa) obj).f2116R) {
                    break;
                }
            }
            cWa cwa = (cWa) obj;
            if (cwa != null) {
                this.f1184R = cwa.e;
            }
            int O = this.f1194R.O(R2, this, m(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 5) {
                z = true;
                if ((O & 1) != 0) {
                }
                if (!z) {
                    m7z m7z = this.f1216R;
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    m7z.f5946R.delete(pointerId);
                    m7z.f5947R.delete(pointerId);
                }
            }
            return O;
        }
        this.f1194R.L();
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d A[Catch: all -> 0x00f0, TryCatch #1 {all -> 0x00f5, blocks: (B:3:0x0006, B:51:0x00e4, B:4:0x004f, B:6:0x0058, B:11:0x0063, B:13:0x006d, B:19:0x007d, B:22:0x0084, B:31:0x0095, B:32:0x009b, B:35:0x00a5, B:36:0x00b1, B:45:0x00c3, B:47:0x00c9, B:49:0x00d7, B:50:0x00da), top: B:57:0x0006 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0095 A[Catch: all -> 0x00f0, TryCatch #1 {all -> 0x00f5, blocks: (B:3:0x0006, B:51:0x00e4, B:4:0x004f, B:6:0x0058, B:11:0x0063, B:13:0x006d, B:19:0x007d, B:22:0x0084, B:31:0x0095, B:32:0x009b, B:35:0x00a5, B:36:0x00b1, B:45:0x00c3, B:47:0x00c9, B:49:0x00d7, B:50:0x00da), top: B:57:0x0006 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b A[Catch: all -> 0x00f0, TryCatch #1 {all -> 0x00f5, blocks: (B:3:0x0006, B:51:0x00e4, B:4:0x004f, B:6:0x0058, B:11:0x0063, B:13:0x006d, B:19:0x007d, B:22:0x0084, B:31:0x0095, B:32:0x009b, B:35:0x00a5, B:36:0x00b1, B:45:0x00c3, B:47:0x00c9, B:49:0x00d7, B:50:0x00da), top: B:57:0x0006 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int X(android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.X(android.view.MotionEvent):int");
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        Zv zv = this.f1191R;
        if (zv != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                bC bCVar = bC.R;
                if (bCVar.e(autofillValue)) {
                    TZ tz = zv.R;
                    bCVar.m(autofillValue).toString();
                    jQ.Y(tz.R.get(Integer.valueOf(keyAt)));
                } else if (bCVar.v(autofillValue)) {
                    throw new bMv("An operation is not implemented: b/138604541: Add onFill() callback for date");
                } else if (bCVar.c(autofillValue)) {
                    throw new bMv("An operation is not implemented: b/138604541: Add onFill() callback for list");
                } else if (bCVar.X(autofillValue)) {
                    throw new bMv("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f1202R.H(i, this.f1184R, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f1202R.H(i, this.f1184R, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            O(getRoot());
        }
        gzG.R(this);
        this.f1239v = true;
        h89 h89 = this.f1204R;
        W3 w3 = (W3) h89.R;
        Canvas canvas2 = w3.R;
        w3.R = canvas;
        getRoot().Z(w3);
        ((W3) h89.R).R = canvas2;
        if (true ^ this.f1210R.isEmpty()) {
            int size = this.f1210R.size();
            for (int i = 0; i < size; i++) {
                ((lYW) this.f1210R.get(i)).L();
            }
        }
        if (pzb.X) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f1210R.clear();
        this.f1239v = false;
        ArrayList arrayList = this.f1236v;
        if (arrayList != null) {
            this.f1210R.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        ivi ivi;
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            float f = -motionEvent.getAxisValue(26);
            getContext();
            getContext();
            jui jui = new jui(nW_.v(viewConfiguration) * f, nW_.R(viewConfiguration) * f, motionEvent.getEventTime());
            pi1 S = msU.S(this.f1218R.f6661R);
            if (!(S == null || (ivi = S.f7191R) == null || (!ivi.m() && !ivi.c(jui)))) {
                return true;
            }
        } else if (Z(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        } else {
            if ((X(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isFocused()
            if (r0 == 0) goto L_0x0081
            lTD r0 = r9.f1214R
            int r1 = r10.getMetaState()
            r0.getClass()
            oST r0 = defpackage.lTD.v
            dh_ r2 = new dh_
            r2.<init>(r1)
            r0.R(r2)
            czM r9 = r9.f1198R
            pi1 r9 = r9.f2467R
            if (r9 == 0) goto L_0x0075
            pi1 r9 = defpackage.msU.A(r9)
            if (r9 == 0) goto L_0x0075
            poS r0 = r9.f7195R
            r1 = 0
            if (r0 == 0) goto L_0x0066
            fue r0 = r0.f7272R
            if (r0 != 0) goto L_0x002f
            goto L_0x0066
        L_0x002f:
            biT r2 = r9.v
            int r3 = r2.e
            if (r3 <= 0) goto L_0x0061
            r4 = 0
            java.lang.Object[] r2 = r2.f1772R
        L_0x0038:
            r5 = r2[r4]
            czM r5 = (defpackage.czM) r5
            fue r6 = r5.f2465R
            boolean r6 = defpackage.n3x.v(r6, r0)
            if (r6 == 0) goto L_0x005d
            if (r1 != 0) goto L_0x0047
            goto L_0x005c
        L_0x0047:
            fue r6 = r5.f2465R
            r7 = r1
        L_0x004a:
            boolean r8 = defpackage.n3x.v(r7, r5)
            if (r8 != 0) goto L_0x005d
            czM r7 = r7.R
            if (r7 == 0) goto L_0x005c
            fue r8 = r7.f2465R
            boolean r8 = defpackage.n3x.v(r8, r6)
            if (r8 != 0) goto L_0x004a
        L_0x005c:
            r1 = r5
        L_0x005d:
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x0038
        L_0x0061:
            if (r1 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            czM r1 = r9.f7189R
        L_0x0066:
            if (r1 == 0) goto L_0x0075
            boolean r9 = r1.m(r10)
            if (r9 == 0) goto L_0x0070
            r9 = 1
            goto L_0x0085
        L_0x0070:
            boolean r9 = r1.c(r10)
            goto L_0x0085
        L_0x0075:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "KeyEvent can't be processed because this key input node is not active."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            boolean r9 = super.dispatchKeyEvent(r10)
        L_0x0085:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.Z) {
            removeCallbacks(this.f1217R);
            MotionEvent motionEvent2 = this.f1192R;
            if (motionEvent.getActionMasked() == 0) {
                if (!((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                    this.Z = false;
                }
            }
            this.f1217R.run();
        }
        if (Z(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !x(motionEvent)) {
            return false;
        }
        int X = X(motionEvent);
        if ((X & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (X & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void g() {
        if (!this.O) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.c) {
                this.c = currentAnimationTimeMillis;
                this.f1225R.R(this, this.f1228R);
                aH9.E(this.f1228R, this.f1240v);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.f1229R);
                int[] iArr = this.f1229R;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f1229R;
                this.f1234e = aH9.N(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    public final Cm getAndroidViewsHandler$ui_release() {
        if (this.f1186R == null) {
            Cm cm = new Cm(getContext());
            this.f1186R = cm;
            addView(cm);
        }
        return this.f1186R;
    }

    @Override // defpackage.gzG
    public i8 getAutofill() {
        return this.f1191R;
    }

    @Override // defpackage.gzG
    public TZ getAutofillTree() {
        return this.f1189R;
    }

    public final kg9 getConfigurationChangeObserver() {
        return this.f1213R;
    }

    @Override // defpackage.gzG
    public jJj getDensity() {
        return this.f1206R;
    }

    @Override // defpackage.gzG
    public cjR getFocusManager() {
        return this.f1218R;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        o8s o8s;
        pi1 S = msU.S(this.f1218R.f6661R);
        if (S != null) {
            gIA T = msU.T(S);
            rect.left = mLz.t(T.f3720R);
            rect.top = mLz.t(T.v);
            rect.right = mLz.t(T.c);
            rect.bottom = mLz.t(T.e);
            o8s = o8s.R;
        } else {
            o8s = null;
        }
        if (o8s == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // defpackage.gzG
    public gP7 getFontFamilyResolver() {
        return (gP7) this.f1238v.getValue();
    }

    @Override // defpackage.gzG
    public agj getFontLoader() {
        return this.f1230X;
    }

    @Override // defpackage.gzG
    public jlt getHapticFeedBack() {
        return this.f1215R;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !((mYQ) this.f1209R.f4941R.f4227R).isEmpty();
    }

    @Override // defpackage.gzG
    public px0 getInputModeManager() {
        return this.f1205R;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.c;
    }

    @Override // android.view.ViewParent, android.view.View, defpackage.gzG
    public mdz getLayoutDirection() {
        return (mdz) this.f1232c.getValue();
    }

    public long getMeasureIteration() {
        jU3 ju3 = this.f1209R;
        if (ju3.f4943R) {
            return ju3.R;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    @Override // defpackage.gzG
    public bLT getModifierLocalManager() {
        return this.f1195R;
    }

    @Override // defpackage.gzG
    public bQf getPointerIconService() {
        return this.f1187R;
    }

    public fue getRoot() {
        return this.f1201R;
    }

    public iAM getRootForTest() {
        return this.f1193R;
    }

    public jRV getSemanticsOwner() {
        return this.f1208R;
    }

    @Override // defpackage.gzG
    public jDh getSharedDrawScope() {
        return this.f1207R;
    }

    @Override // defpackage.gzG
    public boolean getShowLayoutBounds() {
        return this.f1235e;
    }

    @Override // defpackage.gzG
    public pcP getSnapshotObserver() {
        return this.f1221R;
    }

    @Override // defpackage.gzG
    public kef getTextInputService() {
        return this.f1212R;
    }

    @Override // defpackage.gzG
    public lI8 getTextToolbar() {
        return this.f1226R;
    }

    public View getView() {
        return this;
    }

    @Override // defpackage.gzG
    public bUo getViewConfiguration() {
        return this.f1222R;
    }

    public final Mj getViewTreeOwners() {
        return (Mj) this.f1219R.getValue();
    }

    @Override // defpackage.gzG
    public o90 getWindowInfo() {
        return this.f1214R;
    }

    public final long i(long j) {
        g();
        return l1r.v(this.f1240v, aH9.N(aWo.e(j) - aWo.e(this.f1234e), aWo.X(j) - aWo.X(this.f1234e)));
    }

    public final void j() {
        gd gdVar = this.f1202R;
        gdVar.f3824R = true;
        if (gdVar.t() && !gdVar.f3827v) {
            gdVar.f3827v = true;
            gdVar.f3812R.post(gdVar.f3820R);
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= ((float) getWidth())) {
            if (0.0f <= y && y <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    public final void o(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
            i2 = -1;
        } else {
            if (!(i == 9 || i == 10)) {
                i2 = 0;
            }
            i2 = -1;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i3 = 0; i3 < pointerCount; i3++) {
                pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i4 = 0; i4 < pointerCount; i4++) {
                pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
            }
            int i5 = 0;
            while (i5 < pointerCount) {
                int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
                motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
                motionEvent.getPointerCoords(i6, pointerCoords);
                long H = H(aH9.N(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = aWo.e(H);
                pointerCoords.y = aWo.X(H);
                i5++;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            this.f1194R.O(this.f1216R.R(obtain, this), this, true);
            obtain.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        nu_ nu_;
        m4i O;
        nu_ nu_2;
        super.onAttachedToWindow();
        L(getRoot());
        O(getRoot());
        jE4 je4 = getSnapshotObserver().R;
        je4.f4861R = ift.x(je4.f4860R);
        Zv zv = this.f1191R;
        if (zv != null) {
            yU.R.R(zv);
        }
        nu_ s = aH9.s(this);
        adL T = aH9.T(this);
        Mj viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(s == null || T == null || (s == (nu_2 = viewTreeOwners.f294R) && T == nu_2))) {
            if (s == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (T != null) {
                if (!(viewTreeOwners == null || (nu_ = viewTreeOwners.f294R) == null || (O = nu_.O()) == null)) {
                    O.v(this);
                }
                s.O().R(this);
                Mj mj = new Mj(s, T);
                setViewTreeOwners(mj);
                kg9 kg9 = this.f1237v;
                if (kg9 != null) {
                    kg9.x(mj);
                }
                this.f1237v = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        getViewTreeOwners().f294R.O().R(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1188R);
        getViewTreeObserver().addOnScrollChangedListener(this.f1190R);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f1224R);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return this.f1199R.f3179R;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1206R = gQc.v(getContext());
        int i = configuration.fontWeightAdjustment;
        if (i != this.e) {
            this.e = i;
            setFontFamilyResolver(gQc.o(getContext()));
        }
        this.f1213R.x(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x00dc  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        nu_ nu_;
        m4i O;
        super.onDetachedFromWindow();
        pcP snapshotObserver = getSnapshotObserver();
        fbt fbt = snapshotObserver.R.f4861R;
        if (fbt != null) {
            fbt.R();
        }
        snapshotObserver.R.R();
        Mj viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (nu_ = viewTreeOwners.f294R) == null || (O = nu_.O()) == null)) {
            O.v(this);
        }
        Zv zv = this.f1191R;
        if (zv != null) {
            yU.R.v(zv);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f1188R);
        getViewTreeObserver().removeOnScrollChangedListener(this.f1190R);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f1224R);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        o3Z o3z = this.f1218R;
        if (z) {
            pi1 pi1 = o3z.f6661R;
            if (pi1.f7192R == mgi.Inactive) {
                pi1.U(mgi.Active);
                return;
            }
            return;
        }
        msU.Y(o3z.f6661R, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1209R.O(this.f1223R);
        this.f1220R = null;
        K();
        if (this.f1186R != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                L(getRoot());
            }
            kSh c = c(i);
            int intValue = ((Number) c.R).intValue();
            int intValue2 = ((Number) c.v).intValue();
            kSh c2 = c(i2);
            long R2 = dtx.R(intValue, intValue2, ((Number) c2.R).intValue(), ((Number) c2.v).intValue());
            oys oys = this.f1220R;
            if (oys == null) {
                this.f1220R = new oys(R2);
                this.f1231X = false;
            } else if (!oys.v(oys.f7046R, R2)) {
                this.f1231X = true;
            }
            this.f1209R.j(R2);
            this.f1209R.Z();
            setMeasuredDimension(((l0f) getRoot().f3606R.f7296R).e, getRoot().f3606R.f7296R.X);
            if (this.f1186R != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(((l0f) getRoot().f3606R.f7296R).e, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f3606R.f7296R.X, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Zv zv;
        if (!(viewStructure == null || (zv = this.f1191R) == null)) {
            int R2 = zF.R.R(viewStructure, zv.R.R.size());
            for (Map.Entry entry : zv.R.R.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                jQ.Y(entry.getValue());
                zF zFVar = zF.R;
                ViewStructure v = zFVar.v(viewStructure, R2);
                if (v == null) {
                    R2++;
                } else {
                    bC bCVar = bC.R;
                    bCVar.L(v, bCVar.R(viewStructure), intValue);
                    zFVar.e(v, intValue, zv.f671R.getContext().getPackageName(), null, null);
                    bCVar.Z(v, 1);
                    throw null;
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(nu_ nu_) {
        setShowLayoutBounds(dq.C());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f1227R) {
            mdz mdz = mdz.Ltr;
            if (i != 0 && i == 1) {
                mdz = mdz.Rtl;
            }
            setLayoutDirection(mdz);
            this.f1218R.R = mdz;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean C;
        this.f1214R.R.R(Boolean.valueOf(z));
        this.m = true;
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (C = dq.C())) {
            setShowLayoutBounds(C);
            O(getRoot());
        }
    }

    public final void setConfigurationChangeObserver(kg9 kg9) {
        this.f1213R = kg9;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.c = j;
    }

    public final void setOnViewTreeOwnersAvailable(kg9 kg9) {
        Mj viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            kg9.x(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f1237v = kg9;
        }
    }

    @Override // defpackage.gzG
    public void setShowLayoutBounds(boolean z) {
        this.f1235e = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(fue fue) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (this.f1231X && fue != null) {
                while (fue != null && fue.x == 1) {
                    fue = fue.N();
                }
                if (fue == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    public final boolean x(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f1192R) == null) {
            return true;
        }
        if (!(motionEvent.getRawX() == motionEvent2.getRawX())) {
            return true;
        }
        return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
    }

    public final void y(lYW lyw) {
        if (this.f1200R != null) {
            kX7 kx7 = pzb.f7335R;
        }
        h5 h5Var = this.f1203R;
        h5Var.Z();
        ((biT) h5Var.R).v(new WeakReference(lyw, (ReferenceQueue) h5Var.v));
    }

    @Override // defpackage.gzG
    public AT getAccessibilityManager() {
        return this.f1185R;
    }

    @Override // defpackage.gzG
    public ci getClipboardManager() {
        return this.f1197R;
    }
}
