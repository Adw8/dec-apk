package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: _w  reason: default package */
/* loaded from: classes.dex */
public final class _w {
    public final StringBuilder R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f710R;
    public final ArrayList c;
    public final ArrayList v;

    public _w() {
        this.R = new StringBuilder(16);
        this.f710R = new ArrayList();
        this.v = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void R(eBF ebf, int i, int i2) {
        this.f710R.add(new k3(ebf, i, i2));
    }

    public final bz c() {
        String sb = this.R.toString();
        ArrayList arrayList = this.f710R;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((k3) arrayList.get(i)).R(this.R.length()));
        }
        ArrayList arrayList3 = this.v;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList4.add(((k3) arrayList3.get(i2)).R(this.R.length()));
        }
        ArrayList arrayList5 = this.c;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList6.add(((k3) arrayList5.get(i3)).R(this.R.length()));
        }
        return new bz(sb, arrayList2, arrayList4, arrayList6);
    }

    public final void v(bz bzVar) {
        int length = this.R.length();
        this.R.append(bzVar.R);
        List list = bzVar.f1883R;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m3 m3Var = (m3) list.get(i);
            R((eBF) m3Var.f5897R, m3Var.R + length, m3Var.v + length);
        }
        List list2 = bzVar.v;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m3 m3Var2 = (m3) list2.get(i2);
            this.v.add(new k3((kne) m3Var2.f5897R, m3Var2.R + length, m3Var2.v + length));
        }
        List list3 = bzVar.c;
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            m3 m3Var3 = (m3) list3.get(i3);
            this.c.add(new k3(m3Var3.f5897R, m3Var3.R + length, m3Var3.v + length, m3Var3.f5898R));
        }
    }

    public _w(bz bzVar) {
        this();
        v(bzVar);
    }
}
