package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k_4  reason: default package */
/* loaded from: classes.dex */
public final class k_4 extends OG {
    public static final Parcelable.Creator<k_4> CREATOR = new m31(7);
    public boolean R;

    public k_4(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // defpackage.OG, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.f327R, i);
        parcel.writeInt(this.R ? 1 : 0);
    }

    public k_4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            k_4.class.getClassLoader();
        }
        this.R = parcel.readInt() != 1 ? false : true;
    }
}
