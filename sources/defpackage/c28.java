package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c28  reason: default package */
/* loaded from: classes.dex */
public final class c28 implements Parcelable {
    public static final Parcelable.Creator<c28> CREATOR = new bv1(6);
    public final Intent R;

    /* renamed from: R  reason: collision with other field name */
    public final IntentSender f1933R;
    public final int X;
    public final int e;

    public c28(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f1933R = intentSender;
        this.R = intent;
        this.e = i;
        this.X = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1933R, i);
        parcel.writeParcelable(this.R, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.X);
    }

    public c28(Parcel parcel) {
        this.f1933R = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.R = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.e = parcel.readInt();
        this.X = parcel.readInt();
    }
}
