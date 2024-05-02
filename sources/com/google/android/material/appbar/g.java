package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g extends OG {
    public static final Parcelable.Creator<g> CREATOR = new h();
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2249R;
    public boolean c;
    public int e;
    public boolean v;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z = true;
        this.f2249R = parcel.readByte() != 0;
        this.v = parcel.readByte() != 0;
        this.e = parcel.readInt();
        this.R = parcel.readFloat();
        this.c = parcel.readByte() == 0 ? false : z;
    }

    @Override // defpackage.OG, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(((OG) this).f327R, i);
        parcel.writeByte(this.f2249R ? (byte) 1 : 0);
        parcel.writeByte(this.v ? (byte) 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.R);
        parcel.writeByte(this.c ? (byte) 1 : 0);
    }

    public g(Parcelable parcelable) {
        super(parcelable);
    }
}
