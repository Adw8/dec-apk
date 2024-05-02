package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Y  reason: default package */
/* loaded from: classes.dex */
public final class Y extends Xb {
    public final /* synthetic */ int v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i, int i2, Class cls) {
        super(cls, i);
        this.v = i2;
    }

    @Override // defpackage.Xb
    public final O L(nP9 np9) {
        switch (this.v) {
            case 1:
                return e.n(np9.f112R);
            case 2:
                return g.n(np9.f112R);
            case 7:
                return new lfP(np9.f112R);
            case 9:
                return new X(np9.f112R);
            case 13:
                byte[] bArr = np9.f112R;
                ConcurrentHashMap concurrentHashMap = u.R;
                u uVar = (u) u.R.get(new v(bArr));
                return uVar == null ? new u(false, bArr) : uVar;
            case 14:
                return np9;
            default:
                super.L(np9);
                throw null;
        }
    }

    @Override // defpackage.Xb
    public final O O(q qVar) {
        switch (this.v) {
            case 1:
                return qVar.W();
            case 14:
                return qVar.s();
            case 17:
                return qVar;
            case 18:
                return qVar.T();
            default:
                super.O(qVar);
                throw null;
        }
    }
}
