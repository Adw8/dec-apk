package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: iP5  reason: default package */
/* loaded from: classes.dex */
public final class iP5 {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public aLq f4580R;

    /* renamed from: R  reason: collision with other field name */
    public iP5 f4581R;

    /* renamed from: R  reason: collision with other field name */
    public final icY f4582R;

    /* renamed from: R  reason: collision with other field name */
    public final kwo f4584R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4585R;

    /* renamed from: R  reason: collision with other field name */
    public HashSet f4583R = null;
    public int v = 0;
    public int c = Integer.MIN_VALUE;

    public iP5(kwo kwo, icY icy) {
        this.f4584R = kwo;
        this.f4582R = icy;
    }

    public final void L() {
        HashSet hashSet;
        iP5 ip5 = this.f4581R;
        if (!(ip5 == null || (hashSet = ip5.f4583R) == null)) {
            hashSet.remove(this);
            if (this.f4581R.f4583R.size() == 0) {
                this.f4581R.f4583R = null;
            }
        }
        this.f4583R = null;
        this.f4581R = null;
        this.v = 0;
        this.c = Integer.MIN_VALUE;
        this.f4585R = false;
        this.R = 0;
    }

    public final boolean O() {
        return this.f4581R != null;
    }

    public final void R(iP5 ip5, int i, int i2) {
        if (ip5 == null) {
            L();
            return;
        }
        this.f4581R = ip5;
        if (ip5.f4583R == null) {
            ip5.f4583R = new HashSet();
        }
        HashSet hashSet = this.f4581R.f4583R;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.v = i;
        this.c = i2;
    }

    public final boolean X() {
        iP5 ip5;
        HashSet hashSet = this.f4583R;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            iP5 ip52 = (iP5) it.next();
            switch (ip52.f4582R.ordinal()) {
                case 0:
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                case 6:
                case 7:
                case VmNativeCallback.$stable:
                    ip5 = null;
                    break;
                case 1:
                    ip5 = ip52.f4584R.f5508c;
                    break;
                case 2:
                    ip5 = ip52.f4584R.f5512e;
                    break;
                case 3:
                    ip5 = ip52.f4584R.f5491R;
                    break;
                case 4:
                    ip5 = ip52.f4584R.f5516v;
                    break;
                default:
                    throw new AssertionError(ip52.f4582R.name());
            }
            if (ip5.O()) {
                return true;
            }
        }
        return false;
    }

    public final void Z() {
        aLq alq = this.f4580R;
        if (alq == null) {
            this.f4580R = new aLq(1);
        } else {
            alq.c();
        }
    }

    public final int c() {
        if (!this.f4585R) {
            return 0;
        }
        return this.R;
    }

    public final int e() {
        iP5 ip5;
        if (this.f4584R.K == 8) {
            return 0;
        }
        int i = this.c;
        return (i == Integer.MIN_VALUE || (ip5 = this.f4581R) == null || ip5.f4584R.K != 8) ? this.v : i;
    }

    public final void m(int i) {
        this.R = i;
        this.f4585R = true;
    }

    public final String toString() {
        return this.f4584R.f5517v + ":" + this.f4582R.toString();
    }

    public final void v(int i, fHP fhp, ArrayList arrayList) {
        HashSet hashSet = this.f4583R;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                gQc.h(((iP5) it.next()).f4584R, i, arrayList, fhp);
            }
        }
    }
}
