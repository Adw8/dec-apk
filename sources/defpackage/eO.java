package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: eO  reason: default package */
/* loaded from: classes.dex */
public final class eO extends aFk implements kg9 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ _6 f3072R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3073R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f3074R;

    /* renamed from: R  reason: collision with other field name */
    public oJx f3075R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ px f3076R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eO(_6 _6, Object obj, px pxVar, long j, kg9 kg9, aOO aoo) {
        super(1, aoo);
        this.f3072R = _6;
        this.f3073R = obj;
        this.f3076R = pxVar;
        this.R = j;
        this.f3074R = kg9;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        oJx ojx;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                _6 _6 = this.f3072R;
                _6.f680R.f506R = (Pc) _6.f683R.R.x(this.f3073R);
                _6 _62 = this.f3072R;
                _62.f687v.R(this.f3076R.c());
                this.f3072R.f684R.R(Boolean.TRUE);
                SE se = this.f3072R.f680R;
                SE se2 = new SE(se.f507R, se.getValue(), o02.x(se.f506R), se.R, Long.MIN_VALUE, se.f509R);
                oJx ojx2 = new oJx();
                px pxVar = this.f3076R;
                long j = this.R;
                ar arVar = new ar(this.f3072R, se2, this.f3074R, ojx2, 0);
                this.f3075R = ojx2;
                this.X = 1;
                if (o02.e(se2, pxVar, j, arVar, this) == bgr) {
                    return bgr;
                }
                ojx = ojx2;
            } else if (i == 1) {
                ojx = this.f3075R;
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z = ojx.R;
            _6 _63 = this.f3072R;
            SE se3 = _63.f680R;
            se3.f506R.e();
            se3.R = Long.MIN_VALUE;
            _63.f684R.R(Boolean.FALSE);
            return new hw1();
        } catch (CancellationException e) {
            _6 _64 = this.f3072R;
            SE se4 = _64.f680R;
            se4.f506R.e();
            se4.R = Long.MIN_VALUE;
            _64.f684R.R(Boolean.FALSE);
            throw e;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return new eO(this.f3072R, this.f3073R, this.f3076R, this.R, this.f3074R, (aOO) obj).O(o8s.R);
    }
}
