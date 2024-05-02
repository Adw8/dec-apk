package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: bDs  reason: default package */
/* loaded from: classes.dex */
public final class bDs implements js8 {
    public IBinder R;

    public bDs(IBinder iBinder) {
        this.R = iBinder;
    }

    public final n6Q O(l08 l08, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        n6Q n6q;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(js8.c);
            obtain.writeTypedObject(l08, 0);
            obtain.writeTypedObject(parcelFileDescriptor, 0);
            obtain.writeTypedObject(parcelFileDescriptor2, 0);
            this.R.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            int i = fmQ.R;
            if (readStrongBinder == null) {
                n6q = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(n6Q.R);
                n6q = (queryLocalInterface == null || !(queryLocalInterface instanceof n6Q)) ? new dbI(readStrongBinder) : (n6Q) queryLocalInterface;
            }
            return n6q;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.R;
    }
}
