package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: hFt  reason: default package */
/* loaded from: classes.dex */
public abstract class hFt implements Cloneable {

    /* renamed from: R  reason: collision with other field name */
    public n1P f4178R;
    public ArrayList c;

    /* renamed from: e  reason: collision with other field name */
    public ArrayList f4183e;

    /* renamed from: v  reason: collision with other field name */
    public static final int[] f4172v = {2, 1, 3, 4};
    public static final n2G v = new n2G(11);
    public static ThreadLocal R = new ThreadLocal();

    /* renamed from: R  reason: collision with other field name */
    public String f4176R = getClass().getName();

    /* renamed from: R  reason: collision with other field name */
    public long f4173R = -1;

    /* renamed from: v  reason: collision with other field name */
    public long f4184v = -1;

    /* renamed from: R  reason: collision with other field name */
    public TimeInterpolator f4174R = null;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f4177R = new ArrayList();

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f4185v = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public piu f4180R = new piu(6);

    /* renamed from: v  reason: collision with other field name */
    public piu f4186v = new piu(6);

    /* renamed from: R  reason: collision with other field name */
    public ets f4175R = null;

    /* renamed from: R  reason: collision with other field name */
    public int[] f4182R = f4172v;
    public ArrayList X = new ArrayList();
    public int e = 0;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4181R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f4187v = false;
    public ArrayList O = null;
    public ArrayList L = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public n2G f4179R = v;

