package defpackage;

import android.content.Context;

/* renamed from: a4r  reason: default package */
/* loaded from: classes.dex */
public final class a4r extends m9V {
    static {
        kfk.P("NetworkNotRoamingCtrlr");
    }

    public a4r(Context context, CV cv) {
        super((eyJ) piu.g(context, cv).c);
    }

    @Override // defpackage.m9V
    public final boolean R(l3L l3l) {
        return l3l.f5559R.f2441R == g_9.NOT_ROAMING;
    }

    @Override // defpackage.m9V
    public final boolean v(Object obj) {
        b_y b_y = (b_y) obj;
        return !b_y.R || !b_y.e;
    }
}
