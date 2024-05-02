package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: peT  reason: default package */
/* loaded from: classes.dex */
public final class peT extends owe {
    public peT(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void H(FK fk, Collection collection) {
        Iterator it = ((ox_) fk.entrySet()).iterator();
        while (it.hasNext()) {
            WeakHashMap weakHashMap = of5.f6887R;
            if (!collection.contains(m18.H((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    public static void m(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!hCE.v(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        m(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void x(FK fk, View view) {
        WeakHashMap weakHashMap = of5.f6887R;
        String H = m18.H(view);
        if (H != null) {
            fk.put(H, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    x(fk, childAt);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:166:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x060d  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x086a  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0933 A[LOOP:20: B:288:0x092d->B:290:0x0933, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x094d  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x085c A[EDGE_INSN: B:357:0x085c->B:266:0x085c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:376:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.owe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(java.util.ArrayList r34, boolean r35) {
        /*
        // Method dump skipped, instructions count: 2414
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.peT.v(java.util.ArrayList, boolean):void");
    }
}
