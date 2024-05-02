package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: ld  reason: default package */
/* loaded from: classes.dex */
public final class ld extends k8G implements kg9 {
    public final /* synthetic */ Collection R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(int i, Collection collection) {
        super(1);
        this.X = i;
        this.R = collection;
    }

    public final Boolean R(Object obj) {
        switch (this.X) {
            case 0:
                return Boolean.valueOf(this.R.contains(obj));
            default:
                return Boolean.valueOf(this.R.contains(obj));
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                return R(obj);
            case 1:
                return R(obj);
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.R));
        }
    }
}
