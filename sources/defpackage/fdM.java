package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: fdM  reason: default package */
/* loaded from: classes.dex */
public abstract class fdM extends Binder implements IInterface {
    public fdM(String str) {
        attachInterface(this, str);
    }

    public abstract boolean O(int i, Parcel parcel);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return O(i, parcel);
    }
}
