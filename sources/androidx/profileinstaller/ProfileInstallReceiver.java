package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                dTl.l(context, new i2_(0), new h89(17, this), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                String string = intent.getExtras().getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    h89 h89 = new h89(17, this);
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0);
                        try {
                            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
                            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                            dataOutputStream.close();
                        } catch (IOException unused) {
                        }
                        new lff(h89, 10, null, 1).run();
                    } catch (PackageManager.NameNotFoundException e) {
                        new lff(h89, 7, e, 1).run();
                    }
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    h89 h892 = new h89(17, this);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new lff(h892, 11, null, 1).run();
                }
            }
        }
    }
}
