package defpackage;

import java.util.List;
import java.util.ListIterator;

/* renamed from: hNx  reason: default package */
/* loaded from: classes.dex */
public final class hNx extends k8G implements f_c {
    public final /* synthetic */ aD8 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hNx(aD8 ad8, int i) {
        super(0);
        this.X = i;
        this.R = ad8;
    }

    public final Integer R() {
        switch (this.X) {
            case 1:
                iFC L = this.R.L();
                if (L != null) {
                    return Integer.valueOf(L.v);
                }
                return null;
            default:
                return Integer.valueOf(this.R.f796R.L().O());
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        Object obj;
        float f;
        boolean z;
        switch (this.X) {
            case 0:
                return Boolean.valueOf(this.R.c());
            case 1:
                return R();
            case 2:
                aD8 ad8 = this.R;
                List L = ad8.f796R.L().L();
                ListIterator listIterator = L.listIterator(L.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((iFC) obj).v == ad8.Z()) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                        }
                    } else {
                        obj = null;
                    }
                }
                iFC ifc = (iFC) obj;
                if (ifc != null) {
                    aD8 ad82 = this.R;
                    f = caw.m(((float) (-ifc.R)) / ((float) (ad82.O() + ifc.c)), -0.5f, 0.5f);
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            default:
                return R();
        }
    }
}
