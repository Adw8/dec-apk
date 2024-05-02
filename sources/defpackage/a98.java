package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: a98  reason: default package */
/* loaded from: classes.dex */
public final class a98 implements Parcelable {
    public static final Parcelable.Creator<a98> CREATOR = new bv1(2);
    public byte R;

    /* renamed from: R  reason: collision with other field name */
    public ParcelFileDescriptor f762R;

    /* renamed from: R  reason: collision with other field name */
    public String f763R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f764R;

    /* renamed from: R  reason: collision with other field name */
    public String[] f766R;
    public ParcelFileDescriptor c;
    public ParcelFileDescriptor v;

    /* renamed from: v  reason: collision with other field name */
    public String f767v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f765R = false;
    public int e = 0;
    public int X = 1;

    public static int R(Object obj) {
        int i = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
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
        return R(this.c) | R(this.f762R) | 0 | R(this.v) | R(this.f764R);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeTypedObject(this.f762R, i);
        parcel.writeTypedObject(this.v, i);
        parcel.writeTypedList(this.f764R);
        parcel.writeTypedObject(this.c, i);
        parcel.writeString(this.f763R);
        parcel.writeByte(this.R);
        parcel.writeBoolean(this.f765R);
        parcel.writeInt(this.e);
        parcel.writeInt(this.X);
        parcel.writeString(this.f767v);
        parcel.writeStringArray(this.f766R);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
