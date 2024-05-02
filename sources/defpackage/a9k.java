package defpackage;

import java.util.Map;

/* renamed from: a9k  reason: default package */
/* loaded from: classes.dex */
public final class a9k extends k8G implements kg9 {
    public final /* synthetic */ e9w R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9k(e9w e9w, int i) {
        super(1);
        this.X = i;
        this.R = e9w;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                e9w e9w = this.R;
                return Boolean.valueOf(e9w != null ? e9w.v(obj) : true);
            default:
                return new gx6(this.R, (Map) obj);
        }
    }
}
