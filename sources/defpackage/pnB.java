package defpackage;

import android.view.ViewGroup;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: pnB  reason: default package */
/* loaded from: classes.dex */
public abstract class pnB {

    /* renamed from: R  reason: collision with other field name */
    public static o9 f7264R = new o9();
    public static ThreadLocal R = new ThreadLocal();

    /* renamed from: R  reason: collision with other field name */
    public static ArrayList f7263R = new ArrayList();

    public static void R(ViewGroup viewGroup, hFt hft) {
        if (!f7263R.contains(viewGroup)) {
            WeakHashMap weakHashMap = of5.f6887R;
            if (d6y.c(viewGroup)) {
                f7263R.add(viewGroup);
                if (hft == null) {
                    hft = f7264R;
                }
                hFt N = hft.clone();
                ArrayList arrayList = (ArrayList) v().getOrDefault(viewGroup, null);
                if (arrayList != null && arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((hFt) it.next()).Y(viewGroup);
                    }
                }
                if (N != null) {
                    N.x(viewGroup, true);
                }
                jQ.Y(viewGroup.getTag(R.id.transition_current_scene));
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (N != null) {
                    l5K l5k = new l5K(viewGroup, N);
                    viewGroup.addOnAttachStateChangeListener(l5k);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(l5k);
                }
            }
        }
    }

    public static FK v() {
        FK fk;
        WeakReference weakReference = (WeakReference) R.get();
        if (weakReference != null && (fk = (FK) weakReference.get()) != null) {
            return fk;
        }
        FK fk2 = new FK();
        R.set(new WeakReference(fk2));
        return fk2;
    }
}
