package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: i1V  reason: default package */
/* loaded from: classes.dex */
public final class i1V extends Binder implements i9A {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ MultiInstanceInvalidationService f4438R;

    public i1V(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f4438R = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    /* renamed from: L */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ho5 ho5 = null;
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                ho5 = (queryLocalInterface == null || !(queryLocalInterface instanceof ho5)) ? new dz2(readStrongBinder) : (ho5) queryLocalInterface;
            }
            int Z = Z(ho5, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(Z);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                ho5 = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof ho5)) ? new dz2(readStrongBinder2) : (ho5) queryLocalInterface2;
            }
            int readInt = parcel.readInt();
            synchronized (this.f4438R.f1442R) {
                this.f4438R.f1442R.unregister(ho5);
                this.f4438R.f1441R.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            O(parcel.readInt(), parcel.createStringArray());
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    public final void O(int i, String[] strArr) {
        synchronized (this.f4438R.f1442R) {
            String str = (String) this.f4438R.f1441R.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = this.f4438R.f1442R.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                int intValue = ((Integer) this.f4438R.f1442R.getBroadcastCookie(i2)).intValue();
                String str2 = (String) this.f4438R.f1441R.get(Integer.valueOf(intValue));
                if (i != intValue && str.equals(str2)) {
                    try {
                        ((ho5) this.f4438R.f1442R.getBroadcastItem(i2)).c(strArr);
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    }
                }
            }
            this.f4438R.f1442R.finishBroadcast();
        }
    }

    public final int Z(ho5 ho5, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f4438R.f1442R) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f4438R;
            int i = multiInstanceInvalidationService.e + 1;
            multiInstanceInvalidationService.e = i;
            if (multiInstanceInvalidationService.f1442R.register(ho5, Integer.valueOf(i))) {
                this.f4438R.f1441R.put(Integer.valueOf(i), str);
                return i;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f4438R;
            multiInstanceInvalidationService2.e--;
            return 0;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
