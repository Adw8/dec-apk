package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: bbj  reason: default package */
/* loaded from: classes.dex */
public final class bbj extends gxa {
    public static TimeInterpolator R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1757R = true;
    public ArrayList v = new ArrayList();
    public ArrayList c = new ArrayList();
    public ArrayList e = new ArrayList();
    public ArrayList X = new ArrayList();
    public ArrayList O = new ArrayList();
    public ArrayList L = new ArrayList();
    public ArrayList Z = new ArrayList();
    public ArrayList m = new ArrayList();
    public ArrayList x = new ArrayList();
    public ArrayList H = new ArrayList();
    public ArrayList U = new ArrayList();

    public static void m(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((h9X) arrayList.get(size)).f4097R.animate().cancel();
            } else {
                return;
            }
        }
    }

    public final void C(h9X h9x) {
        if (R == null) {
            R = new ValueAnimator().getInterpolator();
        }
        h9x.f4097R.animate().setInterpolator(R);
        X(h9x);
    }

    public final void H(h9X h9x, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                lh7 lh7 = (lh7) arrayList.get(size);
                if (U(lh7, h9x) && lh7.f5801R == null && lh7.f5802v == null) {
                    arrayList.remove(lh7);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.gxa
    public final boolean L() {
        return !this.c.isEmpty() || !this.X.isEmpty() || !this.e.isEmpty() || !this.v.isEmpty() || !this.x.isEmpty() || !this.H.isEmpty() || !this.m.isEmpty() || !this.U.isEmpty() || !this.L.isEmpty() || !this.O.isEmpty() || !this.Z.isEmpty();
    }

    @Override // defpackage.gxa
    public final void O() {
        int size = this.e.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            aD0 ad0 = (aD0) this.e.get(size);
            View view = ad0.f792R.f4097R;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(ad0.f792R);
            this.e.remove(size);
        }
        int size2 = this.v.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c((h9X) this.v.get(size2));
            this.v.remove(size2);
        }
        int size3 = this.c.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            h9X h9x = (h9X) this.c.get(size3);
            h9x.f4097R.setAlpha(1.0f);
            c(h9x);
            this.c.remove(size3);
        }
        int size4 = this.X.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            lh7 lh7 = (lh7) this.X.get(size4);
            h9X h9x2 = lh7.f5801R;
            if (h9x2 != null) {
                U(lh7, h9x2);
            }
            h9X h9x3 = lh7.f5802v;
            if (h9x3 != null) {
                U(lh7, h9x3);
            }
        }
        this.X.clear();
        if (L()) {
            int size5 = this.L.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = (ArrayList) this.L.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        aD0 ad02 = (aD0) arrayList.get(size6);
                        View view2 = ad02.f792R.f4097R;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(ad02.f792R);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.L.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.O.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = (ArrayList) this.O.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        h9X h9x4 = (h9X) arrayList2.get(size8);
                        h9x4.f4097R.setAlpha(1.0f);
                        c(h9x4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.O.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.Z.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = (ArrayList) this.Z.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            lh7 lh72 = (lh7) arrayList3.get(size10);
                            h9X h9x5 = lh72.f5801R;
                            if (h9x5 != null) {
                                U(lh72, h9x5);
                            }
                            h9X h9x6 = lh72.f5802v;
                            if (h9x6 != null) {
                                U(lh72, h9x6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.Z.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    m(this.H);
                    m(this.x);
                    m(this.m);
                    m(this.U);
                    e();
                    return;
                }
            }
        }
    }

    @Override // defpackage.gxa
    public final boolean R(h9X h9x, h9X h9x2, bzl bzl, bzl bzl2) {
        int i;
        int i2;
        int i3 = bzl.R;
        int i4 = bzl.v;
        if (h9x2.P()) {
            i2 = bzl.R;
            i = bzl.v;
        } else {
            i2 = bzl2.R;
            i = bzl2.v;
        }
        if (h9x == h9x2) {
            return Z(h9x, i3, i4, i2, i);
        }
        float translationX = h9x.f4097R.getTranslationX();
        float translationY = h9x.f4097R.getTranslationY();
        float alpha = h9x.f4097R.getAlpha();
        C(h9x);
        h9x.f4097R.setTranslationX(translationX);
        h9x.f4097R.setTranslationY(translationY);
        h9x.f4097R.setAlpha(alpha);
        C(h9x2);
        h9x2.f4097R.setTranslationX((float) (-((int) (((float) (i2 - i3)) - translationX))));
        h9x2.f4097R.setTranslationY((float) (-((int) (((float) (i - i4)) - translationY))));
        h9x2.f4097R.setAlpha(0.0f);
        this.X.add(new lh7(h9x, h9x2, i3, i4, i2, i));
        return true;
    }

    public final boolean U(lh7 lh7, h9X h9x) {
        if (lh7.f5802v == h9x) {
            lh7.f5802v = null;
        } else if (lh7.f5801R != h9x) {
            return false;
        } else {
            lh7.f5801R = null;
        }
        h9x.f4097R.setAlpha(1.0f);
        h9x.f4097R.setTranslationX(0.0f);
        h9x.f4097R.setTranslationY(0.0f);
        c(h9x);
        return true;
    }

    @Override // defpackage.gxa
    public final void X(h9X h9x) {
        View view = h9x.f4097R;
        view.animate().cancel();
        int size = this.e.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((aD0) this.e.get(size)).f792R == h9x) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(h9x);
                this.e.remove(size);
            }
        }
        H(h9x, this.X);
        if (this.v.remove(h9x)) {
            view.setAlpha(1.0f);
            c(h9x);
        }
        if (this.c.remove(h9x)) {
            view.setAlpha(1.0f);
            c(h9x);
        }
        int size2 = this.Z.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.Z.get(size2);
            H(h9x, arrayList);
            if (arrayList.isEmpty()) {
                this.Z.remove(size2);
            }
        }
        int size3 = this.L.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.L.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((aD0) arrayList2.get(size4)).f792R == h9x) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(h9x);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.L.remove(size3);
                    }
                }
            }
        }
        int size5 = this.O.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.O.get(size5);
                if (arrayList3.remove(h9x)) {
                    view.setAlpha(1.0f);
                    c(h9x);
                    if (arrayList3.isEmpty()) {
                        this.O.remove(size5);
                    }
                }
            } else {
                this.H.remove(h9x);
                this.m.remove(h9x);
                this.U.remove(h9x);
                this.x.remove(h9x);
                x();
                return;
            }
        }
    }

    public final boolean Z(h9X h9x, int i, int i2, int i3, int i4) {
        View view = h9x.f4097R;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) h9x.f4097R.getTranslationY());
        C(h9x);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(h9x);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.e.add(new aD0(h9x, translationX, translationY, i3, i4));
        return true;
    }

    public final void x() {
        if (!L()) {
            e();
        }
    }
}
