package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o7N  reason: default package */
/* loaded from: classes.dex */
public final class o7N extends k8G implements kg9 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ c2J f6675R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iUy f6676R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f6677R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f6678R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int Z;
    public final /* synthetic */ iv7 c;
    public final /* synthetic */ iv7 e;
    public final /* synthetic */ iv7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public o7N(c2J c2j, iv7 iv7, iv7 iv72, iv7 iv73, int i, int i2, iUy iuy, long j, iv7 iv74, int i3, lR3 lr3, int i4) {
        super(1);
        this.f6675R = c2j;
        this.f6677R = iv7;
        this.v = iv72;
        this.c = iv73;
        this.X = i;
        this.O = i2;
        this.f6676R = iuy;
        this.R = j;
        this.e = iv74;
        this.L = i3;
        this.f6678R = lr3;
        this.Z = i4;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        c_x c_x;
        Object obj5;
        Integer num;
        Object obj6;
        Object obj7;
        int i;
        h57 h57 = (h57) obj;
        List<pc0> R = this.f6675R.R(meI.TopBar, this.f6677R);
        long j = this.R;
        ArrayList arrayList = new ArrayList(a6.B(R, 10));
        for (pc0 pc0 : R) {
            arrayList.add(pc0.L(j));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj2 = null;
        } else {
            obj2 = it.next();
            if (it.hasNext()) {
                int i2 = ((l0f) obj2).X;
                do {
                    Object next = it.next();
                    int i3 = ((l0f) next).X;
                    if (i2 < i3) {
                        obj2 = next;
                        i2 = i3;
                    }
                } while (it.hasNext());
            }
        }
        l0f l0f = (l0f) obj2;
        int i4 = l0f != null ? l0f.X : 0;
        List<pc0> R2 = this.f6675R.R(meI.Snackbar, this.v);
        iUy iuy = this.f6676R;
        c2J c2j = this.f6675R;
        long j2 = this.R;
        ArrayList arrayList2 = new ArrayList(a6.B(R2, 10));
        for (pc0 pc02 : R2) {
            arrayList2.add(pc02.L(dtx.K((-iuy.R(c2j, c2j.f1948R)) - iuy.v(c2j, c2j.f1948R), -iuy.c(c2j), j2)));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            obj3 = null;
        } else {
            obj3 = it2.next();
            if (it2.hasNext()) {
                int i5 = ((l0f) obj3).X;
                do {
                    Object next2 = it2.next();
                    int i6 = ((l0f) next2).X;
                    if (i5 < i6) {
                        obj3 = next2;
                        i5 = i6;
                    }
                } while (it2.hasNext());
            }
        }
        l0f l0f2 = (l0f) obj3;
        int i7 = l0f2 != null ? l0f2.X : 0;
        Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            obj4 = null;
        } else {
            obj4 = it3.next();
            if (it3.hasNext()) {
                int i8 = ((l0f) obj4).e;
                do {
                    Object next3 = it3.next();
                    int i9 = ((l0f) next3).e;
                    if (i8 < i9) {
                        obj4 = next3;
                        i8 = i9;
                    }
                } while (it3.hasNext());
            }
        }
        l0f l0f3 = (l0f) obj4;
        int i10 = l0f3 != null ? l0f3.e : 0;
        List R3 = this.f6675R.R(meI.Fab, this.c);
        iUy iuy2 = this.f6676R;
        c2J c2j2 = this.f6675R;
        long j3 = this.R;
        ArrayList arrayList3 = new ArrayList();
        for (Iterator it4 = R3.iterator(); it4.hasNext(); it4 = it4) {
            l0f L = ((pc0) it4.next()).L(dtx.K((-iuy2.R(c2j2, c2j2.f1948R)) - iuy2.v(c2j2, c2j2.f1948R), -iuy2.c(c2j2), j3));
            if (!((L.X == 0 || L.e == 0) ? false : true)) {
                L = null;
            }
            if (L != null) {
                arrayList3.add(L);
            }
        }
        if (!arrayList3.isEmpty()) {
            Iterator it5 = arrayList3.iterator();
            if (!it5.hasNext()) {
                obj6 = null;
            } else {
                obj6 = it5.next();
                if (it5.hasNext()) {
                    int i11 = ((l0f) obj6).e;
                    do {
                        Object next4 = it5.next();
                        int i12 = ((l0f) next4).e;
                        if (i11 < i12) {
                            obj6 = next4;
                            i11 = i12;
                        }
                    } while (it5.hasNext());
                }
            }
            int i13 = ((l0f) obj6).e;
            Iterator it6 = arrayList3.iterator();
            if (!it6.hasNext()) {
                obj7 = null;
            } else {
                obj7 = it6.next();
                if (it6.hasNext()) {
                    int i14 = ((l0f) obj7).X;
                    do {
                        Object next5 = it6.next();
                        int i15 = ((l0f) next5).X;
                        if (i14 < i15) {
                            obj7 = next5;
                            i14 = i15;
                        }
                    } while (it6.hasNext());
                }
            }
            int i16 = ((l0f) obj7).X;
            if (this.X == 1) {
                c2J c2j3 = this.f6675R;
                i = c2j3.f1948R == mdz.Ltr ? (this.O - c2j3.B(fky.R)) - i13 : c2j3.B(fky.R);
            } else {
                i = (this.O - i13) / 2;
            }
            c_x = new c_x(i, i16);
        } else {
            c_x = null;
        }
        List<pc0> R4 = this.f6675R.R(meI.BottomBar, aH9.u(new _a(c_x, this.e, this.L, 7), true, -1455477816));
        long j4 = this.R;
        ArrayList arrayList4 = new ArrayList(a6.B(R4, 10));
        for (pc0 pc03 : R4) {
            arrayList4.add(pc03.L(j4));
        }
        Iterator it7 = arrayList4.iterator();
        if (!it7.hasNext()) {
            obj5 = null;
        } else {
            obj5 = it7.next();
            if (it7.hasNext()) {
                int i17 = ((l0f) obj5).X;
                while (true) {
                    Object next6 = it7.next();
                    int i18 = ((l0f) next6).X;
                    if (i17 < i18) {
                        obj5 = next6;
                        i17 = i18;
                    }
                    if (!it7.hasNext()) {
                        break;
                    }
                }
            }
        }
        l0f l0f4 = (l0f) obj5;
        Integer valueOf = l0f4 != null ? Integer.valueOf(l0f4.X) : null;
        if (c_x != null) {
            c2J c2j4 = this.f6675R;
            num = Integer.valueOf(valueOf == null ? this.f6676R.c(c2j4) + c2j4.B(fky.R) + c_x.X : c2j4.B(fky.R) + valueOf.intValue() + c_x.X);
        } else {
            num = null;
        }
        int intValue = i7 != 0 ? (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : this.f6676R.c(this.f6675R)) + i7 : 0;
        c2J c2j5 = this.f6675R;
        List<pc0> R5 = c2j5.R(meI.MainContent, aH9.u(new QG(this.f6676R, c2j5, arrayList, i4, arrayList4, valueOf, this.f6678R, this.L), true, 1643221465));
        long j5 = this.R;
        ArrayList arrayList5 = new ArrayList(a6.B(R5, 10));
        for (pc0 pc04 : R5) {
            arrayList5.add(pc04.L(j5));
        }
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            h57.v(h57, (l0f) it8.next(), 0, 0);
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            h57.v(h57, (l0f) it9.next(), 0, 0);
        }
        int i19 = this.O;
        iUy iuy3 = this.f6676R;
        c2J c2j6 = this.f6675R;
        int i20 = this.Z;
        Iterator it10 = arrayList2.iterator();
        while (it10.hasNext()) {
            h57.v(h57, (l0f) it10.next(), iuy3.R(c2j6, c2j6.f1948R) + ((i19 - i10) / 2), i20 - intValue);
        }
        int i21 = this.Z;
        Iterator it11 = arrayList4.iterator();
        while (it11.hasNext()) {
            h57.v(h57, (l0f) it11.next(), 0, i21 - (valueOf != null ? valueOf.intValue() : 0));
        }
        if (c_x != null) {
            int i22 = this.Z;
            Iterator it12 = arrayList3.iterator();
            while (it12.hasNext()) {
                h57.v(h57, (l0f) it12.next(), c_x.e, i22 - num.intValue());
            }
        }
        return o8s.R;
    }
}
