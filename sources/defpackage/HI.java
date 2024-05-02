package defpackage;

import android.os.Parcel;

/* renamed from: HI  reason: default package */
/* loaded from: classes.dex */
public final class HI implements dCq {
    public final bLS R = pip.R(0, 0, null, 7);

    /* renamed from: R  reason: collision with other field name */
    public final iyL f173R = new iyL();

    /* renamed from: R  reason: collision with other field name */
    public final n6Q f174R;

    public HI(n6Q n6q) {
        this.f174R = n6q;
        _s _sVar = new _s(this);
        dbI dbi = (dbI) n6q;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(n6Q.R);
            obtain.writeStrongInterface(_sVar);
            dbi.R.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
