package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: kzi  reason: default package */
/* loaded from: classes.dex */
public final class kzi implements Parcelable {
    public static final Parcelable.Creator<kzi> CREATOR = new bv1(1);
    public ParcelFileDescriptor R;

    /* renamed from: R  reason: collision with other field name */
    public String f5537R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5538R = false;

    @Override // android.os.Parcelable
    public final int describeContents() {
        ParcelFileDescriptor parcelFileDescriptor = this.R;
        return (parcelFileDescriptor == null ? 0 : parcelFileDescriptor.describeContents()) | 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.f5537R);
        parcel.writeTypedObject(this.R, i);
        parcel.writeBoolean(this.f5538R);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
