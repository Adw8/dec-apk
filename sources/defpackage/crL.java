package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: crL  reason: default package */
/* loaded from: classes.dex */
public final class crL implements Parcelable {
    public static final Parcelable.Creator<crL> CREATOR = new bv1(8);
    public final int e;

    public crL(int i) {
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crL) && this.e == ((crL) obj).e;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    @Override // java.lang.Object
    public final String toString() {
        return jQ.P(opT.U("DefaultLazyKey(index="), this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
    }
}
