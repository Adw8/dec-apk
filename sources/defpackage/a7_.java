package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: a7_  reason: default package */
/* loaded from: classes.dex */
public final class a7_ {
    public static final char[] R = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String O;

    /* renamed from: R  reason: collision with other field name */
    public final int f737R;

    /* renamed from: R  reason: collision with other field name */
    public final String f738R;

    /* renamed from: R  reason: collision with other field name */
    public final List f739R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f740R;
    public final String X;
    public final String c;
    public final String e;
    public final String v;

    /* renamed from: v  reason: collision with other field name */
    public final List f741v;

    static {
        new ppN();
    }

    public a7_(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f738R = str;
        this.v = str2;
        this.c = str3;
        this.e = str4;
        this.f737R = i;
        this.f739R = arrayList;
        this.f741v = arrayList2;
        this.X = str5;
        this.O = str6;
        this.f740R = n3x.v(str, "https");
    }

    public final String L() {
        hro hro;
        try {
            hro = new hro();
            hro.X(this, "/...");
        } catch (IllegalArgumentException unused) {
            hro = null;
        }
        hro.v = ppN.Z("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        hro.c = ppN.Z("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return hro.v().O;
    }

    public final hro O() {
        hro hro = new hro();
        hro.f4404R = this.f738R;
        hro.v = X();
        hro.c = R();
        hro.e = this.e;
        int i = this.f737R;
        String str = this.f738R;
        int i2 = -1;
        if (i != (n3x.v(str, "http") ? 80 : n3x.v(str, "https") ? 443 : -1)) {
            i2 = this.f737R;
        }
        hro.R = i2;
        hro.f4405R.clear();
        hro.f4405R.addAll(c());
        hro.e(e());
        hro.X = this.X == null ? null : this.O.substring(iH_.W(this.O, '#', 0, false, 6) + 1);
        return hro;
    }

    public final String R() {
        if (this.c.length() == 0) {
            return "";
        }
        return this.O.substring(iH_.W(this.O, ':', this.f738R.length() + 3, false, 4) + 1, iH_.W(this.O, '@', 0, false, 6));
    }

    public final String X() {
        if (this.v.length() == 0) {
            return "";
        }
        int length = this.f738R.length() + 3;
        String str = this.O;
        return this.O.substring(length, asb.c(length, str.length(), str, ":@"));
    }

    public final URI Z() {
        hro O = O();
        String str = O.e;
        String str2 = null;
        O.e = str != null ? Pattern.compile("[\"<>^`{|}]").matcher(str).replaceAll("") : null;
        int size = O.f4405R.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = O.f4405R;
            arrayList.set(i, ppN.Z((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, null, 227));
        }
        ArrayList arrayList2 = O.f4406v;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str3 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str3 != null ? ppN.Z(str3, 0, 0, "\\^`{|}", true, true, true, false, null, 195) : null);
            }
        }
        String str4 = O.X;
        if (str4 != null) {
            str2 = ppN.Z(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163);
        }
        O.X = str2;
        String hro = O.toString();
        try {
            return new URI(hro);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(hro).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final ArrayList c() {
        int W = iH_.W(this.O, '/', this.f738R.length() + 3, false, 4);
        String str = this.O;
        int c = asb.c(W, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (W < c) {
            int i = W + 1;
            int e = asb.e(this.O, '/', i, c);
            arrayList.add(this.O.substring(i, e));
            W = e;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f741v == null) {
            return null;
        }
        int W = iH_.W(this.O, '?', 0, false, 6) + 1;
        String str = this.O;
        return this.O.substring(W, asb.e(str, '#', W, str.length()));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a7_) && n3x.v(((a7_) obj).O, this.O);
    }

    public final int hashCode() {
        return this.O.hashCode();
    }

    public final String toString() {
        return this.O;
    }

    public final String v() {
        int W = iH_.W(this.O, '/', this.f738R.length() + 3, false, 4);
        String str = this.O;
        return this.O.substring(W, asb.c(W, str.length(), str, "?#"));
    }
}
