package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: dt7  reason: default package */
/* loaded from: classes.dex */
public final class dt7 extends aFk implements iv7 {
    public /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dt7(int i, aOO aoo) {
        super(2, aoo);
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((dt7) X((dCq) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        int i = this.X;
        dbI dbi = (dbI) ((HI) ((dCq) this.R)).f174R;
        dbi.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(n6Q.R);
            obtain.writeInt(i);
            dbi.R.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return (ParcelFileDescriptor) obtain2.readTypedObject(ParcelFileDescriptor.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        dt7 dt7 = new dt7(this.X, aoo);
        dt7.R = obj;
        return dt7;
    }
}
