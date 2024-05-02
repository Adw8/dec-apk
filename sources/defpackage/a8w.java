package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* renamed from: a8w  reason: default package */
/* loaded from: classes.dex */
public abstract class a8w {
    public static final ThreadLocal R = new ThreadLocal();

    public static String R(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new kqe(str, 0));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) R.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new kqe(str, 1)) : str2;
    }

    public static boolean v(String str) {
        try {
            String R2 = R(str);
            if (R2 != null && R2.length() == 4) {
                if (R2.charAt(0) != 't' && R2.charAt(0) != 'T') {
                    return false;
                }
                if (R2.charAt(1) != 'r' && R2.charAt(1) != 'R') {
                    return false;
                }
                if (R2.charAt(2) != 'u' && R2.charAt(2) != 'U') {
                    return false;
                }
                if (R2.charAt(3) != 'e') {
                    if (R2.charAt(3) != 'E') {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (AccessControlException unused) {
            return false;
        }
    }
}
