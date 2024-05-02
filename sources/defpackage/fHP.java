package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fHP  reason: default package */
/* loaded from: classes.dex */
public final class fHP {
    public static int e;
    public int R;
    public int v;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f3371R = new ArrayList();

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f3372v = null;
    public int c = -1;

    public fHP(int i) {
        int i2 = e;
        e = i2 + 1;
        this.R = i2;
        this.v = i;
    }

    public final boolean R(kwo kwo) {
        if (this.f3371R.contains(kwo)) {
            return false;
        }
        this.f3371R.add(kwo);
        return true;
    }

    public final int c(fhh fhh, int i) {
        int i2;
        int i3;
        if (this.f3371R.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.f3371R;
        m_b m_b = (m_b) ((kwo) arrayList.get(0)).f5495R;
        fhh.i();
        m_b.v(fhh, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((kwo) arrayList.get(i4)).v(fhh, false);
        }
        if (i == 0 && m_b.Q > 0) {
            iTI.v(m_b, fhh, arrayList, 0);
        }
        if (i == 1 && m_b.A > 0) {
            iTI.v(m_b, fhh, arrayList, 1);
        }
        try {
            fhh.j();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f3372v = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.f3372v.add(new kQB(this, (kwo) arrayList.get(i5), fhh, i));
        }
        if (i == 0) {
            i3 = fhh.N(((kwo) m_b).f5491R);
            i2 = fhh.N(((kwo) m_b).f5508c);
            fhh.i();
        } else {
            i3 = fhh.N(((kwo) m_b).f5516v);
            i2 = fhh.N(((kwo) m_b).f5512e);
            fhh.i();
        }
        return i2 - i3;
    }

    public final void e(int i, fHP fhp) {
        Iterator it = this.f3371R.iterator();
        while (it.hasNext()) {
            kwo kwo = (kwo) it.next();
            fhp.R(kwo);
            if (i == 0) {
                kwo.h = fhp.R;
            } else {
                kwo.I = fhp.R;
            }
        }
        this.c = fhp.R;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.v;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String j = jQ.j(sb, this.R, "] <");
        Iterator it = this.f3371R.iterator();
        while (it.hasNext()) {
            StringBuilder t = jQ.t(j, " ");
            t.append(((kwo) it.next()).f5517v);
            j = t.toString();
        }
        return opT.H(j, " >");
    }

    public final void v(ArrayList arrayList) {
        int size = this.f3371R.size();
        if (this.c != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                fHP fhp = (fHP) arrayList.get(i);
                if (this.c == fhp.R) {
                    e(this.v, fhp);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
