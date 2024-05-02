package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* renamed from: aXa  reason: default package */
/* loaded from: classes.dex */
public final class aXa {
    public static final aXa R;

    /* renamed from: R  reason: collision with other field name */
    public static final ArrayList f913R;

    /* renamed from: R  reason: collision with other field name */
    public static final Logger f914R = Logger.getLogger(aXa.class.getName());

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f915R;
    public static final aXa X;
    public static final aXa c;
    public static final aXa e;
    public static final aXa v;

    /* renamed from: R  reason: collision with other field name */
    public final nD1 f916R;

    static {
        if (gCW.R()) {
            f913R = v("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f915R = false;
        } else if (mxC.j()) {
            f913R = v("GmsCore_OpenSSL", "AndroidOpenSSL");
            f915R = true;
        } else {
            f913R = new ArrayList();
            f915R = true;
        }
        R = new aXa(new aYa(23));
        v = new aXa(new aYa(25));
        c = new aXa(new n2G(23, null));
        e = new aXa(new n2G(24, null));
        X = new aXa(new aYa(24));
    }

    public aXa(nD1 nd1) {
        this.f916R = nd1;
    }

    public static ArrayList v(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f914R.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object R(String str) {
        Iterator it = f913R.iterator();
        Exception e2 = null;
        while (it.hasNext()) {
            try {
                return this.f916R.X(str, (Provider) it.next());
            } catch (Exception e3) {
                e2 = e3;
                if (e2 == null) {
                }
            }
        }
        if (f915R) {
            return this.f916R.X(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", e2);
    }
}
