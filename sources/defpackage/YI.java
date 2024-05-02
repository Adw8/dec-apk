package defpackage;

import android.os.Looper;
import java.util.List;

/* renamed from: YI  reason: default package */
/* loaded from: classes.dex */
public final class YI implements lVM {
    @Override // defpackage.lVM
    public String R() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // defpackage.lVM
    public int c() {
        return 1073741823;
    }

    @Override // defpackage.lVM
    public fhC v(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new hBL(cxs.R(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
