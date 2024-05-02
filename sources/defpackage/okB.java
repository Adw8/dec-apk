package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: okB  reason: default package */
/* loaded from: classes.dex */
public abstract class okB {
    public static final /* synthetic */ int R = 0;

    static {
        okB.class.getClassLoader();
    }

    public static Parcelable R(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
