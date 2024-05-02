package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;

/* renamed from: jsT  reason: default package */
/* loaded from: classes.dex */
public final class jsT {
    public Object R;
    public Object v;

    public /* synthetic */ jsT(UB ub) {
        this.v = new Vector();
        this.R = ub;
    }

    public jsT(plH plh, BigInteger bigInteger, Date date, Date date2, Locale locale, plH plh2, hMN hmn) {
        fXV fxv = new fXV(date, locale);
        fXV fxv2 = new fXV(date2, locale);
        msk msk = new msk();
        this.R = msk;
        msk.R = new X(bigInteger);
        msk msk2 = (msk) this.R;
        msk2.f6219R = plh;
        msk2.f6215R = fxv;
        msk2.v = fxv2;
        msk2.f6222v = plh2;
        msk2.f6216R = hmn;
        this.v = new jX9();
    }

    public static byte[] R(piu piu, isV isv) {
        OutputStream outputStream;
        switch (piu.f7201R) {
            case 15:
                outputStream = (OutputStream) piu.f7202R;
                break;
            default:
                outputStream = (OutputStream) piu.f7202R;
                break;
        }
        isv.t(outputStream);
        outputStream.close();
        switch (piu.f7201R) {
            case 15:
                try {
                    return ((Signature) piu.f7203v).sign();
                } catch (SignatureException e) {
                    StringBuilder U = opT.U("exception obtaining signature: ");
                    U.append(e.getMessage());
                    throw new iMS(U.toString(), e);
                }
            default:
                try {
                    W w = new W();
                    for (int i = 0; i != ((Signature[]) piu.c).length; i++) {
                        w.R(new f9y(((Signature[]) piu.c)[i].sign()));
                    }
                    return new iuV(w).V();
                } catch (IOException e2) {
                    StringBuilder U2 = opT.U("exception encoding signature: ");
                    U2.append(e2.getMessage());
                    throw new iMS(U2.toString(), e2);
                } catch (SignatureException e3) {
                    StringBuilder U3 = opT.U("exception obtaining signature: ");
                    U3.append(e3.getMessage());
                    throw new iMS(U3.toString(), e3);
                }
        }
    }

    public static jsT v(String... strArr) {
        try {
            F6[] f6Arr = new F6[strArr.length];
            ME me = new ME();
            for (int i = 0; i < strArr.length; i++) {
                dfN.l(me, strArr[i]);
                me.readByte();
                f6Arr[i] = me.h();
            }
            return new jsT((String[]) strArr.clone(), atb.U(f6Arr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public /* synthetic */ jsT(Object obj, Object obj2) {
        this.R = obj;
        this.v = obj2;
    }

    public /* synthetic */ jsT(ppN ppn, n7K n7k) {
        this.R = ppn;
        gvP.u(n7k, "The SentryOptions is required");
        this.v = n7k;
    }

    public /* synthetic */ jsT(Context context, String str, String str2) {
        this.v = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.R = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.R = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    public /* synthetic */ jsT(String str, ECPublicKey eCPublicKey) {
        this.v = str;
        this.R = eCPublicKey;
    }

    public /* synthetic */ jsT(fMX fmx) {
        this.R = fmx;
    }

    public jsT(int i) {
        byte[] bArr = new byte[i];
        this.v = bArr;
        this.R = new d3(bArr, i);
    }
}
