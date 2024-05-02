package dev.kdrag0n.app.adb;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface MdnsCallback {
    void onPortDiscovered(int i, int i2);

    void onServiceLost(int i);
}
