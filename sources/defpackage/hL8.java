package defpackage;

import com.google.android.play.core.review.ReviewInfo;
import dev.kdrag0n.virtcontainer.ui.main.MainActivity;
import java.util.concurrent.CancellationException;

/* renamed from: hL8  reason: default package */
/* loaded from: classes.dex */
public final class hL8 extends aFk implements iv7 {
    public final /* synthetic */ MainActivity R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4212R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hL8(MainActivity mainActivity, aOO aoo) {
        super(2, aoo);
        this.R = mainActivity;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((hL8) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jy_ jy_;
        Exception e;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                jy_ = (jy_) this.f4212R;
                try {
                    MainActivity mainActivity = this.R;
                    int i2 = MainActivity.X;
                    pir pir = mainActivity.f2751R;
                    if (pir == null) {
                        pir = null;
                    }
                    this.f4212R = jy_;
                    this.X = 1;
                    Object o = biy.o((j1V) ((nak) pir).get(), this);
                    if (o == bgr) {
                        return bgr;
                    }
                    obj = o;
                    jy_ = jy_;
                } catch (Exception e2) {
                    e = e2;
                    kxm.v(cUF.v(jy_), 6, "Failed to request review", e);
                    return null;
                }
            } else if (i == 1) {
                jy_ = (jy_) this.f4212R;
                try {
                    jjU.o(obj);
                } catch (Exception e3) {
                    e = e3;
                    kxm.v(cUF.v(jy_), 6, "Failed to request review", e);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (ReviewInfo) obj;
        } catch (CancellationException e4) {
            throw e4;
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        hL8 hl8 = new hL8(this.R, aoo);
        hl8.f4212R = obj;
        return hl8;
    }
}
