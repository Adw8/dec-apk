package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bzM  reason: default package */
/* loaded from: classes.dex */
public final class bzM implements Parcelable {
    public static final Parcelable.Creator<bzM> CREATOR = new bv1(14);
    public final int O;
    public final Bundle R;

    /* renamed from: R  reason: collision with other field name */
    public final String f1896R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1897R;
    public final int X;

    /* renamed from: X  reason: collision with other field name */
    public final boolean f1898X;
    public final String c;

    /* renamed from: c  reason: collision with other field name */
    public final boolean f1899c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public final boolean f1900e;
    public Bundle v;

    /* renamed from: v  reason: collision with other field name */
    public final String f1901v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f1902v;

    public bzM(pm2 pm2) {
        this.f1896R = pm2.getClass().getName();
        this.f1901v = pm2.f7238R;
        this.f1897R = pm2.f7251e;
        this.e = pm2.L;
        this.X = pm2.Z;
        this.c = pm2.f7248c;
        this.f1902v = pm2.x;
        this.f1899c = pm2.f7255v;
        this.f1900e = pm2.m;
        this.R = pm2.c;
        this.f1898X = pm2.f7247Z;
        this.O = pm2.f7236R.ordinal();
    }

    public final pm2 R(aLv alv, ClassLoader classLoader) {
        pm2 R = alv.R(this.f1896R);
        Bundle bundle = this.R;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        R.B(this.R);
        R.f7238R = this.f1901v;
        R.f7251e = this.f1897R;
        R.f7225O = true;
        R.L = this.e;
        R.Z = this.X;
        R.f7248c = this.c;
        R.x = this.f1902v;
        R.f7255v = this.f1899c;
        R.m = this.f1900e;
        R.f7247Z = this.f1898X;
        R.f7236R = iMP.values()[this.O];
        Bundle bundle2 = this.v;
        if (bundle2 != null) {
            R.f7226R = bundle2;
        } else {
            R.f7226R = new Bundle();
        }
        return R;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1896R);
        sb.append(" (");
        sb.append(this.f1901v);
        sb.append(")}:");
        if (this.f1897R) {
            sb.append(" fromLayout");
        }
        if (this.X != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.X));
        }
        String str = this.c;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.c);
        }
        if (this.f1902v) {
            sb.append(" retainInstance");
        }
        if (this.f1899c) {
            sb.append(" removing");
        }
        if (this.f1900e) {
            sb.append(" detached");
        }
        if (this.f1898X) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1896R);
        parcel.writeString(this.f1901v);
        parcel.writeInt(this.f1897R ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.X);
        parcel.writeString(this.c);
        parcel.writeInt(this.f1902v ? 1 : 0);
        parcel.writeInt(this.f1899c ? 1 : 0);
        parcel.writeInt(this.f1900e ? 1 : 0);
        parcel.writeBundle(this.R);
        parcel.writeInt(this.f1898X ? 1 : 0);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.O);
    }

    public bzM(Parcel parcel) {
        this.f1896R = parcel.readString();
        this.f1901v = parcel.readString();
        boolean z = true;
        this.f1897R = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.X = parcel.readInt();
        this.c = parcel.readString();
        this.f1902v = parcel.readInt() != 0;
        this.f1899c = parcel.readInt() != 0;
        this.f1900e = parcel.readInt() != 0;
        this.R = parcel.readBundle();
        this.f1898X = parcel.readInt() == 0 ? false : z;
        this.v = parcel.readBundle();
        this.O = parcel.readInt();
    }
}
