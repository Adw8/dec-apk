package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: fhb  reason: default package */
/* loaded from: classes.dex */
public final class fhb implements Parcelable {
    public static final Parcelable.Creator<fhb> CREATOR = new bv1(4);
    public ParcelFileDescriptor R;

    /* renamed from: R  reason: collision with other field name */
    public String f3504R;

    /* renamed from: R  reason: collision with other field name */
    public fKE[] f3506R;

    /* renamed from: R  reason: collision with other field name */
    public String[] f3507R;
    public ParcelFileDescriptor c;

    /* renamed from: c  reason: collision with other field name */
    public String f3508c;
    public ParcelFileDescriptor v;

    /* renamed from: v  reason: collision with other field name */
    public String f3509v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3505R = false;
    public int e = 0;
    public int X = 1;

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
        return R(this.f3506R) | R(this.R) | 0 | R(this.v) | R(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeTypedObject(this.R, i);
        parcel.writeTypedObject(this.v, i);
        parcel.writeString(this.f3504R);
        parcel.writeTypedObject(this.c, i);
        parcel.writeTypedArray(this.f3506R, i);
        parcel.writeBoolean(this.f3505R);
        parcel.writeInt(this.e);
        parcel.writeInt(this.X);
        parcel.writeString(this.f3509v);
        parcel.writeString(this.f3508c);
        parcel.writeStringArray(this.f3507R);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
