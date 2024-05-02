package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;

/* renamed from: fhy  reason: default package */
/* loaded from: classes.dex */
public final class fhy implements Comparable, Parcelable {
    public static final Parcelable.Creator<fhy> CREATOR = new bv1(23);
    public final int L;
    public final int O;
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public String f3520R;

    /* renamed from: R  reason: collision with other field name */
    public final Calendar f3521R;
    public final int X;
    public final int e;

    public fhy(Calendar calendar) {
        calendar.set(5, 1);
        Calendar v = dGb.v(calendar);
        this.f3521R = v;
        this.e = v.get(2);
        this.X = v.get(1);
        this.O = v.getMaximum(7);
        this.L = v.getActualMaximum(5);
        this.R = v.getTimeInMillis();
    }

    public static fhy R(int i, int i2) {
        Calendar e = dGb.e(null);
        e.set(1, i);
        e.set(2, i2);
        return new fhy(e);
    }

    public static fhy v(long j) {
        Calendar e = dGb.e(null);
        e.setTimeInMillis(j);
        return new fhy(e);
    }

    public final String O() {
        if (this.f3520R == null) {
            this.f3520R = DateUtils.formatDateTime(null, this.f3521R.getTimeInMillis(), 8228);
        }
        return this.f3520R;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3521R.compareTo(((fhy) obj).f3521R);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhy)) {
            return false;
        }
        fhy fhy = (fhy) obj;
        return this.e == fhy.e && this.X == fhy.X;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.X)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X);
        parcel.writeInt(this.e);
    }
}
