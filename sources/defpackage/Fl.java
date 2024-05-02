package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* renamed from: Fl  reason: default package */
/* loaded from: classes.dex */
public final class Fl extends ThreadLocal {
    public final /* synthetic */ int R;

    public /* synthetic */ Fl(int i) {
        this.R = i;
    }

    public final Cipher R() {
        switch (this.R) {
            case 1:
                try {
                    return (Cipher) aXa.R.R("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 2:
                try {
                    return (Cipher) aXa.R.R("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 3:
                try {
                    return (Cipher) aXa.R.R("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 4:
                try {
                    return (Cipher) aXa.R.R("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            default:
                try {
                    return (Cipher) aXa.R.R("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
        }
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.R) {
            case 0:
                Choreographer instance = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    hk hkVar = new hk(instance, Handler.createAsync(myLooper));
                    return jjU.t(hkVar, hkVar.f4363R);
                }
                throw new IllegalStateException("no Looper on this thread".toString());
            case 1:
                return R();
            case 2:
                return R();
            case 3:
                return R();
            case 4:
                return R();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return R();
            case 6:
                Fl fl = opU.R;
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 7:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(khE.f5395R);
                return simpleDateFormat;
        }
    }
}
