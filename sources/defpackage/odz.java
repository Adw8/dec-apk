package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: odz  reason: default package */
/* loaded from: classes.dex */
public abstract class odz implements IInterface {
    public final IBinder R;
    public final String e;

    public odz(IBinder iBinder, String str) {
        this.R = iBinder;
        this.e = str;
    }

    public final void L(Parcel parcel, int i) {
        try {
            this.R.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel O() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.e);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.R;
    }
}
