package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: fKE  reason: default package */
/* loaded from: classes.dex */
public final class fKE implements Parcelable {
    public static final Parcelable.Creator<fKE> CREATOR = new bv1(0);
    public ParcelFileDescriptor R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3380R = false;

    /* renamed from: R  reason: collision with other field name */
    public kzi[] f3381R;

    public static int R(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Object[]) {
            int i = 0;
            for (Object obj2 : (Object[]) obj) {
                i |= R(obj2);
            }
            return i;
        } else if (obj instanceof Parcelable) {
            return ((Parcelable) obj).describeContents();
        } else {
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return R(this.f3381R) | R(this.R) | 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeTypedObject(this.R, i);
        parcel.writeBoolean(this.f3380R);
        parcel.writeTypedArray(this.f3381R, i);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
