package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aEu  reason: default package */
/* loaded from: classes.dex */
public final class aEu implements p2K, IInterface {
    public final IBinder R;

    public aEu(IBinder iBinder) {
        this.R = iBinder;
    }

    public final Parcel L(Parcel parcel, int i) {
        try {
            parcel = Parcel.obtain();
            this.R.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public final int O(int i, String str, String str2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        obtain.writeInt(i);
        obtain.writeString(str);
        obtain.writeString(str2);
        int i2 = ar1.R;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        Parcel L = L(obtain, 10);
        int readInt = L.readInt();
        L.recycle();
        return readInt;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.R;
    }
}
