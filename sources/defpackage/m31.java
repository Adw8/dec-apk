package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: m31  reason: default package */
/* loaded from: classes.dex */
public final class m31 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int R;

    public /* synthetic */ m31(int i) {
        this.R = i;
    }

    public static oST R(Parcel parcel, ClassLoader classLoader) {
        dqr dqr;
        if (classLoader == null) {
            classLoader = m31.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            dqr = d6b.R;
        } else if (readInt == 1) {
            dqr = bHa.R;
        } else if (readInt == 2) {
            dqr = bYG.R;
        } else {
            throw new IllegalStateException(opT.m("Unsupported MutableState policy ", readInt, " was restored"));
        }
        return new oST(readValue, dqr);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.R) {
            case 0:
                return new iB2(parcel, classLoader);
            case 1:
                return new ebm(parcel, classLoader);
            case 2:
                return R(parcel, classLoader);
            case 3:
                return new jbh(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return OG.R;
                }
                throw new IllegalStateException("superState must be null");
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return new iJ4(parcel, classLoader);
            case 6:
                return new TW(parcel, classLoader);
            case 7:
                return new k_4(parcel, classLoader);
            case VmNativeCallback.$stable:
                return new y2(parcel, classLoader);
            default:
                return new fDC(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.R) {
            case 0:
                return new iB2[i];
            case 1:
                return new ebm[i];
            case 2:
                return new oST[i];
            case 3:
                return new jbh[i];
            case 4:
                return new OG[i];
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return new iJ4[i];
            case 6:
                return new TW[i];
            case 7:
                return new k_4[i];
            case VmNativeCallback.$stable:
                return new y2[i];
            default:
                return new fDC[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.R) {
            case 0:
                return new iB2(parcel, null);
            case 1:
                return new ebm(parcel, null);
            case 2:
                return R(parcel, null);
            case 3:
                return new jbh(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return OG.R;
                }
                throw new IllegalStateException("superState must be null");
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return new iJ4(parcel, null);
            case 6:
                return new TW(parcel, (ClassLoader) null);
            case 7:
                return new k_4(parcel, null);
            case VmNativeCallback.$stable:
                return new y2(parcel, null);
            default:
                return new fDC(parcel, null);
        }
    }
}
