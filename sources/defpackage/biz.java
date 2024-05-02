package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: biz  reason: default package */
/* loaded from: classes.dex */
public final class biz implements Runnable {
    public final /* synthetic */ ArrayList R;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int e;

    /* renamed from: e  reason: collision with other field name */
    public final /* synthetic */ ArrayList f1778e;
    public final /* synthetic */ ArrayList v;

    public biz(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.e = i;
        this.R = arrayList;
        this.v = arrayList2;
        this.c = arrayList3;
        this.f1778e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.e; i++) {
            WeakHashMap weakHashMap = of5.f6887R;
            m18.o((View) this.R.get(i), (String) this.v.get(i));
            m18.o((View) this.c.get(i), (String) this.f1778e.get(i));
        }
    }
}
