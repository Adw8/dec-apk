package defpackage;

import java.util.ArrayList;

/* renamed from: oyF  reason: default package */
/* loaded from: classes.dex */
public final class oyF implements mzq {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hAW f7043R;

    /* renamed from: R  reason: collision with other field name */
    public final String f7044R;
    public final int v = 1;

    public oyF(hAW haw, String str, int i) {
        this.f7043R = haw;
        this.f7044R = str;
        this.R = i;
    }

    @Override // defpackage.mzq
    public final boolean R(ArrayList arrayList, ArrayList arrayList2) {
        pm2 pm2 = this.f7043R.f4139v;
        if (pm2 == null || this.R >= 0 || this.f7044R != null || !pm2.m().M()) {
            return this.f7043R.E(arrayList, arrayList2, this.f7044R, this.R, this.v);
        }
        return false;
    }
}