    public static boolean J(oNy ony, oNy ony2, String str) {
        Object obj = ony.f6812R.get(str);
        Object obj2 = ony2.f6812R.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public static void X(piu piu, View view, oNy ony) {
        ((FK) piu.f7202R).put(view, ony);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) piu.f7203v).indexOfKey(id) >= 0) {
                ((SparseArray) piu.f7203v).put(id, null);
            } else {
                ((SparseArray) piu.f7203v).put(id, view);
            }
        }
        WeakHashMap weakHashMap = of5.f6887R;
        String H = m18.H(view);
        if (H != null) {
            if (((FK) piu.e).containsKey(H)) {
                ((FK) piu.e).put(H, null);
            } else {
                ((FK) piu.e).put(H, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                jXn jxn = (jXn) piu.c;
                if (jxn.f4952R) {
                    jxn.X();
                }
                if (vd.U(jxn.f4953R, jxn.e, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((jXn) piu.c).O(itemIdAtPosition, null);
                    if (view2 != null) {
                        mHC.y(view2, false);
                        ((jXn) piu.c).L(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                mHC.y(view, true);
                ((jXn) piu.c).L(itemIdAtPosition, view);
            }
        }
    }

    public static FK t() {
        FK fk = (FK) R.get();
        if (fk != null) {
            return fk;
        }
        FK fk2 = new FK();
        R.set(fk2);
        return fk2;
    }

    public void A(TimeInterpolator timeInterpolator) {
        this.f4174R = timeInterpolator;
    }

    public void I(View view) {
        this.f4185v.remove(view);
    }

    public final boolean K(View view) {
        return (this.f4177R.size() == 0 && this.f4185v.size() == 0) || this.f4177R.contains(Integer.valueOf(view.getId())) || this.f4185v.contains(view);
    }

    public final void L(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                oNy ony = new oNy(view);
                if (z) {
                    m(ony);
                } else {
                    O(ony);
                }
                ony.f6811R.add(this);
                Z(ony);
                if (z) {
                    X(this.f4180R, view, ony);
                } else {
                    X(this.f4186v, view, ony);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    L(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* renamed from: N */
    public hFt clone() {
        try {
            hFt hft = (hFt) super.clone();
            hft.L = new ArrayList();
            hft.f4180R = new piu(6);
            hft.f4186v = new piu(6);
            hft.c = null;
            hft.f4183e = null;
            return hft;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract void O(oNy ony);

    public Animator P(ViewGroup viewGroup, oNy ony, oNy ony2) {
        return null;
    }

    public void Q(n1P n1p) {
        this.f4178R = n1p;
    }

    public void S(n2G n2g) {
        if (n2g == null) {
            this.f4179R = v;
        } else {
            this.f4179R = n2g;
        }
    }

    public String T(String str) {
        StringBuilder U = opT.U(str);
        U.append(getClass().getSimpleName());
        U.append("@");
        U.append(Integer.toHexString(hashCode()));
        U.append(": ");
        String sb = U.toString();
        if (this.f4184v != -1) {
            StringBuilder t = jQ.t(sb, "dur(");
            t.append(this.f4184v);
            t.append(") ");
            sb = t.toString();
        }
        if (this.f4173R != -1) {
            StringBuilder t2 = jQ.t(sb, "dly(");
            t2.append(this.f4173R);
            t2.append(") ");
            sb = t2.toString();
        }
        if (this.f4174R != null) {
            StringBuilder t3 = jQ.t(sb, "interp(");
            t3.append(this.f4174R);
            t3.append(") ");
            sb = t3.toString();
        }
        if (this.f4177R.size() <= 0 && this.f4185v.size() <= 0) {
            return sb;
        }
        String H = opT.H(sb, "tgts(");
        if (this.f4177R.size() > 0) {
            for (int i = 0; i < this.f4177R.size(); i++) {
                if (i > 0) {
                    H = opT.H(H, ", ");
                }
                StringBuilder U2 = opT.U(H);
                U2.append(this.f4177R.get(i));
                H = U2.toString();
            }
        }
        if (this.f4185v.size() > 0) {
            for (int i2 = 0; i2 < this.f4185v.size(); i2++) {
                if (i2 > 0) {
                    H = opT.H(H, ", ");
                }
                StringBuilder U3 = opT.U(H);
                U3.append(this.f4185v.get(i2));
                H = U3.toString();
            }
        }
        return opT.H(H, ")");
    }

    public final void U(boolean z) {
        if (z) {
            ((FK) this.f4180R.f7202R).clear();
            ((SparseArray) this.f4180R.f7203v).clear();
            ((jXn) this.f4180R.c).v();
            return;
        }
        ((FK) this.f4186v.f7202R).clear();
        ((SparseArray) this.f4186v.f7203v).clear();
        ((jXn) this.f4186v.c).v();
    }

    public final oNy V(View view, boolean z) {
        ets ets = this.f4175R;
        if (ets != null) {
            return ets.V(view, z);
        }
        return (oNy) ((FK) (z ? this.f4180R : this.f4186v).f7202R).getOrDefault(view, null);
    }

    public void W(long j) {
        this.f4173R = j;
    }

    public void Y(View view) {
        if (!this.f4187v) {
            for (int size = this.X.size() - 1; size >= 0; size--) {
                ((Animator) this.X.get(size)).pause();
            }
            ArrayList arrayList = this.O;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.O.clone();
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    ((lpP) arrayList2.get(i)).v();
                }
            }
            this.f4181R = true;
        }
    }

    public void Z(oNy ony) {
    }

    public void cancel() {
        int size = this.X.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) this.X.get(size)).cancel();
        }
        ArrayList arrayList = this.O;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.O.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((lpP) arrayList2.get(i)).R();
            }
        }
    }

    public void d() {
    }

    public void e(View view) {
        this.f4185v.add(view);
    }

    public final void g() {
        int i = this.e - 1;
        this.e = i;
        if (i == 0) {
            ArrayList arrayList = this.O;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.O.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((lpP) arrayList2.get(i2)).c(this);
                }
            }
            int i3 = 0;
            while (true) {
                jXn jxn = (jXn) this.f4180R.c;
                if (jxn.f4952R) {
                    jxn.X();
                }
                if (i3 >= jxn.e) {
                    break;
                }
                View view = (View) ((jXn) this.f4180R.c).Z(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    mHC.y(view, false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                jXn jxn2 = (jXn) this.f4186v.c;
                if (jxn2.f4952R) {
                    jxn2.X();
                }
                if (i4 < jxn2.e) {
                    View view2 = (View) ((jXn) this.f4186v.c).Z(i4);
                    if (view2 != null) {
                        WeakHashMap weakHashMap2 = of5.f6887R;
                        mHC.y(view2, false);
                    }
                    i4++;
                } else {
                    this.f4187v = true;
                    return;
                }
            }
        }
    }

    public void h(lpP lpp) {
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            arrayList.remove(lpp);
            if (this.O.size() == 0) {
                this.O = null;
            }
        }
    }

    public String[] i() {
        return null;
    }

    public void j(ViewGroup viewGroup, piu piu, piu piu2, ArrayList arrayList, ArrayList arrayList2) {
        Animator P;
        oNy ony;
        View view;
        ViewGroup viewGroup2 = viewGroup;
        FK t = t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            oNy ony2 = (oNy) arrayList.get(i);
            oNy ony3 = (oNy) arrayList2.get(i);
            if (ony2 != null && !ony2.f6811R.contains(this)) {
                ony2 = null;
            }
            if (ony3 != null && !ony3.f6811R.contains(this)) {
                ony3 = null;
            }
            if (!(ony2 == null && ony3 == null)) {
                if ((ony2 == null || ony3 == null || o(ony2, ony3)) && (P = P(viewGroup2, ony2, ony3)) != null) {
                    if (ony3 != null) {
                        View view2 = ony3.R;
                        String[] i2 = i();
                        if (i2 != null && i2.length > 0) {
                            ony = new oNy(view2);
                            oNy ony4 = (oNy) ((FK) piu2.f7202R).getOrDefault(view2, null);
                            if (ony4 != null) {
                                int i3 = 0;
                                while (i3 < i2.length) {
                                    HashMap hashMap = ony.f6812R;
                                    String str = i2[i3];
                                    hashMap.put(str, ony4.f6812R.get(str));
                                    i3++;
                                    P = P;
                                    i2 = i2;
                                }
                            }
                            int i4 = t.e;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    break;
                                }
                                phr phr = (phr) t.getOrDefault((Animator) t.Z(i5), null);
                                if (phr.f7185R != null && phr.R == view2 && phr.f7184R.equals(this.f4176R) && phr.f7185R.equals(ony)) {
                                    P = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            P = P;
                            ony = null;
                        }
                        view = view2;
                    } else {
                        view = ony2.R;
                        P = P;
                        ony = null;
                    }
                    if (P != null) {
                        String str2 = this.f4176R;
                        mZP mzp = kkY.R;
                        t.put(P, new phr(view, str2, this, new otJ(viewGroup2), ony));
                        this.L.add(P);
                    }
                    i++;
                    viewGroup2 = viewGroup;
                }
            }
            i++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator = (Animator) this.L.get(sparseIntArray.keyAt(i6));
                animator.setStartDelay(animator.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE));
            }
        }
    }

    public abstract void m(oNy ony);

    public void n(long j) {
        this.f4184v = j;
    }

    public boolean o(oNy ony, oNy ony2) {
        if (ony == null || ony2 == null) {
            return false;
        }
        String[] i = i();
        if (i != null) {
            for (String str : i) {
                if (!J(ony, ony2, str)) {
                }
            }
            return false;
        }
        for (String str2 : ony.f6812R.keySet()) {
            if (J(ony, ony2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final void s() {
        if (this.e == 0) {
            ArrayList arrayList = this.O;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.O.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((lpP) arrayList2.get(i)).X(this);
                }
            }
            this.f4187v = false;
        }
        this.e++;
    }

    @Override // java.lang.Object
    public final String toString() {
        return T("");
    }

    public void u(ViewGroup viewGroup) {
        if (this.f4181R) {
            if (!this.f4187v) {
                int size = this.X.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((Animator) this.X.get(size)).resume();
                }
                ArrayList arrayList = this.O;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.O.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((lpP) arrayList2.get(i)).e();
                    }
                }
            }
            this.f4181R = false;
        }
    }

    public void v(lpP lpp) {
        if (this.O == null) {
            this.O = new ArrayList();
        }
        this.O.add(lpp);
    }

    public final void x(ViewGroup viewGroup, boolean z) {
        U(z);
        if (this.f4177R.size() > 0 || this.f4185v.size() > 0) {
            for (int i = 0; i < this.f4177R.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f4177R.get(i)).intValue());
                if (findViewById != null) {
                    oNy ony = new oNy(findViewById);
                    if (z) {
                        m(ony);
                    } else {
                        O(ony);
                    }
                    ony.f6811R.add(this);
                    Z(ony);
                    if (z) {
                        X(this.f4180R, findViewById, ony);
                    } else {
                        X(this.f4186v, findViewById, ony);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f4185v.size(); i2++) {
                View view = (View) this.f4185v.get(i2);
                oNy ony2 = new oNy(view);
                if (z) {
                    m(ony2);
                } else {
                    O(ony2);
                }
                ony2.f6811R.add(this);
                Z(ony2);
                if (z) {
                    X(this.f4180R, view, ony2);
                } else {
                    X(this.f4186v, view, ony2);
                }
            }
            return;
        }
        L(viewGroup, z);
    }

    public final oNy y(View view, boolean z) {
        ets ets = this.f4175R;
        if (ets != null) {
            return ets.y(view, z);
        }
        ArrayList arrayList = z ? this.c : this.f4183e;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            oNy ony = (oNy) arrayList.get(i2);
            if (ony == null) {
                return null;
            }
            if (ony.R == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (oNy) (z ? this.f4183e : this.c).get(i);
    }

    public void z() {
        s();
        FK t = t();
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (t.containsKey(animator)) {
                s();
                if (animator != null) {
                    animator.addListener(new dAg(this, t));
                    long j = this.f4184v;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f4173R;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f4174R;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new XM(1, this));
                    animator.start();
                }
            }
        }
        this.L.clear();
        g();
    }
}
