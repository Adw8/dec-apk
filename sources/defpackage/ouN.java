package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ouN  reason: default package */
/* loaded from: classes.dex */
public final class ouN implements Parcelable {
    public static final Parcelable.Creator<ouN> CREATOR = new bv1(15);
    public final Bundle R;

    /* renamed from: R  reason: collision with other field name */
    public final String f7017R;
    public final int e;
    public final Bundle v;

    public ouN(j5B j5b) {
        this.f7017R = j5b.f4826R;
        this.e = j5b.f4822R.e;
        this.R = j5b.f4820R;
        Bundle bundle = new Bundle();
        this.v = bundle;
        j5b.f4823R.c(bundle);
    }

    public final j5B R(Context context, e9E e9e, iMP imp, bJ3 bj3) {
        Bundle bundle = this.R;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        int i = j5B.e;
        return new j5B(context, e9e, bundle, imp, bj3, this.f7017R, this.v);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7017R);
        parcel.writeInt(this.e);
        parcel.writeBundle(this.R);
        parcel.writeBundle(this.v);
    }

    public ouN(Parcel parcel) {
        this.f7017R = parcel.readString();
        this.e = parcel.readInt();
        this.R = parcel.readBundle(ouN.class.getClassLoader());
        this.v = parcel.readBundle(ouN.class.getClassLoader());
    }
}
