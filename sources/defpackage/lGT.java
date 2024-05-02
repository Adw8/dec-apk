package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.platform.h;
import java.util.LinkedHashMap;

/* renamed from: lGT  reason: default package */
/* loaded from: classes.dex */
public final class lGT {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final fue f5637R;

    /* renamed from: R  reason: collision with other field name */
    public hYA f5638R;

    /* renamed from: R  reason: collision with other field name */
    public j5I f5639R;
    public int c;
    public int v;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f5641R = new LinkedHashMap();

    /* renamed from: v  reason: collision with other field name */
    public final LinkedHashMap f5643v = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final c2J f5635R = new c2J(this);

    /* renamed from: c  reason: collision with other field name */
    public final LinkedHashMap f5642c = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final dMX f5636R = new dMX();

    /* renamed from: R  reason: collision with other field name */
    public final String f5640R = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public lGT(fue fue, j5I j5i) {
        this.f5637R = fue;
        this.f5639R = j5i;
    }

    public final void R(int i) {
        this.v = 0;
        int size = (this.f5637R.U().size() - this.c) - 1;
        if (i <= size) {
            this.f5636R.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.f5636R.R.add(((oxg) this.f5641R.get((fue) this.f5637R.U().get(i2))).f7039R);
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            this.f5639R.c(this.f5636R);
            while (size >= i) {
                fue fue = (fue) this.f5637R.U().get(size);
                oxg oxg = (oxg) this.f5641R.get(fue);
                Object obj = oxg.f7039R;
                if (this.f5636R.contains(obj)) {
                    fue.x = 3;
                    this.v++;
                    oxg.f7040R.R(Boolean.FALSE);
                } else {
                    fue fue2 = this.f5637R;
                    fue2.c = true;
                    this.f5641R.remove(fue);
                    fJK fjk = oxg.R;
                    if (fjk != null) {
                        fjk.R();
                    }
                    this.f5637R.S(size, 1);
                    fue2.c = false;
                }
                this.f5643v.remove(obj);
                size--;
            }
        }
        v();
    }

    /* JADX INFO: finally extract failed */
    public final void c(fue fue, Object obj, iv7 iv7) {
        LinkedHashMap linkedHashMap = this.f5641R;
        Object obj2 = linkedHashMap.get(fue);
        if (obj2 == null) {
            obj2 = new oxg(obj, am8.R);
            linkedHashMap.put(fue, obj2);
        }
        oxg oxg = (oxg) obj2;
        fJK fjk = oxg.R;
        boolean X = fjk != null ? fjk.X() : true;
        if (oxg.f7038R != iv7 || X || oxg.f7041R) {
            oxg.f7038R = iv7;
            dR6 c = ift.c();
            try {
                dR6 m = c.m();
                fue fue2 = this.f5637R;
                fue2.c = true;
                iv7 iv72 = oxg.f7038R;
                fJK fjk2 = oxg.R;
                hYA hya = this.f5638R;
                if (hya != null) {
                    dNH u = aH9.u(new azM(oxg, 9, iv72), true, -34810602);
                    if (fjk2 == null || fjk2.c()) {
                        ViewGroup.LayoutParams layoutParams = h.R;
                        hdZ hdz = new hdZ(fue);
                        Object obj3 = aEl.R;
                        fjk2 = new hAe(hya, hdz);
                    }
                    fjk2.v(u);
                    oxg.R = fjk2;
                    fue2.c = false;
                    dR6.P(m);
                    c.c();
                    oxg.f7041R = false;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            } catch (Throwable th) {
                c.c();
                throw th;
            }
        }
    }

    public final fue e(Object obj) {
        int i;
        if (this.v == 0) {
            return null;
        }
        int size = this.f5637R.U().size() - this.c;
        int i2 = size - this.v;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (n3x.v(((oxg) this.f5641R.get((fue) this.f5637R.U().get(i4))).f7039R, obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                oxg oxg = (oxg) this.f5641R.get((fue) this.f5637R.U().get(i3));
                if (this.f5639R.Z(obj, oxg.f7039R)) {
                    oxg.f7039R = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            fue fue = this.f5637R;
            fue.c = true;
            fue.u(i4, i2, 1);
            fue.c = false;
        }
        this.v--;
        fue fue2 = (fue) this.f5637R.U().get(i2);
        oxg oxg2 = (oxg) this.f5641R.get(fue2);
        oxg2.f7040R.R(Boolean.TRUE);
        oxg2.f7041R = true;
        ift.H();
        return fue2;
    }

    public final void v() {
        boolean z = true;
        if (this.f5641R.size() == this.f5637R.U().size()) {
            if ((this.f5637R.U().size() - this.v) - this.c >= 0) {
                if (this.f5642c.size() != this.c) {
                    z = false;
                }
                if (!z) {
                    StringBuilder U = opT.U("Incorrect state. Precomposed children ");
                    U.append(this.c);
                    U.append(". Map size ");
                    U.append(this.f5642c.size());
                    throw new IllegalArgumentException(U.toString().toString());
                }
                return;
            }
            StringBuilder U2 = opT.U("Incorrect state. Total children ");
            U2.append(this.f5637R.U().size());
            U2.append(". Reusable children ");
            U2.append(this.v);
            U2.append(". Precomposed children ");
            U2.append(this.c);
            throw new IllegalArgumentException(U2.toString().toString());
        }
        StringBuilder U3 = opT.U("Inconsistency between the count of nodes tracked by the state (");
        U3.append(this.f5641R.size());
        U3.append(") and the children count on the SubcomposeLayout (");
        U3.append(this.f5637R.U().size());
        U3.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
        throw new IllegalArgumentException(U3.toString().toString());
    }
}
