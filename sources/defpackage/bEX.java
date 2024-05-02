package defpackage;

import android.view.ViewParent;

/* renamed from: bEX  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bEX extends nZL implements kg9 {
    public static final bEX R = new bEX();

    public bEX() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
