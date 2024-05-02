package defpackage;

import java.util.HashMap;
import java.util.Set;

/* renamed from: nog  reason: default package */
/* loaded from: classes.dex */
public final class nog {

    /* renamed from: R  reason: collision with other field name */
    public eJ5 f6594R;

    /* renamed from: R  reason: collision with other field name */
    public Object f6595R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f6597R;
    public int v;
    public int R = -1;

    /* renamed from: R  reason: collision with other field name */
    public final lmG f6599R = new lmG();

    /* renamed from: R  reason: collision with other field name */
    public final mAv f6600R = new mAv(0);

    /* renamed from: R  reason: collision with other field name */
    public final kyQ f6598R = new kyQ();

    /* renamed from: R  reason: collision with other field name */
    public final pmk f6601R = new pmk(this, 0);

    /* renamed from: v  reason: collision with other field name */
    public final pmk f6603v = new pmk(this, 1);

    /* renamed from: v  reason: collision with other field name */
    public final lmG f6602v = new lmG();

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f6596R = new HashMap();

    public nog(kg9 kg9) {
        this.f6597R = kg9;
    }

    public static final void R(nog nog, Object obj) {
        eJ5 ej5 = nog.f6594R;
        if (ej5 != null) {
            int i = ej5.R;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj2 = ej5.f3050R[i3];
                int i4 = ej5.f3049R[i3];
                boolean z = i4 != nog.R;
                if (z) {
                    nog.f6599R.X(obj2, obj);
                    if ((obj2 instanceof gHm) && !nog.f6599R.c(obj2)) {
                        nog.f6602v.O(obj2);
                        nog.f6596R.remove(obj2);
                    }
                }
                if (!z) {
                    if (i2 != i3) {
                        ej5.f3050R[i2] = obj2;
                        ej5.f3049R[i2] = i4;
                    }
                    i2++;
                }
            }
            int i5 = ej5.R;
            for (int i6 = i2; i6 < i5; i6++) {
                ej5.f3050R[i6] = null;
            }
            ej5.R = i2;
        }
    }

    public final void c(Object obj) {
        if (this.v <= 0) {
            Object obj2 = this.f6595R;
            eJ5 ej5 = this.f6594R;
            if (ej5 == null) {
                ej5 = new eJ5();
                this.f6594R = ej5;
                this.f6600R.m(obj2, ej5);
            }
            int R = ej5.R(this.R, obj);
            if ((obj instanceof gHm) && R != this.R) {
                gHm ghm = (gHm) obj;
                Object[] X = ghm.X();
                for (Object obj3 : X) {
                    if (obj3 == null) {
                        break;
                    }
                    this.f6602v.R(obj3, obj);
                }
                this.f6596R.put(obj, ghm.e());
            }
            if (R == -1) {
                this.f6599R.R(obj, obj2);
            }
        }
    }

    public final void e() {
        lBz lbz = lBz.m;
        mAv mav = this.f6600R;
        int i = mav.R;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = ((Object[]) mav.f5962R)[i3];
            eJ5 ej5 = (eJ5) ((Object[]) mav.v)[i3];
            Boolean bool = (Boolean) lbz.x(obj);
            if (bool.booleanValue()) {
                int i4 = ej5.R;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj2 = ej5.f3050R[i5];
                    int i6 = ej5.f3049R[i5];
                    this.f6599R.X(obj2, obj);
                    if ((obj2 instanceof gHm) && !this.f6599R.c(obj2)) {
                        this.f6602v.O(obj2);
                        this.f6596R.remove(obj2);
                    }
                }
            }
            if (!bool.booleanValue()) {
                if (i2 != i3) {
                    ((Object[]) mav.f5962R)[i2] = obj;
                    Object[] objArr = (Object[]) mav.v;
                    objArr[i2] = objArr[i3];
                }
                i2++;
            }
        }
        int i7 = mav.R;
        if (i7 > i2) {
            for (int i8 = i2; i8 < i7; i8++) {
                ((Object[]) mav.f5962R)[i8] = null;
                ((Object[]) mav.v)[i8] = null;
            }
            mav.R = i2;
        }
    }

    public final boolean v(Set set) {
        lmG lmg;
        int e;
        lmG lmg2;
        int e2;
        boolean z = false;
        for (Object obj : set) {
            if (this.f6602v.c(obj) && (e = (lmg = this.f6602v).e(obj)) >= 0) {
                kyQ L = lmg.L(e);
                int i = L.e;
                for (int i2 = 0; i2 < i; i2++) {
                    gHm ghm = (gHm) L.R[i2];
                    if (!n3x.v(ghm.e(), this.f6596R.get(ghm)) && (e2 = (lmg2 = this.f6599R).e(ghm)) >= 0) {
                        kyQ L2 = lmg2.L(e2);
                        int i3 = L2.e;
                        int i4 = 0;
                        while (i4 < i3) {
                            this.f6598R.add(L2.R[i4]);
                            i4++;
                            z = true;
                        }
                    }
                }
            }
            lmG lmg3 = this.f6599R;
            int e3 = lmg3.e(obj);
            if (e3 >= 0) {
                kyQ L3 = lmg3.L(e3);
                int i5 = L3.e;
                int i6 = 0;
                while (i6 < i5) {
                    this.f6598R.add(L3.R[i6]);
                    i6++;
                    z = true;
                }
            }
        }
        return z;
    }
}
