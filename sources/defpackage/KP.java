package defpackage;

import android.util.Log;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: KP  reason: default package */
/* loaded from: classes.dex */
public final class KP implements mzq {
    public int L;
    public int O;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final hAW f248R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f249R;

    /* renamed from: R  reason: collision with other field name */
    public String f250R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f251R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f252R;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f253X;
    public int Z;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public ArrayList f254c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f255c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f256e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public CharSequence f257v;

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f258v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f259v;

    public KP(hAW haw) {
        haw.A();
        eAj eaj = haw.f4113R;
        if (eaj != null) {
            eaj.f3004R.getClassLoader();
        }
        this.f251R = new ArrayList();
        this.f259v = true;
        this.f255c = false;
        this.Z = -1;
        this.f253X = false;
        this.f248R = haw;
    }

    public final void L(pm2 pm2) {
        hAW haw;
        if (pm2 == null || (haw = pm2.f7234R) == null || haw == this.f248R) {
            v(new dJb(8, pm2));
            return;
        }
        StringBuilder U = opT.U("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        U.append(pm2.toString());
        U.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(U.toString());
    }

    public final void O(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f250R);
            printWriter.print(" mIndex=");
            printWriter.print(this.Z);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f256e);
            if (this.X != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.X));
            }
            if (!(this.R == 0 && this.v == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.R));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.v));
            }
            if (!(this.c == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.c));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.O == 0 && this.f249R == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.O));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f249R);
            }
            if (!(this.L == 0 && this.f257v == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.L));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f257v);
            }
        }
        if (!this.f251R.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f251R.size();
            for (int i = 0; i < size; i++) {
                dJb djb = (dJb) this.f251R.get(i);
                switch (djb.R) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case VmNativeCallback.$stable /* 8 */:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder U = opT.U("cmd=");
                        U.append(djb.R);
                        str2 = U.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(djb.f2560R);
                if (z) {
                    if (!(djb.v == 0 && djb.c == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(djb.v));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(djb.c));
                    }
                    if (djb.e != 0 || djb.X != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(djb.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(djb.X));
                    }
                }
            }
        }
    }

    @Override // defpackage.mzq
    public final boolean R(ArrayList arrayList, ArrayList arrayList2) {
        if (hAW.W(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f252R) {
            return true;
        }
        hAW haw = this.f248R;
        if (haw.f4136v == null) {
            haw.f4136v = new ArrayList();
        }
        haw.f4136v.add(this);
        return true;
    }

    public final void X(int i, pm2 pm2, String str, int i2) {
        String str2 = pm2.f7250e;
        if (str2 != null) {
            kSM ksm = gju.R;
            gju.v(new khS(pm2, str2));
            gju.R(pm2).getClass();
            ovv ovv = ovv.DETECT_FRAGMENT_REUSE;
            if (ovv instanceof Void) {
                Void r0 = (Void) ovv;
            }
        }
        Class<?> cls = pm2.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder U = opT.U("Fragment ");
            U.append(cls.getCanonicalName());
            U.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(U.toString());
        }
        if (str != null) {
            String str3 = pm2.f7248c;
            if (str3 == null || str.equals(str3)) {
                pm2.f7248c = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + pm2 + ": was " + pm2.f7248c + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = pm2.L;
                if (i3 == 0 || i3 == i) {
                    pm2.L = i;
                    pm2.Z = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + pm2 + ": was " + pm2.L + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + pm2 + " with tag " + str + " to container view with no id");
            }
        }
        v(new dJb(i2, pm2));
        pm2.f7234R = this.f248R;
    }

    public final void c(int i) {
        if (this.f252R) {
            if (hAW.W(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f251R.size();
            for (int i2 = 0; i2 < size; i2++) {
                dJb djb = (dJb) this.f251R.get(i2);
                pm2 pm2 = djb.f2560R;
                if (pm2 != null) {
                    pm2.O += i;
                    if (hAW.W(2)) {
                        StringBuilder U = opT.U("Bump nesting of ");
                        U.append(djb.f2560R);
                        U.append(" to ");
                        U.append(djb.f2560R.O);
                        Log.v("FragmentManager", U.toString());
                    }
                }
            }
        }
    }

    public final int e(boolean z) {
        if (!this.f256e) {
            if (hAW.W(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new ect());
                O("  ", printWriter, true);
                printWriter.close();
            }
            this.f256e = true;
            if (this.f252R) {
                this.Z = this.f248R.f4121R.getAndIncrement();
            } else {
                this.Z = -1;
            }
            this.f248R.o(this, z);
            return this.Z;
        }
        throw new IllegalStateException("commit already called");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.Z >= 0) {
            sb.append(" #");
            sb.append(this.Z);
        }
        if (this.f250R != null) {
            sb.append(" ");
            sb.append(this.f250R);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void v(dJb djb) {
        this.f251R.add(djb);
        djb.v = this.R;
        djb.c = this.v;
        djb.e = this.c;
        djb.X = this.e;
    }

    public KP(KP kp) {
        kp.f248R.A();
        eAj eaj = kp.f248R.f4113R;
        if (eaj != null) {
            eaj.f3004R.getClassLoader();
        }
        this.f251R = new ArrayList();
        this.f259v = true;
        this.f255c = false;
        Iterator it = kp.f251R.iterator();
        while (it.hasNext()) {
            this.f251R.add(new dJb((dJb) it.next()));
        }
        this.R = kp.R;
        this.v = kp.v;
        this.c = kp.c;
        this.e = kp.e;
        this.X = kp.X;
        this.f252R = kp.f252R;
        this.f259v = kp.f259v;
        this.f250R = kp.f250R;
        this.L = kp.L;
        this.f257v = kp.f257v;
        this.O = kp.O;
        this.f249R = kp.f249R;
        if (kp.f258v != null) {
            ArrayList arrayList = new ArrayList();
            this.f258v = arrayList;
            arrayList.addAll(kp.f258v);
        }
        if (kp.f254c != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f254c = arrayList2;
            arrayList2.addAll(kp.f254c);
        }
        this.f255c = kp.f255c;
        this.Z = -1;
        this.f253X = false;
        this.f248R = kp.f248R;
        this.f256e = kp.f256e;
        this.Z = kp.Z;
        this.f253X = kp.f253X;
    }
}
