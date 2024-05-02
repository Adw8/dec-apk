package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: fDp  reason: default package */
/* loaded from: classes.dex */
public final class fDp implements Parcelable {
    public static final Parcelable.Creator<fDp> CREATOR = new bv1(17);
    public boolean R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f3354R;
    public int X;
    public int e;

    public fDp(Parcel parcel) {
        this.e = parcel.readInt();
        this.X = parcel.readInt();
        this.R = parcel.readInt() != 1 ? false : true;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f3354R = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("FullSpanItem{mPosition=");
        U.append(this.e);
        U.append(", mGapDir=");
        U.append(this.X);
        U.append(", mHasUnwantedGapAfter=");
        U.append(this.R);
        U.append(", mGapPerSpan=");
        U.append(Arrays.toString(this.f3354R));
        U.append('}');
        return U.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.X);
        parcel.writeInt(this.R ? 1 : 0);
        int[] iArr = this.f3354R;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f3354R);
    }
}
