package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ebm  reason: default package */
/* loaded from: classes.dex */
public final class ebm extends OG {
    public static final Parcelable.Creator<ebm> CREATOR = new m31(1);
    public boolean R;
    public int e;

    public ebm(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readInt();
        this.R = parcel.readInt() != 0;
    }

    @Override // defpackage.OG, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.f327R, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.R ? 1 : 0);
    }

    public ebm(Parcelable parcelable) {
        super(parcelable);
    }
}
