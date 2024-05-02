package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* renamed from: Ju  reason: default package */
/* loaded from: classes.dex */
public final class Ju extends View.BaseSavedState {
    public static final Parcelable.Creator<Ju> CREATOR = new bv1(24);
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f211R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f212R;
    public float c;
    public float v;

    public Ju(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.R);
        parcel.writeFloat(this.v);
        parcel.writeList(this.f211R);
        parcel.writeFloat(this.c);
        parcel.writeBooleanArray(new boolean[]{this.f212R});
    }

    public Ju(Parcel parcel) {
        super(parcel);
        this.R = parcel.readFloat();
        this.v = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.f211R = arrayList;
        parcel.readList(arrayList, Float.class.getClassLoader());
        this.c = parcel.readFloat();
        this.f212R = parcel.createBooleanArray()[0];
    }
}
