package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: jbh  reason: default package */
/* loaded from: classes.dex */
public final class jbh extends OG {
    public static final Parcelable.Creator<jbh> CREATOR = new m31(3);
    public SparseArray R;

    public jbh(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.R = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.R.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // defpackage.OG, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(super.f327R, i);
        SparseArray sparseArray = this.R;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.R.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.R.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public jbh(Parcelable parcelable) {
        super(parcelable);
    }
}
