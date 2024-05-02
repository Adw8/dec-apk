package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bRg  reason: default package */
/* loaded from: classes.dex */
public abstract class bRg {
    public static final lG0 R = new lG0("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final lG0 v = new lG0(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final oFB R(String str) {
        dqt H = asb.H(R, str, 0);
        if (H != null) {
            if (H.f2901R == null) {
                H.f2901R = new jkV(H);
            }
            Locale locale = Locale.ROOT;
            String lowerCase = ((String) H.f2901R.get(1)).toLowerCase(locale);
            if (H.f2901R == null) {
                H.f2901R = new jkV(H);
            }
            ((String) H.f2901R.get(2)).toLowerCase(locale);
            ArrayList arrayList = new ArrayList();
            int i = H.R().X;
            while (true) {
                int i2 = i + 1;
                if (i2 < str.length()) {
                    dqt H2 = asb.H(v, str, i2);
                    if (H2 != null) {
                        ixT v2 = H2.R.v(1);
                        String str2 = null;
                        String str3 = v2 != null ? v2.f4777R : null;
                        if (str3 == null) {
                            i = H2.R().X;
                        } else {
                            ixT v3 = H2.R.v(2);
                            if (v3 != null) {
                                str2 = v3.f4777R;
                            }
                            if (str2 == null) {
                                str2 = H2.R.v(3).f4777R;
                            } else if (iH_._(str2, "'", false) && str2.endsWith("'") && str2.length() > 2) {
                                str2 = str2.substring(1, str2.length() - 1);
                            }
                            arrayList.add(str3);
                            arrayList.add(str2);
                            i = H2.R().X;
                        }
                    } else {
                        StringBuilder U = opT.U("Parameter is not formatted correctly: \"");
                        U.append(str.substring(i2));
                        U.append("\" for: \"");
                        U.append(str);
                        U.append('\"');
                        throw new IllegalArgumentException(U.toString().toString());
                    }
                } else {
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        return new oFB(str, lowerCase);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
        } else {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
    }
}
