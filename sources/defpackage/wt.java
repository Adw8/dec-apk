package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wt  reason: default package */
/* loaded from: classes.dex */
public final class wt implements Parcelable {
    public static final Parcelable.Creator<wt> CREATOR = new bv1(5);
    public final Intent R;
    public final int e;

    public wt(Intent intent, int i) {
        this.e = i;
        this.R = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("ActivityResult{resultCode=");
        int i = this.e;
        U.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        U.append(", data=");
        U.append(this.R);
        U.append('}');
        return U.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.R == null ? 0 : 1);
        Intent intent = this.R;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public wt(Parcel parcel) {
        this.e = parcel.readInt();
        this.R = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
