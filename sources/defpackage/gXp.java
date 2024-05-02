package defpackage;

import android.content.Context;

/* renamed from: gXp  reason: default package */
/* loaded from: classes.dex */
public final class gXp extends k8G implements kg9 {
    public final /* synthetic */ Context R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gXp(Context context) {
        super(1);
        this.R = context;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        ((Boolean) obj).booleanValue();
        vd.I(this.R, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", null);
        return o8s.R;
    }
}
