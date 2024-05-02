package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: oEG  reason: default package */
/* loaded from: classes.dex */
public final class oEG implements fb {
    public final Lh R;

    /* renamed from: R  reason: collision with other field name */
    public final d74 f6711R;

    /* renamed from: R  reason: collision with other field name */
    public Throwable f6712R;

    /* renamed from: R  reason: collision with other field name */
    public final l9F f6713R;

    /* renamed from: R  reason: collision with other field name */
    public lMx f6714R;

    /* renamed from: R  reason: collision with other field name */
    public volatile boolean f6715R;

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f6716R;
    public boolean v;

    public oEG(d74 d74, Object[] objArr, Lh lh, l9F l9f) {
        this.f6711R = d74;
        this.f6716R = objArr;
        this.R = lh;
        this.f6713R = l9f;
    }

    @Override // defpackage.fb
    public final synchronized j0 C() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((lMx) e()).f5666R;
    }

    @Override // defpackage.fb
    public final void H(Xf xf) {
        lMx lmx;
        Throwable th;
        synchronized (this) {
            if (!this.v) {
                this.v = true;
                lmx = this.f6714R;
                th = this.f6712R;
                if (lmx == null && th == null) {
                    lMx v = v();
                    this.f6714R = v;
                    lmx = v;
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            xf.v(th);
            return;
        }
        if (this.f6715R) {
            lmx.cancel();
        }
        lmx.O(new keA(this, xf));
    }

    @Override // defpackage.fb
    public final fb R() {
        return new oEG(this.f6711R, this.f6716R, this.R, this.f6713R);
    }

    /* JADX INFO: finally extract failed */
    public final o3I X(dEt det) {
        arx arx = det.f2534R;
        eUn eun = new eUn(det);
        eun.f3110R = new a6W(arx.X(), arx.c());
        dEt R = eun.R();
        int i = R.e;
        if (i < 200 || i >= 300) {
            try {
                arx.O().Q(new ME());
                arx.X();
                arx.c();
                if (!R.f2543R) {
                    o3I o3i = new o3I(R, null);
                    arx.close();
                    return o3i;
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } catch (Throwable th) {
                arx.close();
                throw th;
            }
        } else if (i == 204 || i == 205) {
            arx.close();
            if (R.f2543R) {
                return new o3I(R, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } else {
            hug hug = new hug(arx);
            try {
                Object X = this.f6713R.X(hug);
                if (R.f2543R) {
                    return new o3I(R, X);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            } catch (RuntimeException e) {
                IOException iOException = hug.f4414R;
                if (iOException == null) {
                    throw e;
                }
                throw iOException;
            }
        }
    }

    @Override // defpackage.fb
    public final boolean c() {
        boolean z = true;
        if (this.f6715R) {
            return true;
        }
        synchronized (this) {
            lMx lmx = this.f6714R;
            if (lmx == null || !lmx.O) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fb
    public final void cancel() {
        lMx lmx;
        this.f6715R = true;
        synchronized (this) {
            lmx = this.f6714R;
        }
        if (lmx != null) {
            lmx.cancel();
        }
    }

    @Override // java.lang.Object
    public final Object clone() {
        return new oEG(this.f6711R, this.f6716R, this.R, this.f6713R);
    }

    public final r2 e() {
        lMx lmx = this.f6714R;
        if (lmx != null) {
            return lmx;
        }
        Throwable th = this.f6712R;
        if (th == null) {
            try {
                lMx v = v();
                this.f6714R = v;
                return v;
            } catch (IOException | Error | RuntimeException e) {
                biy.Y(e);
                this.f6712R = e;
                throw e;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public final lMx v() {
        a7_ a7_;
        hro hro;
        Lh lh = this.R;
        d74 d74 = this.f6711R;
        Object[] objArr = this.f6716R;
        pdD[] pddArr = d74.f2500R;
        int length = objArr.length;
        if (length == pddArr.length) {
            kK5 kk5 = new kK5(d74.f2496R, d74.R, d74.v, d74.f2495R, d74.f2498R, d74.f2499R, d74.f2501v, d74.c);
            if (d74.e) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                pddArr[i].Z(kk5, objArr[i]);
            }
            hro hro2 = kk5.f5260R;
            if (hro2 != null) {
                a7_ = hro2.v();
            } else {
                a7_ a7_2 = kk5.f5257R;
                String str = kk5.v;
                a7_2.getClass();
                try {
                    hro = new hro();
                    hro.X(a7_2, str);
                } catch (IllegalArgumentException unused) {
                    hro = null;
                }
                a7_ = hro != null ? hro.v() : null;
                if (a7_ == null) {
                    StringBuilder U = opT.U("Malformed URL. Base: ");
                    U.append(kk5.f5257R);
                    U.append(", Relative: ");
                    U.append(kk5.v);
                    throw new IllegalArgumentException(U.toString());
                }
            }
            h7U h7u = kk5.f5259R;
            if (h7u == null) {
                iM2 im2 = kk5.f5261R;
                if (im2 != null) {
                    h7u = new kLG(im2.R, im2.v);
                } else {
                    pls pls = kk5.f5265R;
                    if (pls != null) {
                        if (!pls.f7222R.isEmpty()) {
                            h7u = new kxs(pls.R, pls.f7223R, khE.m(pls.f7222R));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (kk5.f5266R) {
                        long j = (long) 0;
                        asb.R(j, j, j);
                        h7u = new mQp(null, new byte[0], 0, 0);
                    }
                }
            }
            oFB ofb = kk5.f5264R;
            if (ofb != null) {
                if (h7u != null) {
                    h7u = new dId(h7u, ofb);
                } else {
                    iRl irl = kk5.f5262R;
                    String str2 = ofb.R;
                    irl.getClass();
                    dTl.n("Content-Type");
                    dTl.Q(str2, "Content-Type");
                    dTl.o(irl, "Content-Type", str2);
                }
            }
            fmL fml = kk5.f5258R;
            fml.R = a7_;
            fml.f3557R = kk5.f5262R.v().c();
            fml.v(kk5.f5263R, h7u);
            fml.e(lLL.class, new lLL(d74.f2497R, arrayList));
            j0 j0Var = new j0(fml);
            nZz nzz = (nZz) lh;
            nzz.getClass();
            return new lMx(nzz, j0Var, false);
        }
        throw new IllegalArgumentException(jQ.j(opT.C("Argument count (", length, ") doesn't match expected count ("), pddArr.length, ")"));
    }
}
