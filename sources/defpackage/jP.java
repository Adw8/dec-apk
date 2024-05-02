package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: jP  reason: default package */
/* loaded from: classes.dex */
public final class jP {

    /* renamed from: R  reason: collision with other field name */
    public final h9q f4919R;

    /* renamed from: R  reason: collision with other field name */
    public mRM f4921R = new mRM(30, 1);

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f4920R = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final qy f4922R = new qy(2, this);

    public jP(h9q h9q) {
        this.f4919R = h9q;
    }

    public final int C(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.v.size() - 1; size >= 0; size--) {
            uz uzVar = (uz) this.v.get(size);
            int i5 = uzVar.R;
            if (i5 == 8) {
                int i6 = uzVar.v;
                int i7 = uzVar.c;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            uzVar.v = i6 + 1;
                            uzVar.c = i7 + 1;
                        } else if (i2 == 2) {
                            uzVar.v = i6 - 1;
                            uzVar.c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        uzVar.c = i7 + 1;
                    } else if (i2 == 2) {
                        uzVar.c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        uzVar.v = i6 + 1;
                    } else if (i2 == 2) {
                        uzVar.v = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = uzVar.v;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= uzVar.c;
                    } else if (i5 == 2) {
                        i += uzVar.c;
                    }
                } else if (i2 == 1) {
                    uzVar.v = i8 + 1;
                } else if (i2 == 2) {
                    uzVar.v = i8 - 1;
                }
            }
        }
        for (int size2 = this.v.size() - 1; size2 >= 0; size2--) {
            uz uzVar2 = (uz) this.v.get(size2);
            if (uzVar2.R == 8) {
                int i9 = uzVar2.c;
                if (i9 == uzVar2.v || i9 < 0) {
                    this.v.remove(size2);
                    H(uzVar2);
                }
            } else if (uzVar2.c <= 0) {
                this.v.remove(size2);
                H(uzVar2);
            }
        }
        return i;
    }

    public final void H(uz uzVar) {
        uzVar.f7429R = null;
        this.f4921R.v(uzVar);
    }

    public final boolean L() {
        return this.f4920R.size() > 0;
    }

    public final int O(int i, int i2) {
        int size = this.v.size();
        while (i2 < size) {
            uz uzVar = (uz) this.v.get(i2);
            int i3 = uzVar.R;
            if (i3 == 8) {
                int i4 = uzVar.v;
                if (i4 == i) {
                    i = uzVar.c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (uzVar.c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = uzVar.v;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = uzVar.c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += uzVar.c;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean R(int i) {
        int size = this.v.size();
        for (int i2 = 0; i2 < size; i2++) {
            uz uzVar = (uz) this.v.get(i2);
            int i3 = uzVar.R;
            if (i3 == 8) {
                if (O(uzVar.c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = uzVar.v;
                int i5 = uzVar.c + i4;
                while (i4 < i5) {
                    if (O(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void U(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            H((uz) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final void X(uz uzVar, int i) {
        this.f4919R.R(uzVar);
        int i2 = uzVar.R;
        if (i2 == 2) {
            h9q h9q = this.f4919R;
            int i3 = uzVar.c;
            h9q.R.p(i, i3, true);
            RecyclerView recyclerView = h9q.R;
            recyclerView.f1407U = true;
            recyclerView.f1385R.c += i3;
        } else if (i2 == 4) {
            this.f4919R.e(i, uzVar.c, uzVar.f7429R);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final uz Z(Object obj, int i, int i2, int i3) {
        uz uzVar = (uz) this.f4921R.R();
        if (uzVar == null) {
            return new uz(obj, i, i2, i3);
        }
        uzVar.R = i;
        uzVar.v = i2;
        uzVar.c = i3;
        uzVar.f7429R = obj;
        return uzVar;
    }

    public final void c() {
        v();
        int size = this.f4920R.size();
        for (int i = 0; i < size; i++) {
            uz uzVar = (uz) this.f4920R.get(i);
            int i2 = uzVar.R;
            if (i2 == 1) {
                this.f4919R.R(uzVar);
                this.f4919R.X(uzVar.v, uzVar.c);
            } else if (i2 == 2) {
                this.f4919R.R(uzVar);
                h9q h9q = this.f4919R;
                int i3 = uzVar.v;
                int i4 = uzVar.c;
                h9q.R.p(i3, i4, true);
                RecyclerView recyclerView = h9q.R;
                recyclerView.f1407U = true;
                recyclerView.f1385R.c += i4;
            } else if (i2 == 4) {
                this.f4919R.R(uzVar);
                this.f4919R.e(uzVar.v, uzVar.c, uzVar.f7429R);
            } else if (i2 == 8) {
                this.f4919R.R(uzVar);
                this.f4919R.O(uzVar.v, uzVar.c);
            }
        }
        U(this.f4920R);
        this.R = 0;
    }

    public final void e(uz uzVar) {
        int i;
        int i2 = uzVar.R;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int C = C(uzVar.v, i2);
        int i3 = uzVar.v;
        int i4 = uzVar.R;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + uzVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < uzVar.c; i6++) {
            int C2 = C((i * i6) + uzVar.v, uzVar.R);
            int i7 = uzVar.R;
            if (i7 == 2 ? C2 == C : i7 == 4 && C2 == C + 1) {
                i5++;
            } else {
                uz Z = Z(uzVar.f7429R, i7, C, i5);
                X(Z, i3);
                H(Z);
                if (uzVar.R == 4) {
                    i3 += i5;
                }
                i5 = 1;
                C = C2;
            }
        }
        Object obj = uzVar.f7429R;
        H(uzVar);
        if (i5 > 0) {
            uz Z2 = Z(obj, uzVar.R, C, i5);
            X(Z2, i3);
            H(Z2);
        }
    }

    public final void m(uz uzVar) {
        this.v.add(uzVar);
        int i = uzVar.R;
        if (i == 1) {
            this.f4919R.X(uzVar.v, uzVar.c);
        } else if (i == 2) {
            h9q h9q = this.f4919R;
            h9q.R.p(uzVar.v, uzVar.c, false);
            h9q.R.f1407U = true;
        } else if (i == 4) {
            this.f4919R.e(uzVar.v, uzVar.c, uzVar.f7429R);
        } else if (i == 8) {
            this.f4919R.O(uzVar.v, uzVar.c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + uzVar);
        }
    }

    public final void v() {
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            this.f4919R.R((uz) this.v.get(i));
        }
        U(this.v);
        this.R = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x00a3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x00d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0126 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0117 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
        // Method dump skipped, instructions count: 668
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jP.x():void");
    }
}
