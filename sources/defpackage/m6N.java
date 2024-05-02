package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m6N  reason: default package */
/* loaded from: classes.dex */
public final class m6N implements Parcelable {
    public static final Parcelable.Creator<m6N> CREATOR = new bv1(16);
    public boolean R;
    public int X;
    public int e;

    public m6N() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.X);
        parcel.writeInt(this.R ? 1 : 0);
    }

    public m6N(Parcel parcel) {
        this.e = parcel.readInt();
        this.X = parcel.readInt();
        this.R = parcel.readInt() != 1 ? false : true;
    }

    public m6N(m6N m6n) {
        this.e = m6n.e;
        this.X = m6n.X;
        this.R = m6n.R;
    }
}
