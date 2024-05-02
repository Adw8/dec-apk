package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.d;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: piu  reason: default package */
/* loaded from: classes.dex */
public final class piu implements kH, pkd {
    public static piu R;
    public static piu v;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ int f7201R;

    /* renamed from: R  reason: collision with other field name */
    public Object f7202R;
    public Object c;
    public Object e;

    /* renamed from: v  reason: collision with other field name */
    public Object f7203v;

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ piu(fMX fmx, dYv dyv, int i) {
        this(fmx, dyv);
        this.f7201R = 13;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ piu(fMX fmx, dYv dyv, ktS kts, int i) {
        this(fmx, dyv, kts);
        this.f7201R = 12;
    }

    public piu(nhY nhy, Signature signature, wa waVar) {
        this.f7201R = 15;
        this.e = nhy;
        this.f7203v = signature;
        this.c = waVar;
        this.f7202R = new gB5(signature);
    }

    public static synchronized piu g(Context context, CV cv) {
        piu piu;
        synchronized (piu.class) {
            if (R == null) {
                R = new piu(context, cv);
            }
            piu = R;
        }
        return piu;
    }

    public final fE3 C(UF uf) {
        int size = ((ArrayList) this.c).size();
        for (int i = 0; i < size; i++) {
            fE3 fe3 = (fE3) ((ArrayList) this.c).get(i);
            if (fe3 != null && fe3.R == uf) {
                return fe3;
            }
        }
        fE3 fe32 = new fE3((Context) this.f7203v, uf);
        ((ArrayList) this.c).add(fe32);
        return fe32;
    }

    public final pm2 H(String str) {
        d dVar = (d) ((HashMap) this.f7203v).get(str);
        if (dVar != null) {
            return dVar.f1318R;
        }
        return null;
    }

    public final void J(jlw jlw) {
        c1f c1f = new c1f(jlw.R, jlw.v);
        if (((Map) this.c).containsKey(c1f)) {
            jlw jlw2 = (jlw) ((Map) this.c).get(c1f);
            if (!jlw2.equals(jlw) || !jlw.equals(jlw2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c1f);
            }
            return;
        }
        ((Map) this.c).put(c1f, jlw);
    }

    public final void K(aS_ as_) {
        jj1 jj1 = new jj1(as_.R, as_.f891R);
        if (((Map) this.e).containsKey(jj1)) {
            aS_ as_2 = (aS_) ((Map) this.e).get(jj1);
            if (!as_2.equals(as_) || !as_.equals(as_2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + jj1);
            }
            return;
        }
        ((Map) this.e).put(jj1, as_);
    }

    public final void L() {
        ((HashMap) this.f7203v).values().removeAll(Collections.singleton(null));
    }

    public final ArrayList N() {
        ArrayList arrayList = new ArrayList();
        for (d dVar : ((HashMap) this.f7203v).values()) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public final void O(Object obj, okQ okq, boolean z) {
        dtx e3k;
        byte[] bArr;
        if (((ConcurrentMap) this.f7203v) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (okq.K() == aLF.ENABLED) {
            ConcurrentMap concurrentMap = (ConcurrentMap) this.f7203v;
            Integer num = Integer.valueOf(okq.V());
            hPF o = okq.o();
            hPF hpf = hPF.RAW;
            num = null;
            if (o == hpf) {
            }
            mzM mzm = mzM.R;
            String V = okq.i().V();
            b0 o2 = okq.i().o();
            f6h i = okq.i().i();
            hPF o3 = okq.o();
            if (o3 == hpf) {
                if (num != null) {
                    throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
                }
            } else if (num == null) {
                throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
            }
            iey iey = new iey(V, o2, i, o3, num);
            mzm.getClass();
            try {
                try {
                    e3k = mzm.R(iey);
                } catch (GeneralSecurityException unused) {
                    e3k = new e3K(iey);
                }
                int ordinal = okq.o().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            bArr = cU5.f2103R;
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(okq.V()).array();
                } else {
                    bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(okq.V()).array();
                }
                npR npr = new npR(obj, bArr, okq.K(), okq.o(), okq.V(), e3k);
                ArrayList arrayList = new ArrayList();
                arrayList.add(npr);
                owK owk = new owK(npr.R());
                List list = (List) concurrentMap.put(owk, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(npr);
                    concurrentMap.put(owk, Collections.unmodifiableList(arrayList2));
                }
                if (!z) {
                    return;
                }
                if (((npR) this.c) == null) {
                    this.c = npr;
                    return;
                }
                throw new IllegalStateException("you cannot set two primary primitives");
            } catch (GeneralSecurityException e) {
                throw new j8f("Creating a LegacyProtoKey failed", e);
            }
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    public final ArrayList P() {
        ArrayList arrayList = new ArrayList();
        for (d dVar : ((HashMap) this.f7203v).values()) {
            if (dVar != null) {
                arrayList.add(dVar.f1318R);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @Override // defpackage.kH
    public final boolean R(UF uf, lRG lrg) {
        return ((ActionMode.Callback) this.f7202R).onPrepareActionMode(C(uf), y(lrg));
    }

    public final pm2 U(String str) {
        for (d dVar : ((HashMap) this.f7203v).values()) {
            if (dVar != null) {
                pm2 pm2 = dVar.f1318R;
                if (!str.equals(pm2.f7238R)) {
                    pm2 = pm2.f7252v.f4127R.U(str);
                }
                if (pm2 != null) {
                    return pm2;
                }
            }
        }
        return null;
    }

    public final void V(oTE ote) {
        jj1 jj1 = new jj1(ote.f6830R, ote.f6831R);
        if (((Map) this.f7203v).containsKey(jj1)) {
            oTE ote2 = (oTE) ((Map) this.f7203v).get(jj1);
            if (!ote2.equals(ote) || !ote.equals(ote2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + jj1);
            }
            return;
        }
        ((Map) this.f7203v).put(jj1, ote);
    }

    public final void X(pm2 pm2) {
        if (!((ArrayList) this.f7202R).contains(pm2)) {
            synchronized (((ArrayList) this.f7202R)) {
                ((ArrayList) this.f7202R).add(pm2);
            }
            pm2.f7245R = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + pm2);
    }

    public final bzM Y(String str, bzM bzm) {
        return bzm != null ? (bzM) ((HashMap) this.c).put(str, bzm) : (bzM) ((HashMap) this.c).remove(str);
    }

    public final void Z(String str) {
        ((msD) this.f7202R).v();
        mVu R2 = ((k87) this.c).R();
        if (str == null) {
            R2.O(1);
        } else {
            R2.Z(1, str);
        }
        ((msD) this.f7202R).c();
        try {
            R2.H();
            ((msD) this.f7202R).Z();
        } finally {
            ((msD) this.f7202R).O();
            ((k87) this.c).c(R2);
        }
    }

    @Override // defpackage.kH
    public final void c(UF uf) {
        ((ActionMode.Callback) this.f7202R).onDestroyActionMode(C(uf));
    }

    @Override // defpackage.kH
    public final boolean e(UF uf, lRG lrg) {
        return ((ActionMode.Callback) this.f7202R).onCreateActionMode(C(uf), y(lrg));
    }

    public final void i(d dVar) {
        pm2 pm2 = dVar.f1318R;
        if (pm2.x) {
            ((naw) this.e).O(pm2);
        }
        if (((d) ((HashMap) this.f7203v).put(pm2.f7238R, null)) != null && hAW.W(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + pm2);
        }
    }

    public final List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f7202R).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f7202R)) {
            arrayList = new ArrayList((ArrayList) this.f7202R);
        }
        return arrayList;
    }

    public final void m() {
        ((msD) this.f7202R).v();
        mVu R2 = ((k87) this.e).R();
        ((msD) this.f7202R).c();
        try {
            R2.H();
            ((msD) this.f7202R).Z();
        } finally {
            ((msD) this.f7202R).O();
            ((k87) this.e).c(R2);
        }
    }

    public final void o(eVr evr) {
        c1f c1f = new c1f(evr.R, evr.v);
        if (((Map) this.f7202R).containsKey(c1f)) {
            eVr evr2 = (eVr) ((Map) this.f7202R).get(c1f);
            if (!evr2.equals(evr) || !evr.equals(evr2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + c1f);
            }
            return;
        }
        ((Map) this.f7202R).put(c1f, evr);
    }

    public final void t(d dVar) {
        pm2 pm2 = dVar.f1318R;
        if (!(((HashMap) this.f7203v).get(pm2.f7238R) != null)) {
            ((HashMap) this.f7203v).put(pm2.f7238R, dVar);
            if (hAW.W(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + pm2);
            }
        }
    }

    @Override // defpackage.kH
    public final boolean v(UF uf, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f7202R).onActionItemClicked(C(uf), new o5B((Context) this.f7203v, (irv) menuItem));
    }

    public final void x(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((cE0) this.f7203v).getOrDefault(obj, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        x(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final Menu y(lRG lrg) {
        Menu menu = (Menu) ((cE0) this.e).getOrDefault(lrg, null);
        if (menu != null) {
            return menu;
        }
        dES des = new dES((Context) this.f7203v, lrg);
        ((cE0) this.e).put(lrg, des);
        return des;
    }

    public piu(int i) {
        this.f7201R = i;
        if (i == 3) {
            this.f7202R = new mRM(10, 1);
            this.f7203v = new cE0();
            this.c = new ArrayList();
            this.e = new HashSet();
        } else if (i == 8) {
            this.f7202R = new Object();
            this.f7203v = new Handler(Looper.getMainLooper(), new jn7(this));
        } else if (i == 10) {
            this.f7202R = new HashMap();
            this.f7203v = new HashMap();
            this.c = new HashMap();
            this.e = new HashMap();
        } else if (i == 5) {
            this.f7202R = new ArrayList();
            this.f7203v = new HashMap();
            this.c = new HashMap();
        } else if (i != 6) {
            this.f7202R = new mRM(256, 0);
            this.f7203v = new mRM(256, 0);
            this.c = new mRM(256, 0);
            this.e = new aLq[32];
        } else {
            this.f7202R = new FK();
            this.f7203v = new SparseArray();
            this.c = new jXn();
            this.e = new FK();
        }
    }

    public piu(msD msd) {
        this.f7201R = 7;
        this.f7202R = msd;
        this.f7203v = new jAB(this, msd, 4);
        this.c = new m8B(this, msd, 0);
        this.e = new m8B(this, msd, 1);
    }

    public piu(k7d k7d) {
        this.f7201R = 10;
        this.f7202R = new HashMap(k7d.R);
        this.f7203v = new HashMap(k7d.v);
        this.c = new HashMap(k7d.c);
        this.e = new HashMap(k7d.e);
    }

    public piu(Context context, CV cv) {
        this.f7201R = 0;
        Context applicationContext = context.getApplicationContext();
        this.f7202R = new gb(applicationContext, cv);
        this.f7203v = new Ww(applicationContext, cv);
        this.c = new eyJ(applicationContext, cv);
        this.e = new aN0(applicationContext, cv);
    }

    public piu(Typeface typeface, lzo lzo) {
        this.f7201R = 4;
        this.e = typeface;
        this.f7202R = lzo;
        this.c = new e1o(1024);
        this.f7203v = new char[((lzo) this.f7202R).c() * 2];
        int c = ((lzo) this.f7202R).c();
        for (int i = 0; i < c; i++) {
            iYb iyb = new iYb(this, i);
            Character.toChars(iyb.c(), (char[]) this.f7203v, i * 2);
            gvP.x("invalid metadata codepoint length", iyb.v() > 0);
            ((e1o) this.c).R(iyb, 0, iyb.v() - 1);
        }
    }

    public piu(Context context, ActionMode.Callback callback) {
        this.f7201R = 1;
        this.f7203v = context;
        this.f7202R = callback;
        this.c = new ArrayList();
        this.e = new cE0();
    }

    public piu(Map map, Map map2, byte[] bArr, String str) {
        this.f7201R = 11;
        this.f7202R = map;
        this.f7203v = map2;
        this.c = bArr;
        this.e = str;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ piu(Class cls, int i) {
        this(cls);
        this.f7201R = 9;
    }

    public piu(fMX fmx, dYv dyv, ktS kts) {
        this.f7201R = 12;
        this.f7202R = fmx;
        this.f7203v = dyv;
        this.c = kts;
    }

    public piu(Class cls) {
        this.f7201R = 9;
        this.f7203v = new ConcurrentHashMap();
        this.f7202R = cls;
        this.e = imB.R;
    }

    public piu(fMX fmx, dYv dyv) {
        this.f7201R = 13;
        this.f7202R = fmx;
        this.f7203v = dyv;
    }
}
