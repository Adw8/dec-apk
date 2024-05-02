package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: iB2  reason: default package */
/* loaded from: classes.dex */
public final class iB2 extends OG {
    public static final Parcelable.Creator<iB2> CREATOR = new m31(0);
    public boolean R;

    public iB2(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("SearchView.SavedState{");
        U.append(Integer.toHexString(System.identityHashCode(this)));
        U.append(" isIconified=");
        U.append(this.R);
        U.append("}");
        return U.toString();
    }

    @Override // defpackage.OG, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.f327R, i);
        parcel.writeValue(Boolean.valueOf(this.R));
    }

    public iB2(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.R = ((Boolean) parcel.readValue(null)).booleanValue();
    }
}
