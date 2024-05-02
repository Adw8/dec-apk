package androidx.core.app;

import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(o25 o25) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        g_3 g_3 = remoteActionCompat.f1278R;
        boolean z = true;
        if (o25.X(1)) {
            g_3 = o25.L();
        }
        remoteActionCompat.f1278R = (IconCompat) g_3;
        CharSequence charSequence = remoteActionCompat.f1279R;
        if (o25.X(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((aFZ) o25).f807R);
        }
        remoteActionCompat.f1279R = charSequence;
        CharSequence charSequence2 = remoteActionCompat.v;
        if (o25.X(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((aFZ) o25).f807R);
        }
        remoteActionCompat.v = charSequence2;
        remoteActionCompat.R = (PendingIntent) o25.O(remoteActionCompat.R, 4);
        boolean z2 = remoteActionCompat.f1280R;
        if (o25.X(5)) {
            z2 = ((aFZ) o25).f807R.readInt() != 0;
        }
        remoteActionCompat.f1280R = z2;
        z = remoteActionCompat.f1281v;
        if (o25.X(6)) {
            if (((aFZ) o25).f807R.readInt() == 0) {
                z = false;
            }
        }
        remoteActionCompat.f1281v = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, o25 o25) {
        o25.getClass();
        IconCompat iconCompat = remoteActionCompat.f1278R;
        o25.Z(1);
        o25.m(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1279R;
        o25.Z(2);
        aFZ afz = (aFZ) o25;
        TextUtils.writeToParcel(charSequence, afz.f807R, 0);
        CharSequence charSequence2 = remoteActionCompat.v;
        o25.Z(3);
        TextUtils.writeToParcel(charSequence2, afz.f807R, 0);
        PendingIntent pendingIntent = remoteActionCompat.R;
        o25.Z(4);
        afz.f807R.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f1280R;
        o25.Z(5);
        afz.f807R.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f1281v;
        o25.Z(6);
        afz.f807R.writeInt(z2 ? 1 : 0);
    }
}
