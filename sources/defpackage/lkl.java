package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: lkl  reason: default package */
/* loaded from: classes.dex */
public final class lkl implements Runnable {
    public final /* synthetic */ RecyclerView R;
    public final /* synthetic */ int e;

    public /* synthetic */ lkl(RecyclerView recyclerView, int i) {
        this.e = i;
        this.R = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                RecyclerView recyclerView = this.R;
                if (recyclerView.f1417e && !recyclerView.isLayoutRequested()) {
                    RecyclerView recyclerView2 = this.R;
                    if (!recyclerView2.f1425v) {
                        recyclerView2.requestLayout();
                        return;
                    } else if (recyclerView2.f1375O) {
                        recyclerView2.f1410X = true;
                        return;
                    } else {
                        recyclerView2.C();
                        return;
                    }
                } else {
                    return;
                }
            default:
                gxa gxa = this.R.f1393R;
                if (gxa != null) {
                    bbj bbj = (bbj) gxa;
                    boolean z = !bbj.v.isEmpty();
                    boolean z2 = !bbj.e.isEmpty();
                    boolean z3 = !bbj.X.isEmpty();
                    boolean z4 = !bbj.c.isEmpty();
                    if (z || z2 || z4 || z3) {
                        Iterator it = bbj.v.iterator();
                        while (it.hasNext()) {
                            h9X h9x = (h9X) it.next();
                            View view = h9x.f4097R;
                            ViewPropertyAnimator animate = view.animate();
                            bbj.H.add(h9x);
                            animate.setDuration(((gxa) bbj).v).alpha(0.0f).setListener(new i0l(bbj, h9x, animate, view)).start();
                        }
                        bbj.v.clear();
                        if (z2) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(bbj.e);
                            bbj.L.add(arrayList);
                            bbj.e.clear();
                            oP1 op1 = new oP1(bbj, arrayList, 0);
                            if (z) {
                                View view2 = ((aD0) arrayList.get(0)).f792R.f4097R;
                                long j = ((gxa) bbj).v;
                                WeakHashMap weakHashMap = of5.f6887R;
                                mHC.N(view2, op1, j);
                            } else {
                                op1.run();
                            }
                        }
                        if (z3) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(bbj.X);
                            bbj.Z.add(arrayList2);
                            bbj.X.clear();
                            oP1 op12 = new oP1(bbj, arrayList2, 1);
                            if (z) {
                                View view3 = ((lh7) arrayList2.get(0)).f5801R.f4097R;
                                long j2 = ((gxa) bbj).v;
                                WeakHashMap weakHashMap2 = of5.f6887R;
                                mHC.N(view3, op12, j2);
                            } else {
                                op12.run();
                            }
                        }
                        if (z4) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.addAll(bbj.c);
                            bbj.O.add(arrayList3);
                            bbj.c.clear();
                            oP1 op13 = new oP1(bbj, arrayList3, 2);
                            if (z || z2 || z3) {
                                long j3 = 0;
                                long j4 = z ? ((gxa) bbj).v : 0;
                                long j5 = z2 ? ((gxa) bbj).c : 0;
                                if (z3) {
                                    j3 = ((gxa) bbj).e;
                                }
                                View view4 = ((h9X) arrayList3.get(0)).f4097R;
                                WeakHashMap weakHashMap3 = of5.f6887R;
                                mHC.N(view4, op13, Math.max(j5, j3) + j4);
                            } else {
                                op13.run();
                            }
                        }
                    }
                }
                this.R.f1374N = false;
                return;
        }
    }
}
