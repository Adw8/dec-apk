package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: oDT  reason: default package */
/* loaded from: classes.dex */
public final class oDT extends k8G implements kg9 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oDT(int i, Object obj) {
        super(1);
        this.X = i;
        this.R = obj;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return Boolean.valueOf(((List) obj).addAll(this.X, (Collection) this.R));
    }
}
