package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: gdM  reason: default package */
/* loaded from: classes.dex */
public final class gdM implements Parcelable {
    public static final Parcelable.Creator<gdM> CREATOR = new bv1(25);
    public int L;
    public int O;
    public int X;
    public final int e;

    public gdM(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.X = readInt;
        this.O = readInt2;
        this.L = readInt3;
        this.e = readInt4;
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
        if (!(obj instanceof gdM)) {
            return false;
        }
        gdM gdm = (gdM) obj;
        return this.X == gdm.X && this.O == gdm.O && this.e == gdm.e && this.L == gdm.L;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.X), Integer.valueOf(this.O), Integer.valueOf(this.L)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeInt(this.O);
        parcel.writeInt(this.L);
        parcel.writeInt(this.e);
    }
}
