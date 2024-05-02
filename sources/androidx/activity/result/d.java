package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: R  reason: collision with other field name */
    public Random f1026R = new Random();

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f1025R = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f1024R = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap X = new HashMap();
    public final Bundle R = new Bundle();

    public final void O(String str) {
        Integer num;
        if (!this.f1024R.contains(str) && (num = (Integer) this.v.remove(str)) != null) {
            this.f1025R.remove(num);
        }
        this.e.remove(str);
        if (this.X.containsKey(str)) {
            StringBuilder i = jQ.i("Dropping pending result for request ", str, ": ");
            i.append(this.X.get(str));
            Log.w("ActivityResultRegistry", i.toString());
            this.X.remove(str);
        }
        if (this.R.containsKey(str)) {
            StringBuilder i2 = jQ.i("Dropping pending result for request ", str, ": ");
            i2.append(this.R.getParcelable(str));
            Log.w("ActivityResultRegistry", i2.toString());
            this.R.remove(str);
        }
        D4 d4 = (D4) this.c.get(str);
        if (d4 != null) {
            Iterator it = d4.f73R.iterator();
            while (it.hasNext()) {
                d4.R.v((k3P) it.next());
            }
            d4.f73R.clear();
            this.c.remove(str);
        }
    }

    public final boolean R(int i, int i2, Intent intent) {
        String str = (String) this.f1025R.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        Nd nd = (Nd) this.e.get(str);
        if (nd == null || nd.R == null || !this.f1024R.contains(str)) {
            this.X.remove(str);
            this.R.putParcelable(str, new wt(intent, i2));
            return true;
        }
        nd.R.R(nd.f320R.x(intent, i2));
        this.f1024R.remove(str);
        return true;
    }

    public final void X(String str) {
        if (((Integer) this.v.get(str)) == null) {
            int nextInt = this.f1026R.nextInt(2147418112);
            while (true) {
                int i = nextInt + 65536;
                if (this.f1025R.containsKey(Integer.valueOf(i))) {
                    nextInt = this.f1026R.nextInt(2147418112);
                } else {
                    this.f1025R.put(Integer.valueOf(i), str);
                    this.v.put(str, Integer.valueOf(i));
                    return;
                }
            }
        }
    }

    public final Ks c(String str, pm2 pm2, mjG mjg, Sw sw) {
        m4i m4i = pm2.f7242R;
        if (!m4i.f5900R.R(iMP.STARTED)) {
            X(str);
            D4 d4 = (D4) this.c.get(str);
            if (d4 == null) {
                d4 = new D4(m4i);
            }
            ActivityResultRegistry$1 activityResultRegistry$1 = new k3P(str, sw, mjg) { // from class: androidx.activity.result.ActivityResultRegistry$1
                public final /* synthetic */ Sw R;

                /* renamed from: R  reason: collision with other field name */
                public final /* synthetic */ String f1022R;

                /* renamed from: R  reason: collision with other field name */
                public final /* synthetic */ mjG f1023R;

                {
                    this.f1022R = r2;
                    this.R = r3;
                    this.f1023R = r4;
                }

                @Override // defpackage.k3P
                public final void e(nu_ nu_, alX alx) {
                    if (alX.ON_START.equals(alx)) {
                        d.this.e.put(this.f1022R, new Nd(this.R, this.f1023R));
                        if (d.this.X.containsKey(this.f1022R)) {
                            Object obj = d.this.X.get(this.f1022R);
                            d.this.X.remove(this.f1022R);
                            this.R.R(obj);
                        }
                        wt wtVar = (wt) d.this.R.getParcelable(this.f1022R);
                        if (wtVar != null) {
                            d.this.R.remove(this.f1022R);
                            this.R.R(this.f1023R.x(wtVar.R, wtVar.e));
                        }
                    } else if (alX.ON_STOP.equals(alx)) {
                        d.this.e.remove(this.f1022R);
                    } else if (alX.ON_DESTROY.equals(alx)) {
                        d.this.O(this.f1022R);
                    }
                }
            };
            d4.R.R(activityResultRegistry$1);
            d4.f73R.add(activityResultRegistry$1);
            this.c.put(str, d4);
            return new Ks(this, str, mjg, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + pm2 + " is attempting to register while current state is " + m4i.f5900R + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final Ks e(String str, mjG mjg, ieQ ieq) {
        X(str);
        this.e.put(str, new Nd(ieq, mjg));
        if (this.X.containsKey(str)) {
            Object obj = this.X.get(str);
            this.X.remove(str);
            ieq.R(obj);
        }
        wt wtVar = (wt) this.R.getParcelable(str);
        if (wtVar != null) {
            this.R.remove(str);
            ieq.R(mjg.x(wtVar.R, wtVar.e));
        }
        return new Ks(this, str, mjg, 1);
    }

    public abstract void v(int i, mjG mjg);
}
