package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: aEW  reason: default package */
/* loaded from: classes.dex */
public final class aEW implements Ke {
    public static final Parcelable.Creator<aEW> CREATOR = new bv1(22);
    public final long R;

    public aEW(long j) {
        this.R = j;
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
        return (obj instanceof aEW) && this.R == ((aEW) obj).R;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.R)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.R);
    }
}
