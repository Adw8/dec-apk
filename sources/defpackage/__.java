package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: __  reason: default package */
/* loaded from: classes.dex */
public final class __ extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ gn R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ AtomicInteger f704R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ[] f705R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public __(nWQ[] nwqArr, int i, AtomicInteger atomicInteger, gn gnVar, aOO aoo) {
        super(2, aoo);
        this.f705R = nwqArr;
        this.O = i;
        this.f704R = atomicInteger;
        this.R = gnVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((__) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        AtomicInteger atomicInteger;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                nWQ[] nwqArr = this.f705R;
                int i2 = this.O;
                nWQ nwq = nwqArr[i2];
                TL tl = new TL(this.R, i2);
                this.X = 1;
                if (nwq.v(tl, this) == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.R.m(null);
            }
            return o8s.R;
        } finally {
            if (this.f704R.decrementAndGet() == 0) {
                this.R.m(null);
            }
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new __(this.f705R, this.O, this.f704R, this.R, aoo);
    }
}
