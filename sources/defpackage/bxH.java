package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bxH  reason: default package */
/* loaded from: classes.dex */
public final class bxH implements Parcelable {
    public static final Parcelable.Creator<bxH> CREATOR = new bv1(12);
    public String R;
    public int e;

    public bxH(Parcel parcel) {
        this.R = parcel.readString();
        this.e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.R);
        parcel.writeInt(this.e);
    }
}
