package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: OG  reason: default package */
/* loaded from: classes.dex */
public abstract class OG implements Parcelable {

    /* renamed from: R  reason: collision with other field name */
    public final Parcelable f327R;
    public static final uY R = new uY();
    public static final Parcelable.Creator<OG> CREATOR = new m31(4);

    public OG() {
        this.f327R = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f327R, i);
    }

    public OG(Parcelable parcelable) {
        if (parcelable != null) {
            this.f327R = parcelable == R ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public OG(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f327R = readParcelable == null ? R : readParcelable;
    }
}
