package defpackage;

import android.os.Parcel;

/* renamed from: oL0  reason: default package */
/* loaded from: classes.dex */
public final class oL0 extends aFk implements iv7 {
    public final /* synthetic */ dCq R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oL0(dCq dcq, aOO aoo) {
        super(2, aoo);
        this.R = dcq;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((oL0) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        dbI dbi = (dbI) ((HI) this.R).f174R;
        dbi.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(n6Q.R);
            dbi.R.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            return o8s.R;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new oL0(this.R, aoo);
    }
}
