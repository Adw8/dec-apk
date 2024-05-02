package defpackage;

import android.view.ViewStructure;

/* renamed from: zF  reason: default package */
/* loaded from: classes.dex */
public final class zF {
    public static final zF R = new zF();

    public final int R(ViewStructure viewStructure, int i) {
        return viewStructure.addChildCount(i);
    }

    public final void c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    public final void e(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        viewStructure.setId(i, str, str2, str3);
    }

    public final ViewStructure v(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }
}
