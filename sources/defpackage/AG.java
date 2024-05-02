package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: AG  reason: default package */
/* loaded from: classes.dex */
public final class AG extends View.BaseSavedState {
    public static final Parcelable.Creator<AG> CREATOR = new bv1(7);
    public boolean R;

    public AG(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.R ? (byte) 1 : 0);
    }

    public AG(Parcel parcel) {
        super(parcel);
        this.R = parcel.readByte() != 0;
    }
}
