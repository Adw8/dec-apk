package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: dzb  reason: default package */
/* loaded from: classes.dex */
public final class dzb {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public long f2928R;

    /* renamed from: R  reason: collision with other field name */
    public String f2929R;
    public String c;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public String f2930v;

    public static dzb R(String str, String str2) {
        int indexOf = str.indexOf(58);
        if (-1 == indexOf) {
            afN.R(-87767683552140L);
        } else {
            str = str.substring(0, indexOf);
            if (indexOf >= str.length()) {
                afN.R(-87771978519436L);
            } else {
                str.substring(indexOf + 1);
            }
        }
        String[] split = TextUtils.split(str, Pattern.quote(afN.R(-87776273486732L)));
        if (split.length >= 6) {
            dzb dzb = new dzb();
            dzb.R = Integer.parseInt(split[0]);
            dzb.v = Integer.parseInt(split[1]);
            dzb.f2929R = split[2];
            dzb.f2930v = split[3];
            dzb.c = split[4];
            dzb.f2928R = Long.parseLong(split[5]);
            return dzb;
        }
        throw new IllegalArgumentException(afN.R(-87784863421324L));
    }

    public final String toString() {
        return TextUtils.join(afN.R(-87887942636428L), new Object[]{Integer.valueOf(this.R), Integer.valueOf(this.v), this.f2929R, this.f2930v, this.c, Long.valueOf(this.f2928R)});
    }
}
