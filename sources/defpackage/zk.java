package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* renamed from: zk  reason: default package */
/* loaded from: classes.dex */
public final class zk {

    /* renamed from: R  reason: collision with other field name */
    public gL6 f7501R;

    /* renamed from: R  reason: collision with other field name */
    public lxg f7505R = null;

    /* renamed from: R  reason: collision with other field name */
    public jsT f7503R = null;

    /* renamed from: R  reason: collision with other field name */
    public String f7502R = null;
    public ai R = null;

    /* renamed from: R  reason: collision with other field name */
    public lV8 f7504R = null;

    public final gL6 R() {
        hZW hzw = hZW.NEW_BUILDER;
        try {
            ai aiVar = this.R;
            if (aiVar != null) {
                try {
                    dxG dxg = (dxG) h5.i(this.f7505R, aiVar).R;
                    c_m c_m = (c_m) dxg.L(hzw);
                    c_m.O(dxg);
                    return new gL6(24, (l9K) c_m);
                } catch (b7b | GeneralSecurityException e) {
                    int i = XN.R;
                    Log.w("XN", "cannot decrypt keyset: ", e);
                }
            }
            dxG R = this.f7505R.R();
            if (R.t() > 0) {
                dxG dxg2 = (dxG) new h5(R).R;
                c_m c_m2 = (c_m) dxg2.L(hzw);
                c_m2.O(dxg2);
                return new gL6(24, (l9K) c_m2);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (FileNotFoundException e2) {
            int i2 = XN.R;
            if (Log.isLoggable("XN", 4)) {
                Log.i("XN", String.format("keyset not found, will generate a new one. %s", e2.getMessage()));
            }
            if (this.f7504R != null) {
                gL6 gl6 = new gL6(24, dxG.o());
                lV8 lv8 = this.f7504R;
                synchronized (gl6) {
                    gl6.X(lv8.R);
                    int i3 = ibQ.R((dxG) gl6.U().R).y().i();
                    synchronized (gl6) {
                        for (int i4 = 0; i4 < ((dxG) ((l9K) gl6.R).v).t(); i4++) {
                            okQ y = ((dxG) ((l9K) gl6.R).v).y(i4);
                            if (y.V() == i3) {
                                if (y.K().equals(aLF.ENABLED)) {
                                    l9K l9k = (l9K) gl6.R;
                                    l9k.X();
                                    dxG.j((dxG) l9k.v, i3);
                                    if (this.R != null) {
                                        h5 U = gl6.U();
                                        jsT jst = this.f7503R;
                                        ai aiVar2 = this.R;
                                        byte[] bArr = new byte[0];
                                        dxG dxg3 = (dxG) U.R;
                                        byte[] R2 = aiVar2.R(dxg3.e(), bArr);
                                        try {
                                            if (dxG.K(aiVar2.v(R2, bArr), nCG.R()).equals(dxg3)) {
                                                k8_ t = lH1.t();
                                                MH H = b0.H(R2, 0, R2.length);
                                                t.X();
                                                lH1.j((lH1) t.v, H);
                                                cLd R3 = ibQ.R(dxg3);
                                                t.X();
                                                lH1.g((lH1) t.v, R3);
                                                if (!((SharedPreferences.Editor) jst.R).putString((String) jst.v, lTs.L(((lH1) t.v()).e())).commit()) {
                                                    throw new IOException("Failed to write to SharedPreferences");
                                                }
                                            } else {
                                                throw new GeneralSecurityException("cannot encrypt keyset");
                                            }
                                        } catch (b7b unused) {
                                            throw new GeneralSecurityException("invalid keyset, corrupted key material");
                                        }
                                    } else {
                                        h5 U2 = gl6.U();
                                        jsT jst2 = this.f7503R;
                                        if (!((SharedPreferences.Editor) jst2.R).putString((String) jst2.v, lTs.L(((dxG) U2.R).e())).commit()) {
                                            throw new IOException("Failed to write to SharedPreferences");
                                        }
                                    }
                                    return gl6;
                                } else {
                                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i3);
                                }
                            }
                        }
                        throw new GeneralSecurityException("key not found: " + i3);
                    }
                }
            }
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
    }

    public final void c(Context context, String str, String str2) {
        if (context != null) {
            this.f7505R = new lxg(context, str, str2);
            this.f7503R = new jsT(context, str, str2);
            return;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public final ai v() {
        int i = XN.R;
        Uc uc = new Uc();
        boolean c = uc.c(this.f7502R);
        if (!c) {
            try {
                Uc.R(this.f7502R);
            } catch (GeneralSecurityException | ProviderException e) {
                int i2 = XN.R;
                Log.w("XN", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return uc.v(this.f7502R);
        } catch (GeneralSecurityException | ProviderException e2) {
            if (!c) {
                int i3 = XN.R;
                Log.w("XN", "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
            throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f7502R), e2);
        }
    }
}
