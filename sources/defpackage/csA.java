package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: csA  reason: default package */
/* loaded from: classes.dex */
public abstract class csA extends qN {
    private static Map<Object, csA> defaultInstanceMap = new ConcurrentHashMap();
    public f2c unknownFields = f2c.R;
    public int memoizedSerializedSize = -1;

    public static csA C(csA csa, b5 b5Var, nCG ncg) {
        csA csa2 = (csA) csa.L(hZW.NEW_MUTABLE_INSTANCE);
        try {
            kV5 kv5 = kV5.R;
            kv5.getClass();
            bvr R = kv5.R(csa2.getClass());
            ma7 ma7 = b5Var.f1524R;
            if (ma7 == null) {
                ma7 = new ma7(b5Var);
            }
            R.c(csa2, ma7, ncg);
            R.m(csa2);
            return csa2;
        } catch (b7b e) {
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof b7b) {
                throw ((b7b) e2.getCause());
            }
            throw new b7b(e2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof b7b) {
                throw ((b7b) e3.getCause());
            }
            throw e3;
        }
    }

    public static csA H(csA csa, b0 b0Var, nCG ncg) {
        try {
            MH mh = (MH) b0Var;
            byte[] bArr = mh.R;
            int V = mh.V();
            int size = mh.size();
            b5 b5Var = new b5(bArr, V, size, true);
            try {
                b5Var.e(size);
                csA C = C(csa, b5Var, ncg);
                try {
                    if (b5Var.O != 0) {
                        throw new b7b("Protocol message end-group tag did not match expected tag.");
                    } else if (C.x()) {
                        return C;
                    } else {
                        throw new b7b(new iMS().getMessage());
                    }
                } catch (b7b e) {
                    throw e;
                }
            } catch (b7b e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (b7b e3) {
            throw e3;
        }
    }

    public static void N(Class cls, csA csa) {
        defaultInstanceMap.put(cls, csa);
    }

    public static csA U(csA csa, byte[] bArr, nCG ncg) {
        int length = bArr.length;
        csA csa2 = (csA) csa.L(hZW.NEW_MUTABLE_INSTANCE);
        try {
            kV5 kv5 = kV5.R;
            kv5.getClass();
            bvr R = kv5.R(csa2.getClass());
            R.X(csa2, bArr, 0, length + 0, new cDk(ncg));
            R.m(csa2);
            if (csa2.memoizedHashCode != 0) {
                throw new RuntimeException();
            } else if (csa2.x()) {
                return csa2;
            } else {
                throw new b7b(new iMS().getMessage());
            }
        } catch (b7b e) {
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof b7b) {
                throw ((b7b) e2.getCause());
            }
            throw new b7b(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw b7b.O();
        }
    }

    public static csA Z(Class cls) {
        csA csa = defaultInstanceMap.get(cls);
        if (csa == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                csa = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (csa == null) {
            csa = (csA) ((csA) hU3.v(cls)).L(hZW.GET_DEFAULT_INSTANCE);
            if (csa != null) {
                defaultInstanceMap.put(cls, csa);
            } else {
                throw new IllegalStateException();
            }
        }
        return csa;
    }

    public static Object m(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public abstract Object L(hZW hzw);

    public final c_m O() {
        return (c_m) L(hZW.NEW_BUILDER);
    }

    @Override // defpackage.qN
    public final int R() {
        if (this.memoizedSerializedSize == -1) {
            kV5 kv5 = kV5.R;
            kv5.getClass();
            this.memoizedSerializedSize = kv5.R(getClass()).x(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.qN
    public final void X(d3 d3Var) {
        kV5 kv5 = kV5.R;
        kv5.getClass();
        bvr R = kv5.R(getClass());
        gL6 gl6 = d3Var.f2474R;
        if (gl6 == null) {
            gl6 = new gL6(d3Var);
        }
        R.R(this, gl6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kV5 kv5 = kV5.R;
        kv5.getClass();
        return kv5.R(getClass()).O(this, (csA) obj);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        kV5 kv5 = kV5.R;
        kv5.getClass();
        int e = kv5.R(getClass()).e(this);
        this.memoizedHashCode = e;
        return e;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        iWF.l(this, sb, 0);
        return sb.toString();
    }

    public final boolean x() {
        byte byteValue = ((Byte) L(hZW.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        kV5 kv5 = kV5.R;
        kv5.getClass();
        boolean Z = kv5.R(getClass()).Z(this);
        L(hZW.SET_MEMOIZED_IS_INITIALIZED);
        return Z;
    }
}
