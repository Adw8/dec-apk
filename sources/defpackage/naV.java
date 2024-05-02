package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: naV  reason: default package */
/* loaded from: classes.dex */
public final class naV extends aFk implements iv7 {
    public final /* synthetic */ l5n R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nKE f6471R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public naV(l5n l5n, nKE nke, aOO aoo) {
        super(2, aoo);
        this.R = l5n;
        this.f6471R = nke;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((naV) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jM jMVar;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                if (((Boolean) this.R.f5581R.f684R.getValue()).booleanValue()) {
                    nKE nke = this.f6471R;
                    jMVar = nke instanceof ipq ? (ipq) nke : ila.R;
                } else {
                    jMVar = this.f6471R;
                }
                l5n l5n = this.R;
                _6 _6 = l5n.f5581R;
                dU5 du5 = new dU5(l5n.f5580R);
                this.X = 1;
                if (_6.R(_6, du5, jMVar, this) == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.R.f5582R.R(Boolean.FALSE);
        } catch (CancellationException unused) {
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new naV(this.R, this.f6471R, aoo);
    }
}
