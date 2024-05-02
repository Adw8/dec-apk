package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: fHD  reason: default package */
/* loaded from: classes.dex */
public final class fHD {
    public static final String R = kfk.P("SystemJobInfoConverter");

    /* renamed from: R  reason: collision with other field name */
    public final ComponentName f3370R;

    public fHD(Context context) {
        this.f3370R = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
