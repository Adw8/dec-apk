package defpackage;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: jcw  reason: default package */
/* loaded from: classes.dex */
public final class jcw implements orq {
    public static final oFB R = bRg.R("application/dns-message");

    /* renamed from: R  reason: collision with other field name */
    public final a7_ f4983R;

    /* renamed from: R  reason: collision with other field name */
    public final nZz f4984R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4985R;
    public final boolean v;

    public jcw(nZz nzz, a7_ a7_, boolean z, boolean z2) {
        this.f4984R = nzz;
        this.f4983R = a7_;
        this.f4985R = z;
        this.v = z2;
    }

    public static ArrayList v(String str, dEt det) {
        th = null;
        if (det.f2544v == null && det.f2542R != nX1.HTTP_2) {
            oMv omv = oMv.f6773R;
            oMv omv2 = oMv.f6773R;
            StringBuilder U = opT.U("Incorrect protocol: ");
            U.append(det.f2542R);
            String sb = U.toString();
            omv2.getClass();
            oMv.m(5, sb, th);
        }
        try {
            if (det.f2543R) {
                arx arx = det.f2534R;
                if (arx.c() <= 65536) {
                    return mxE.R(str, arx.O().h());
                }
                throw new IOException("response size exceeds limit (65536 bytes): " + arx.c() + " bytes");
            }
            throw new IOException("response: " + det.e + ' ' + det.f2540R);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final void R(String str, ArrayList arrayList, int i) {
        List<String> list;
        boolean z;
        fmL fml = new fmL();
        fml.f3557R.e("Accept", R.R);
        int i2 = mxE.R;
        ME me = new ME();
        me.X4(0);
        me.X4(256);
        me.X4(1);
        me.X4(0);
        me.X4(0);
        me.X4(0);
        ME me2 = new ME();
        List b = iH_.b(str, new char[]{'.'}, 0, 6);
        if (!b.isEmpty()) {
            ListIterator listIterator = b.listIterator(b.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    list = dF.vz(b, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = fcD.R;
        for (String str2 : list) {
            long W = pdD.W(str2);
            if (W == ((long) str2.length())) {
                me2.a((int) W);
                me2.vr(str2);
            } else {
                throw new IllegalArgumentException(opT.H("non-ascii hostname: ", str).toString());
            }
        }
        me2.a(0);
        me2.Z(me, 0, me2.R);
        me.X4(i);
        me.X4(1);
        F6 h = me.h();
        if (this.f4985R) {
            fml.R = this.f4983R;
            fml.v("POST", new dId(R, h));
        } else {
            String a = iH_.a(h.R(), "=", "");
            hro O = this.f4983R.O();
            O.R("dns", a);
            fml.R = O.v();
        }
        j0 j0Var = new j0(fml);
        if (!this.f4985R) {
            this.f4984R.getClass();
        }
        nZz nzz = this.f4984R;
        nzz.getClass();
        arrayList.add(new lMx(nzz, j0Var, false));
    }

    @Override // defpackage.orq
    public final List c(String str) {
        if (!this.v) {
            if ((j3D.R.R(str) == null) && !this.v) {
                throw new UnknownHostException("private hosts not resolved");
            }
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList(5);
        R(str, arrayList, 1);
        R(str, arrayList, 28);
        CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lMx) ((r2) it.next())).O(new ewo(arrayList2, countDownLatch, this, str, arrayList3));
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            arrayList2.add(e);
        }
        if (!arrayList3.isEmpty()) {
            return arrayList3;
        }
        if (!arrayList2.isEmpty()) {
            Exception exc = (Exception) arrayList2.get(0);
            if (!(exc instanceof UnknownHostException)) {
                UnknownHostException unknownHostException = new UnknownHostException(str);
                unknownHostException.initCause(exc);
                int size = arrayList2.size();
                for (int i = 1; i < size; i++) {
                    l6.U(unknownHostException, (Throwable) arrayList2.get(i));
                }
                throw unknownHostException;
            }
            throw exc;
        }
        throw new UnknownHostException(str);
    }
}
