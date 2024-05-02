package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: TW  reason: default package */
/* loaded from: classes.dex */
public final class TW extends OG {
    public static final Parcelable.Creator<TW> CREATOR = new m31(6);
    public boolean R;
    public int X;
    public boolean c;
    public final int e;
    public boolean v;

    public TW(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readInt();
        this.X = parcel.readInt();
        boolean z = false;
        this.R = parcel.readInt() == 1;
        this.v = parcel.readInt() == 1;
        this.c = parcel.readInt() == 1 ? true : z;
    }

    @Override // defpackage.OG, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.f327R, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.X);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public TW(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.e = bottomSheetBehavior.N;
        this.X = bottomSheetBehavior.f2285v;
        this.R = bottomSheetBehavior.f2274R;
        this.v = bottomSheetBehavior.f2275U;
        this.c = bottomSheetBehavior.f2256C;
    }
}
