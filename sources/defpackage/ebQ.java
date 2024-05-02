package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;

/* renamed from: ebQ  reason: default package */
/* loaded from: classes.dex */
public abstract class ebQ extends fdM {
    public ebQ() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // defpackage.fdM
    public final boolean O(int i, Parcel parcel) {
        k8L k8l = null;
        if (i == 2) {
            Bundle bundle = (Bundle) okB.R(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                k8l = queryLocalInterface instanceof k8L ? (k8L) queryLocalInterface : new k8L(readStrongBinder);
            }
            bNW bnw = (bNW) this;
            synchronized (bnw) {
                bnw.f1617R.X("updateServiceState AIDL call", new Object[0]);
                if (meq.v(bnw.f1613R) && meq.R(bnw.f1613R)) {
                    int i2 = bundle.getInt("action_type");
                    kX6 kx6 = bnw.f1616R;
                    synchronized (kx6.f5325R) {
                        kx6.f5325R.add(k8l);
                    }
                    if (i2 == 1) {
                        String string = bundle.getString("notification_channel_name");
                        synchronized (bnw) {
                            if (string == null) {
                                string = "File downloads by Play";
                            }
                            bnw.R.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", string, 2));
                            bnw.f1615R.R(true);
                            kX6 kx62 = bnw.f1616R;
                            String string2 = bundle.getString("notification_title");
                            String string3 = bundle.getString("notification_subtext");
                            long j = bundle.getLong("notification_timeout", 600000);
                            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                            Notification.Builder timeoutAfter = new Notification.Builder(bnw.f1613R, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j);
                            if (parcelable instanceof PendingIntent) {
                                timeoutAfter.setContentIntent((PendingIntent) parcelable);
                            }
                            Notification.Builder ongoing = timeoutAfter.setSmallIcon(17301633).setOngoing(false);
                            if (string2 == null) {
                                string2 = "Downloading additional file";
                            }
                            Notification.Builder contentTitle = ongoing.setContentTitle(string2);
                            if (string3 == null) {
                                string3 = "Transferring";
                            }
                            contentTitle.setSubText(string3);
                            int i3 = bundle.getInt("notification_color");
                            if (i3 != 0) {
                                timeoutAfter.setColor(i3).setVisibility(-1);
                            }
                            kx62.R = timeoutAfter.build();
                            bnw.f1613R.bindService(new Intent(bnw.f1613R, ExtractionForegroundService.class), bnw.f1616R, 1);
                        }
                    } else if (i2 == 2) {
                        bnw.f1615R.R(false);
                        kX6 kx63 = bnw.f1616R;
                        kx63.f5326R.X("Stopping foreground installation service.", new Object[0]);
                        kx63.f5323R.unbindService(kx63);
                        ExtractionForegroundService extractionForegroundService = kx63.f5324R;
                        if (extractionForegroundService != null) {
                            synchronized (extractionForegroundService) {
                                extractionForegroundService.stopForeground(true);
                                extractionForegroundService.stopSelf();
                            }
                        }
                        kx63.R();
                    } else {
                        bnw.f1617R.L("Unknown action type received: %d", Integer.valueOf(i2));
                        k8l.X(new Bundle());
                    }
                }
                k8l.X(new Bundle());
            }
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) okB.R(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                k8l = queryLocalInterface2 instanceof k8L ? (k8L) queryLocalInterface2 : new k8L(readStrongBinder2);
            }
            bNW bnw2 = (bNW) this;
            bnw2.f1617R.X("clearAssetPackStorage AIDL call", new Object[0]);
            if (!meq.v(bnw2.f1613R) || !meq.R(bnw2.f1613R)) {
                k8l.X(new Bundle());
            } else {
                dRx.L(bnw2.f1614R.e());
                Bundle bundle3 = new Bundle();
                Parcel O = k8l.O();
                O.writeInt(1);
                bundle3.writeToParcel(O, 0);
                k8l.L(O, 4);
            }
        }
        return true;
    }
}
