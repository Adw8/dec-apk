package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: eTk  reason: default package */
/* loaded from: classes.dex */
public abstract class eTk extends Binder implements boR {
    public eTk() {
        attachInterface(this, boR.v);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = boR.v;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i != 1598968902) {
            if (i == 1) {
                parcel.readInt();
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                parcel.enforceNoDataAvail();
            } else if (i == 2) {
                parcel.readInt();
                parcel.enforceNoDataAvail();
            } else if (i == 3) {
                parcel.readInt();
                parcel.readInt();
                parcel.enforceNoDataAvail();
            } else if (i == 4) {
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                String readString = parcel.readString();
                parcel.enforceNoDataAvail();
                ((_s) this).L(readInt, readInt2, readString);
            } else if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.enforceNoDataAvail();
                ((_s) this).O(readInt3, readInt4);
            }
            return true;
        }
        parcel2.writeString(str);
        return true;
    }
}
