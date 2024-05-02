package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(o25 o25) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.R;
        if (o25.X(1)) {
            i = ((aFZ) o25).f807R.readInt();
        }
        iconCompat.R = i;
        byte[] bArr = iconCompat.f1290R;
        if (o25.X(2)) {
            aFZ afz = (aFZ) o25;
            int readInt = afz.f807R.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                afz.f807R.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1290R = bArr;
        iconCompat.f1287R = o25.O(iconCompat.f1287R, 3);
        int i2 = iconCompat.f1291v;
        if (o25.X(4)) {
            i2 = ((aFZ) o25).f807R.readInt();
        }
        iconCompat.f1291v = i2;
        int i3 = iconCompat.c;
        if (o25.X(5)) {
            i3 = ((aFZ) o25).f807R.readInt();
        }
        iconCompat.c = i3;
        iconCompat.f1285R = (ColorStateList) o25.O(iconCompat.f1285R, 6);
        String str = iconCompat.f1289R;
        if (o25.X(7)) {
            str = ((aFZ) o25).f807R.readString();
        }
        iconCompat.f1289R = str;
        String str2 = iconCompat.f1292v;
        if (o25.X(8)) {
            str2 = ((aFZ) o25).f807R.readString();
        }
        iconCompat.f1292v = str2;
        iconCompat.f1286R = PorterDuff.Mode.valueOf(iconCompat.f1289R);
        switch (iconCompat.R) {
            case -1:
                Parcelable parcelable = iconCompat.f1287R;
                if (parcelable != null) {
                    iconCompat.f1288R = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f1287R;
                if (parcelable2 == null) {
                    byte[] bArr3 = iconCompat.f1290R;
                    iconCompat.f1288R = bArr3;
                    iconCompat.R = 3;
                    iconCompat.f1291v = 0;
                    iconCompat.c = bArr3.length;
                    break;
                } else {
                    iconCompat.f1288R = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1290R, Charset.forName("UTF-16"));
                iconCompat.f1288R = str3;
                if (iconCompat.R == 2 && iconCompat.f1292v == null) {
                    iconCompat.f1292v = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f1288R = iconCompat.f1290R;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, o25 o25) {
        o25.getClass();
        iconCompat.f1289R = iconCompat.f1286R.name();
        switch (iconCompat.R) {
            case -1:
                iconCompat.f1287R = (Parcelable) iconCompat.f1288R;
                break;
            case 1:
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                iconCompat.f1287R = (Parcelable) iconCompat.f1288R;
                break;
            case 2:
                iconCompat.f1290R = ((String) iconCompat.f1288R).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1290R = (byte[]) iconCompat.f1288R;
                break;
            case 4:
            case 6:
                iconCompat.f1290R = iconCompat.f1288R.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.R;
        if (-1 != i) {
            o25.Z(1);
            ((aFZ) o25).f807R.writeInt(i);
        }
        byte[] bArr = iconCompat.f1290R;
        if (bArr != null) {
            o25.Z(2);
            aFZ afz = (aFZ) o25;
            afz.f807R.writeInt(bArr.length);
            afz.f807R.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1287R;
        if (parcelable != null) {
            o25.Z(3);
            ((aFZ) o25).f807R.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1291v;
        if (i2 != 0) {
            o25.Z(4);
            ((aFZ) o25).f807R.writeInt(i2);
        }
        int i3 = iconCompat.c;
        if (i3 != 0) {
            o25.Z(5);
            ((aFZ) o25).f807R.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1285R;
        if (colorStateList != null) {
            o25.Z(6);
            ((aFZ) o25).f807R.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1289R;
        if (str != null) {
            o25.Z(7);
            ((aFZ) o25).f807R.writeString(str);
        }
        String str2 = iconCompat.f1292v;
        if (str2 != null) {
            o25.Z(8);
            ((aFZ) o25).f807R.writeString(str2);
        }
    }
}
