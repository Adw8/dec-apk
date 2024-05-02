package dev.kdrag0n.virtcontainer.adb.pairing;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.app.Service;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService;

/* loaded from: classes.dex */
public final class AdbPairingService extends kak {
    public static final /* synthetic */ int X = 0;
    public OT R;

    /* renamed from: R  reason: collision with other field name */
    public gh f2735R;

    /* renamed from: R  reason: collision with other field name */
    public sk f2737R;

    /* renamed from: R  reason: collision with other field name */
    public yd f2738R;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f2736R = g4x.O(new oMu(cY.Success));
    public final ivW v = g4x.O(null);

    public AdbPairingService() {
        super(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object L(dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService r11, defpackage.aOO r12) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService.L(dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object X(dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService r8, defpackage.aOO r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof defpackage.Yv
            if (r0 == 0) goto L_0x0016
            r0 = r9
            Yv r0 = (defpackage.Yv) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001b
        L_0x0016:
            Yv r0 = new Yv
            r0.<init>(r8, r9)
        L_0x001b:
            java.lang.Object r9 = r0.f648R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r8 = r0.e
            dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService r2 = r0.R
            defpackage.jjU.o(r9)
            r9 = r8
            r8 = r2
            goto L_0x005b
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            defpackage.jjU.o(r9)
            r9 = 0
        L_0x003c:
            ivW r2 = r8.v
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x0062
            int r9 = r9 + r3
            long r4 = (long) r9
            r6 = 600(0x258, double:2.964E-321)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x0062
            r4 = 500(0x1f4, double:2.47E-321)
            r0.R = r8
            r0.e = r9
            r0.X = r3
            java.lang.Object r2 = defpackage.n3x.Z(r4, r0)
            if (r2 != r1) goto L_0x005b
            goto L_0x0064
        L_0x005b:
            ivW r2 = r8.v
            r4 = 0
            r2.H(r4)
            goto L_0x003c
        L_0x0062:
            o8s r1 = defpackage.o8s.R
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService.X(dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService, aOO):java.lang.Object");
    }

    public final gh Z() {
        gh ghVar = this.f2735R;
        if (ghVar != null) {
            return ghVar;
        }
        return null;
    }

    public final sk m() {
        sk skVar = this.f2737R;
        if (skVar != null) {
            return skVar;
        }
        return null;
    }

    @Override // defpackage.kak, defpackage.gCv, android.app.Service
    public final void onCreate() {
        super.onCreate();
        pby[] pbyArr = kxm.R;
        m().v();
        mxC.y(l6.J(Z().v), gQc.Q(this), new D5(this));
        mxC.y(l6.J(Z().f3869R), gQc.Q(this), new hki(9, this));
        this.v.H(null);
        mxC.y(new aGD(new aGD(new aGD(Z().v, Z().f3869R, new _m(1, null)), this.v, new _m(2, null)), this.f2736R, new _m(3, null)), gQc.Q(this), new Object() { // from class: Nb
            @Override // defpackage.h2V
            public final Object R(Object obj, aOO aoo) {
                kgF kgf = (kgF) obj;
                AdbPairingService adbPairingService = AdbPairingService.this;
                int i = AdbPairingService.X;
                adbPairingService.getClass();
                if (kgf.f5391R != null) {
                    sk m = adbPairingService.m();
                    i3D i3d = kgf.f5391R;
                    m.getClass();
                    Notification.Builder builder = new Notification.Builder(m.f7415R, "adb_setup__pairing");
                    String str = i3d.f4449R;
                    Intent intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
                    if (str != null) {
                        intent.putExtra(":settings:fragment_args_key", str);
                        Bundle bundle = new Bundle();
                        bundle.putString(":settings:fragment_args_key", str);
                        intent.putExtra(":settings:show_fragment_args", bundle);
                    }
                    PendingIntent B = hDC.B(intent, m.f7415R, 300);
                    m.R(builder);
                    builder.setContentTitle(m.f7415R.getString(R.string.adb_setup_notification_waiting_prepare_miui));
                    builder.setContentText(m.f7415R.getString(R.string.adb_setup_notification_waiting_server_desc));
                    builder.setSmallIcon(R.drawable.ic_fluent_wrench_24_filled);
                    builder.setContentIntent(B);
                    if (Y5.X) {
                        builder.setForegroundServiceBehavior(1);
                    }
                    m.f7415R.startForeground(300, builder.build());
                } else if (!kgf.f5392R) {
                    adbPairingService.m().c(false);
                } else if (!kgf.v) {
                    adbPairingService.m().c(true);
                } else {
                    sk m2 = adbPairingService.m();
                    cY cYVar = kgf.R;
                    m2.getClass();
                    Notification.Builder builder2 = new Notification.Builder(m2.f7415R, "adb_setup__pairing");
                    Intent intent2 = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
                    intent2.putExtra(":settings:fragment_args_key", "toggle_adb_wireless");
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(":settings:fragment_args_key", "toggle_adb_wireless");
                    intent2.putExtra(":settings:show_fragment_args", bundle2);
                    PendingIntent B2 = hDC.B(intent2, m2.f7415R, 300);
                    RemoteInput.Builder builder3 = new RemoteInput.Builder("key_adb_pairing_code");
                    builder3.setLabel(m2.f7415R.getString(R.string.adb_setup_notification_pairing_code_field));
                    RemoteInput build = builder3.build();
                    Service service = m2.f7415R;
                    Intent intent3 = new Intent(service, service.getClass());
                    intent3.putExtra("requestCode", 100);
                    Notification.Action.Builder builder4 = new Notification.Action.Builder((Icon) null, m2.f7415R.getString(R.string.adb_setup_notification_pairing_code_button), PendingIntent.getForegroundService(service, 10100, intent3, Y5.R | 134217728));
                    builder4.addRemoteInput(build);
                    builder2.addAction(builder4.build());
                    m2.R(builder2);
                    int ordinal = cYVar.ordinal();
                    if (ordinal == 0) {
                        builder2.setContentTitle(m2.f7415R.getString(R.string.adb_setup_notification_pairing_code));
                        builder2.setContentText(m2.f7415R.getString(R.string.adb_setup_notification_pairing_code_desc));
                        builder2.setSmallIcon(R.drawable.ic_fluent_password_24_filled);
                    } else if (ordinal == 1) {
                        builder2.setContentTitle(m2.f7415R.getString(R.string.adb_setup_notification_pairing_code_error));
                        builder2.setContentText(m2.f7415R.getString(R.string.adb_setup_notification_pairing_code_error_desc_wrong));
                        builder2.setSmallIcon(R.drawable.ic_fluent_error_circle_24_filled);
                    } else if (ordinal == 2) {
                        builder2.setContentTitle(m2.f7415R.getString(R.string.adb_setup_notification_pairing_code_error));
                        builder2.setContentText(m2.f7415R.getString(R.string.adb_setup_notification_pairing_code_error_desc_pairing));
                        builder2.setSmallIcon(R.drawable.ic_fluent_error_circle_24_filled);
                    } else if (ordinal == 3) {
                        builder2.setContentTitle(m2.f7415R.getString(R.string.adb_setup_notification_pairing_code_error));
                        builder2.setContentText(m2.f7415R.getString(R.string.adb_setup_notification_pairing_code_error_desc_setup));
                        builder2.setSmallIcon(R.drawable.ic_fluent_error_circle_24_filled);
                    }
                    builder2.setContentIntent(B2);
                    builder2.setAllowSystemGeneratedContextualActions(false);
                    if (Y5.X) {
                        builder2.setForegroundServiceBehavior(1);
                    }
                    m2.f7415R.startForeground(300, builder2.build());
                }
                return o8s.R;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof h2V) || !(obj instanceof fUn)) {
                    return false;
                }
                return n3x.v(v(), ((fUn) obj).v());
            }

            public final int hashCode() {
                return v().hashCode();
            }

            @Override // defpackage.fUn
            public final aAC v() {
                return new kk(AdbPairingService.this, AdbPairingService.class);
            }
        });
        l6.z(gQc.Q(this), iFn.R, 0, new U0(this, null), 2);
    }

    @Override // defpackage.gCv, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        CharSequence charSequence;
        super.onStartCommand(intent, i, i2);
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("requestCode", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 100) {
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
            if (resultsFromIntent == null || (charSequence = resultsFromIntent.getCharSequence("key_adb_pairing_code")) == null) {
                return 2;
            }
            String obj = iH_.vr(charSequence.toString()).toString();
            if (!Jk.R.R.matcher(obj).matches()) {
                pby[] pbyArr = kxm.R;
                this.f2736R.H(new oMu(cY.WrongCode));
                return 2;
            }
            l6.z(gQc.Q(this), null, 0, new c9(this, obj, null), 3);
            return 2;
        } else if (valueOf != null && valueOf.intValue() == 101) {
            stopSelf();
            stopForeground(true);
            l6.z(g8W.R, null, 0, new H3(this, null), 3);
            return 2;
        } else {
            Intent intent2 = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
            intent2.putExtra(":settings:fragment_args_key", "toggle_adb_wireless");
            Bundle bundle = new Bundle();
            bundle.putString(":settings:fragment_args_key", "toggle_adb_wireless");
            intent2.putExtra(":settings:show_fragment_args", bundle);
            intent2.addFlags(268435456);
            startActivity(intent2);
            return 2;
        }
    }
}
