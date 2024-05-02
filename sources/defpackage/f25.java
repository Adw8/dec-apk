package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f25  reason: default package */
/* loaded from: classes.dex */
public final class f25 extends e9E implements Iterable, dsi {
    public static final /* synthetic */ int L = 0;
    public int O;
    public String X;
    public String e;
    public final eSi v = new eSi();

    public f25(jFk jfk) {
        super(jfk);
    }

    @Override // defpackage.e9E
    public final jzp P(CV cv) {
        jzp P = super.P(cv);
        ArrayList arrayList = new ArrayList();
        oV5 ov5 = new oV5(this);
        while (ov5.hasNext()) {
            jzp P2 = ((e9E) ov5.next()).P(cv);
            if (P2 != null) {
                arrayList.add(P2);
            }
        }
        return (jzp) dF.vr(P7.B(new jzp[]{P, (jzp) dF.vr(arrayList)}));
    }

    public final e9E V(int i, boolean z) {
        f25 f25;
        e9E e9e = (e9E) this.v.L(i, null);
        if (e9e != null) {
            return e9e;
        }
        if (!z || (f25 = ((e9E) this).f2984R) == null) {
            return null;
        }
        return f25.V(i, true);
    }

    @Override // defpackage.e9E
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f25)) {
            return false;
        }
        ArrayList D = iOY.D(a6.G(new o7s(0, this.v)));
        f25 f25 = (f25) obj;
        o7s o7s = new o7s(0, f25.v);
        while (o7s.hasNext()) {
            D.remove((e9E) o7s.next());
        }
        return super.equals(obj) && this.v.m() == f25.v.m() && this.O == f25.O && D.isEmpty();
    }

    @Override // defpackage.e9E
    public final int hashCode() {
        int i = this.O;
        eSi esi = this.v;
        int m = esi.m();
        for (int i2 = 0; i2 < m; i2++) {
            if (esi.f3102R) {
                esi.O();
            }
            i = (((i * 31) + esi.f3103R[i2]) * 31) + ((e9E) esi.x(i2)).hashCode();
        }
        return i;
    }

    public final void i(e9E e9e) {
        int i = e9e.e;
        String str = e9e.c;
        boolean z = false;
        if ((i == 0 && str == null) ? false : true) {
            String str2 = this.c;
            if (str2 == null || (!n3x.v(str, str2))) {
                if (i != super.e) {
                    e9E e9e2 = (e9E) this.v.L(i, null);
                    if (e9e2 != e9e) {
                        if (e9e.f2984R == null) {
                            z = true;
                        }
                        if (z) {
                            if (e9e2 != null) {
                                e9e2.f2984R = null;
                            }
                            e9e.f2984R = this;
                            this.v.Z(e9e.e, e9e);
                            return;
                        }
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(("Destination " + e9e + " cannot have the same id as graph " + this).toString());
            }
            throw new IllegalArgumentException(("Destination " + e9e + " cannot have the same route as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new oV5(this);
    }

    public final e9E o(String str, boolean z) {
        f25 f25;
        e9E e9e = (e9E) this.v.L(aYa.x(str).hashCode(), null);
        if (e9e != null) {
            return e9e;
        }
        if (!z || (f25 = ((e9E) this).f2984R) == null) {
            return null;
        }
        if (!(str == null || iH_.r(str))) {
            return f25.o(str, true);
        }
        return null;
    }

    @Override // defpackage.e9E
    public final void t(Context context, AttributeSet attributeSet) {
        super.t(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, dgk.f2819O);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != super.e) {
            if (this.X != null) {
                this.O = 0;
                this.X = null;
            }
            this.O = resourceId;
            this.e = null;
            this.e = aYa.H(context, resourceId);
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
    }

    @Override // defpackage.e9E
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.X;
        e9E o = !(str == null || iH_.r(str)) ? o(str, true) : null;
        if (o == null) {
            o = V(this.O, true);
        }
        sb.append(" startDestination=");
        if (o == null) {
            String str2 = this.X;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.e;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    StringBuilder U = opT.U("0x");
                    U.append(Integer.toHexString(this.O));
                    sb.append(U.toString());
                }
            }
        } else {
            sb.append("{");
            sb.append(o.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
