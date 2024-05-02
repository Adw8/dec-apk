package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.d;
import java.io.OutputStream;
import java.lang.reflect.Type;

/* renamed from: Zz  reason: default package */
/* loaded from: classes.dex */
public class Zz implements Ia, aXc, azg, IC {
    public Object R;

    public /* synthetic */ Zz(Object obj) {
        this.R = obj;
    }

    public static int m(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int x(int i, boolean z) {
        return m(i) + (z ? 1 : 0) + i;
    }

    public void C(int i) {
        ((OutputStream) this.R).write(i);
    }

    public void H() {
        ((eAj) this.R).f3006R.B();
    }

    public fTU L() {
        return new fTU((OutputStream) this.R);
    }

    public void N(byte[] bArr, int i, int i2) {
        ((OutputStream) this.R).write(bArr, i, i2);
    }

    public jG O(int i) {
        return null;
    }

    public void P(int i) {
        if (i < 128) {
            C(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        do {
            i2--;
            bArr[i2] = (byte) i;
            i >>>= 8;
        } while (i != 0);
        int i3 = 5 - i2;
        int i4 = i2 - 1;
        bArr[i4] = (byte) (i3 | 128);
        N(bArr, i4, i3 + 1);
    }

    @Override // defpackage.Ia
    public Object R(oEG oeg) {
        fi1 fi1 = new fi1(oeg);
        oeg.H(new f67(this, 1, fi1));
        return fi1;
    }

    public boolean U(int i, int i2, Bundle bundle) {
        return false;
    }

    public void V(O o) {
        o.K(this, true);
    }

    public jG X(int i) {
        return null;
    }

    public oYJ Z() {
        return new oYJ((OutputStream) this.R);
    }

    @Override // defpackage.azg
    public Object c() {
        pm2 pm2 = (pm2) this.R;
        eAj eaj = pm2.f7232R;
        return eaj instanceof Z6 ? ((d) eaj.f3007R).f1014R : ((d) pm2.r()).f1014R;
    }

    @Override // defpackage.Ia
    public Type e() {
        return (Type) this.R;
    }

    public void g(boolean z, int i, byte[] bArr) {
        i(i, z);
        P(bArr.length);
        N(bArr, 0, bArr.length);
    }

    public void i(int i, boolean z) {
        if (z) {
            C(i);
        }
    }

    public void j(b[] bVarArr) {
        for (b bVar : bVarArr) {
            bVar.v().K(this, true);
        }
    }

    public void o(O[] oArr) {
        for (O o : oArr) {
            o.K(this, true);
        }
    }

    @Override // defpackage.IC
    public void onCancel() {
        ((kuA) this.R).R();
    }

    public void t(int i, int i2) {
        if (i2 < 31) {
            C(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        N(bArr, i4, 6 - i4);
    }

    @Override // defpackage.aXc
    public void v(Object obj) {
        if (((nu_) obj) != null) {
            jcp jcp = (jcp) this.R;
            if (jcp.y) {
                View p = jcp.p();
                if (p.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (((jcp) this.R).f4978R != null) {
                    if (hAW.W(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + ((jcp) this.R).f4978R);
                    }
                    ((jcp) this.R).f4978R.setContentView(p);
                }
            }
        }
    }

    public void y(boolean z, int i, b[] bVarArr) {
        i(i, z);
        C(128);
        j(bVarArr);
        C(0);
        C(0);
    }

    public /* synthetic */ Zz() {
        this.R = new SX(this);
    }
}
