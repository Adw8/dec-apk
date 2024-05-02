package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: ooN  reason: default package */
/* loaded from: classes.dex */
public final class ooN extends View.BaseSavedState {
    public static final Parcelable.Creator<ooN> CREATOR = new bv1(20);
    public int e;

    public ooN(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("MaterialCheckBox.SavedState{");
        U.append(Integer.toHexString(System.identityHashCode(this)));
        U.append(" CheckedState=");
        int i = this.e;
        return jQ.g(U, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.e));
    }

    public ooN(Parcel parcel) {
        super(parcel);
        this.e = ((Integer) parcel.readValue(ooN.class.getClassLoader())).intValue();
    }
}
