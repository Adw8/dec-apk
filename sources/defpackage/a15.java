package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportViewModel;
import java.util.concurrent.ExecutorService;

/* renamed from: a15  reason: default package */
/* loaded from: classes.dex */
public final class a15 extends aFk implements iv7 {
    public final /* synthetic */ DeviceSupportViewModel R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public a15(DeviceSupportViewModel deviceSupportViewModel, aOO aoo) {
        super(2, aoo);
        this.R = deviceSupportViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((a15) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                btA bta = new btA(2);
                bta.R("/vendor/bin/misc_writer --set-enable-pkvm");
                bta.v(Gz.R.toArray(new String[0]));
                String[] strArr = (String[]) bta.O(new String[bta.X()]);
                ExecutorService executorService = gQ7.R;
                giP gip = new giP();
                if (strArr != null && strArr.length > 0) {
                    ((njQ) gip).R.add(new cAh(strArr));
                }
                gip.R();
                iyL iyl = this.R.R;
                this.X = 1;
                if (iyl.L(this) == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception unused) {
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new a15(this.R, aoo);
    }
}
