package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.c;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.d;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hAW  reason: default package */
/* loaded from: classes.dex */
public final class hAW {
    public ArrayList O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f4108O;

    /* renamed from: R  reason: collision with other field name */
    public Ks f4109R;

    /* renamed from: R  reason: collision with other field name */
    public c f4112R;

    /* renamed from: R  reason: collision with other field name */
    public eAj f4113R;

    /* renamed from: R  reason: collision with other field name */
    public naw f4124R;

    /* renamed from: R  reason: collision with other field name */
    public pdD f4126R;

    /* renamed from: R  reason: collision with other field name */
    public pm2 f4128R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4129R;
    public ArrayList X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f4130X;
    public Ks c;

    /* renamed from: c  reason: collision with other field name */
    public ArrayList f4131c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f4133c;
    public ArrayList e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f4135e;
    public Ks v;

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f4136v;

    /* renamed from: v  reason: collision with other field name */
    public pm2 f4139v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f4140v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f4118R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final piu f4127R = new piu(5);

    /* renamed from: R  reason: collision with other field name */
    public final p5g f4125R = new p5g(this);

    /* renamed from: R  reason: collision with other field name */
    public final hSO f4115R = new hSO(this);

    /* renamed from: R  reason: collision with other field name */
    public final AtomicInteger f4121R = new AtomicInteger();

    /* renamed from: R  reason: collision with other field name */
    public final Map f4119R = Collections.synchronizedMap(new HashMap());

    /* renamed from: v  reason: collision with other field name */
    public final Map f4137v = Collections.synchronizedMap(new HashMap());

    /* renamed from: R  reason: collision with other field name */
    public final alu f4111R = new alu(this);

    /* renamed from: R  reason: collision with other field name */
    public final CopyOnWriteArrayList f4120R = new CopyOnWriteArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final kWs f4122R = new kWs(this, 0);

    /* renamed from: v  reason: collision with other field name */
    public final kWs f4138v = new kWs(this, 1);

    /* renamed from: c  reason: collision with other field name */
    public final kWs f4132c = new kWs(this, 2);

    /* renamed from: e  reason: collision with other field name */
    public final kWs f4134e = new kWs(this, 3);

    /* renamed from: R  reason: collision with other field name */
    public final eI8 f4114R = new eI8(this);
    public int R = -1;

    /* renamed from: R  reason: collision with other field name */
    public aLv f4110R = new aLv(this);

    /* renamed from: R  reason: collision with other field name */
    public ieQ f4116R = new ieQ(this, 1);

    /* renamed from: R  reason: collision with other field name */
    public ArrayDeque f4117R = new ArrayDeque();

    /* renamed from: R  reason: collision with other field name */
    public kvW f4123R = new kvW(2, this);

    public hAW() {
        Collections.synchronizedMap(new HashMap());
    }

