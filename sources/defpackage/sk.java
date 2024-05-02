package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import dev.kdrag0n.virtcontainer.R;
import java.util.Collections;

/* renamed from: sk  reason: default package */
/* loaded from: classes.dex */
public final class sk {
    public final F4 R;

    /* renamed from: R  reason: collision with other field name */
    public final NotificationManager f7414R;

    /* renamed from: R  reason: collision with other field name */
    public final Service f7415R;

    public sk(Service service, NotificationManager notificationManager, F4 f4) {
        this.f7415R = service;
        this.f7414R = notificationManager;
        this.R = f4;
    }

    public final void R(Notification.Builder builder) {
        Service service = this.f7415R;
        Intent intent = new Intent(service, service.getClass());
        intent.putExtra("requestCode", 101);
        builder.addAction(new Notification.Action.Builder((Icon) null, this.f7415R.getString(R.string.cancel), PendingIntent.getForegroundService(service, 10101, intent, 201326592)).build());
    }

    public final void c(boolean z) {
        Notification.Builder builder = new Notification.Builder(this.f7415R, "adb_setup__pairing");
        Intent intent = new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
        intent.putExtra(":settings:fragment_args_key", "toggle_adb_wireless");
        Bundle bundle = new Bundle();
        bundle.putString(":settings:fragment_args_key", "toggle_adb_wireless");
        intent.putExtra(":settings:show_fragment_args", bundle);
        PendingIntent B = hDC.B(intent, this.f7415R, 300);
        R(builder);
        if (z) {
            builder.setContentTitle(this.f7415R.getString(R.string.adb_setup_notification_waiting_pairing));
            builder.setContentText(this.f7415R.getString(R.string.adb_setup_notification_waiting_pairing_desc));
            builder.setSmallIcon(R.drawable.ic_fluent_link_24_filled);
        } else {
            builder.setContentTitle(this.f7415R.getString(R.string.adb_setup_notification_waiting_server));
            builder.setContentText(this.f7415R.getString(R.string.adb_setup_notification_waiting_server_desc));
            builder.setSmallIcon(R.drawable.ic_fluent_wrench_24_filled);
        }
        builder.setContentIntent(B);
        if (Y5.X) {
            builder.setForegroundServiceBehavior(1);
        }
        this.f7415R.startForeground(300, builder.build());
    }

    public final void v() {
        this.f7414R.createNotificationChannelGroups(Collections.singletonList(new NotificationChannelGroup("adb_setup", this.f7415R.getString(R.string.adb_setup_notification_group))));
        NotificationManager notificationManager = this.f7414R;
        NotificationChannel notificationChannel = new NotificationChannel("adb_setup__pairing", this.f7415R.getString(R.string.adb_setup_notification_channel_pairing), 4);
        notificationChannel.setDescription(this.f7415R.getString(R.string.adb_setup_notification_channel_pairing_desc));
        notificationChannel.setGroup("adb_setup");
        notificationManager.createNotificationChannels(Collections.singletonList(notificationChannel));
    }
}
