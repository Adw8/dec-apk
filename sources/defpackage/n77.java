package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: n77  reason: default package */
/* loaded from: classes.dex */
public final class n77 extends oMv {
    public static final kgV R = new kgV(12, 0);

    /* renamed from: R  reason: collision with other field name */
    public final Class f6309R;

    /* renamed from: R  reason: collision with other field name */
    public final Method f6310R;
    public final Method c;
    public final Class v;

    /* renamed from: v  reason: collision with other field name */
    public final Method f6311v;

    public n77(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f6310R = method;
        this.f6311v = method2;
        this.c = method3;
        this.f6309R = cls;
        this.v = cls2;
    }

    @Override // defpackage.oMv
    public final String O(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f6311v.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                orv orv = (orv) invocationHandler;
                boolean z = orv.f6983R;
                if (!z && orv.R == null) {
                    oMv.m(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return orv.R;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    @Override // defpackage.oMv
    public final void R(SSLSocket sSLSocket) {
        try {
            this.c.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // defpackage.oMv
    public final void e(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f6310R.invoke(null, sSLSocket, Proxy.newProxyInstance(oMv.class.getClassLoader(), new Class[]{this.f6309R, this.v}, new orv(atb.R(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }
}
