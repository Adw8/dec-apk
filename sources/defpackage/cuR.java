package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;

/* renamed from: cuR  reason: default package */
/* loaded from: classes.dex */
public final class cuR extends ViewGroup {

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2454R;
    public final ArrayList v;
    public final int e = 5;
    public final h5 R = new h5(4);
    public int X = 1;

    public cuR(Context context) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.f2454R = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.v = arrayList2;
        setClipChildren(false);
        cWb cwb = new cWb(context);
        addView(cwb);
        arrayList.add(cwb);
        arrayList2.add(cwb);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
