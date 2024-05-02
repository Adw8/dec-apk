package defpackage;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: khE  reason: default package */
/* loaded from: classes.dex */
public abstract class khE {

    /* renamed from: R  reason: collision with other field name */
    public static final String f5394R;
    public static final bd4 R = asb.R;

    /* renamed from: R  reason: collision with other field name */
    public static final TimeZone f5395R = TimeZone.getTimeZone("GMT");

    static {
        String E = iH_.E("okhttp3.", nZz.class.getName());
        if (iH_.n(E, "Client")) {
            E = E.substring(0, E.length() - "Client".length());
        }
        f5394R = E;
    }

    public static final bd4 L(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h8A h8a = (h8A) it.next();
            F6 f6 = h8a.f4088R;
            F6 f62 = h8a.v;
            String m = f6.m();
            String m2 = f62.m();
            arrayList.add(m);
            arrayList.add(iH_.vr(m2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new bd4((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        r11.e().R();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r11.e().e(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean O(defpackage.fGn r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            long r0 = java.lang.System.nanoTime()
            hqj r2 = r11.e()
            boolean r2 = r2.X()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x001d
            hqj r2 = r11.e()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L_0x001e
        L_0x001d:
            r5 = r3
        L_0x001e:
            hqj r2 = r11.e()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.e(r12)
            ME r12 = new ME     // Catch: InterruptedIOException -> 0x0070, all -> 0x005a
            r12.<init>()     // Catch: InterruptedIOException -> 0x0070, all -> 0x005a
        L_0x0034:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.Y(r12, r7)     // Catch: InterruptedIOException -> 0x0070, all -> 0x005a
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x0044
            r12.X()     // Catch: InterruptedIOException -> 0x0070, all -> 0x005a
            goto L_0x0034
        L_0x0044:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0051
        L_0x0049:
            hqj r11 = r11.e()
            r11.R()
            goto L_0x0076
        L_0x0051:
            hqj r11 = r11.e()
            long r0 = r0 + r5
            r11.e(r0)
            goto L_0x0076
        L_0x005a:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0067
            hqj r11 = r11.e()
            r11.R()
            goto L_0x006f
        L_0x0067:
            hqj r11 = r11.e()
            long r0 = r0 + r5
            r11.e(r0)
        L_0x006f:
            throw r12
        L_0x0070:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0051
            goto L_0x0049
        L_0x0076:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khE.O(fGn, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final boolean R(a7_ a7_, a7_ a7_2) {
        return n3x.v(a7_.e, a7_2.e) && a7_.f737R == a7_2.f737R && n3x.v(a7_.f738R, a7_2.f738R);
    }

    public static final List X(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        return Collections.unmodifiableList(pdD.Y(Arrays.copyOf(objArr2, objArr2.length)));
    }

    public static final String Z(a7_ a7_, boolean z) {
        String str;
        if (iH_.I(a7_.e, ":")) {
            str = '[' + a7_.e + ']';
        } else {
            str = a7_.e;
        }
        if (!z) {
            int i = a7_.f737R;
            String str2 = a7_.f738R;
            if (i == (n3x.v(str2, "http") ? 80 : n3x.v(str2, "https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + a7_.f737R;
    }

    public static final String c(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long e(dEt det) {
        String R2 = det.f2535R.R("Content-Length");
        if (R2 != null) {
            byte[] bArr = asb.f1481R;
            try {
                return Long.parseLong(R2);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static final List m(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final void v(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!n3x.v(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }
}
