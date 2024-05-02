package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: owe  reason: default package */
/* loaded from: classes.dex */
public abstract class owe {
    public final ViewGroup R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f7035R = new ArrayList();
    public final ArrayList v = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public boolean f7036R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f7037v = false;

    public owe(ViewGroup viewGroup) {
        this.R = viewGroup;
    }

    public static owe O(ViewGroup viewGroup, ieQ ieq) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof owe) {
            return (owe) tag;
        }
        ieq.getClass();
        peT pet = new peT(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, pet);
        return pet;
    }

    public final void L() {
        synchronized (this.f7035R) {
            Z();
            this.f7037v = false;
            int size = this.f7035R.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                kuA kua = (kuA) this.f7035R.get(size);
                int c = opT.c(kua.f5473R.f7228R);
                if (kua.R == 2 && c != 2) {
                    mfw mfw = kua.f5473R.f7243R;
                    this.f7037v = false;
                    break;
                }
            }
        }
    }

    public final void R(int i, int i2, d dVar) {
        synchronized (this.f7035R) {
            a3 a3Var = new a3();
            kuA e = e(dVar.f1318R);
            if (e != null) {
                e.c(i, i2);
                return;
            }
            kuA kua = new kuA(i, i2, dVar, a3Var);
            this.f7035R.add(kua);
            kua.f5471R.add(new b0n(this, kua, 0));
            kua.f5471R.add(new b0n(this, kua, 1));
        }
    }

    public final void X() {
        String str;
        String str2;
        if (hAW.W(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.R;
        WeakHashMap weakHashMap = of5.f6887R;
        boolean v = d6y.v(viewGroup);
        synchronized (this.f7035R) {
            Z();
            Iterator it = this.f7035R.iterator();
            while (it.hasNext()) {
                ((kuA) it.next()).e();
            }
            Iterator it2 = new ArrayList(this.v).iterator();
            while (it2.hasNext()) {
                kuA kua = (kuA) it2.next();
                if (hAW.W(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (v) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.R + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(kua);
                    Log.v("FragmentManager", sb.toString());
                }
                kua.R();
            }
            Iterator it3 = new ArrayList(this.f7035R).iterator();
            while (it3.hasNext()) {
                kuA kua2 = (kuA) it3.next();
                if (hAW.W(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (v) {
                        str = "";
                    } else {
                        str = "Container " + this.R + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(kua2);
                    Log.v("FragmentManager", sb2.toString());
                }
                kua2.R();
            }
        }
    }

    public final void Z() {
        Iterator it = this.f7035R.iterator();
        while (it.hasNext()) {
            kuA kua = (kuA) it.next();
            if (kua.v == 2) {
                kua.c(opT.v(kua.f5473R.p().getVisibility()), 1);
            }
        }
    }

    public final void c() {
        if (!this.f7037v) {
            ViewGroup viewGroup = this.R;
            WeakHashMap weakHashMap = of5.f6887R;
            if (!d6y.v(viewGroup)) {
                X();
                this.f7036R = false;
                return;
            }
            synchronized (this.f7035R) {
                if (!this.f7035R.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.v);
                    this.v.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        kuA kua = (kuA) it.next();
                        if (hAW.W(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + kua);
                        }
                        kua.R();
                        if (!kua.f5475v) {
                            this.v.add(kua);
                        }
                    }
                    Z();
                    ArrayList arrayList2 = new ArrayList(this.f7035R);
                    this.f7035R.clear();
                    this.v.addAll(arrayList2);
                    if (hAW.W(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((kuA) it2.next()).e();
                    }
                    v(arrayList2, this.f7036R);
                    this.f7036R = false;
                    if (hAW.W(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    public final kuA e(pm2 pm2) {
        Iterator it = this.f7035R.iterator();
        while (it.hasNext()) {
            kuA kua = (kuA) it.next();
            if (kua.f5473R.equals(pm2) && !kua.f5474R) {
                return kua;
            }
        }
        return null;
    }

    public abstract void v(ArrayList arrayList, boolean z);
}
