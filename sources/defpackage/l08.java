package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l08  reason: default package */
/* loaded from: classes.dex */
public final class l08 implements Parcelable {
    public static final Parcelable.Creator<l08> CREATOR = new bv1(3);
    public Object R;
    public int e;

    public l08(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            this.e = readInt;
            this.R = (a98) parcel.readTypedObject(a98.CREATOR);
        } else if (readInt == 1) {
            this.e = readInt;
            this.R = (fhb) parcel.readTypedObject(fhb.CREATOR);
        } else {
            throw new IllegalArgumentException(opT.Z("union: unknown tag: ", readInt));
        }
    }

    public static String v(int i) {
        if (i == 0) {
            return "appConfig";
        }
        if (i == 1) {
            return "rawConfig";
        }
        throw new IllegalStateException(opT.Z("unknown field: ", i));
    }

    public final void R(int i) {
        if (this.e != i) {
            StringBuilder U = opT.U("bad access: ");
            U.append(v(i));
            U.append(", ");
            U.append(v(this.e));
            U.append(" is available.");
            throw new IllegalStateException(U.toString());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i;
        int i2 = this.e;
        if (i2 == 0) {
            R(0);
            a98 a98 = (a98) this.R;
            if (a98 != null) {
                i = a98.describeContents();
                return 0 | i;
            }
            i = 0;
            return 0 | i;
        } else if (i2 != 1) {
            return 0;
        } else {
            R(1);
            fhb fhb = (fhb) this.R;
            if (fhb != null) {
                i = fhb.describeContents();
                return 0 | i;
            }
            i = 0;
            return 0 | i;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        int i2 = this.e;
        if (i2 == 0) {
            R(0);
            parcel.writeTypedObject((a98) this.R, i);
        } else if (i2 == 1) {
            R(1);
            parcel.writeTypedObject((fhb) this.R, i);
        }
    }

    public l08(fhb fhb) {
        this.e = 1;
        this.R = fhb;
    }
}
