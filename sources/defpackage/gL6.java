package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Base64;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Mac;

/* renamed from: gL6  reason: default package */
/* loaded from: classes.dex */
public class gL6 implements foC, etI, uE, j7x, bFN {
    public Object R;

    public /* synthetic */ gL6(int i, Object obj) {
        this.R = obj;
    }

    public final void A(int i, int i2) {
        d3 d3Var = (d3) this.R;
        d3Var.S(i, 0);
        d3Var.d((i2 >> 31) ^ (i2 << 1));
    }

    public final int C() {
        Configuration configuration = ((Context) this.R).getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public final float H(int i, int i2) {
        return ((Float[]) ((c85[]) this.R)[i].R)[i2].floatValue();
    }

    public final void I(int i, int i2) {
        d3 d3Var = (d3) this.R;
        d3Var.S(i, 0);
        d3Var.Q(i2);
    }

    public final void J(long j, int i) {
        ((d3) this.R).z(j, i);
    }

    public final void K(int i, int i2) {
        ((d3) this.R).I(i, i2);
    }

    public final synchronized okQ L(fZH fzh, hPF hpf) {
        int V;
        synchronized (this) {
            V = lTs.V();
            while (P(V)) {
                V = lTs.V();
            }
        }
        return (okQ) r1.v();
        if (hpf != hPF.UNKNOWN_PREFIX) {
            oMZ Y = okQ.Y();
            Y.X();
            okQ.j((okQ) Y.v, fzh);
            Y.X();
            okQ.t((okQ) Y.v, V);
            aLF alf = aLF.ENABLED;
            Y.X();
            okQ.y((okQ) Y.v, alf);
            Y.X();
            okQ.g((okQ) Y.v, hpf);
            return (okQ) Y.v();
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }

    public final c85 N(int i) {
        return ((c85[]) this.R)[i];
    }

    @Override // defpackage.bFN
    public final byte[] O() {
        if (Arrays.equals(((zI) this.R).e(), iZL.O)) {
            return iZL.v;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    public final synchronized boolean P(int i) {
        for (okQ okq : Collections.unmodifiableList(((dxG) ((l9K) this.R).v).i())) {
            if (okq.V() == i) {
                return true;
            }
        }
        return false;
    }

    public final void Q(long j, int i) {
        ((d3) this.R).z(j, i);
    }

    @Override // defpackage.foC
    public final boolean R(lRG lrg, MenuItem menuItem) {
        boolean z;
        Sz sz = ((ActionMenuView) this.R).f1085R;
        if (sz != null) {
            h89 h89 = (h89) sz;
            if (((Toolbar) h89.R).R.I()) {
                z = true;
            } else {
                ((Toolbar) h89.R).getClass();
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void S(long j, int i) {
        ((d3) this.R).W((j >> 63) ^ (j << 1), i);
    }

    public final synchronized h5 U() {
        dxG dxg;
        dxg = (dxG) ((l9K) this.R).v();
        if (dxg.t() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
        return new h5(dxg);
    }

    public final void V(double d, int i) {
        d3 d3Var = (d3) this.R;
        d3Var.getClass();
        d3Var.z(Double.doubleToRawLongBits(d), i);
    }

    public final void W(long j, int i) {
        ((d3) this.R).W(j, i);
    }

    public final synchronized void X(k1p k1p) {
        okQ L;
        synchronized (this) {
            L = L(kWP.X(k1p), k1p.i());
        }
        l9K l9k = (l9K) this.R;
        l9k.X();
        dxG.g((dxG) l9k.v, L);
    }

    public final void Y(int i, float f) {
        d3 d3Var = (d3) this.R;
        d3Var.getClass();
        d3Var.I(i, Float.floatToRawIntBits(f));
    }

    public final int Z() {
        return ((Parcel) this.R).dataAvail();
    }

    @Override // defpackage.foC
    public final void c(lRG lrg) {
        foC foc = ((ActionMenuView) this.R).f1087R;
        if (foc != null) {
            foc.c(lrg);
        }
    }

    public final void d(int i, int i2) {
        d3 d3Var = (d3) this.R;
        d3Var.S(i, 0);
        d3Var.d(i2);
    }

    @Override // defpackage.bFN
    public final mF9 e(byte[] bArr) {
        byte[] j = vd.j();
        byte[] N = vd.N(j, bArr);
        byte[] z = vd.z(j);
        byte[] K = cpc.K(z, bArr);
        byte[] K2 = cpc.K(iZL.C, iZL.v);
        zI zIVar = (zI) this.R;
        int macLength = Mac.getInstance(zIVar.R).getMacLength();
        return new mF9(zIVar.v(zIVar.c(cpc.K(iZL.P, K2, "eae_prk".getBytes(StandardCharsets.UTF_8), N), null), iZL.v("shared_secret", K, K2, macLength), macLength), z);
    }

    public final void g(int i, int i2, float f) {
        ((Float[]) ((c85[]) this.R)[i].R)[i2] = Float.valueOf(f);
    }

    public final void h(int i, bvr bvr, Object obj) {
        d3 d3Var = (d3) this.R;
        d3Var.S(i, 3);
        bvr.R((qN) obj, d3Var.f2474R);
        d3Var.S(i, 4);
    }

    public final void i(int i, b0 b0Var) {
        d3 d3Var = (d3) this.R;
        d3Var.S(i, 2);
        d3Var.h(b0Var);
    }

    public final long j() {
        return ((long) ((ByteBuffer) this.R).getInt()) & 4294967295L;
    }

    public final float m() {
        return ((Parcel) this.R).readFloat();
    }

    public final void n(int i, int i2) {
        ((d3) this.R).I(i, i2);
    }

    public final void o(int i, int i2) {
        d3 d3Var = (d3) this.R;
        d3Var.S(i, 0);
        d3Var.Q(i2);
    }

    public final void t(int i, boolean z) {
        d3 d3Var = (d3) this.R;
        d3Var.S(i, 0);
        d3Var.J(z ? (byte) 1 : 0);
    }

    public final void u(long j, int i) {
        ((d3) this.R).W(j, i);
    }

    @Override // defpackage.uE
    public final void v(Typeface typeface) {
        QL ql = (QL) this.R;
        if (ql.C(typeface)) {
            ql.m(false);
        }
    }

    public final long x() {
        byte readByte = ((Parcel) this.R).readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0;
        return lqt.R(j, 0) ? eT9.v : gQc.r(m(), j);
    }

    public final void y(int i) {
        Object obj = this.R;
        ((ByteBuffer) obj).position(((ByteBuffer) obj).position() + i);
    }

    public final void z(int i, bvr bvr, Object obj) {
        d3 d3Var = (d3) this.R;
        qN qNVar = (qN) obj;
        d3Var.S(i, 2);
        d3Var.d(qNVar.v(bvr));
        bvr.R(qNVar, d3Var.f2474R);
    }

    public gL6(int i) {
        if (i == 4) {
            this.R = l6.n(null);
        } else if (i == 8) {
            this.R = new ppN();
        } else if (i == 10) {
            this.R = new ConcurrentHashMap();
        } else if (i == 17) {
            this.R = new HashMap();
        } else if (i != 19) {
            this.R = new ArrayDeque();
        } else {
            this.R = Handler.createAsync(Looper.getMainLooper());
        }
    }

    public gL6(d3 d3Var) {
        Charset charset = ibk.R;
        if (d3Var != null) {
            this.R = d3Var;
            d3Var.f2474R = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public gL6(Window window) {
        this.R = new i54(window);
    }

    public gL6(String str) {
        this.R = Parcel.obtain();
        byte[] decode = Base64.decode(str, 0);
        ((Parcel) this.R).unmarshall(decode, 0, decode.length);
        ((Parcel) this.R).setDataPosition(0);
    }

    public gL6(ByteBuffer byteBuffer) {
        this.R = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public gL6(int i, int i2) {
        c85[] c85Arr = new c85[i];
        for (int i3 = 0; i3 < i; i3++) {
            c85Arr[i3] = new c85(i2, 1);
        }
        this.R = c85Arr;
    }

    public gL6(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.R = new GestureDetector(context, onGestureListener, handler);
    }

    public /* synthetic */ gL6(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(20, materialButtonToggleGroup);
    }
}
