package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y2  reason: default package */
/* loaded from: classes.dex */
public final class y2 extends OG {
    public static final Parcelable.Creator<y2> CREATOR = new m31(8);
    public boolean R;

    public y2(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.OG, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.f327R, i);
        parcel.writeInt(this.R ? 1 : 0);
    }

    public y2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.R = parcel.readInt() != 1 ? false : true;
    }
}
