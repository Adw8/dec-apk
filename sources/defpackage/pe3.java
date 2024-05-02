package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: pe3  reason: default package */
/* loaded from: classes.dex */
public final class pe3 implements kOC, kYJ {
    public static final String v = kfk.P("SystemFgDispatcher");
    public final CV R;

    /* renamed from: R  reason: collision with other field name */
    public Context f7141R;

    /* renamed from: R  reason: collision with other field name */
    public final idW f7142R;

    /* renamed from: R  reason: collision with other field name */
    public jFe f7143R;

    /* renamed from: R  reason: collision with other field name */
    public lbh f7149R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f7144R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public String f7145R = null;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f7148R = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final HashSet f7147R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f7146R = new HashMap();

    public pe3(Context context) {
        this.f7141R = context;
        jFe R = jFe.R(context);
        this.f7143R = R;
        CV cv = R.f4884R;
        this.R = cv;
        this.f7142R = new idW(this.f7141R, cv, this);
        this.f7143R.f4888R.R(this);
    }

    @Override // defpackage.kOC
    public final void R(List list) {
    }

    @Override // defpackage.kOC
    public final void c(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                kfk.U().x(v, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                jFe jfe = this.f7143R;
                jfe.f4884R.X(new nTd(jfe, str, true));
            }
        }
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        kfk.U().x(v, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (!(notification == null || this.f7149R == null)) {
            this.f7148R.put(stringExtra, new fFo(intExtra, intExtra2, notification));
            if (TextUtils.isEmpty(this.f7145R)) {
                this.f7145R = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f7149R;
                systemForegroundService.f1462R.post(new fWY(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f7149R;
            systemForegroundService2.f1462R.post(new kBb(systemForegroundService2, intExtra, notification, 6));
            if (intExtra2 != 0) {
                for (Map.Entry entry : this.f7148R.entrySet()) {
                    i |= ((fFo) entry.getValue()).v;
                }
                fFo ffo = (fFo) this.f7148R.get(this.f7145R);
                if (ffo != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f7149R;
                    systemForegroundService3.f1462R.post(new fWY(systemForegroundService3, ffo.R, ffo.f3365R, i));
                }
            }
        }
    }

    @Override // defpackage.kYJ
    public final void v(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f7144R) {
            try {
                l3L l3l = (l3L) this.f7146R.remove(str);
                if (l3l != null ? this.f7147R.remove(l3l) : false) {
                    this.f7142R.v(this.f7147R);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        fFo ffo = (fFo) this.f7148R.remove(str);
        if (str.equals(this.f7145R) && this.f7148R.size() > 0) {
            Iterator it = this.f7148R.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f7145R = (String) entry.getKey();
            if (this.f7149R != null) {
                fFo ffo2 = (fFo) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f7149R;
                systemForegroundService.f1462R.post(new fWY(systemForegroundService, ffo2.R, ffo2.f3365R, ffo2.v));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f7149R;
                systemForegroundService2.f1462R.post(new hk0(ffo2.R, 0, systemForegroundService2));
            }
        }
        lbh lbh = this.f7149R;
        if (ffo != null && lbh != null) {
            kfk.U().x(v, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(ffo.R), str, Integer.valueOf(ffo.v)), new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) lbh;
            systemForegroundService3.f1462R.post(new hk0(ffo.R, 0, systemForegroundService3));
        }
    }
}
