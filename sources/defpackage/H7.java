package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: H7  reason: default package */
/* loaded from: classes.dex */
public final class H7 implements Parcelable {
    public static final Parcelable.Creator<H7> CREATOR = new bv1(10);
    public final int L;
    public final int O;
    public final CharSequence R;

    /* renamed from: R  reason: collision with other field name */
    public final String f166R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f167R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f168R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f169R;
    public final int X;
    public final ArrayList c;

    /* renamed from: c  reason: collision with other field name */
    public final int[] f170c;
    public final int e;
    public final CharSequence v;

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f171v;

    /* renamed from: v  reason: collision with other field name */
    public final int[] f172v;

    public H7(KP kp) {
        int size = kp.f251R.size();
        this.f169R = new int[size * 6];
        if (kp.f252R) {
            this.f167R = new ArrayList(size);
            this.f172v = new int[size];
            this.f170c = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                dJb djb = (dJb) kp.f251R.get(i);
                int i3 = i2 + 1;
                this.f169R[i2] = djb.R;
                ArrayList arrayList = this.f167R;
                pm2 pm2 = djb.f2560R;
                arrayList.add(pm2 != null ? pm2.f7238R : null);
                int[] iArr = this.f169R;
                int i4 = i3 + 1;
                iArr[i3] = djb.f2561R ? 1 : 0;
                int i5 = i4 + 1;
                iArr[i4] = djb.v;
                int i6 = i5 + 1;
                iArr[i5] = djb.c;
                int i7 = i6 + 1;
                iArr[i6] = djb.e;
                iArr[i7] = djb.X;
                this.f172v[i] = djb.f2559R.ordinal();
                this.f170c[i] = djb.f2562v.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.e = kp.X;
            this.f166R = kp.f250R;
            this.X = kp.Z;
            this.O = kp.O;
            this.R = kp.f249R;
            this.L = kp.L;
            this.v = kp.f257v;
            this.f171v = kp.f258v;
            this.c = kp.f254c;
            this.f168R = kp.f255c;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void R(KP kp) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f169R;
            boolean z = true;
            if (i < iArr.length) {
                dJb djb = new dJb();
                int i3 = i + 1;
                djb.R = iArr[i];
                if (hAW.W(2)) {
                    Log.v("FragmentManager", "Instantiate " + kp + " op #" + i2 + " base fragment #" + this.f169R[i3]);
                }
                djb.f2559R = iMP.values()[this.f172v[i2]];
                djb.f2562v = iMP.values()[this.f170c[i2]];
                int[] iArr2 = this.f169R;
                int i4 = i3 + 1;
                if (iArr2[i3] == 0) {
                    z = false;
                }
                djb.f2561R = z;
                int i5 = i4 + 1;
                int i6 = iArr2[i4];
                djb.v = i6;
                int i7 = i5 + 1;
                int i8 = iArr2[i5];
                djb.c = i8;
                int i9 = i7 + 1;
                int i10 = iArr2[i7];
                djb.e = i10;
                i = i9 + 1;
                int i11 = iArr2[i9];
                djb.X = i11;
                kp.R = i6;
                kp.v = i8;
                kp.c = i10;
                kp.e = i11;
                kp.v(djb);
                i2++;
            } else {
                kp.X = this.e;
                kp.f250R = this.f166R;
                kp.f252R = true;
                kp.O = this.O;
                kp.f249R = this.R;
                kp.L = this.L;
                kp.f257v = this.v;
                kp.f258v = this.f171v;
                kp.f254c = this.c;
                kp.f255c = this.f168R;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f169R);
        parcel.writeStringList(this.f167R);
        parcel.writeIntArray(this.f172v);
        parcel.writeIntArray(this.f170c);
        parcel.writeInt(this.e);
        parcel.writeString(this.f166R);
        parcel.writeInt(this.X);
        parcel.writeInt(this.O);
        TextUtils.writeToParcel(this.R, parcel, 0);
        parcel.writeInt(this.L);
        TextUtils.writeToParcel(this.v, parcel, 0);
        parcel.writeStringList(this.f171v);
        parcel.writeStringList(this.c);
        parcel.writeInt(this.f168R ? 1 : 0);
    }

    public H7(Parcel parcel) {
        this.f169R = parcel.createIntArray();
        this.f167R = parcel.createStringArrayList();
        this.f172v = parcel.createIntArray();
        this.f170c = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f166R = parcel.readString();
        this.X = parcel.readInt();
        this.O = parcel.readInt();
        this.R = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.L = parcel.readInt();
        this.v = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f171v = parcel.createStringArrayList();
        this.c = parcel.createStringArrayList();
        this.f168R = parcel.readInt() != 0;
    }
}
