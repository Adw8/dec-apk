package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: mpr  reason: default package */
/* loaded from: classes.dex */
public final class mpr {
    public final LinkedHashMap O;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Activity f6175R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f6176R;

    /* renamed from: R  reason: collision with other field name */
    public Bundle f6177R;

    /* renamed from: R  reason: collision with other field name */
    public c f6178R;

    /* renamed from: R  reason: collision with other field name */
    public bJ3 f6179R;

    /* renamed from: R  reason: collision with other field name */
    public final bLS f6180R;

    /* renamed from: R  reason: collision with other field name */
    public final bV5 f6181R;

    /* renamed from: R  reason: collision with other field name */
    public f25 f6182R;

    /* renamed from: R  reason: collision with other field name */
    public hFh f6183R;

    /* renamed from: R  reason: collision with other field name */
    public final hSO f6184R;

    /* renamed from: R  reason: collision with other field name */
    public iMP f6185R;

    /* renamed from: R  reason: collision with other field name */
    public final il f6186R;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f6187R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f6188R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f6189R;

    /* renamed from: R  reason: collision with other field name */
    public final CopyOnWriteArrayList f6190R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f6191R;

    /* renamed from: R  reason: collision with other field name */
    public nu_ f6192R;

    /* renamed from: R  reason: collision with other field name */
    public final pkq f6193R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6194R;

    /* renamed from: R  reason: collision with other field name */
    public Parcelable[] f6195R;
    public final LinkedHashMap X;
    public final LinkedHashMap c;
    public final LinkedHashMap e;
    public final LinkedHashMap v;

    /* renamed from: v  reason: collision with other field name */
    public kg9 f6196v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6197v;

