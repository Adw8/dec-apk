package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: ehk  reason: default package */
/* loaded from: classes.dex */
public final class ehk implements Parcelable {
    public static final Parcelable.Creator<ehk> CREATOR = new bv1(13);
    public String R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f3180R;

    /* renamed from: R  reason: collision with other field name */
    public H7[] f3181R;
    public ArrayList X;
    public ArrayList c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public ArrayList f3182e;
    public ArrayList v;

    public ehk() {
        this.R = null;
        this.c = new ArrayList();
        this.f3182e = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f3180R);
        parcel.writeStringList(this.v);
        parcel.writeTypedArray(this.f3181R, i);
        parcel.writeInt(this.e);
        parcel.writeString(this.R);
        parcel.writeStringList(this.c);
        parcel.writeTypedList(this.f3182e);
        parcel.writeTypedList(this.X);
    }

    public ehk(Parcel parcel) {
        this.R = null;
        this.c = new ArrayList();
        this.f3182e = new ArrayList();
        this.f3180R = parcel.createStringArrayList();
        this.v = parcel.createStringArrayList();
        this.f3181R = (H7[]) parcel.createTypedArray(H7.CREATOR);
        this.e = parcel.readInt();
        this.R = parcel.readString();
        this.c = parcel.createStringArrayList();
        this.f3182e = parcel.createTypedArrayList(Ho.CREATOR);
        this.X = parcel.createTypedArrayList(bxH.CREATOR);
    }
}
