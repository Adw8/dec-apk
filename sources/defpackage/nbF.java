package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.Service;
import android.media.AudioAttributes;
import android.net.Uri;
import dev.kdrag0n.virtcontainer.R;
import java.util.Collections;

/* renamed from: nbF  reason: default package */
/* loaded from: classes.dex */
public final class nbF {
    public final Service R;

    public nbF(Service service, mEh meh) {
        this.R = service;
        meh.f5985R.v();
        meh.R.createNotificationChannelGroups(Collections.singletonList(new NotificationChannelGroup("service", meh.f5984R.getString(R.string.service_notification_group))));
        NotificationManager notificationManager = meh.R;
        NotificationChannel notificationChannel = new NotificationChannel("service__persistent", meh.f5984R.getString(R.string.service_notification_channel_persistent), 4);
        notificationChannel.setDescription(meh.f5984R.getString(R.string.service_notification_channel_persistent_desc));
        notificationChannel.setGroup("service");
        notificationChannel.enableVibration(false);
        Uri parse = Uri.parse("android.resource://dev.kdrag0n.virtcontainer/raw/sound_silent_notification");
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(4);
        builder.setUsage(5);
        notificationChannel.setSound(parse, builder.build());
        NotificationChannel notificationChannel2 = new NotificationChannel("service__errors", meh.f5984R.getString(R.string.service_notification_channel_errors), 4);
        notificationChannel2.setDescription(meh.f5984R.getString(R.string.service_notification_channel_errors_desc));
        notificationChannel2.setGroup("service");
        NotificationChannel notificationChannel3 = new NotificationChannel("service__action", meh.f5984R.getString(R.string.service_notification_channel_action), 4);
        notificationChannel3.setDescription(meh.f5984R.getString(R.string.service_notification_channel_action_desc));
        notificationChannel3.setGroup("service");
        NotificationChannel notificationChannel4 = new NotificationChannel("adb_setup__upgrade", meh.f5984R.getString(R.string.adb_setup_notification_channel_upgrade), 2);
        notificationChannel4.setDescription(meh.f5984R.getString(R.string.adb_setup_notification_channel_upgrade_desc));
        notificationChannel4.setGroup("adb_setup");
        notificationManager.createNotificationChannels(pdD.Y(notificationChannel, notificationChannel2, notificationChannel3, notificationChannel4));
    }
}
