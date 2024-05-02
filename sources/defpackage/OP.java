package defpackage;

import android.util.SparseIntArray;

/* renamed from: OP  reason: default package */
/* loaded from: classes.dex */
public final class OP implements h2V {
    public final /* synthetic */ Zh R;
    public final /* synthetic */ int e;

    public /* synthetic */ OP(Zh zh, int i) {
        this.e = i;
        this.R = zh;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                this.R.K(((Boolean) obj).booleanValue());
                return o8s.R;
            default:
                if (((SparseIntArray) obj) != null) {
                    this.R.recreate();
                }
                return o8s.R;
        }
    }
}
