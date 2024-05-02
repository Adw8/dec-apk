package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* renamed from: sN  reason: default package */
/* loaded from: classes.dex */
public final class sN extends aFk implements iv7 {
    public final /* synthetic */ AdbPairViewModel R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public sN(AdbPairViewModel adbPairViewModel, aOO aoo) {
        super(2, aoo);
        this.R = adbPairViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((sN) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                String[] strArr = (String[]) Gz.R.toArray(new String[0]);
                String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                ExecutorService executorService = gQ7.R;
                giP gip = new giP();
                if (strArr2 != null && strArr2.length > 0) {
                    ((njQ) gip).R.add(new cAh(strArr2));
                }
                gip.R();
                iyL iyl = this.R.f2759R;
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
        return new sN(this.R, aoo);
    }
}
