package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: peG  reason: default package */
/* loaded from: classes.dex */
public final class peG implements Parcelable {
    public static final Parcelable.Creator<peG> CREATOR = new bv1(18);
    public int L;
    public int O;
    public List R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7150R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f7151R;
    public int X;
    public boolean c;
    public int e;
    public boolean v;

    /* renamed from: v  reason: collision with other field name */
    public int[] f7152v;

    public peG() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.X);
        parcel.writeInt(this.O);
        if (this.O > 0) {
            parcel.writeIntArray(this.f7151R);
        }
        parcel.writeInt(this.L);
        if (this.L > 0) {
            parcel.writeIntArray(this.f7152v);
        }
        parcel.writeInt(this.f7150R ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeList(this.R);
    }

    public peG(Parcel parcel) {
        this.e = parcel.readInt();
        this.X = parcel.readInt();
        int readInt = parcel.readInt();
        this.O = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f7151R = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.L = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.f7152v = iArr2;
            parcel.readIntArray(iArr2);
        }
        boolean z = false;
        this.f7150R = parcel.readInt() == 1;
        this.v = parcel.readInt() == 1;
        this.c = parcel.readInt() == 1 ? true : z;
        this.R = parcel.readArrayList(fDp.class.getClassLoader());
    }

    public peG(peG peg) {
        this.O = peg.O;
        this.e = peg.e;
        this.X = peg.X;
        this.f7151R = peg.f7151R;
        this.L = peg.L;
        this.f7152v = peg.f7152v;
        this.f7150R = peg.f7150R;
        this.v = peg.v;
        this.c = peg.c;
        this.R = peg.R;
    }
}
