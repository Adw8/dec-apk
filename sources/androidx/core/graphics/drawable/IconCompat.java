package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode v = PorterDuff.Mode.SRC_IN;

    /* renamed from: R  reason: collision with other field name */
    public Object f1288R;

    /* renamed from: v  reason: collision with other field name */
    public String f1292v;
    public int R = -1;

    /* renamed from: R  reason: collision with other field name */
    public byte[] f1290R = null;

    /* renamed from: R  reason: collision with other field name */
    public Parcelable f1287R = null;

    /* renamed from: v  reason: collision with other field name */
    public int f1291v = 0;
    public int c = 0;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f1285R = null;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f1286R = v;

    /* renamed from: R  reason: collision with other field name */
    public String f1289R = null;

    public final String toString() {
        String str;
        int i;
        if (this.R == -1) {
            return String.valueOf(this.f1288R);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.R) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.R) {
            case 1:
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1288R).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1288R).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1292v);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i2 = this.R;
                if (i2 == -1) {
                    i = jWG.R(this.f1288R);
                } else if (i2 == 2) {
                    i = this.f1291v;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                objArr[0] = Integer.valueOf(i);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1291v);
                if (this.c != 0) {
                    sb.append(" off=");
                    sb.append(this.c);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1288R);
                break;
        }
        if (this.f1285R != null) {
            sb.append(" tint=");
            sb.append(this.f1285R);
        }
        if (this.f1286R != v) {
            sb.append(" mode=");
            sb.append(this.f1286R);
        }
        sb.append(")");
        return sb.toString();
    }
}
