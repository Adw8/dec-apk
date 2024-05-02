package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: fDC  reason: default package */
/* loaded from: classes.dex */
public final class fDC extends OG {
    public static final Parcelable.Creator<fDC> CREATOR = new m31(9);
    public CharSequence R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3353R;

    public fDC(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("TextInputLayout.SavedState{");
        U.append(Integer.toHexString(System.identityHashCode(this)));
        U.append(" error=");
        U.append((Object) this.R);
        U.append("}");
        return U.toString();
    }

    @Override // defpackage.OG, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(((OG) this).f327R, i);
        TextUtils.writeToParcel(this.R, parcel, i);
        parcel.writeInt(this.f3353R ? 1 : 0);
    }

    public fDC(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.R = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3353R = parcel.readInt() != 1 ? false : true;
    }
}
