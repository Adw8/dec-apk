package defpackage;

import java.util.Map;

/* renamed from: mX1  reason: default package */
/* loaded from: classes.dex */
public final class mX1 extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mX1(Object obj, Object obj2, int i, int i2, int i3) {
        super(2);
        this.X = i3;
        this.R = obj;
        this.v = obj2;
        this.O = i;
        this.L = i2;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 1:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 2:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                msU.X((ncu) this.R, (iv7) this.v, m88, this.O | 1, this.L);
                return;
            case 1:
                aH9.j((ncu) this.R, (iv7) this.v, m88, this.O | 1, this.L);
                return;
            case 2:
                cU5.c((ncu) this.R, (iv7) this.v, m88, this.O | 1, this.L);
                return;
            default:
                gQc.L((i5Q) this.R, (Map) this.v, m88, this.O | 1, this.L);
                return;
        }
    }
}
