package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.Y;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.crypto.Mac;

/* renamed from: h5  reason: default package */
/* loaded from: classes.dex */
public class h5 implements kj3, IC, aSp, b6E, bFN {
    public Object R;
    public final /* synthetic */ int e;
    public Object v;

    public /* synthetic */ h5() {
        this.e = 18;
    }

    public static final h5 i(lxg lxg, rg rgVar) {
        byte[] bArr = new byte[0];
        lH1 v = lxg.v();
        if (v.y().size() != 0) {
            try {
                dxG K = dxG.K(rgVar.v(v.y().t(), bArr), nCG.R());
                if (K.t() > 0) {
                    return new h5(K);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (b7b unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static h5 x(k_8 k_8) {
        int ordinal = k_8.ordinal();
        if (ordinal == 0) {
            return new h5(new zI("HmacSha256", 1), k_8.NIST_P256, 27);
        }
        if (ordinal == 1) {
            return new h5(new zI("HmacSha384", 1), k_8.NIST_P384, 27);
        }
        if (ordinal == 2) {
            return new h5(new zI("HmacSha512", 1), k_8.NIST_P521, 27);
        }
        throw new GeneralSecurityException("invalid curve type: " + k_8);
    }

    public final boolean C() {
        return ((l8) this.v).getPreventCornerOverlap();
    }

    public final Object H() {
        l6E l6e = (l6E) ((AtomicReference) this.R).get();
        int R = l6e.R(Thread.currentThread().getId());
        if (R >= 0) {
            return l6e.f5587R[R];
        }
        return null;
    }

    public final void J(vd vdVar) {
        boolean z;
        Y y = (Y) this.R;
        synchronized (y.f1336R) {
            z = y.c == Y.e;
            y.c = vdVar;
        }
        if (z) {
            CW S = CW.S();
            k0f k0f = y.f1337R;
            ble ble = S.f61R;
            if (ble.R == null) {
                synchronized (ble.f1808R) {
                    if (ble.R == null) {
                        ble.R = Handler.createAsync(Looper.getMainLooper());
                    }
                }
            }
            ble.R.post(k0f);
        }
        if (vdVar instanceof f0O) {
            ((gXD) this.v).m((f0O) vdVar);
        } else if (vdVar instanceof c61) {
            ((gXD) this.v).x(((c61) vdVar).R);
        }
    }

    public final void K(int i, int i2, int i3, int i4) {
        ((l8) this.v).f5592v.set(i, i2, i3, i4);
        Object obj = this.v;
        l8.R((l8) obj, i + ((l8) obj).f5589R.left, i2 + ((l8) obj).f5589R.top, i3 + ((l8) obj).f5589R.right, i4 + ((l8) obj).f5589R.bottom);
    }

    public final jpU L() {
        if (((String) this.R) == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        } else if (((String) this.v) != null) {
            return new jpU(this);
        } else {
            throw new IllegalArgumentException("Product type must be provided.");
        }
    }

    public final Object N(Class cls) {
        d0J d0j = (d0J) kWP.c.get(cls);
        Class c = d0j == null ? null : d0j.c();
        if (c != null) {
            aLF alf = aLF.ENABLED;
            dxG dxg = (dxG) this.R;
            int i = ibQ.R;
            int V = dxg.V();
            boolean z = true;
            int i2 = 0;
            boolean z2 = false;
            for (okQ okq : dxg.i()) {
                if (okq.K() == alf) {
                    if (!okq.J()) {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(okq.V())));
                    } else if (okq.o() == hPF.UNKNOWN_PREFIX) {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(okq.V())));
                    } else if (okq.K() != aLF.UNKNOWN_STATUS) {
                        if (okq.V() == V) {
                            if (!z2) {
                                z2 = true;
                            } else {
                                throw new GeneralSecurityException("keyset contains multiple primary keys");
                            }
                        }
                        if (okq.i().i() != f6h.ASYMMETRIC_PUBLIC) {
                            z = false;
                        }
                        i2++;
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(okq.V())));
                    }
                }
            }
            if (i2 == 0) {
                throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
            } else if (z2 || z) {
                piu piu = new piu(c, 0);
                imB imb = (imB) this.v;
                if (((ConcurrentMap) piu.f7203v) != null) {
                    piu.e = imb;
                    for (okQ okq2 : ((dxG) this.R).i()) {
                        if (okq2.K() == alf) {
                            fZH i3 = okq2.i();
                            Logger logger = kWP.f5319R;
                            Object v = kWP.v(i3.V(), i3.o(), c);
                            if (okq2.V() == ((dxG) this.R).V()) {
                                piu.O(v, okq2, true);
                            } else {
                                piu.O(v, okq2, false);
                            }
                        }
                    }
                    ConcurrentMap concurrentMap = (ConcurrentMap) piu.f7203v;
                    if (concurrentMap != null) {
                        b1t b1t = new b1t(concurrentMap, (npR) piu.c, (imB) piu.e, (Class) piu.f7202R);
                        piu.f7203v = null;
                        d0J d0j2 = (d0J) kWP.c.get(cls);
                        if (d0j2 == null) {
                            StringBuilder U = opT.U("No wrapper found for ");
                            U.append(((Class) b1t.c).getName());
                            throw new GeneralSecurityException(U.toString());
                        } else if (d0j2.c().equals((Class) b1t.c)) {
                            return d0j2.R(b1t);
                        } else {
                            StringBuilder U2 = opT.U("Wrong input primitive class, expected ");
                            U2.append(d0j2.c());
                            U2.append(", got ");
                            U2.append((Class) b1t.c);
                            throw new GeneralSecurityException(U2.toString());
                        }
                    } else {
                        throw new IllegalStateException("build cannot be called twice");
                    }
                } else {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
            } else {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
        } else {
            StringBuilder U3 = opT.U("No wrapper found for ");
            U3.append(cls.getName());
            throw new GeneralSecurityException(U3.toString());
        }
    }

    @Override // defpackage.bFN
    public final byte[] O() {
        int ordinal = ((k_8) this.R).ordinal();
        if (ordinal == 0) {
            return iZL.c;
        }
        if (ordinal == 1) {
            return iZL.e;
        }
        if (ordinal == 2) {
            return iZL.X;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    /* JADX INFO: finally extract failed */
    public final void P(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.R).getContext().obtainStyledAttributes(attributeSet, iTI.m, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            ((hw1) ((nhs) this.v).f6515R).J(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.b6E
    public final Object R() {
        nt4 nt4 = (nt4) this.R;
        List list = (List) this.v;
        nt4.getClass();
        HashMap hashMap = new HashMap();
        for (aKF akf : nt4.f6620R.values()) {
            String str = akf.f839R.f6323R;
            if (list.contains(str)) {
                aKF akf2 = (aKF) hashMap.get(str);
                if ((akf2 == null ? -1 : akf2.R) < akf.R) {
                    hashMap.put(str, akf);
                }
            }
        }
        return hashMap;
    }

    public final KeyListener U(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? ((hw1) ((nhs) this.v).f6515R).i(keyListener) : keyListener;
    }

    public final void V(zq zqVar) {
        cWb cwb = (cWb) ((Map) this.R).get(zqVar);
        if (cwb != null) {
            zq zqVar2 = (zq) ((Map) this.v).remove(cwb);
        }
        ((Map) this.R).remove(zqVar);
    }

    @Override // defpackage.kj3
    public final void X(jeV jev) {
        Object[] objArr = (Object[]) this.v;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    jev.O(i);
                } else if (obj instanceof byte[]) {
                    jev.R(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    jev.c((double) ((Float) obj).floatValue(), i);
                } else if (obj instanceof Double) {
                    jev.c(((Double) obj).doubleValue(), i);
                } else if (obj instanceof Long) {
                    jev.X(((Long) obj).longValue(), i);
                } else if (obj instanceof Integer) {
                    jev.X((long) ((Integer) obj).intValue(), i);
                } else if (obj instanceof Short) {
                    jev.X((long) ((Short) obj).shortValue(), i);
                } else if (obj instanceof Byte) {
                    jev.X((long) ((Byte) obj).byteValue(), i);
                } else if (obj instanceof String) {
                    jev.Z(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    jev.X(((Boolean) obj).booleanValue() ? 1 : 0, i);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
            }
        }
    }

    public final Object Y(qN qNVar) {
        if (!Void.class.equals((Class) this.v)) {
            ((Dd) this.R).K(qNVar);
            return ((Dd) this.R).g(qNVar, (Class) this.v);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final void Z() {
        Reference poll;
        do {
            poll = ((ReferenceQueue) this.v).poll();
            if (poll != null) {
                ((biT) this.R).U(poll);
                continue;
            }
        } while (poll != null);
    }

    @Override // defpackage.kj3
    public final String c() {
        return (String) this.R;
    }

    @Override // defpackage.bFN
    public final mF9 e(byte[] bArr) {
        KeyPair U = hDC.U(hDC.P((k_8) this.R));
        byte[] Z = hDC.Z((ECPrivateKey) U.getPrivate(), hDC.g((k_8) this.R, bArr));
        byte[] A = hDC.A(hDC.P((k_8) this.R).getCurve(), 1, ((ECPublicKey) U.getPublic()).getW());
        byte[] K = cpc.K(A, bArr);
        byte[] K2 = cpc.K(iZL.C, O());
        zI zIVar = (zI) this.v;
        int macLength = Mac.getInstance(zIVar.R).getMacLength();
        return new mF9(zIVar.v(zIVar.c(cpc.K(iZL.P, K2, "eae_prk".getBytes(StandardCharsets.UTF_8), Z), null), iZL.v("shared_secret", K, K2, macLength), macLength), A);
    }

    public final fZH g(b0 b0Var) {
        try {
            qN U = new h89(25, ((Dd) this.R).y()).U(b0Var);
            dLW K = fZH.K();
            String P = ((Dd) this.R).P();
            K.X();
            fZH.j((fZH) K.v, P);
            U.getClass();
            try {
                jsT jst = new jsT(U.R());
                U.X((d3) jst.R);
                d3 d3Var = (d3) jst.R;
                if (d3Var.f2473R - d3Var.v == 0) {
                    MH mh = new MH((byte[]) jst.v);
                    K.X();
                    fZH.g((fZH) K.v, mh);
                    f6h t = ((Dd) this.R).t();
                    K.X();
                    fZH.y((fZH) K.v, t);
                    return (fZH) K.v();
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e) {
                throw new RuntimeException(U.c("ByteString"), e);
            }
        } catch (b7b e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public final void h() {
        ai_ ai_ = (ai_) this.v;
        Context context = (Context) this.R;
        if (ai_.f983R) {
            context.unregisterReceiver((ai_) ai_.f982R.v);
            ai_.f983R = false;
            return;
        }
        fgm.O("BillingBroadcastManager", "Receiver is not registered.");
    }

    public final qN j(b0 b0Var) {
        try {
            return new h89(25, ((Dd) this.R).y()).U(b0Var);
        } catch (b7b e) {
            StringBuilder U = opT.U("Failures parsing proto of type ");
            U.append(((Class) ((Dd) this.R).y().R).getName());
            throw new GeneralSecurityException(U.toString(), e);
        }
    }

    public final boolean m(aAx aax, boolean z) {
        if (!((orf) this.v).R((Map) aax.R, (hjM) this.R, aax, z)) {
            return false;
        }
        return ((orf) this.v).e(aax) || ((orf) this.v).X((Map) aax.R, (hjM) this.R, aax, z);
    }

    public final void o(Object obj) {
        boolean z;
        long id = Thread.currentThread().getId();
        synchronized (this.v) {
            l6E l6e = (l6E) ((AtomicReference) this.R).get();
            int R = l6e.R(id);
            if (R < 0) {
                z = false;
            } else {
                l6e.f5587R[R] = obj;
                z = true;
            }
            if (!z) {
                ((AtomicReference) this.R).set(l6e.v(id, obj));
            }
        }
    }

    @Override // defpackage.IC
    public final void onCancel() {
        ((hFt) this.R).cancel();
    }

    public final void t(kFU kfu) {
        int i = kfu.R;
        if (i == 0) {
            ((Handler) this.v).post(new dX(this, (h89) this.R, kfu.f5224R, 0));
        } else {
            ((Handler) this.v).post(new kBb(this, (h89) this.R, i, 3));
        }
    }

    public final String toString() {
        boolean z;
        switch (this.e) {
            case 12:
                StringBuilder U = opT.U("Bounds{lower=");
                U.append((ojk) this.R);
                U.append(" upper=");
                U.append((ojk) this.v);
                U.append("}");
                return U.toString();
            case 14:
                StringBuilder U2 = opT.U("MasterKey{keyAlias=");
                U2.append((String) this.R);
                U2.append(", isKeyStoreBacked=");
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    instance.load(null);
                    z = instance.containsAlias((String) this.R);
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    z = false;
                }
                U2.append(z);
                U2.append("}");
                return U2.toString();
            case 26:
                return ibQ.R((dxG) this.R).toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0030 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(long r12, defpackage.pfJ r14) {
        /*
            r11 = this;
            java.lang.Object r11 = r11.v
            orf r11 = (defpackage.orf) r11
            int r0 = r14.X
            r1 = 0
            r2 = 1
            r3 = r1
            r4 = r2
        L_0x000a:
            if (r3 >= r0) goto L_0x0068
            java.lang.Object[] r5 = r14.f7157R
            r5 = r5[r3]
            oSr r5 = (defpackage.oSr) r5
            if (r4 == 0) goto L_0x0050
            biT r6 = r11.R
            int r7 = r6.e
            if (r7 <= 0) goto L_0x002f
            java.lang.Object[] r6 = r6.f1772R
            r8 = r1
        L_0x001d:
            r9 = r6[r8]
            r10 = r9
            coj r10 = (defpackage.coj) r10
            oSr r10 = r10.f2204R
            boolean r10 = defpackage.n3x.v(r10, r5)
            if (r10 == 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            int r8 = r8 + 1
            if (r8 < r7) goto L_0x001d
        L_0x002f:
            r9 = 0
        L_0x0030:
            coj r9 = (defpackage.coj) r9
            if (r9 == 0) goto L_0x004f
            r9.f2208v = r2
            biT r11 = r9.v
            k8q r5 = new k8q
            r5.<init>(r12)
            boolean r11 = r11.Z(r5)
            if (r11 != 0) goto L_0x004d
            biT r11 = r9.v
            k8q r5 = new k8q
            r5.<init>(r12)
            r11.v(r5)
        L_0x004d:
            r11 = r9
            goto L_0x0065
        L_0x004f:
            r4 = r1
        L_0x0050:
            coj r6 = new coj
            r6.<init>(r5)
            biT r5 = r6.v
            k8q r7 = new k8q
            r7.<init>(r12)
            r5.v(r7)
            biT r11 = r11.R
            r11.v(r6)
            r11 = r6
        L_0x0065:
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h5.v(long, pfJ):void");
    }

    public final InputConnection y(InputConnection inputConnection, EditorInfo editorInfo) {
        nhs nhs = (nhs) this.v;
        if (inputConnection != null) {
            return ((hw1) nhs.f6515R).V(inputConnection, editorInfo);
        }
        nhs.getClass();
        return null;
    }

    public /* synthetic */ h5(Object obj, int i, Object obj2) {
        this.e = i;
        this.R = obj;
        this.v = obj2;
    }

    public /* synthetic */ h5(Object obj, Object obj2, int i) {
        this.e = i;
        this.v = obj;
        this.R = obj2;
    }

    public h5(Context context, gZn gzn) {
        this.e = 20;
        this.R = context;
        this.v = new ai_(this, gzn);
    }

    public h5(biT bit, q4 q4Var) {
        this.e = 7;
        this.R = bit;
        this.v = q4Var;
    }

    public h5(rg rgVar) {
        this.e = 28;
        this.R = rgVar;
        this.v = null;
    }

    public h5(Dd dd, Class cls) {
        this.e = 25;
        if (((Map) dd.v).keySet().contains(cls) || Void.class.equals(cls)) {
            this.R = dd;
            this.v = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dd.toString(), cls.getName()));
    }

    public h5(mZ_ mz_) {
        this.e = 28;
        this.R = null;
        this.v = mz_;
    }

    public h5(jP7 jp7) {
        this.e = 6;
        this.R = jp7;
        this.v = new orf();
    }

    public h5(h5 h5Var, d5M d5m) {
        this.e = 3;
        this.R = h5Var;
        this.v = d5m;
    }

    public h5(msD msd) {
        this.e = 13;
        this.R = Collections.newSetFromMap(new IdentityHashMap());
        this.v = msd;
    }

    public h5(TextView textView) {
        this.e = 1;
        textView.getClass();
        this.R = textView;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public h5(String str) {
        this(str, 15, (Object) null);
        this.e = 15;
    }

    public h5(EditText editText) {
        this.e = 0;
        this.R = editText;
        this.v = new nhs(editText);
    }

    public h5(KeyGenParameterSpec keyGenParameterSpec, String str) {
        this.e = 14;
        this.R = str;
        this.v = keyGenParameterSpec;
    }

    public h5(int i) {
        this.e = i;
        if (i == 5) {
            this.R = new AtomicReference(mjG.R);
            this.v = new Object();
        } else if (i == 17) {
            this.R = new Y();
            this.v = new gXD();
            J(aSp.R);
        } else if (i == 29) {
            this.R = null;
            this.v = null;
            int i2 = Uc.R;
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.v = instance;
                instance.load(null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        } else if (i == 8) {
            this.R = new biT(new Reference[16]);
            this.v = new ReferenceQueue();
        } else if (i == 9) {
            this.R = new dq((Object) null);
            this.v = new e2I();
        } else if (i == 21) {
            this.R = new Rect();
            this.v = new Rect();
        } else if (i != 22) {
            this.R = new LinkedHashMap();
            this.v = new LinkedHashMap();
        }
    }

    public h5(ArrayList arrayList, ArrayList arrayList2) {
        this.e = 10;
        int size = arrayList.size();
        this.R = new int[size];
        this.v = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.R)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.v)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public h5(WindowInsetsAnimation.Bounds bounds) {
        this.e = 12;
        this.R = ojk.c(bounds.getLowerBound());
        this.v = ojk.c(bounds.getUpperBound());
    }

    public h5(int i, int i2) {
        this.e = 10;
        this.R = new int[]{i, i2};
        this.v = new float[]{0.0f, 1.0f};
    }

    public h5(int i, int i2, int i3) {
        this.e = 10;
        this.R = new int[]{i, i2, i3};
        this.v = new float[]{0.0f, 0.5f, 1.0f};
    }

    public h5(l8 l8Var) {
        this.e = 2;
        this.v = l8Var;
    }

    public h5(dxG dxg) {
        this.e = 26;
        this.R = dxg;
        this.v = imB.R;
    }
}
