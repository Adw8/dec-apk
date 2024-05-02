package defpackage;

import java.util.List;

/* renamed from: iCm  reason: default package */
/* loaded from: classes.dex */
public final class iCm extends k8G implements kg9 {
    public final /* synthetic */ List R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f4488R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iCm(g5M g5m, List list, int i) {
        super(1);
        this.X = i;
        this.f4488R = g5m;
        this.R = list;
    }

    public final Object R(int i) {
        switch (this.X) {
            case 0:
                return this.f4488R.x(this.R.get(i));
            default:
                return this.f4488R.x(this.R.get(i));
        }
    }

    @Override // defpackage.kg9
    public final /* bridge */ /* synthetic */ Object x(Object obj) {
        switch (this.X) {
            case 0:
                return R(((Number) obj).intValue());
            default:
                return R(((Number) obj).intValue());
        }
    }
}
