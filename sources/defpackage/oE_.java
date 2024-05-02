package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: oE_  reason: default package */
/* loaded from: classes.dex */
public abstract class oE_ {
    public static void L(View view, Rect rect) {
        WeakHashMap weakHashMap = of5.f6887R;
        if (d6y.v(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean Z(List list) {
        return list == null || list.isEmpty();
    }

    public static void e(View view, List list) {
        boolean z;
        boolean z2;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (list.get(i) == view) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            WeakHashMap weakHashMap = of5.f6887R;
            if (m18.H(view) != null) {
                list.add(view);
            }
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = (View) list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                z2 = false;
                                break;
                            } else if (list.get(i4) == childAt) {
                                z2 = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!z2 && m18.H(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public abstract void C(View view, Object obj);

    public abstract void H(Object obj, View view, ArrayList arrayList);

    public abstract void N(Object obj, Rect rect);

    public abstract Object O(Object obj);

    public abstract void P(Object obj, a3 a3Var, dX dXVar);

    public abstract void R(View view, Object obj);

    public abstract void U(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract boolean X(Object obj);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract void g(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void j(Object obj, View view, ArrayList arrayList);

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract void v(Object obj, ArrayList arrayList);

    public abstract Object x(Object obj, Object obj2);

    public abstract Object y(Object obj);
}
