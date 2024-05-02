package defpackage;

import java.util.ArrayList;

/* renamed from: kjs  reason: default package */
/* loaded from: classes.dex */
public final class kjs extends c2D {
    public final /* synthetic */ f0t R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f5402R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ArrayList f5403R;
    public final /* synthetic */ Object c;

    /* renamed from: c  reason: collision with other field name */
    public final /* synthetic */ ArrayList f5404c;
    public final /* synthetic */ Object v = null;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ ArrayList f5405v = null;

    public kjs(f0t f0t, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.R = f0t;
        this.f5402R = obj;
        this.f5403R = arrayList;
        this.c = obj2;
        this.f5404c = arrayList2;
    }

    @Override // defpackage.c2D, defpackage.lpP
    public final void X(hFt hft) {
        Object obj = this.f5402R;
        if (obj != null) {
            this.R.t(obj, this.f5403R, null);
        }
        Object obj2 = this.v;
        if (obj2 != null) {
            this.R.t(obj2, this.f5405v, null);
        }
        Object obj3 = this.c;
        if (obj3 != null) {
            this.R.t(obj3, this.f5404c, null);
        }
    }

    @Override // defpackage.lpP
    public final void c(hFt hft) {
        hft.h(this);
    }
}