    public mpr(Context context) {
        Object obj;
        this.f6176R = context;
        Iterator it = a6.l(context, i5D.J).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!(((Context) obj) instanceof Activity));
        this.f6175R = (Activity) obj;
        this.f6186R = new il();
        this.f6187R = g4x.O(fcD.R);
        this.f6189R = new LinkedHashMap();
        this.v = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f6190R = new CopyOnWriteArrayList();
        this.f6185R = iMP.INITIALIZED;
        this.f6193R = new pkq(1, this);
        this.f6184R = new hSO(this);
        this.f6197v = true;
        this.f6183R = new hFh();
        this.X = new LinkedHashMap();
        this.O = new LinkedHashMap();
        hFh hfh = this.f6183R;
        hfh.R(new dT8(hfh));
        this.f6183R.R(new yL(this.f6176R));
        this.f6188R = new ArrayList();
        this.f6181R = new bV5(new gVU(this, 0));
        this.f6180R = pip.R(1, 0, h9.DROP_OLDEST, 2);
    }

    public static e9E e(e9E e9e, int i) {
        if (e9e.e == i) {
            return e9e;
        }
        return (e9e instanceof f25 ? (f25) e9e : e9e.f2984R).V(i, true);
    }

    public static /* synthetic */ void g(mpr mpr, j5B j5b) {
        mpr.j(j5b, false, new il());
    }

    public final boolean C() {
        Intent intent;
        int i = 0;
        if (L() != 1) {
            return N();
        }
        Activity activity = this.f6175R;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            e9E O = O();
            int i2 = O.e;
            for (f25 f25 = O.f2984R; f25 != null; f25 = ((e9E) f25).f2984R) {
                if (f25.O != i2) {
                    Bundle bundle = new Bundle();
                    Activity activity2 = this.f6175R;
                    if (!(activity2 == null || activity2.getIntent() == null || this.f6175R.getIntent().getData() == null)) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", this.f6175R.getIntent());
                        jzp P = this.f6182R.P(new CV(this.f6175R.getIntent()));
                        if (P != null) {
                            bundle.putAll(P.f5175R.v(P.R));
                        }
                    }
                    k7I k7i = new k7I(this);
                    int i3 = ((e9E) f25).e;
                    ((List) k7i.R).clear();
                    ((List) k7i.R).add(new oCU(i3, null));
                    if (((f25) k7i.e) != null) {
                        k7i.O();
                    }
                    k7i.X = bundle;
                    ((Intent) k7i.c).putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    k7i.v().v();
                    Activity activity3 = this.f6175R;
                    if (activity3 != null) {
                        activity3.finish();
                    }
                } else {
                    i2 = ((e9E) f25).e;
                }
            }
            return false;
        } else if (!this.f6194R) {
            return false;
        } else {
            Intent intent2 = this.f6175R.getIntent();
            Bundle extras2 = intent2.getExtras();
            int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            ArrayList arrayList = new ArrayList(intArray.length);
            for (int i4 : intArray) {
                arrayList.add(Integer.valueOf(i4));
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            int intValue = ((Number) s3.f(arrayList)).intValue();
            if (parcelableArrayList != null) {
                Bundle bundle2 = (Bundle) s3.f(parcelableArrayList);
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            e9E e = e(Z(), intValue);
            if (e instanceof f25) {
                int i5 = f25.L;
                intValue = n2G.m((f25) e).e;
            }
            e9E O2 = O();
            if (!(O2 != null && intValue == O2.e)) {
                return false;
            }
            k7I k7i2 = new k7I(this);
            Bundle X = hDC.X(new kSh("android-support-nav:controller:deepLinkIntent", intent2));
            Bundle bundle3 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
            if (bundle3 != null) {
                X.putAll(bundle3);
            }
            k7i2.X = X;
            ((Intent) k7i2.c).putExtra("android-support-nav:controller:deepLinkExtras", X);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                i++;
                if (i >= 0) {
                    ((List) k7i2.R).add(new oCU(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null));
                    if (((f25) k7i2.e) != null) {
                        k7i2.O();
                    }
                } else {
                    pdD.k();
                    throw null;
                }
            }
            k7i2.v().v();
            Activity activity4 = this.f6175R;
            if (activity4 != null) {
                activity4.finish();
            }
        }
        return true;
    }

    public final void H(int i, Bundle bundle, ixU ixu) {
        int i2;
        int i3;
        e9E e9e = this.f6186R.isEmpty() ? this.f6182R : ((j5B) this.f6186R.last()).f4822R;
        if (e9e != null) {
            oKo H = e9e.H(i);
            Bundle bundle2 = null;
            if (H != null) {
                if (ixu == null) {
                    ixu = H.f6749R;
                }
                i2 = H.R;
                Bundle bundle3 = H.f6748R;
                if (bundle3 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(bundle3);
                }
            } else {
                i2 = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            boolean z = false;
            if (i2 != 0 || ixu == null || (i3 = ixu.R) == -1) {
                if (i2 != 0) {
                    e9E c = c(i2);
                    if (c == null) {
                        int i4 = e9E.X;
                        String H2 = aYa.H(this.f6176R, i2);
                        if (H == null) {
                            z = true;
                        }
                        if (!z) {
                            StringBuilder i5 = jQ.i("Navigation destination ", H2, " referenced from action ");
                            i5.append(aYa.H(this.f6176R, i));
                            i5.append(" cannot be found from the current destination ");
                            i5.append(e9e);
                            throw new IllegalArgumentException(i5.toString().toString());
                        }
                        throw new IllegalArgumentException("Navigation action/destination " + H2 + " cannot be found from the current destination " + e9e);
                    }
                    U(c, bundle2, ixu);
                    return;
                }
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            } else if (P(i3, ixu.f4779c, false)) {
                v();
            }
        } else {
            throw new IllegalStateException("no current navigation node");
        }
    }

    public final void K() {
        hSO hso = this.f6184R;
        boolean z = true;
        if (!this.f6197v || L() <= 1) {
            z = false;
        }
        ((jnM) hso).f5017R = z;
        geB geb = ((jnM) hso).R;
        if (geb != null) {
            geb.accept(Boolean.valueOf(z));
        }
    }

    public final int L() {
        il ilVar = this.f6186R;
        int i = 0;
        if (!(ilVar instanceof Collection) || !ilVar.isEmpty()) {
            Iterator it = ilVar.iterator();
            while (it.hasNext()) {
                if ((!(((j5B) it.next()).f4822R instanceof f25)) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        return i;
    }

    public final boolean N() {
        return !this.f6186R.isEmpty() && P(O().e, true, false) && v();
    }

    public final e9E O() {
        j5B j5b = (j5B) this.f6186R.C();
        if (j5b != null) {
            return j5b.f4822R;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final boolean P(int i, boolean z, boolean z2) {
        e9E e9e;
        String str;
        if (!this.f6186R.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = dF.xN(this.f6186R).iterator();
            while (true) {
                if (!it.hasNext()) {
                    e9e = null;
                    break;
                }
                e9E e9e2 = ((j5B) it.next()).f4822R;
                jFk v = this.f6183R.v(e9e2.f2986R);
                if (z || e9e2.e != i) {
                    arrayList.add(v);
                }
                if (e9e2.e == i) {
                    e9e = e9e2;
                    break;
                }
            }
            if (e9e == null) {
                int i2 = e9E.X;
                String H = aYa.H(this.f6176R, i);
                Log.i("NavController", "Ignoring popBackStack to destination " + H + " as it was not found on the current back stack");
            } else {
                oJx ojx = new oJx();
                il ilVar = new il();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str = null;
                        break;
                    }
                    oJx ojx2 = new oJx();
                    this.f6196v = new h0m(ojx2, ojx, this, z2, ilVar);
                    ((jFk) it2.next()).m((j5B) this.f6186R.last(), z2);
                    str = null;
                    this.f6196v = null;
                    if (!ojx2.R) {
                        break;
                    }
                }
                if (z2) {
                    if (!z) {
                        Iterator it3 = new k0v(a6.l(e9e, i5D.I), new omH(this, 0), 1).iterator();
                        while (it3.hasNext()) {
                            LinkedHashMap linkedHashMap = this.c;
                            Integer valueOf = Integer.valueOf(((e9E) it3.next()).e);
                            ouN oun = ilVar.isEmpty() ? str : ilVar.R[ilVar.e];
                            linkedHashMap.put(valueOf, oun != null ? oun.f7017R : str);
                        }
                    }
                    if (!ilVar.isEmpty()) {
                        ouN oun2 = (ouN) ilVar.first();
                        Iterator it4 = new k0v(a6.l(c(oun2.e), i5D.u), new omH(this, 1), 1).iterator();
                        while (it4.hasNext()) {
                            this.c.put(Integer.valueOf(((e9E) it4.next()).e), oun2.f7017R);
                        }
                        this.e.put(oun2.f7017R, ilVar);
                    }
                }
                K();
                return ojx.R;
            }
        }
        return false;
    }

    public final void R(e9E e9e, Bundle bundle, j5B j5b, List list) {
        Object obj;
        Object obj2;
        e9E e9e2 = j5b.f4822R;
        if (!(e9e2 instanceof hVC)) {
            while (!this.f6186R.isEmpty() && (((j5B) this.f6186R.last()).f4822R instanceof hVC) && P(((j5B) this.f6186R.last()).f4822R.e, true, false)) {
            }
        }
        il ilVar = new il();
        j5B j5b2 = null;
        if (e9e instanceof f25) {
            e9E e9e3 = e9e2;
            do {
                e9e3 = e9e3.f2984R;
                if (e9e3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = listIterator.previous();
                        if (n3x.v(((j5B) obj2).f4822R, e9e3)) {
                            break;
                        }
                    }
                    j5B j5b3 = (j5B) obj2;
                    if (j5b3 == null) {
                        int i = j5B.e;
                        j5b3 = aYa.m(this.f6176R, e9e3, bundle, m(), this.f6179R);
                    }
                    ilVar.addFirst(j5b3);
                    if ((!this.f6186R.isEmpty()) && ((j5B) this.f6186R.last()).f4822R == e9e3) {
                        g(this, (j5B) this.f6186R.last());
                    }
                }
                if (e9e3 == null) {
                    break;
                }
            } while (e9e3 != e9e);
        }
        e9E e9e4 = ilVar.isEmpty() ? e9e2 : ((j5B) ilVar.first()).f4822R;
        while (e9e4 != null && c(e9e4.e) == null) {
            e9e4 = e9e4.f2984R;
            if (e9e4 != null) {
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator2.previous();
                    if (n3x.v(((j5B) obj).f4822R, e9e4)) {
                        break;
                    }
                }
                j5B j5b4 = (j5B) obj;
                if (j5b4 == null) {
                    int i2 = j5B.e;
                    j5b4 = aYa.m(this.f6176R, e9e4, e9e4.v(bundle), m(), this.f6179R);
                }
                ilVar.addFirst(j5b4);
            }
        }
        if (!ilVar.isEmpty()) {
            e9e2 = ((j5B) ilVar.first()).f4822R;
        }
        while (!this.f6186R.isEmpty() && (((j5B) this.f6186R.last()).f4822R instanceof f25) && ((f25) ((j5B) this.f6186R.last()).f4822R).V(e9e2.e, false) == null) {
            g(this, (j5B) this.f6186R.last());
        }
        il ilVar2 = this.f6186R;
        j5B j5b5 = (j5B) (ilVar2.isEmpty() ? null : ilVar2.R[ilVar2.e]);
        if (j5b5 == null) {
            j5b5 = (j5B) (ilVar.isEmpty() ? null : ilVar.R[ilVar.e]);
        }
        if (!n3x.v(j5b5 != null ? j5b5.f4822R : null, this.f6182R)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                if (n3x.v(((j5B) previous).f4822R, this.f6182R)) {
                    j5b2 = previous;
                    break;
                }
            }
            j5B j5b6 = j5b2;
            if (j5b6 == null) {
                int i3 = j5B.e;
                Context context = this.f6176R;
                f25 f25 = this.f6182R;
                j5b6 = aYa.m(context, f25, f25.v(bundle), m(), this.f6179R);
            }
            ilVar.addFirst(j5b6);
        }
        Iterator it = ilVar.iterator();
        while (it.hasNext()) {
            j5B j5b7 = (j5B) it.next();
            Object obj3 = this.X.get(this.f6183R.v(j5b7.f4822R.f2986R));
            if (obj3 != null) {
                ((ebT) obj3).R(j5b7);
            } else {
                throw new IllegalStateException(jQ.g(opT.U("NavigatorBackStack for "), e9e.f2986R, " should already be created").toString());
            }
        }
        this.f6186R.addAll(ilVar);
        this.f6186R.addLast(j5b);
        Iterator it2 = dF.iE(ilVar, j5b).iterator();
        while (it2.hasNext()) {
            j5B j5b8 = (j5B) it2.next();
            f25 f252 = j5b8.f4822R.f2984R;
            if (f252 != null) {
                x(j5b8, X(((e9E) f252).e));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100 A[LOOP:1: B:44:0x00fa->B:46:0x0100, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(defpackage.e9E r17, android.os.Bundle r18, defpackage.ixU r19) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpr.U(e9E, android.os.Bundle, ixU):void");
    }

    public final void V(j5B j5b) {
        bJ3 bj3;
        j5B j5b2 = (j5B) this.f6189R.remove(j5b);
        if (j5b2 != null) {
            AtomicInteger atomicInteger = (AtomicInteger) this.v.get(j5b2);
            Integer valueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                ebT ebt = (ebT) this.X.get(this.f6183R.v(j5b2.f4822R.f2986R));
                if (ebt != null) {
                    boolean v = n3x.v(ebt.f3159R.O.get(j5b2), Boolean.TRUE);
                    ivW ivw = ebt.f3161v;
                    ivw.H(cYa.M((Set) ivw.getValue(), j5b2));
                    ebt.f3159R.O.remove(j5b2);
                    if (!ebt.f3159R.f6186R.contains(j5b2)) {
                        ebt.f3159R.V(j5b2);
                        if (j5b2.f4827R.f5900R.R(iMP.CREATED)) {
                            j5b2.R(iMP.DESTROYED);
                        }
                        il ilVar = ebt.f3159R.f6186R;
                        boolean z = true;
                        if (!(ilVar instanceof Collection) || !ilVar.isEmpty()) {
                            Iterator it = ilVar.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (n3x.v(((j5B) it.next()).f4826R, j5b2.f4826R)) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (z && !v && (bj3 = ebt.f3159R.f6179R) != null) {
                            ns8 ns8 = (ns8) bj3.f1587R.remove(j5b2.f4826R);
                            if (ns8 != null) {
                                ns8.R();
                            }
                        }
                        ebt.f3159R.o();
                        mpr mpr = ebt.f3159R;
                        mpr.f6187R.H(mpr.y());
                    } else if (!ebt.f3160R) {
                        ebt.f3159R.o();
                        mpr mpr2 = ebt.f3159R;
                        mpr2.f6187R.H(mpr2.y());
                    }
                }
                this.v.remove(j5b2);
            }
        }
    }

    public final j5B X(int i) {
        Object obj;
        boolean z;
        il ilVar = this.f6186R;
        ListIterator listIterator = ilVar.listIterator(ilVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((j5B) obj).f4822R.e == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        j5B j5b = (j5B) obj;
        if (j5b != null) {
            return j5b;
        }
        StringBuilder C = opT.C("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        C.append(O());
        throw new IllegalArgumentException(C.toString().toString());
    }

    public final f25 Z() {
        f25 f25 = this.f6182R;
        if (f25 != null) {
            return f25;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
    }

    public final e9E c(int i) {
        e9E e9e;
        f25 f25 = this.f6182R;
        if (f25 == null) {
            return null;
        }
        if (((e9E) f25).e == i) {
            return f25;
        }
        j5B j5b = (j5B) this.f6186R.C();
        if (j5b == null || (e9e = j5b.f4822R) == null) {
            e9e = this.f6182R;
        }
        return e(e9e, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bd, code lost:
        if ((r7.length == 0) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x038b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.f25 r24, android.os.Bundle r25) {
        /*
        // Method dump skipped, instructions count: 1034
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpr.i(f25, android.os.Bundle):void");
    }

    public final void j(j5B j5b, boolean z, il ilVar) {
        bJ3 bj3;
        i4m i4m;
        Set set;
        j5B j5b2 = (j5B) this.f6186R.last();
        if (n3x.v(j5b2, j5b)) {
            this.f6186R.removeLast();
            ebT ebt = (ebT) this.X.get(this.f6183R.v(j5b2.f4822R.f2986R));
            boolean z2 = true;
            if (!((ebt == null || (i4m = ebt.v) == null || (set = (Set) i4m.getValue()) == null || !set.contains(j5b2)) ? false : true) && !this.v.containsKey(j5b2)) {
                z2 = false;
            }
            iMP imp = j5b2.f4827R.f5900R;
            iMP imp2 = iMP.CREATED;
            if (imp.R(imp2)) {
                if (z) {
                    j5b2.R(imp2);
                    ilVar.addFirst(new ouN(j5b2));
                }
                if (!z2) {
                    j5b2.R(iMP.DESTROYED);
                    V(j5b2);
                } else {
                    j5b2.R(imp2);
                }
            }
            if (!z && !z2 && (bj3 = this.f6179R) != null) {
                ns8 ns8 = (ns8) bj3.f1587R.remove(j5b2.f4826R);
                if (ns8 != null) {
                    ns8.R();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder U = opT.U("Attempted to pop ");
        U.append(j5b.f4822R);
        U.append(", which is not the top of the back stack (");
        U.append(j5b2.f4822R);
        U.append(')');
        throw new IllegalStateException(U.toString().toString());
    }

    public final iMP m() {
        return this.f6192R == null ? iMP.CREATED : this.f6185R;
    }

    public final void o() {
        e9E e9e;
        i4m i4m;
        Set set;
        iMP imp = iMP.RESUMED;
        iMP imp2 = iMP.STARTED;
        ArrayList arrayList = new ArrayList(this.f6186R);
        if (!arrayList.isEmpty()) {
            e9E e9e2 = ((j5B) dF.zw(arrayList)).f4822R;
            if (e9e2 instanceof hVC) {
                for (j5B j5b : dF.xN(arrayList)) {
                    e9e = j5b.f4822R;
                    if (!((e9e instanceof f25) || (e9e instanceof hVC))) {
                        break;
                    }
                }
            }
            e9e = null;
            HashMap hashMap = new HashMap();
            for (j5B j5b2 : dF.xN(arrayList)) {
                iMP imp3 = j5b2.f4829v;
                e9E e9e3 = j5b2.f4822R;
                if (e9e2 != null && e9e3.e == e9e2.e) {
                    if (imp3 != imp) {
                        ebT ebt = (ebT) this.X.get(this.f6183R.v(e9e3.f2986R));
                        if (!n3x.v((ebt == null || (i4m = ebt.v) == null || (set = (Set) i4m.getValue()) == null) ? null : Boolean.valueOf(set.contains(j5b2)), Boolean.TRUE)) {
                            AtomicInteger atomicInteger = (AtomicInteger) this.v.get(j5b2);
                            boolean z = false;
                            if (atomicInteger != null && atomicInteger.get() == 0) {
                                z = true;
                            }
                            if (!z) {
                                hashMap.put(j5b2, imp);
                            }
                        }
                        hashMap.put(j5b2, imp2);
                    }
                    e9e2 = e9e2.f2984R;
                } else if (e9e == null || e9e3.e != e9e.e) {
                    j5b2.R(iMP.CREATED);
                } else {
                    if (imp3 == imp) {
                        j5b2.R(imp2);
                    } else if (imp3 != imp2) {
                        hashMap.put(j5b2, imp2);
                    }
                    e9e = e9e.f2984R;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j5B j5b3 = (j5B) it.next();
                iMP imp4 = (iMP) hashMap.get(j5b3);
                if (imp4 != null) {
                    j5b3.R(imp4);
                } else {
                    j5b3.v();
                }
            }
        }
    }

    public final boolean t(int i, Bundle bundle, ixU ixu) {
        e9E e9e;
        j5B j5b;
        e9E e9e2;
        if (!this.c.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str = (String) this.c.get(Integer.valueOf(i));
        Collection values = this.c.values();
        oF_ of_ = new oF_(str, 4);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (((Boolean) of_.x(it.next())).booleanValue()) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap = this.e;
        gvP.O(linkedHashMap);
        il ilVar = (il) linkedHashMap.remove(str);
        ArrayList arrayList = new ArrayList();
        j5B j5b2 = (j5B) this.f6186R.C();
        if (j5b2 == null || (e9e = j5b2.f4822R) == null) {
            e9e = Z();
        }
        if (ilVar != null) {
            Iterator it2 = ilVar.iterator();
            while (it2.hasNext()) {
                ouN oun = (ouN) it2.next();
                e9E e = e(e9e, oun.e);
                if (e != null) {
                    arrayList.add(oun.R(this.f6176R, e, m(), this.f6179R));
                    e9e = e;
                } else {
                    int i2 = e9E.X;
                    String H = aYa.H(this.f6176R, oun.e);
                    throw new IllegalStateException(("Restore State failed: destination " + H + " cannot be found from the current destination " + e9e).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!(((j5B) next).f4822R instanceof f25)) {
                arrayList3.add(next);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it4.hasNext()) {
                break;
            }
            j5B j5b3 = (j5B) it4.next();
            List list = (List) dF.vl(arrayList2);
            if (!(list == null || (j5b = (j5B) dF.zw(list)) == null || (e9e2 = j5b.f4822R) == null)) {
                str2 = e9e2.f2986R;
            }
            if (n3x.v(str2, j5b3.f4822R.f2986R)) {
                list.add(j5b3);
            } else {
                arrayList2.add(pdD.h(j5b3));
            }
        }
        oJx ojx = new oJx();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            List list2 = (List) it5.next();
            jFk v = this.f6183R.v(((j5B) dF.b(list2)).f4822R.f2986R);
            this.f6191R = new e25(ojx, arrayList, new blo(), this, bundle, 3);
            v.e(list2, ixu);
            this.f6191R = null;
        }
        return ojx.R;
    }

    public final boolean v() {
        while (!this.f6186R.isEmpty() && (((j5B) this.f6186R.last()).f4822R instanceof f25)) {
            g(this, (j5B) this.f6186R.last());
        }
        j5B j5b = (j5B) this.f6186R.C();
        if (j5b != null) {
            this.f6188R.add(j5b);
        }
        this.R++;
        o();
        int i = this.R - 1;
        this.R = i;
        if (i == 0) {
            ArrayList arrayList = new ArrayList(this.f6188R);
            this.f6188R.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j5B j5b2 = (j5B) it.next();
                Iterator it2 = this.f6190R.iterator();
                while (it2.hasNext()) {
                    ((WO) it2.next()).R(j5b2.f4822R);
                }
                this.f6180R.c(j5b2);
            }
            this.f6187R.H(y());
        }
        return j5b != null;
    }

    public final void x(j5B j5b, j5B j5b2) {
        this.f6189R.put(j5b, j5b2);
        if (this.v.get(j5b2) == null) {
            this.v.put(j5b2, new AtomicInteger(0));
        }
        ((AtomicInteger) this.v.get(j5b2)).incrementAndGet();
    }

    public final ArrayList y() {
        iMP imp = iMP.STARTED;
        ArrayList arrayList = new ArrayList();
        for (ebT ebt : this.X.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) ebt.v.getValue()) {
                j5B j5b = (j5B) obj;
                if (!arrayList.contains(j5b) && !j5b.f4829v.R(imp)) {
                    arrayList2.add(obj);
                }
            }
            s3.E(arrayList2, arrayList);
        }
        il ilVar = this.f6186R;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ilVar.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            j5B j5b2 = (j5B) next;
            if (!arrayList.contains(j5b2) && j5b2.f4829v.R(imp)) {
                arrayList3.add(next);
            }
        }
        s3.E(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (!(((j5B) next2).f4822R instanceof f25)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }
}
