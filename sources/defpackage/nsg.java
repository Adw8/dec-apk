package defpackage;

import android.graphics.Path;

/* renamed from: nsg  reason: default package */
/* loaded from: classes.dex */
public final class nsg extends k8G implements iv7 {
    public static final nsg R = new nsg();

    public nsg() {
        super(2);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        cF5 cf5 = (cF5) obj;
        int i = ((a2Y) obj2).R;
        Path path = cf5.f2033v.f2856R;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        path.setFillType(z ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
        cf5.c();
        return o8s.R;
    }
}
