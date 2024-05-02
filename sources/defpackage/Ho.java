package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Ho  reason: default package */
/* loaded from: classes.dex */
public final class Ho implements Parcelable {
    public static final Parcelable.Creator<Ho> CREATOR = new bv1(11);
    public final List R;
    public final List v;

    public Ho(ArrayList arrayList, ArrayList arrayList2) {
        this.R = arrayList;
        this.v = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.R);
        parcel.writeTypedList(this.v);
    }

    public Ho(Parcel parcel) {
        this.R = parcel.createStringArrayList();
        this.v = parcel.createTypedArrayList(H7.CREATOR);
    }
}
