package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import dev.kdrag0n.app.data.SettingsUpdateWorker;
import java.util.Map;

/* renamed from: glK  reason: default package */
/* loaded from: classes.dex */
public final class glK extends d3x {
    public final Map R;

    public glK(Map map) {
        this.R = map;
    }

    @Override // defpackage.d3x
    public final ListenableWorker R(Context context, String str, WorkerParameters workerParameters) {
        lXY lxy = (lXY) this.R.get(str);
        if (lxy == null) {
            return null;
        }
        return new SettingsUpdateWorker(context, workerParameters, (m5f) ((mYo) lxy.get()).R.f4660R.N.get());
    }
}
