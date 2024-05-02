package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: oST  reason: default package */
/* loaded from: classes.dex */
public final class oST extends i4H implements Parcelable {
    public static final Parcelable.Creator<oST> CREATOR = new m31(2);

    public oST(Object obj, dqr dqr) {
        super(obj, dqr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        dqr dqr = ((i4H) this).R;
        if (n3x.v(dqr, d6b.R)) {
            i2 = 0;
        } else if (n3x.v(dqr, bHa.R)) {
            i2 = 1;
        } else if (n3x.v(dqr, bYG.R)) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
