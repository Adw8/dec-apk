package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: g_h  reason: default package */
/* loaded from: classes.dex */
public final class g_h extends View.BaseSavedState {
    public static final Parcelable.Creator<g_h> CREATOR = new bv1(9);
    public int e;

    public g_h(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("HorizontalScrollView.SavedState{");
        U.append(Integer.toHexString(System.identityHashCode(this)));
        U.append(" scrollPosition=");
        return jQ.j(U, this.e, "}");
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e);
    }

    public g_h(Parcel parcel) {
        super(parcel);
        this.e = parcel.readInt();
    }
}
