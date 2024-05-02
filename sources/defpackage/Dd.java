package defpackage;

import android.content.Context;
import android.view.MenuItem;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: Dd  reason: default package */
/* loaded from: classes.dex */
public abstract class Dd {
    public Object R;
    public Object c;
    public Object v;

    public /* synthetic */ Dd() {
    }

    public /* synthetic */ Dd(Context context) {
        this.R = context;
    }

    public static boolean N(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean V(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract Object C(int i, Object obj);

    public abstract void H(Object obj, Object obj2);

    public abstract void K(qN qNVar);

    public abstract FK L();

    public abstract Object O(int i, int i2);

    public abstract String P();

    public abstract void U(int i);

    public abstract void X();

    public abstract int Z();

    public final Object g(qN qNVar, Class cls) {
        Object obj;
        k_8 k_8;
        lNJ lnj = (lNJ) ((Map) this.v).get(cls);
        if (lnj != null) {
            boolean z = false;
            switch (((eF) lnj).R) {
                case 0:
                    WX wx = (WX) qNVar;
                    return new aOm((oYA) new Q0(1).g(wx.t(), oYA.class), (gwO) new Q0(13).g(wx.i(), gwO.class), wx.i().V().i());
                case 1:
                    Sb sb = (Sb) qNVar;
                    return new KL(sb.V().y(), sb.i().t());
                case 2:
                    E1 e1 = (E1) qNVar;
                    return new W7(e1.i().y(), e1.t().t());
                case 3:
                    return new e8(((rm) qNVar).y().t());
                case 4:
                    return new Ij(((Da) qNVar).y().t());
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    return new eW(0, ((D1) qNVar).y().t());
                case 6:
                    String g = ((kda) qNVar).y().g();
                    return ((Uc) bm9.R(g)).v(g);
                case 7:
                    olG olg = (olG) qNVar;
                    String y = olg.y().y();
                    return new fuV(olg.y().g(), ((Uc) bm9.R(y)).v(y));
                case VmNativeCallback.$stable /* 8 */:
                    return new eW(1, ((iMQ) qNVar).y().t());
                case 9:
                    return new Jz(((nc) qNVar).y().t());
                case 10:
                    apQ apq = (apQ) qNVar;
                    jhs V = apq.i().V();
                    lVo o = V.o();
                    hDC.j(hDC.p(o.t()), apq.t().t());
                    new nul(V.i().g());
                    o.o().t();
                    hDC.G(o.V());
                    hDC.l(V.V());
                    obj = new dq();
                    break;
                case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                    hDg hdg = (hDg) qNVar;
                    jhs V2 = hdg.V();
                    lVo o2 = V2.o();
                    k_8 p = hDC.p(o2.t());
                    byte[] t = hdg.K().t();
                    byte[] t2 = hdg.J().t();
                    ECParameterSpec P = hDC.P(p);
                    ECPoint eCPoint = new ECPoint(new BigInteger(1, t), new BigInteger(1, t2));
                    hDC.O(eCPoint, P.getCurve());
                    obj = new iEA((ECPublicKey) ((KeyFactory) aXa.X.R("EC")).generatePublic(new ECPublicKeySpec(eCPoint, P)), o2.o().t(), hDC.G(o2.V()), hDC.l(V2.V()), new nul(V2.i().g()));
                    break;
                case 12:
                    lDz ldz = (lDz) qNVar;
                    if (!ldz.o()) {
                        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
                    } else if (ldz.i().K()) {
                        if (ldz.t().size() == 0) {
                            z = true;
                        }
                        if (!z) {
                            iVb i = ldz.i().i();
                            cUF.L(i);
                            cUF.O(i);
                            cUF.X(i);
                            inw o3 = i.o();
                            if (o3.ordinal() == 1) {
                                int ordinal = ldz.i().i().o().ordinal();
                                if (ordinal == 1) {
                                    byte[] t3 = ldz.t().t();
                                    byte[] z2 = vd.z(t3);
                                    nE.R(t3);
                                    nE.R(z2);
                                } else if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                                    byte[] t4 = ldz.t().t();
                                    byte[] t5 = ldz.i().V().t();
                                    int ordinal2 = ldz.i().i().o().ordinal();
                                    if (ordinal2 == 2) {
                                        k_8 = k_8.NIST_P256;
                                    } else if (ordinal2 == 3) {
                                        k_8 = k_8.NIST_P384;
                                    } else if (ordinal2 == 4) {
                                        k_8 = k_8.NIST_P521;
                                    } else {
                                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                                    }
                                    ECPublicKey g2 = hDC.g(k_8, t5);
                                    ECPrivateKey j = hDC.j(k_8, t4);
                                    hDC.f(j, g2);
                                    hDC.O(g2.getW(), j.getParams().getCurve());
                                    nE.R(t4);
                                    nE.R(t5);
                                } else {
                                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                                }
                                return new ppN();
                            }
                            StringBuilder U = opT.U("Unable to determine KEM-encoding length for ");
                            U.append(o3.name());
                            throw new IllegalArgumentException(U.toString());
                        }
                        throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
                    } else {
                        throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
                    }
                case 13:
                    fWO fwo = (fWO) qNVar;
                    if (fwo.V().size() == 0) {
                        z = true;
                    }
                    if (!z) {
                        iVb i2 = fwo.i();
                        return new aXN(fwo, cUF.L(i2), cUF.O(i2), cUF.X(i2));
                    }
                    throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
                case 14:
                    pA pAVar = (pA) qNVar;
                    return new gjr(new i8L(pAVar.t().t()), pAVar.i().y());
                default:
                    p4q p4q = (p4q) qNVar;
                    clj t6 = p4q.V().t();
                    SecretKeySpec secretKeySpec = new SecretKeySpec(p4q.i().t(), "HMAC");
                    int i3 = p4q.V().i();
                    int ordinal3 = t6.ordinal();
                    if (ordinal3 == 1) {
                        return new gjr(new bDg("HMACSHA1", secretKeySpec), i3);
                    }
                    if (ordinal3 == 2) {
                        return new gjr(new bDg("HMACSHA384", secretKeySpec), i3);
                    }
                    if (ordinal3 == 3) {
                        return new gjr(new bDg("HMACSHA256", secretKeySpec), i3);
                    }
                    if (ordinal3 == 4) {
                        return new gjr(new bDg("HMACSHA512", secretKeySpec), i3);
                    }
                    if (ordinal3 == 5) {
                        return new gjr(new bDg("HMACSHA224", secretKeySpec), i3);
                    }
                    throw new GeneralSecurityException("unknown hash");
            }
            return obj;
        }
        StringBuilder U2 = opT.U("Requested primitive class ");
        U2.append(cls.getCanonicalName());
        U2.append(" not supported.");
        throw new IllegalArgumentException(U2.toString());
    }

    public abstract qN i(b0 b0Var);

    public final MenuItem j(MenuItem menuItem) {
        if (!(menuItem instanceof irv)) {
            return menuItem;
        }
        irv irv = (irv) menuItem;
        if (((cE0) this.v) == null) {
            this.v = new cE0();
        }
        MenuItem menuItem2 = (MenuItem) ((cE0) this.v).getOrDefault(irv, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        o5B o5b = new o5B((Context) this.R, irv);
        ((cE0) this.v).put(irv, o5b);
        return o5b;
    }

    public abstract int m(Object obj);

    public final Object[] o(int i, Object[] objArr) {
        int Z = Z();
        if (objArr.length < Z) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), Z);
        }
        for (int i2 = 0; i2 < Z; i2++) {
            objArr[i2] = O(i2, i);
        }
        if (objArr.length > Z) {
            objArr[Z] = null;
        }
        return objArr;
    }

    public abstract f6h t();

    public abstract int x(Object obj);

    public imt y() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public Dd(Class cls, lNJ[] lnjArr) {
        this.R = cls;
        HashMap hashMap = new HashMap();
        for (lNJ lnj : lnjArr) {
            if (!hashMap.containsKey(lnj.R)) {
                hashMap.put(lnj.R, lnj);
            } else {
                StringBuilder U = opT.U("KeyTypeManager constructed with duplicate factories for primitive ");
                U.append(lnj.R.getCanonicalName());
                throw new IllegalArgumentException(U.toString());
            }
        }
        if (lnjArr.length > 0) {
            this.c = lnjArr[0].R;
        } else {
            this.c = Void.class;
        }
        this.v = Collections.unmodifiableMap(hashMap);
    }
}
