package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.view.View;
import androidx.activity.result.d;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kBb  reason: default package */
/* loaded from: classes.dex */
public final class kBb implements Runnable {
    public final Object R;
    public final int X;
    public final /* synthetic */ int e;
    public final Object v;

    public /* synthetic */ kBb(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.R = obj;
        this.X = i;
        this.v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Sw sw;
        int i = 0;
        switch (this.e) {
            case 0:
                c31 c31 = (c31) this.R;
                int i2 = this.X;
                Object obj = ((Zz) this.v).R;
                String str = (String) ((d) c31).f1025R.get(Integer.valueOf(i2));
                if (str != null) {
                    Nd nd = (Nd) c31.e.get(str);
                    if (nd == null || (sw = nd.R) == null) {
                        ((d) c31).R.remove(str);
                        c31.X.put(str, obj);
                        return;
                    } else if (((d) c31).f1024R.remove(str)) {
                        sw.R(obj);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((c31) this.R).R(this.X, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.v));
                return;
            case 2:
                int[] iArr = new int[((String[]) this.v).length];
                PackageManager packageManager = ((Activity) this.R).getPackageManager();
                String packageName = ((Activity) this.R).getPackageName();
                int length = ((String[]) this.v).length;
                while (i < length) {
                    iArr[i] = packageManager.checkPermission(((String[]) this.v)[i], packageName);
                    i++;
                }
                ((By) ((Activity) this.R)).onRequestPermissionsResult(this.X, (String[]) this.v, iArr);
                return;
            case 3:
                int i3 = this.X;
                n1P n1p = (n1P) ((h89) this.v).R;
                if (n1p != null) {
                    n1p.t(i3);
                    return;
                }
                return;
            case 4:
                int size = ((List) this.v).size();
                if (this.X != 1) {
                    while (i < size) {
                        ((jbB) ((List) this.v).get(i)).R();
                        i++;
                    }
                    return;
                }
                while (i < size) {
                    ((jbB) ((List) this.v).get(i)).v();
                    i++;
                }
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((dUU) this.v).R((Intent) this.R, this.X);
                return;
            case 6:
                ((SystemForegroundService) this.R).f1461R.notify(this.X, (Notification) this.v);
                return;
            case 7:
                ((BottomSheetBehavior) this.R).n((View) this.v, this.X, false);
                return;
            default:
                aVh avh = (aVh) this.v;
                int i4 = this.X;
                String str2 = (String) this.R;
                avh.getClass();
                try {
                    avh.Z(i4, str2);
                    return;
                } catch (iuG e) {
                    aVh.R.x("notifyModuleCompleted failed", e);
                    return;
                }
        }
    }

    public /* synthetic */ kBb(Object obj, Intent intent, int i) {
        this.e = 5;
        this.v = obj;
        this.R = intent;
        this.X = i;
    }

    public /* synthetic */ kBb(Object obj, Object obj2, int i, int i2) {
        this.e = i2;
        this.R = obj;
        this.v = obj2;
        this.X = i;
    }

    public /* synthetic */ kBb(aVh avh, int i, String str) {
        this.e = 8;
        this.v = avh;
        this.X = i;
        this.R = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kBb(defpackage.jbB r3, int r4) {
        /*
            r2 = this;
            r0 = 4
            r2.e = r0
            r0 = 1
            jbB[] r0 = new defpackage.jbB[r0]
            if (r3 == 0) goto L_0x0014
            r1 = 0
            r0[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            return
        L_0x0014:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "initCallback cannot be null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kBb.<init>(jbB, int):void");
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public kBb(int i, ArrayList arrayList) {
        this(arrayList, i, (Throwable) null);
        this.e = 4;
    }

    public kBb(List list, int i, Throwable th) {
        this.e = 4;
        if (list != null) {
            this.v = new ArrayList(list);
            this.X = i;
            this.R = th;
            return;
        }
        throw new NullPointerException("initCallbacks cannot be null");
    }
}
