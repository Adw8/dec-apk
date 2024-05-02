package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.GregorianCalendar;

/* renamed from: BD  reason: default package */
/* loaded from: classes.dex */
public final class BD implements Parcelable {
    public static final Parcelable.Creator<BD> CREATOR = new bv1(21);
    public final int O;
    public final Ke R;

    /* renamed from: R  reason: collision with other field name */
    public final fhy f20R;
    public final int X;
    public fhy c;
    public final int e;
    public final fhy v;

    public BD(fhy fhy, fhy fhy2, Ke ke, fhy fhy3, int i) {
        this.f20R = fhy;
        this.v = fhy2;
        this.c = fhy3;
        this.e = i;
        this.R = ke;
        if (fhy3 != null && fhy.f3521R.compareTo(fhy3.f3521R) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (fhy3 != null && fhy3.f3521R.compareTo(fhy2.f3521R) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (i < 0 || i > dGb.e(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        } else if (fhy.f3521R instanceof GregorianCalendar) {
            int i2 = fhy2.X;
            int i3 = fhy.X;
            this.O = (fhy2.e - fhy.e) + ((i2 - i3) * 12) + 1;
            this.X = (i2 - i3) + 1;
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
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
        if (!(obj instanceof BD)) {
            return false;
        }
        BD bd = (BD) obj;
        return this.f20R.equals(bd.f20R) && this.v.equals(bd.v) && cTo.R(this.c, bd.c) && this.e == bd.e && this.R.equals(bd.R);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20R, this.v, this.c, Integer.valueOf(this.e), this.R});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f20R, 0);
        parcel.writeParcelable(this.v, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.R, 0);
        parcel.writeInt(this.e);
    }
}
