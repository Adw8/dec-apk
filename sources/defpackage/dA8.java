package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: dA8  reason: default package */
/* loaded from: classes.dex */
public abstract class dA8 {
    public static final Class R;

    /* renamed from: R  reason: collision with other field name */
    public static final k3o f2516R;
    public static final k3o c;
    public static final k3o v;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        R = cls;
        f2516R = I(false);
        v = I(true);
        c = new k3o();
    }

    public static void A(int i, List list, gL6 gl6) {
        if (!(list == null || list.isEmpty())) {
            gl6.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                d3 d3Var = (d3) gl6.R;
                d3Var.S(i, 2);
                d3Var.h((b0) list.get(i2));
            }
        }
    }

    public static void B(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            int i2 = 0;
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = d3.R;
                    i3 += 4;
                }
                ((d3) gl6.R).d(i3);
                while (i2 < list.size()) {
                    ((d3) gl6.R).u(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            gl6.getClass();
            while (i2 < list.size()) {
                ((d3) gl6.R).I(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static int C(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (d3.t(i) * list.size()) + N(list);
    }

    public static void E(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            int i2 = 0;
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += d3.K((longValue >> 63) ^ (longValue << 1));
                }
                ((d3) gl6.R).d(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    ((d3) gl6.R).s((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            gl6.getClass();
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                ((d3) gl6.R).W((longValue3 >> 63) ^ (longValue3 << 1), i);
                i2++;
            }
        }
    }

    public static void F(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            int i2 = 0;
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += d3.K(((Long) list.get(i4)).longValue());
                }
                ((d3) gl6.R).d(i3);
                while (i2 < list.size()) {
                    ((d3) gl6.R).s(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            gl6.getClass();
            while (i2 < list.size()) {
                ((d3) gl6.R).W(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void G(int i, List list, gL6 gl6, bvr bvr) {
        if (!(list == null || list.isEmpty())) {
            gl6.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                gl6.z(i, bvr, list.get(i2));
            }
        }
    }

    public static int H(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d3.t(i) * size) + U(list);
    }

    public static k3o I(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (k3o) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int J(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d3.t(i) * size) + Y(list);
    }

    public static int K(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            if (size <= 0) {
                return 0;
            }
            cuq.H(0);
            cuq.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += d3.V(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int L(List list) {
        return list.size() * 4;
    }

    public static void M(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    i2 += d3.V((intValue >> 31) ^ (intValue << 1));
                }
                ((d3) gl6.R).d(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue2 = ((Integer) list.get(i4)).intValue();
                    ((d3) gl6.R).d((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            gl6.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                d3 d3Var = (d3) gl6.R;
                int intValue3 = ((Integer) list.get(i5)).intValue();
                d3Var.S(i, 0);
                d3Var.d((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static int N(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            if (size <= 0) {
                return 0;
            }
            j72.H(0);
            j72.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += d3.K(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d3.O(i) * size;
    }

    public static int P(int i, bvr bvr, Object obj) {
        int t = d3.t(i);
        int v2 = ((qN) obj).v(bvr);
        return d3.V(v2) + v2 + t;
    }

    public static void Q(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ((Boolean) list.get(i3)).booleanValue();
                    Logger logger = d3.R;
                    i2++;
                }
                ((d3) gl6.R).d(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((d3) gl6.R).J(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : 0);
                }
                return;
            }
            gl6.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                d3 d3Var = (d3) gl6.R;
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                d3Var.S(i, 0);
                d3Var.J(booleanValue ? (byte) 1 : 0);
            }
        }
    }

    public static int R(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d3.v(i) * size;
    }

    public static void S(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            int i2 = 0;
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = d3.R;
                    i3 += 8;
                }
                ((d3) gl6.R).d(i3);
                while (i2 < list.size()) {
                    d3 d3Var = (d3) gl6.R;
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    d3Var.getClass();
                    d3Var.n(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            gl6.getClass();
            while (i2 < list.size()) {
                d3 d3Var2 = (d3) gl6.R;
                double doubleValue2 = ((Double) list.get(i2)).doubleValue();
                d3Var2.getClass();
                d3Var2.z(Double.doubleToRawLongBits(doubleValue2), i);
                i2++;
            }
        }
    }

    public static void T(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            int i2 = 0;
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = d3.R;
                    i3 += 4;
                }
                ((d3) gl6.R).d(i3);
                while (i2 < list.size()) {
                    d3 d3Var = (d3) gl6.R;
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    d3Var.getClass();
                    d3Var.u(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            gl6.getClass();
            while (i2 < list.size()) {
                d3 d3Var2 = (d3) gl6.R;
                float floatValue2 = ((Float) list.get(i2)).floatValue();
                d3Var2.getClass();
                d3Var2.I(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    public static int U(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            if (size <= 0) {
                return 0;
            }
            cuq.H(0);
            cuq.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += d3.H(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int V(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int t = d3.t(i) * size;
        if (list instanceof c1n) {
            c1n c1n = (c1n) list;
            while (i4 < size) {
                Object U = c1n.U(i4);
                if (U instanceof b0) {
                    int size2 = ((b0) U).size();
                    i3 = d3.V(size2) + size2;
                } else {
                    i3 = d3.y((String) U);
                }
                t += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof b0) {
                    int size3 = ((b0) obj).size();
                    i2 = d3.V(size3) + size3;
                } else {
                    i2 = d3.y((String) obj);
                }
                t += i2;
                i4++;
            }
        }
        return t;
    }

    public static void W(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            int i2 = 0;
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = d3.R;
                    i3 += 4;
                }
                ((d3) gl6.R).d(i3);
                while (i2 < list.size()) {
                    ((d3) gl6.R).u(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            gl6.getClass();
            while (i2 < list.size()) {
                ((d3) gl6.R).I(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static int X(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            if (size <= 0) {
                return 0;
            }
            cuq.H(0);
            cuq.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += d3.H(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int Y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            if (size <= 0) {
                return 0;
            }
            j72.H(0);
            j72.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += d3.K(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int Z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d3.L(i) * size;
    }

    public static void a(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += d3.V(((Integer) list.get(i3)).intValue());
                }
                ((d3) gl6.R).d(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((d3) gl6.R).d(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            gl6.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                d3 d3Var = (d3) gl6.R;
                int intValue = ((Integer) list.get(i5)).intValue();
                d3Var.S(i, 0);
                d3Var.d(intValue);
            }
        }
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = d3.t(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = ((b0) list.get(i2)).size();
            t += d3.V(size2) + size2;
        }
        return t;
    }

    public static void d(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += d3.H(((Integer) list.get(i3)).intValue());
                }
                ((d3) gl6.R).d(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((d3) gl6.R).Q(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            gl6.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                d3 d3Var = (d3) gl6.R;
                int intValue = ((Integer) list.get(i5)).intValue();
                d3Var.S(i, 0);
                d3Var.Q(intValue);
            }
        }
    }

    public static int e(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d3.t(i) * size) + X(list);
    }

    public static void f(int i, List list, gL6 gl6) {
        if (list != null && !list.isEmpty()) {
            gl6.getClass();
            int i2 = 0;
            if (list instanceof c1n) {
                c1n c1n = (c1n) list;
                while (i2 < list.size()) {
                    Object U = c1n.U(i2);
                    if (U instanceof String) {
                        d3 d3Var = (d3) gl6.R;
                        d3Var.S(i, 2);
                        d3Var.A((String) U);
                    } else {
                        d3 d3Var2 = (d3) gl6.R;
                        d3Var2.S(i, 2);
                        d3Var2.h((b0) U);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                d3 d3Var3 = (d3) gl6.R;
                d3Var3.S(i, 2);
                d3Var3.A((String) list.get(i2));
                i2++;
            }
        }
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d3.t(i) * size) + y(list);
    }

    public static Object h(int i, List list, puu puu, Object obj, k3o k3o) {
        if (puu == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (puu.R()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = n(i, intValue, obj, k3o);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!puu.R()) {
                    obj = n(i, intValue2, obj, k3o);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof j72) {
            j72 j72 = (j72) list;
            if (size <= 0) {
                return 0;
            }
            j72.H(0);
            j72.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += d3.K((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int j(int i, List list, bvr bvr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = d3.t(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int v2 = ((qN) list.get(i2)).v(bvr);
            t += d3.V(v2) + v2;
        }
        return t;
    }

    public static void k(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += d3.H(((Integer) list.get(i3)).intValue());
                }
                ((d3) gl6.R).d(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((d3) gl6.R).Q(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            gl6.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                d3 d3Var = (d3) gl6.R;
                int intValue = ((Integer) list.get(i5)).intValue();
                d3Var.S(i, 0);
                d3Var.Q(intValue);
            }
        }
    }

    public static void l(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            int i2 = 0;
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = d3.R;
                    i3 += 8;
                }
                ((d3) gl6.R).d(i3);
                while (i2 < list.size()) {
                    ((d3) gl6.R).n(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            gl6.getClass();
            while (i2 < list.size()) {
                ((d3) gl6.R).z(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static int m(List list) {
        return list.size() * 8;
    }

    public static Object n(int i, int i2, Object obj, k3o k3o) {
        if (obj == null) {
            k3o.getClass();
            obj = f2c.v();
        }
        k3o.getClass();
        ((f2c) obj).c((i << 3) | 0, Long.valueOf((long) i2));
        return obj;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d3.t(i) * size) + K(list);
    }

    public static void p(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            int i2 = 0;
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += d3.K(((Long) list.get(i4)).longValue());
                }
                ((d3) gl6.R).d(i3);
                while (i2 < list.size()) {
                    ((d3) gl6.R).s(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            gl6.getClass();
            while (i2 < list.size()) {
                ((d3) gl6.R).W(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static void r(int i, List list, gL6 gl6, bvr bvr) {
        if (!(list == null || list.isEmpty())) {
            gl6.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                gl6.h(i, bvr, list.get(i2));
            }
        }
    }

    public static void s(int i, List list, gL6 gl6, boolean z) {
        if (!(list == null || list.isEmpty())) {
            int i2 = 0;
            if (z) {
                ((d3) gl6.R).S(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = d3.R;
                    i3 += 8;
                }
                ((d3) gl6.R).d(i3);
                while (i2 < list.size()) {
                    ((d3) gl6.R).n(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            gl6.getClass();
            while (i2 < list.size()) {
                ((d3) gl6.R).z(((Long) list.get(i2)).longValue(), i);
                i2++;
            }
        }
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (d3.t(i) * size) + i(list);
    }

    public static void u(k3o k3o, Object obj, Object obj2) {
        k3o.getClass();
        csA csa = (csA) obj;
        f2c f2c = csa.unknownFields;
        f2c f2c2 = ((csA) obj2).unknownFields;
        if (!f2c2.equals(f2c.R)) {
            int i = f2c.f3281R + f2c2.f3281R;
            int[] copyOf = Arrays.copyOf(f2c.f3283R, i);
            System.arraycopy(f2c2.f3283R, 0, copyOf, f2c.f3281R, f2c2.f3281R);
            Object[] copyOf2 = Arrays.copyOf(f2c.f3284R, i);
            System.arraycopy(f2c2.f3284R, 0, copyOf2, f2c.f3281R, f2c2.f3281R);
            f2c = new f2c(i, copyOf, copyOf2, true);
        }
        csa.unknownFields = f2c;
    }

    public static int v(List list) {
        return list.size();
    }

    public static int x(int i, List list, bvr bvr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += d3.m(i, (qN) list.get(i3), bvr);
        }
        return i2;
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cUq) {
            cUq cuq = (cUq) list;
            if (size <= 0) {
                return 0;
            }
            cuq.H(0);
            cuq.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += d3.V((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static boolean z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
