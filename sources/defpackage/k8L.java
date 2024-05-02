package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: k8L  reason: default package */
/* loaded from: classes.dex */
public final class k8L extends odz {
    public k8L(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void X(Bundle bundle) {
        Parcel O = O();
        int i = okB.R;
        O.writeInt(1);
        bundle.writeToParcel(O, 0);
        L(O, 3);
    }
}
