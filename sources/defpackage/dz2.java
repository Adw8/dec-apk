package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dz2  reason: default package */
/* loaded from: classes.dex */
public final class dz2 implements ho5 {
    public IBinder R;

    public dz2(IBinder iBinder) {
        this.R = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.R;
    }

    @Override // defpackage.ho5
    public final void c(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.R.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
