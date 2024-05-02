package defpackage;

import java.util.List;

/* renamed from: dVs  reason: default package */
/* loaded from: classes.dex */
public final class dVs {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f2654R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mMG f2655R;

    public dVs(mMG mmg, String str, f_c f_c) {
        this.f2655R = mmg;
        this.f2654R = str;
        this.R = f_c;
    }

    public final void R() {
        List list = (List) this.f2655R.v.remove(this.f2654R);
        if (list != null) {
            list.remove(this.R);
        }
        if (list != null && (!list.isEmpty())) {
            this.f2655R.v.put(this.f2654R, list);
        }
    }
}
