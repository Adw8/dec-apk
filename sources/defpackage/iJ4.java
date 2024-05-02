package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: iJ4  reason: default package */
/* loaded from: classes.dex */
public final class iJ4 extends OG {
    public static final Parcelable.Creator<iJ4> CREATOR = new m31(5);
    public Parcelable v;

    public iJ4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.v = parcel.readParcelable(classLoader == null ? kds.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.OG, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f327R, i);
        parcel.writeParcelable(this.v, 0);
    }

    public iJ4(Parcelable parcelable) {
        super(parcelable);
    }
}
