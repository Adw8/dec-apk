package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.HashMap;

/* renamed from: dNF  reason: default package */
/* loaded from: classes.dex */
public final class dNF implements kYJ {
    public static final String R = kfk.P("CommandHandler");

    /* renamed from: R  reason: collision with other field name */
    public final Context f2582R;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f2584R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final Object f2583R = new Object();

    public dNF(Context context) {
        this.f2582R = context;
    }

    public static Intent R(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.content.Intent r11, int r12, defpackage.dUU r13) {
        /*
        // Method dump skipped, instructions count: 893
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dNF.e(android.content.Intent, int, dUU):void");
    }

    @Override // defpackage.kYJ
    public final void v(String str, boolean z) {
        synchronized (this.f2583R) {
            kYJ kyj = (kYJ) this.f2584R.remove(str);
            if (kyj != null) {
                kyj.v(str, z);
            }
        }
    }
}
