package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new bv1(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cL7 cl7 = (cL7) this;
        parcel.writeParcelable(cl7.R, 0);
        parcel.writeInt(cl7.f2072R ? 1 : 0);
    }
}
