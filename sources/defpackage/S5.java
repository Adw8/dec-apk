package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: S5  reason: default package */
/* loaded from: classes.dex */
public class S5 implements gOQ {
    public static final zI R = new zI();

    /* renamed from: R  reason: collision with other field name */
    public final Class f503R;

    /* renamed from: R  reason: collision with other field name */
    public final Method f504R;
    public final Method c;
    public final Method e;
    public final Method v;

    public S5(Class cls) {
        this.f503R = cls;
        this.f504R = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.v = cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.gOQ
    public final boolean R(SSLSocket sSLSocket) {
        return this.f503R.isInstance(sSLSocket);
    }

    @Override // defpackage.gOQ
    public final boolean c() {
        return Xe.R.X();
    }

    @Override // defpackage.gOQ
    public final String e(SSLSocket sSLSocket) {
        if (!R(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.c.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, O1.R);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && n3x.v(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.gOQ
    public final void v(SSLSocket sSLSocket, String str, List list) {
        if (R(sSLSocket)) {
            try {
                this.f504R.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.v.invoke(sSLSocket, str);
                }
                Method method = this.e;
                oMv omv = oMv.f6773R;
                method.invoke(sSLSocket, atb.O(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
