package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* renamed from: jQ */
/* loaded from: classes.dex */
public abstract /* synthetic */ class jQ {
    public static final /* synthetic */ int[] R = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};

    public static /* synthetic */ int[] A(int i) {
        int[] iArr = new int[i];
        System.arraycopy(R, 0, iArr, 0, i);
        return iArr;
    }

    public static String C(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String H(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.Y());
        return sb.toString();
    }

    public static /* synthetic */ int I(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ void J(kwo kwo) {
        if (kwo != null) {
            throw new ClassCastException();
        }
    }

    public static void K(jr_ jr_, boolean z, boolean z2, boolean z3, boolean z4) {
        jr_.g(z);
        jr_.g(z2);
        jr_.g(z3);
        jr_.g(z4);
    }

    public static lXY L(fMX fmx, int i) {
        return nak.v(new iao(fmx, i));
    }

    public static String N(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static u O(String str) {
        return new u(str).S();
    }

    public static String P(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ String Q(int i) {
        return i == 1 ? "BEGIN_ARRAY" : i == 2 ? "END_ARRAY" : i == 3 ? "BEGIN_OBJECT" : i == 4 ? "END_OBJECT" : i == 5 ? "NAME" : i == 6 ? "STRING" : i == 7 ? "NUMBER" : i == 8 ? "BOOLEAN" : i == 9 ? "NULL" : i == 10 ? "END_DOCUMENT" : "null";
    }

    public static /* synthetic */ int R(int i, int i2) {
        if (i != 0 && i2 != 0) {
            return i - i2;
        }
        throw null;
    }

    public static String U(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static /* synthetic */ Iterator V() {
        try {
            return Arrays.asList(new y1()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static u X(u uVar, String str, u uVar2, String str2) {
        new u(uVar, str);
        return new u(uVar2, str2);
    }

    public static /* synthetic */ void Y(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static k7Q Z(jr_ jr_, bF9 bf9, ky1 ky1, jr_ jr_2, jJj jjj, ky1 ky12, jr_ jr_3, mdz mdz, ky1 ky13, jr_ jr_4, bUo buo, ky1 ky14, jr_ jr_5) {
        l6.p(jr_, bf9, ky1);
        l6.p(jr_2, jjj, ky12);
        l6.p(jr_3, mdz, ky13);
        l6.p(jr_4, buo, ky14);
        jr_.j();
        return new k7Q(jr_5);
    }

    public static int c(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int e(long j, int i, int i2) {
        return (ejC.R(j) + i) * i2;
    }

    public static String g(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ void h(Object obj) {
        throw new ClassCastException();
    }

    public static StringBuilder i(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static String j(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static k7Q m(jr_ jr_, bUo buo, ky1 ky1, jr_ jr_2) {
        l6.p(jr_, buo, ky1);
        jr_.j();
        return new k7Q(jr_2);
    }

    public static /* synthetic */ String n(int i) {
        return i == 1 ? "UNCOMPRESSED" : i == 2 ? "COMPRESSED" : i == 3 ? "DO_NOT_USE_CRUNCHY_UNCOMPRESSED" : "null";
    }

    public static void o(int i, dNH dnh, k7Q k7q, jr_ jr_, int i2, int i3) {
        dnh.y(k7q, jr_, Integer.valueOf(i));
        jr_.w(i2);
        jr_.w(i3);
    }

    public static StringBuilder t(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ String u(int i) {
        return i == 1 ? "EXPONENTIAL" : i == 2 ? "LINEAR" : "null";
    }

    public static float v(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static Object x(jr_ jr_, int i, int i2) {
        jr_.w(i);
        jr_.w(i2);
        return jr_.I();
    }

    public static StringBuilder y(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ String z(int i) {
        return i == 1 ? "UNKNOWN" : i == 2 ? "HORIZONTAL_DIMENSION" : i == 3 ? "VERTICAL_DIMENSION" : i == 4 ? "LEFT" : i == 5 ? "RIGHT" : i == 6 ? "TOP" : i == 7 ? "BOTTOM" : i == 8 ? "BASELINE" : "null";
    }
}