    public static boolean W(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static void X4(pm2 pm2) {
        if (W(2)) {
            Log.v("FragmentManager", "show: " + pm2);
        }
        if (pm2.f7247Z) {
            pm2.f7247Z = false;
            pm2.P = !pm2.P;
        }
    }

    public static boolean k(pm2 pm2) {
        if (pm2 != null) {
            hAW haw = pm2.f7234R;
            if (!pm2.equals(haw.f4139v) || !k(haw.f4128R)) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(pm2 pm2) {
        return pm2 == null || (pm2.H && (pm2.f7234R == null || r(pm2.f7254v)));
    }

    public static boolean s(pm2 pm2) {
        Iterator it = pm2.f7252v.f4127R.P().iterator();
        boolean z = false;
        while (it.hasNext()) {
            pm2 pm22 = (pm2) it.next();
            if (pm22 != null) {
                z = s(pm22);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final aLv A() {
        pm2 pm2 = this.f4128R;
        return pm2 != null ? pm2.f7234R.A() : this.f4110R;
    }

    public final void B() {
        if (this.f4113R != null) {
            this.f4133c = false;
            this.f4135e = false;
            this.f4124R.f6474e = false;
            for (pm2 pm2 : this.f4127R.j()) {
                if (pm2 != null) {
                    pm2.f7252v.B();
                }
            }
        }
    }

    public final void C(boolean z, boolean z2) {
        if (!z2 || !(this.f4113R instanceof a2M)) {
            for (pm2 pm2 : this.f4127R.j()) {
                if (pm2 != null && z2) {
                    pm2.f7252v.C(z, true);
                }
            }
            return;
        }
        vl(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public final Bundle D() {
        int i;
        H7[] h7Arr;
        ArrayList arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = X().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            owe owe = (owe) it.next();
            if (owe.f7037v) {
                if (W(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                owe.f7037v = false;
                owe.c();
            }
        }
        Iterator it2 = X().iterator();
        while (it2.hasNext()) {
            ((owe) it2.next()).X();
        }
        J(true);
        this.f4133c = true;
        this.f4124R.f6474e = true;
        piu piu = this.f4127R;
        piu.getClass();
        ArrayList arrayList2 = new ArrayList(((HashMap) piu.f7203v).size());
        for (d dVar : ((HashMap) piu.f7203v).values()) {
            if (dVar != null) {
                pm2 pm2 = dVar.f1318R;
                dVar.P();
                arrayList2.add(pm2.f7238R);
                if (W(2)) {
                    Log.v("FragmentManager", "Saved state of " + pm2 + ": " + pm2.f7226R);
                }
            }
        }
        piu piu2 = this.f4127R;
        piu2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) piu2.c).values());
        if (!arrayList3.isEmpty()) {
            piu piu3 = this.f4127R;
            synchronized (((ArrayList) piu3.f7202R)) {
                h7Arr = null;
                if (((ArrayList) piu3.f7202R).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) piu3.f7202R).size());
                    Iterator it3 = ((ArrayList) piu3.f7202R).iterator();
                    while (it3.hasNext()) {
                        pm2 pm22 = (pm2) it3.next();
                        arrayList.add(pm22.f7238R);
                        if (W(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + pm22.f7238R + "): " + pm22);
                        }
                    }
                }
            }
            ArrayList arrayList4 = this.f4136v;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                h7Arr = new H7[size];
                for (i = 0; i < size; i++) {
                    h7Arr[i] = new H7((KP) this.f4136v.get(i));
                    if (W(2)) {
                        StringBuilder C = opT.C("saveAllState: adding back stack #", i, ": ");
                        C.append(this.f4136v.get(i));
                        Log.v("FragmentManager", C.toString());
                    }
                }
            }
            ehk ehk = new ehk();
            ehk.f3180R = arrayList2;
            ehk.v = arrayList;
            ehk.f3181R = h7Arr;
            ehk.e = this.f4121R.get();
            pm2 pm23 = this.f4139v;
            if (pm23 != null) {
                ehk.R = pm23.f7238R;
            }
            ehk.c.addAll(this.f4119R.keySet());
            ehk.f3182e.addAll(this.f4119R.values());
            ehk.X = new ArrayList(this.f4117R);
            bundle.putParcelable("state", ehk);
            for (String str : this.f4137v.keySet()) {
                bundle.putBundle(opT.H("result_", str), (Bundle) this.f4137v.get(str));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                bzM bzm = (bzM) it4.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", bzm);
                StringBuilder U = opT.U("fragment_");
                U.append(bzm.f1901v);
                bundle.putBundle(U.toString(), bundle2);
            }
        } else if (W(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    public final boolean E(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int u = u(i, str, (i2 & 1) != 0);
        if (u < 0) {
            return false;
        }
        for (int size = this.f4136v.size() - 1; size >= u; size--) {
            arrayList.add((KP) this.f4136v.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void F(Parcelable parcelable) {
        int i;
        d dVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f4113R.f3004R.getClassLoader());
                this.f4137v.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f4113R.f3004R.getClassLoader());
                arrayList.add((bzM) bundle.getParcelable("state"));
            }
        }
        piu piu = this.f4127R;
        ((HashMap) piu.c).clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bzM bzm = (bzM) it.next();
            ((HashMap) piu.c).put(bzm.f1901v, bzm);
        }
        ehk ehk = (ehk) bundle3.getParcelable("state");
        if (ehk != null) {
            ((HashMap) this.f4127R.f7203v).clear();
            Iterator it2 = ehk.f3180R.iterator();
            while (it2.hasNext()) {
                bzM Y = this.f4127R.Y((String) it2.next(), null);
                if (Y != null) {
                    pm2 pm2 = (pm2) this.f4124R.v.get(Y.f1901v);
                    if (pm2 != null) {
                        if (W(2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + pm2);
                        }
                        dVar = new d(this.f4111R, this.f4127R, pm2, Y);
                    } else {
                        dVar = new d(this.f4111R, this.f4127R, this.f4113R.f3004R.getClassLoader(), A(), Y);
                    }
                    pm2 pm22 = dVar.f1318R;
                    pm22.f7234R = this;
                    if (W(2)) {
                        StringBuilder U = opT.U("restoreSaveState: active (");
                        U.append(pm22.f7238R);
                        U.append("): ");
                        U.append(pm22);
                        Log.v("FragmentManager", U.toString());
                    }
                    dVar.C(this.f4113R.f3004R.getClassLoader());
                    this.f4127R.t(dVar);
                    dVar.R = this.R;
                }
            }
            naw naw = this.f4124R;
            naw.getClass();
            Iterator it3 = new ArrayList(naw.v.values()).iterator();
            while (true) {
                i = 0;
                if (!it3.hasNext()) {
                    break;
                }
                pm2 pm23 = (pm2) it3.next();
                if (((HashMap) this.f4127R.f7203v).get(pm23.f7238R) != null) {
                    i = 1;
                }
                if (i == 0) {
                    if (W(2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + pm23 + " that was not found in the set of active Fragments " + ehk.f3180R);
                    }
                    this.f4124R.O(pm23);
                    pm23.f7234R = this;
                    d dVar2 = new d(this.f4111R, this.f4127R, pm23);
                    dVar2.R = 1;
                    dVar2.H();
                    pm23.f7255v = true;
                    dVar2.H();
                }
            }
            piu piu2 = this.f4127R;
            ArrayList<String> arrayList2 = ehk.v;
            ((ArrayList) piu2.f7202R).clear();
            if (arrayList2 != null) {
                for (String str3 : arrayList2) {
                    pm2 H = piu2.H(str3);
                    if (H != null) {
                        if (W(2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + H);
                        }
                        piu2.X(H);
                    } else {
                        throw new IllegalStateException(jQ.C("No instantiated fragment for (", str3, ")"));
                    }
                }
            }
            if (ehk.f3181R != null) {
                this.f4136v = new ArrayList(ehk.f3181R.length);
                int i2 = 0;
                while (true) {
                    H7[] h7Arr = ehk.f3181R;
                    if (i2 >= h7Arr.length) {
                        break;
                    }
                    H7 h7 = h7Arr[i2];
                    h7.getClass();
                    KP kp = new KP(this);
                    h7.R(kp);
                    kp.Z = h7.X;
                    for (int i3 = 0; i3 < h7.f167R.size(); i3++) {
                        String str4 = (String) h7.f167R.get(i3);
                        if (str4 != null) {
                            ((dJb) kp.f251R.get(i3)).f2560R = I(str4);
                        }
                    }
                    kp.c(1);
                    if (W(2)) {
                        StringBuilder C = opT.C("restoreAllState: back stack #", i2, " (index ");
                        C.append(kp.Z);
                        C.append("): ");
                        C.append(kp);
                        Log.v("FragmentManager", C.toString());
                        PrintWriter printWriter = new PrintWriter(new ect());
                        kp.O("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f4136v.add(kp);
                    i2++;
                }
            } else {
                this.f4136v = null;
            }
            this.f4121R.set(ehk.e);
            String str5 = ehk.R;
            if (str5 != null) {
                pm2 I = I(str5);
                this.f4139v = I;
                g(I);
            }
            ArrayList arrayList3 = ehk.c;
            if (arrayList3 != null) {
                while (i < arrayList3.size()) {
                    this.f4119R.put((String) arrayList3.get(i), (Ho) ehk.f3182e.get(i));
                    i++;
                }
            }
            this.f4117R = new ArrayDeque(ehk.X);
        }
    }

    public final void G(int i, boolean z) {
        eAj eaj;
        if (this.f4113R == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.R) {
            this.R = i;
            piu piu = this.f4127R;
            Iterator it = ((ArrayList) piu.f7202R).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((HashMap) piu.f7203v).get(((pm2) it.next()).f7238R);
                if (dVar != null) {
                    dVar.H();
                }
            }
            Iterator it2 = ((HashMap) piu.f7203v).values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                d dVar2 = (d) it2.next();
                if (dVar2 != null) {
                    dVar2.H();
                    pm2 pm2 = dVar2.f1318R;
                    if (pm2.f7255v && !pm2.y()) {
                        z2 = true;
                    }
                    if (z2) {
                        if (pm2.f7249c && !((HashMap) piu.c).containsKey(pm2.f7238R)) {
                            dVar2.P();
                        }
                        piu.i(dVar2);
                    }
                }
            }
            zw();
            if (this.f4140v && (eaj = this.f4113R) != null && this.R == 7) {
                eaj.f3007R.invalidateOptionsMenu();
                this.f4140v = false;
            }
        }
    }

    public final void H() {
        boolean z = true;
        this.f4130X = true;
        J(true);
        Iterator it = X().iterator();
        while (it.hasNext()) {
            ((owe) it.next()).X();
        }
        eAj eaj = this.f4113R;
        if (eaj instanceof ly1) {
            z = ((naw) this.f4127R.e).f6473c;
        } else {
            Context context = eaj.f3004R;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            for (Ho ho : this.f4119R.values()) {
                for (String str : ho.R) {
                    naw naw = (naw) this.f4127R.e;
                    naw.getClass();
                    if (W(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    naw.X(str);
                }
            }
        }
        i(-1);
        eAj eaj2 = this.f4113R;
        if (eaj2 instanceof mMq) {
            eaj2.b(this.f4138v);
        }
        eAj eaj3 = this.f4113R;
        if (eaj3 instanceof jOq) {
            eaj3.a(this.f4122R);
        }
        eAj eaj4 = this.f4113R;
        if (eaj4 instanceof a2M) {
            eaj4.F(this.f4132c);
        }
        eAj eaj5 = this.f4113R;
        if (eaj5 instanceof gpY) {
            eaj5.D(this.f4134e);
        }
        eAj eaj6 = this.f4113R;
        if (eaj6 instanceof eI3) {
            eaj6.f(this.f4114R);
        }
        this.f4113R = null;
        this.f4126R = null;
        this.f4128R = null;
        if (this.f4112R != null) {
            Iterator it2 = ((jnM) this.f4115R).f5016R.iterator();
            while (it2.hasNext()) {
                ((hS) it2.next()).cancel();
            }
            this.f4112R = null;
        }
        Ks ks = this.f4109R;
        if (ks != null) {
            ks.v();
            this.v.v();
            this.c.v();
        }
    }

    public final pm2 I(String str) {
        return this.f4127R.H(str);
    }

    /* JADX INFO: finally extract failed */
    public final boolean J(boolean z) {
        boolean z2;
        K(z);
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.e;
            ArrayList arrayList2 = this.X;
            synchronized (this.f4118R) {
                if (this.f4118R.isEmpty()) {
                    z2 = false;
                } else {
                    int size = this.f4118R.size();
                    z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((mzq) this.f4118R.get(i)).R(arrayList, arrayList2);
                    }
                    this.f4118R.clear();
                    this.f4113R.f3005R.removeCallbacks(this.f4123R);
                }
            }
            if (!z2) {
                break;
            }
            this.f4129R = true;
            try {
                a(this.e, this.X);
                e();
                z3 = true;
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        cr();
        if (this.f4108O) {
            this.f4108O = false;
            zw();
        }
        this.f4127R.L();
        return z3;
    }

    public final void K(boolean z) {
        if (this.f4129R) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f4113R == null) {
            if (this.f4130X) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f4113R.f3005R.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z && p()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.e == null) {
            this.e = new ArrayList();
            this.X = new ArrayList();
        }
    }

    public final void L(pm2 pm2) {
        if (W(2)) {
            Log.v("FragmentManager", "detach: " + pm2);
        }
        if (!pm2.m) {
            pm2.m = true;
            if (pm2.f7245R) {
                if (W(2)) {
                    Log.v("FragmentManager", "remove from detach: " + pm2);
                }
                piu piu = this.f4127R;
                synchronized (((ArrayList) piu.f7202R)) {
                    ((ArrayList) piu.f7202R).remove(pm2);
                }
                pm2.f7245R = false;
                if (s(pm2)) {
                    this.f4140v = true;
                }
                mL(pm2);
            }
        }
    }

    public final boolean M() {
        return l(-1, 0);
    }

    public final void N() {
        Iterator it = this.f4127R.P().iterator();
        while (it.hasNext()) {
            pm2 pm2 = (pm2) it.next();
            if (pm2 != null) {
                pm2.g();
                pm2.f7252v.N();
            }
        }
    }

    public final d O(pm2 pm2) {
        piu piu = this.f4127R;
        d dVar = (d) ((HashMap) piu.f7203v).get(pm2.f7238R);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this.f4111R, this.f4127R, pm2);
        dVar2.C(this.f4113R.f3004R.getClassLoader());
        dVar2.R = this.R;
        return dVar2;
    }

    public final boolean P() {
        if (this.R >= 1) {
            for (pm2 pm2 : this.f4127R.j()) {
                if (pm2 != null) {
                    if (!pm2.f7247Z ? pm2.f7252v.P() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final ViewGroup Q(pm2 pm2) {
        ViewGroup viewGroup = pm2.f7229R;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (pm2.Z > 0 && this.f4126R.n()) {
            View z = this.f4126R.z(pm2.Z);
            if (z instanceof ViewGroup) {
                return (ViewGroup) z;
            }
        }
        return null;
    }

    public final d R(pm2 pm2) {
        String str = pm2.f7250e;
        if (str != null) {
            kSM ksm = gju.R;
            gju.v(new khS(pm2, str));
            gju.R(pm2).getClass();
            ovv ovv = ovv.DETECT_FRAGMENT_REUSE;
            if (ovv instanceof Void) {
                Void r0 = (Void) ovv;
            }
        }
        if (W(2)) {
            Log.v("FragmentManager", "add: " + pm2);
        }
        d O = O(pm2);
        pm2.f7234R = this;
        this.f4127R.t(O);
        if (!pm2.m) {
            this.f4127R.X(pm2);
            pm2.f7255v = false;
            if (pm2.f7228R == null) {
                pm2.P = false;
            }
            if (s(pm2)) {
                this.f4140v = true;
            }
        }
        return O;
    }

    public final ieQ S() {
        pm2 pm2 = this.f4128R;
        return pm2 != null ? pm2.f7234R.S() : this.f4116R;
    }

    public final boolean T() {
        pm2 pm2 = this.f4128R;
        if (pm2 == null) {
            return true;
        }
        return pm2.j() && this.f4128R.C().T();
    }

    public final void U(boolean z) {
        if (!z || !(this.f4113R instanceof mMq)) {
            for (pm2 pm2 : this.f4127R.j()) {
                if (pm2 != null) {
                    pm2.onLowMemory();
                    if (z) {
                        pm2.f7252v.U(true);
                    }
                }
            }
            return;
        }
        vl(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    public final void V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String H = opT.H(str, "    ");
        piu piu = this.f4127R;
        piu.getClass();
        String str3 = str + "    ";
        if (!((HashMap) piu.f7203v).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (d dVar : ((HashMap) piu.f7203v).values()) {
                printWriter.print(str);
                if (dVar != null) {
                    pm2 pm2 = dVar.f1318R;
                    printWriter.println(pm2);
                    pm2.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(pm2.L));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(pm2.Z));
                    printWriter.print(" mTag=");
                    printWriter.println(pm2.f7248c);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(pm2.e);
                    printWriter.print(" mWho=");
                    printWriter.print(pm2.f7238R);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(pm2.O);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(pm2.f7245R);
                    printWriter.print(" mRemoving=");
                    printWriter.print(pm2.f7255v);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(pm2.f7251e);
                    printWriter.print(" mInLayout=");
                    printWriter.println(pm2.f7246X);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(pm2.f7247Z);
                    printWriter.print(" mDetached=");
                    printWriter.print(pm2.m);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(pm2.H);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(pm2.x);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(pm2.N);
                    if (pm2.f7234R != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(pm2.f7234R);
                    }
                    if (pm2.f7232R != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(pm2.f7232R);
                    }
                    if (pm2.f7254v != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(pm2.f7254v);
                    }
                    if (pm2.c != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(pm2.c);
                    }
                    if (pm2.f7226R != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(pm2.f7226R);
                    }
                    if (pm2.f7227R != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(pm2.f7227R);
                    }
                    if (pm2.v != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(pm2.v);
                    }
                    Object obj = pm2.f7244R;
                    if (obj == null) {
                        hAW haw = pm2.f7234R;
                        obj = (haw == null || (str2 = pm2.f7253v) == null) ? null : haw.I(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(pm2.X);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    mfw mfw = pm2.f7243R;
                    printWriter.println(mfw == null ? false : mfw.f6119R);
                    mfw mfw2 = pm2.f7243R;
                    if ((mfw2 == null ? 0 : mfw2.f6115R) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        mfw mfw3 = pm2.f7243R;
                        printWriter.println(mfw3 == null ? 0 : mfw3.f6115R);
                    }
                    mfw mfw4 = pm2.f7243R;
                    if ((mfw4 == null ? 0 : mfw4.v) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        mfw mfw5 = pm2.f7243R;
                        printWriter.println(mfw5 == null ? 0 : mfw5.v);
                    }
                    mfw mfw6 = pm2.f7243R;
                    if ((mfw6 == null ? 0 : mfw6.c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        mfw mfw7 = pm2.f7243R;
                        printWriter.println(mfw7 == null ? 0 : mfw7.c);
                    }
                    mfw mfw8 = pm2.f7243R;
                    if ((mfw8 == null ? 0 : mfw8.e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        mfw mfw9 = pm2.f7243R;
                        printWriter.println(mfw9 == null ? 0 : mfw9.e);
                    }
                    if (pm2.f7229R != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(pm2.f7229R);
                    }
                    if (pm2.f7228R != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(pm2.f7228R);
                    }
                    if (pm2.H() != null) {
                        new ebj(pm2, pm2.e()).S(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + pm2.f7252v + ":");
                    pm2.f7252v.V(opT.H(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) piu.f7202R).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((pm2) ((ArrayList) piu.f7202R).get(i)).toString());
            }
        }
        ArrayList arrayList = this.f4131c;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((pm2) this.f4131c.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.f4136v;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                KP kp = (KP) this.f4136v.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(kp.toString());
                kp.O(H, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4121R.get());
        synchronized (this.f4118R) {
            int size4 = this.f4118R.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((mzq) this.f4118R.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4113R);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4126R);
        if (this.f4128R != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4128R);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.R);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f4133c);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4135e);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f4130X);
        if (this.f4140v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f4140v);
        }
    }

    public final HashSet X() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f4127R.N().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((d) it.next()).f1318R.f7229R;
            if (viewGroup != null) {
                hashSet.add(owe.O(viewGroup, S()));
            }
        }
        return hashSet;
    }

    public final void Y(mzq mzq, boolean z) {
        if (!z || (this.f4113R != null && !this.f4130X)) {
            K(z);
            if (mzq.R(this.e, this.X)) {
                this.f4129R = true;
                try {
                    a(this.e, this.X);
                } finally {
                    e();
                }
            }
            cr();
            if (this.f4108O) {
                this.f4108O = false;
                zw();
            }
            this.f4127R.L();
        }
    }

    public final void Z(boolean z, Configuration configuration) {
        if (!z || !(this.f4113R instanceof jOq)) {
            for (pm2 pm2 : this.f4127R.j()) {
                if (pm2 != null) {
                    pm2.onConfigurationChanged(configuration);
                    if (z) {
                        pm2.f7252v.Z(true, configuration);
                    }
                }
            }
            return;
        }
        vl(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    public final void _(pm2 pm2) {
        if (pm2 == null || (pm2.equals(I(pm2.f7238R)) && (pm2.f7232R == null || pm2.f7234R == this))) {
            pm2 pm22 = this.f4139v;
            this.f4139v = pm2;
            g(pm22);
            g(this.f4139v);
            return;
        }
        throw new IllegalArgumentException("Fragment " + pm2 + " is not an active fragment of FragmentManager " + this);
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((KP) arrayList.get(i)).f255c) {
                        if (i2 != i) {
                            h(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((KP) arrayList.get(i2)).f255c) {
                                i2++;
                            }
                        }
                        h(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    h(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void b() {
        synchronized (this.f4118R) {
            boolean z = true;
            if (this.f4118R.size() != 1) {
                z = false;
            }
            if (z) {
                this.f4113R.f3005R.removeCallbacks(this.f4123R);
                this.f4113R.f3005R.post(this.f4123R);
                cr();
            }
        }
    }

    public final void c(pm2 pm2) {
        if (W(2)) {
            Log.v("FragmentManager", "attach: " + pm2);
        }
        if (pm2.m) {
            pm2.m = false;
            if (!pm2.f7245R) {
                this.f4127R.X(pm2);
                if (W(2)) {
                    Log.v("FragmentManager", "add from attach: " + pm2);
                }
                if (s(pm2)) {
                    this.f4140v = true;
                }
            }
        }
    }

    public final void cr() {
        synchronized (this.f4118R) {
            try {
                boolean z = true;
                if (!this.f4118R.isEmpty()) {
                    hSO hso = this.f4115R;
                    ((jnM) hso).f5017R = true;
                    geB geb = ((jnM) hso).R;
                    if (geb != null) {
                        geb.accept(Boolean.TRUE);
                    }
                    return;
                }
                hSO hso2 = this.f4115R;
                ArrayList arrayList = this.f4136v;
                if ((arrayList != null ? arrayList.size() : 0) <= 0 || !k(this.f4128R)) {
                    z = false;
                }
                ((jnM) hso2).f5017R = z;
                geB geb2 = ((jnM) hso2).R;
                if (geb2 != null) {
                    geb2.accept(Boolean.valueOf(z));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(pm2 pm2) {
        if (W(2)) {
            Log.v("FragmentManager", "hide: " + pm2);
        }
        if (!pm2.f7247Z) {
            pm2.f7247Z = true;
            pm2.P = true ^ pm2.P;
            mL(pm2);
        }
    }

    public final void e() {
        this.f4129R = false;
        this.X.clear();
        this.e.clear();
    }

    public final void f(pm2 pm2) {
        if (W(2)) {
            Log.v("FragmentManager", "remove: " + pm2 + " nesting=" + pm2.O);
        }
        boolean z = !pm2.y();
        if (!pm2.m || z) {
            piu piu = this.f4127R;
            synchronized (((ArrayList) piu.f7202R)) {
                ((ArrayList) piu.f7202R).remove(pm2);
            }
            pm2.f7245R = false;
            if (s(pm2)) {
                this.f4140v = true;
            }
            pm2.f7255v = true;
            mL(pm2);
        }
    }

    public final void g(pm2 pm2) {
        if (pm2 != null && pm2.equals(I(pm2.f7238R))) {
            pm2.f7234R.getClass();
            boolean k = k(pm2);
            Boolean bool = pm2.f7237R;
            if (bool == null || bool.booleanValue() != k) {
                pm2.f7237R = Boolean.valueOf(k);
                pm2.n(k);
                hAW haw = pm2.f7252v;
                haw.cr();
                haw.g(haw.f4139v);
            }
        }
    }

    public final void h(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3;
        int i3;
        ViewGroup viewGroup;
        int i4;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        int i5 = i2;
        boolean z = ((KP) arrayList4.get(i)).f255c;
        ArrayList arrayList6 = this.O;
        if (arrayList6 == null) {
            this.O = new ArrayList();
        } else {
            arrayList6.clear();
        }
        this.O.addAll(this.f4127R.j());
        pm2 pm2 = this.f4139v;
        boolean z2 = false;
        int i6 = i;
        while (true) {
            int i7 = 1;
            if (i6 < i5) {
                KP kp = (KP) arrayList4.get(i6);
                int i8 = 3;
                if (!((Boolean) arrayList5.get(i6)).booleanValue()) {
                    ArrayList arrayList7 = this.O;
                    int i9 = 0;
                    while (i9 < kp.f251R.size()) {
                        dJb djb = (dJb) kp.f251R.get(i9);
                        int i10 = djb.R;
                        if (i10 != i7) {
                            if (i10 == 2) {
                                pm2 pm22 = djb.f2560R;
                                int i11 = pm22.Z;
                                boolean z3 = false;
                                for (int size = arrayList7.size() - 1; size >= 0; size--) {
                                    pm2 pm23 = (pm2) arrayList7.get(size);
                                    if (pm23.Z == i11) {
                                        if (pm23 == pm22) {
                                            z3 = true;
                                        } else {
                                            if (pm23 == pm2) {
                                                i11 = i11;
                                                i4 = 0;
                                                kp.f251R.add(i9, new dJb(9, pm23, 0));
                                                i9++;
                                                pm2 = null;
                                            } else {
                                                i11 = i11;
                                                i4 = 0;
                                            }
                                            dJb djb2 = new dJb(3, pm23, i4);
                                            djb2.v = djb.v;
                                            djb2.e = djb.e;
                                            djb2.c = djb.c;
                                            djb2.X = djb.X;
                                            kp.f251R.add(i9, djb2);
                                            arrayList7.remove(pm23);
                                            i9++;
                                        }
                                    }
                                    i11 = i11;
                                }
                                if (z3) {
                                    kp.f251R.remove(i9);
                                    i9--;
                                } else {
                                    i7 = 1;
                                    djb.R = 1;
                                    djb.f2561R = true;
                                    arrayList7.add(pm22);
                                    i9 += i7;
                                    i8 = 3;
                                }
                            } else if (i10 == i8 || i10 == 6) {
                                arrayList7.remove(djb.f2560R);
                                pm2 pm24 = djb.f2560R;
                                if (pm24 == pm2) {
                                    kp.f251R.add(i9, new dJb(9, pm24));
                                    i9++;
                                    i7 = 1;
                                    pm2 = null;
                                    i9 += i7;
                                    i8 = 3;
                                }
                            } else if (i10 == 7) {
                                i7 = 1;
                            } else if (i10 == 8) {
                                kp.f251R.add(i9, new dJb(9, pm2, 0));
                                djb.f2561R = true;
                                i9++;
                                pm2 = djb.f2560R;
                            }
                            i7 = 1;
                            i9 += i7;
                            i8 = 3;
                        }
                        arrayList7.add(djb.f2560R);
                        i9 += i7;
                        i8 = 3;
                    }
                } else {
                    ArrayList arrayList8 = this.O;
                    int size2 = kp.f251R.size() - 1;
                    while (size2 >= 0) {
                        dJb djb3 = (dJb) kp.f251R.get(size2);
                        int i12 = djb3.R;
                        if (i12 != i7) {
                            if (i12 != 3) {
                                switch (i12) {
                                    case VmNativeCallback.$stable:
                                        pm2 = null;
                                        break;
                                    case 9:
                                        pm2 = djb3.f2560R;
                                        break;
                                    case 10:
                                        djb3.f2562v = djb3.f2559R;
                                        break;
                                }
                                size2--;
                                i7 = 1;
                            }
                            arrayList8.add(djb3.f2560R);
                            size2--;
                            i7 = 1;
                        }
                        arrayList8.remove(djb3.f2560R);
                        size2--;
                        i7 = 1;
                    }
                }
                z2 = z2 || kp.f252R;
                i6++;
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                i5 = i2;
            } else {
                this.O.clear();
                if (z || this.R < 1) {
                    arrayList3 = arrayList;
                    i3 = i2;
                } else {
                    int i13 = i;
                    i3 = i2;
                    while (true) {
                        arrayList3 = arrayList;
                        if (i13 < i3) {
                            Iterator it = ((KP) arrayList3.get(i13)).f251R.iterator();
                            while (it.hasNext()) {
                                pm2 pm25 = ((dJb) it.next()).f2560R;
                                if (!(pm25 == null || pm25.f7234R == null)) {
                                    this.f4127R.t(O(pm25));
                                }
                            }
                            i13++;
                        }
                    }
                }
                for (int i14 = i; i14 < i3; i14++) {
                    KP kp2 = (KP) arrayList3.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        kp2.c(-1);
                        for (int size3 = kp2.f251R.size() - 1; size3 >= 0; size3--) {
                            dJb djb4 = (dJb) kp2.f251R.get(size3);
                            pm2 pm26 = djb4.f2560R;
                            if (pm26 != null) {
                                pm26.f7249c = kp2.f253X;
                                if (pm26.f7243R != null) {
                                    pm26.X().f6119R = true;
                                }
                                int i15 = kp2.X;
                                int i16 = 4100;
                                if (i15 == 4097) {
                                    i16 = 8194;
                                } else if (i15 == 8194) {
                                    i16 = 4097;
                                } else if (i15 != 8197) {
                                    i16 = i15 != 4099 ? i15 != 4100 ? 0 : 8197 : 4099;
                                }
                                if (!(pm26.f7243R == null && i16 == 0)) {
                                    pm26.X();
                                    pm26.f7243R.X = i16;
                                }
                                ArrayList arrayList9 = kp2.f254c;
                                ArrayList arrayList10 = kp2.f258v;
                                pm26.X();
                                mfw mfw = pm26.f7243R;
                                mfw.f6118R = arrayList9;
                                mfw.f6124v = arrayList10;
                            }
                            switch (djb4.R) {
                                case 1:
                                    pm26.G(djb4.v, djb4.c, djb4.e, djb4.X);
                                    kp2.f248R.w(pm26, true);
                                    kp2.f248R.f(pm26);
                                    break;
                                case 2:
                                default:
                                    StringBuilder U = opT.U("Unknown cmd: ");
                                    U.append(djb4.R);
                                    throw new IllegalArgumentException(U.toString());
                                case 3:
                                    pm26.G(djb4.v, djb4.c, djb4.e, djb4.X);
                                    kp2.f248R.R(pm26);
                                    break;
                                case 4:
                                    pm26.G(djb4.v, djb4.c, djb4.e, djb4.X);
                                    kp2.f248R.getClass();
                                    X4(pm26);
                                    break;
                                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                                    pm26.G(djb4.v, djb4.c, djb4.e, djb4.X);
                                    kp2.f248R.w(pm26, true);
                                    kp2.f248R.d(pm26);
                                    break;
                                case 6:
                                    pm26.G(djb4.v, djb4.c, djb4.e, djb4.X);
                                    kp2.f248R.c(pm26);
                                    break;
                                case 7:
                                    pm26.G(djb4.v, djb4.c, djb4.e, djb4.X);
                                    kp2.f248R.w(pm26, true);
                                    kp2.f248R.L(pm26);
                                    break;
                                case VmNativeCallback.$stable:
                                    kp2.f248R._(null);
                                    break;
                                case 9:
                                    kp2.f248R._(pm26);
                                    break;
                                case 10:
                                    kp2.f248R.q(pm26, djb4.f2559R);
                                    break;
                            }
                        }
                        continue;
                    } else {
                        kp2.c(1);
                        int size4 = kp2.f251R.size();
                        for (int i17 = 0; i17 < size4; i17++) {
                            dJb djb5 = (dJb) kp2.f251R.get(i17);
                            pm2 pm27 = djb5.f2560R;
                            if (pm27 != null) {
                                pm27.f7249c = kp2.f253X;
                                if (pm27.f7243R != null) {
                                    pm27.X().f6119R = false;
                                }
                                int i18 = kp2.X;
                                if (!(pm27.f7243R == null && i18 == 0)) {
                                    pm27.X();
                                    pm27.f7243R.X = i18;
                                }
                                ArrayList arrayList11 = kp2.f258v;
                                ArrayList arrayList12 = kp2.f254c;
                                pm27.X();
                                mfw mfw2 = pm27.f7243R;
                                mfw2.f6118R = arrayList11;
                                mfw2.f6124v = arrayList12;
                            }
                            switch (djb5.R) {
                                case 1:
                                    pm27.G(djb5.v, djb5.c, djb5.e, djb5.X);
                                    kp2.f248R.w(pm27, false);
                                    kp2.f248R.R(pm27);
                                    break;
                                case 2:
                                default:
                                    StringBuilder U2 = opT.U("Unknown cmd: ");
                                    U2.append(djb5.R);
                                    throw new IllegalArgumentException(U2.toString());
                                case 3:
                                    pm27.G(djb5.v, djb5.c, djb5.e, djb5.X);
                                    kp2.f248R.f(pm27);
                                    break;
                                case 4:
                                    pm27.G(djb5.v, djb5.c, djb5.e, djb5.X);
                                    kp2.f248R.d(pm27);
                                    break;
                                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                                    pm27.G(djb5.v, djb5.c, djb5.e, djb5.X);
                                    kp2.f248R.w(pm27, false);
                                    kp2.f248R.getClass();
                                    X4(pm27);
                                    break;
                                case 6:
                                    pm27.G(djb5.v, djb5.c, djb5.e, djb5.X);
                                    kp2.f248R.L(pm27);
                                    break;
                                case 7:
                                    pm27.G(djb5.v, djb5.c, djb5.e, djb5.X);
                                    kp2.f248R.w(pm27, false);
                                    kp2.f248R.c(pm27);
                                    break;
                                case VmNativeCallback.$stable:
                                    kp2.f248R._(pm27);
                                    break;
                                case 9:
                                    kp2.f248R._(null);
                                    break;
                                case 10:
                                    kp2.f248R.q(pm27, djb5.f2562v);
                                    break;
                            }
                        }
                        continue;
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i3 - 1)).booleanValue();
                for (int i19 = i; i19 < i3; i19++) {
                    KP kp3 = (KP) arrayList3.get(i19);
                    if (booleanValue) {
                        for (int size5 = kp3.f251R.size() - 1; size5 >= 0; size5--) {
                            pm2 pm28 = ((dJb) kp3.f251R.get(size5)).f2560R;
                            if (pm28 != null) {
                                O(pm28).H();
                            }
                        }
                    } else {
                        Iterator it2 = kp3.f251R.iterator();
                        while (it2.hasNext()) {
                            pm2 pm29 = ((dJb) it2.next()).f2560R;
                            if (pm29 != null) {
                                O(pm29).H();
                            }
                        }
                    }
                }
                G(this.R, true);
                HashSet hashSet = new HashSet();
                for (int i20 = i; i20 < i3; i20++) {
                    Iterator it3 = ((KP) arrayList3.get(i20)).f251R.iterator();
                    while (it3.hasNext()) {
                        pm2 pm210 = ((dJb) it3.next()).f2560R;
                        if (!(pm210 == null || (viewGroup = pm210.f7229R) == null)) {
                            hashSet.add(owe.O(viewGroup, S()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    owe owe = (owe) it4.next();
                    owe.f7036R = booleanValue;
                    owe.L();
                    owe.c();
                }
                for (int i21 = i; i21 < i3; i21++) {
                    KP kp4 = (KP) arrayList3.get(i21);
                    if (((Boolean) arrayList2.get(i21)).booleanValue() && kp4.Z >= 0) {
                        kp4.Z = -1;
                    }
                    kp4.getClass();
                }
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void i(int i) {
        try {
            this.f4129R = true;
            for (d dVar : ((HashMap) this.f4127R.f7203v).values()) {
                if (dVar != null) {
                    dVar.R = i;
                }
            }
            G(i, false);
            Iterator it = X().iterator();
            while (it.hasNext()) {
                ((owe) it.next()).X();
            }
            this.f4129R = false;
            J(true);
        } catch (Throwable th) {
            this.f4129R = false;
            throw th;
        }
    }

    public final void j() {
        if (this.R >= 1) {
            for (pm2 pm2 : this.f4127R.j()) {
                if (pm2 != null && !pm2.f7247Z) {
                    pm2.f7252v.j();
                }
            }
        }
    }

    public final boolean l(int i, int i2) {
        J(false);
        K(true);
        pm2 pm2 = this.f4139v;
        if (pm2 != null && i < 0 && pm2.m().M()) {
            return true;
        }
        boolean E = E(this.e, this.X, null, i, i2);
        if (E) {
            this.f4129R = true;
            try {
                a(this.e, this.X);
            } finally {
                e();
            }
        }
        cr();
        if (this.f4108O) {
            this.f4108O = false;
            zw();
        }
        this.f4127R.L();
        return E;
    }

    public final boolean m() {
        if (this.R >= 1) {
            for (pm2 pm2 : this.f4127R.j()) {
                if (pm2 != null) {
                    if (!pm2.f7247Z ? pm2.f7252v.m() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void mL(pm2 pm2) {
        ViewGroup Q = Q(pm2);
        if (Q != null) {
            mfw mfw = pm2.f7243R;
            boolean z = false;
            if ((mfw == null ? 0 : mfw.e) + (mfw == null ? 0 : mfw.c) + (mfw == null ? 0 : mfw.v) + (mfw == null ? 0 : mfw.f6115R) > 0) {
                if (Q.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    Q.setTag(R.id.visible_removing_fragment_view_tag, pm2);
                }
                pm2 pm22 = (pm2) Q.getTag(R.id.visible_removing_fragment_view_tag);
                mfw mfw2 = pm2.f7243R;
                if (mfw2 != null) {
                    z = mfw2.f6119R;
                }
                if (pm22.f7243R != null) {
                    pm22.X().f6119R = z;
                }
            }
        }
    }

    public final pm2 n(String str) {
        piu piu = this.f4127R;
        if (str != null) {
            int size = ((ArrayList) piu.f7202R).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                pm2 pm2 = (pm2) ((ArrayList) piu.f7202R).get(size);
                if (pm2 != null && str.equals(pm2.f7248c)) {
                    return pm2;
                }
            }
        }
        if (str != null) {
            for (d dVar : ((HashMap) piu.f7203v).values()) {
                if (dVar != null) {
                    pm2 pm22 = dVar.f1318R;
                    if (str.equals(pm22.f7248c)) {
                        return pm22;
                    }
                }
            }
        } else {
            piu.getClass();
        }
        return null;
    }

    public final void o(mzq mzq, boolean z) {
        if (!z) {
            if (this.f4113R == null) {
                if (this.f4130X) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (p()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f4118R) {
            if (this.f4113R != null) {
                this.f4118R.add(mzq);
                b();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final boolean p() {
        return this.f4133c || this.f4135e;
    }

    public final void q(pm2 pm2, iMP imp) {
        if (!pm2.equals(I(pm2.f7238R)) || !(pm2.f7232R == null || pm2.f7234R == this)) {
            throw new IllegalArgumentException("Fragment " + pm2 + " is not an active fragment of FragmentManager " + this);
        }
        pm2.f7236R = imp;
    }

    public final boolean t() {
        if (this.R < 1) {
            return false;
        }
        boolean z = false;
        for (pm2 pm2 : this.f4127R.j()) {
            if (pm2 != null && r(pm2)) {
                if (!pm2.f7247Z ? pm2.f7252v.t() | false : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final int u(int i, String str, boolean z) {
        ArrayList arrayList = this.f4136v;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str != null || i >= 0) {
            int size = this.f4136v.size() - 1;
            while (size >= 0) {
                KP kp = (KP) this.f4136v.get(size);
                if ((str != null && str.equals(kp.f250R)) || (i >= 0 && i == kp.Z)) {
                    break;
                }
                size--;
            }
            if (size >= 0) {
                if (z) {
                    while (size > 0) {
                        int i2 = size - 1;
                        KP kp2 = (KP) this.f4136v.get(i2);
                        if ((str == null || !str.equals(kp2.f250R)) && (i < 0 || i != kp2.Z)) {
                            break;
                        }
                        size = i2;
                    }
                } else if (size == this.f4136v.size() - 1) {
                    return -1;
                } else {
                    size++;
                }
            }
            return size;
        } else if (z) {
            return 0;
        } else {
            return -1 + this.f4136v.size();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: pm2 */
    /* JADX WARN: Multi-variable type inference failed */
    public final void v(eAj eaj, pdD pdd, pm2 pm2) {
        if (this.f4113R == null) {
            this.f4113R = eaj;
            this.f4126R = pdd;
            this.f4128R = pm2;
            if (pm2 != 0) {
                this.f4120R.add(new eQu(pm2));
            } else if (eaj instanceof kQZ) {
                this.f4120R.add(eaj);
            }
            if (this.f4128R != null) {
                cr();
            }
            if (eaj instanceof dZd) {
                c cVar = ((androidx.activity.d) eaj.f3007R).f1012R;
                this.f4112R = cVar;
                cVar.R(pm2 != 0 ? pm2 : eaj, this.f4115R);
            }
            if (pm2 != 0) {
                naw naw = pm2.f7234R.f4124R;
                naw naw2 = (naw) naw.c.get(pm2.f7238R);
                if (naw2 == null) {
                    naw2 = new naw(naw.f6475v);
                    naw.c.put(pm2.f7238R, naw2);
                }
                this.f4124R = naw2;
            } else if (eaj instanceof ly1) {
                this.f4124R = (naw) new CV(eaj.e(), naw.R, 0).O(naw.class);
            } else {
                this.f4124R = new naw(false);
            }
            this.f4124R.f6474e = p();
            this.f4127R.e = this.f4124R;
            eAj eaj2 = this.f4113R;
            if ((eaj2 instanceof adL) && pm2 == 0) {
                bhK c = eaj2.c();
                c.c("android:support:fragments", new fy7(2, this));
                Bundle R = c.R("android:support:fragments");
                if (R != null) {
                    F(R);
                }
            }
            eAj eaj3 = this.f4113R;
            if (eaj3 instanceof Z6) {
                c31 c31 = ((androidx.activity.d) eaj3.f3007R).f1014R;
                String H = opT.H("FragmentManager:", pm2 != 0 ? jQ.g(new StringBuilder(), pm2.f7238R, ":") : "");
                this.f4109R = c31.e(opT.H(H, "StartActivityForResult"), new BI(), new ieQ(this, 2));
                this.v = c31.e(opT.H(H, "StartIntentSenderForResult"), new Dk(1), new ieQ(this, 3));
                this.c = c31.e(opT.H(H, "RequestPermissions"), new GU(), new ieQ(this, 0));
            }
            eAj eaj4 = this.f4113R;
            if (eaj4 instanceof jOq) {
                eaj4.B(this.f4122R);
            }
            eAj eaj5 = this.f4113R;
            if (eaj5 instanceof mMq) {
                eaj5.E(this.f4138v);
            }
            eAj eaj6 = this.f4113R;
            if (eaj6 instanceof a2M) {
                eaj6.l(this.f4132c);
            }
            eAj eaj7 = this.f4113R;
            if (eaj7 instanceof gpY) {
                eaj7.M(this.f4134e);
            }
            eAj eaj8 = this.f4113R;
            if ((eaj8 instanceof eI3) && pm2 == 0) {
                eaj8.G(this.f4114R);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void vl(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new ect());
        eAj eaj = this.f4113R;
        if (eaj != null) {
            try {
                eaj.f3007R.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                V("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: vr */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        pm2 pm2 = this.f4128R;
        if (pm2 != null) {
            sb.append(pm2.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4128R)));
            sb.append("}");
        } else {
            eAj eaj = this.f4113R;
            if (eaj != null) {
                sb.append(eaj.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f4113R)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void w(pm2 pm2, boolean z) {
        ViewGroup Q = Q(pm2);
        if (Q != null && (Q instanceof FragmentContainerView)) {
            ((FragmentContainerView) Q).setDrawDisappearingViewsLast(!z);
        }
    }

    public final boolean x() {
        if (this.R < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (pm2 pm2 : this.f4127R.j()) {
            if (pm2 != null && r(pm2)) {
                if (!pm2.f7247Z ? pm2.f7252v.x() | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(pm2);
                    z = true;
                }
            }
        }
        if (this.f4131c != null) {
            for (int i = 0; i < this.f4131c.size(); i++) {
                pm2 pm22 = (pm2) this.f4131c.get(i);
                if (arrayList == null || !arrayList.contains(pm22)) {
                    pm22.getClass();
                }
            }
        }
        this.f4131c = arrayList;
        return z;
    }

    public final void y(boolean z, boolean z2) {
        if (!z2 || !(this.f4113R instanceof gpY)) {
            for (pm2 pm2 : this.f4127R.j()) {
                if (pm2 != null && z2) {
                    pm2.f7252v.y(z, true);
                }
            }
            return;
        }
        vl(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public final pm2 z(int i) {
        piu piu = this.f4127R;
        int size = ((ArrayList) piu.f7202R).size();
        while (true) {
            size--;
            if (size >= 0) {
                pm2 pm2 = (pm2) ((ArrayList) piu.f7202R).get(size);
                if (pm2 != null && pm2.L == i) {
                    return pm2;
                }
            } else {
                for (d dVar : ((HashMap) piu.f7203v).values()) {
                    if (dVar != null) {
                        pm2 pm22 = dVar.f1318R;
                        if (pm22.L == i) {
                            return pm22;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final void zw() {
        Iterator it = this.f4127R.N().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            pm2 pm2 = dVar.f1318R;
            if (pm2.C) {
                if (this.f4129R) {
                    this.f4108O = true;
                } else {
                    pm2.C = false;
                    dVar.H();
                }
            }
        }
    }
}
