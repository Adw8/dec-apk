package defpackage;

import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* renamed from: KB  reason: default package */
/* loaded from: classes.dex */
public abstract class KB {
    public static final Method R = Class.forName("com.android.org.conscrypt.Conscrypt").getDeclaredMethod("exportKeyingMaterial", SSLSocket.class, String.class, byte[].class, Integer.TYPE);
}
