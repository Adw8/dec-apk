package defpackage;

import android.graphics.Path;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.KeyAgreement;

/* renamed from: n2G  reason: default package */
/* loaded from: classes.dex */
public final class n2G implements nYE, aoz, hKX, a25, nD1 {
    public static n2G R;
    public final /* synthetic */ int e;

    public /* synthetic */ n2G(int i, Object obj) {
        this.e = i;
    }

    public static e9E m(f25 f25) {
        return (e9E) iOY.f(a6.l(f25.V(f25.O, true), g5M.R));
    }

    public static Path x(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // defpackage.aoz
    public final void L(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case VmNativeCallback.$stable:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // defpackage.a25
    public final byte[] O(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            kKl kkl = new kKl(0, bArr);
            if (bArr3.length <= 2147483631) {
                ByteBuffer allocate = ByteBuffer.allocate(bArr3.length + 16);
                kkl.v(allocate, bArr2, bArr3, bArr4);
                return allocate.array();
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // defpackage.hKX
    public final /* synthetic */ Object R() {
        switch (this.e) {
            case 14:
                return new gkF();
            case 15:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(mdj.R);
                vd.A(newSingleThreadExecutor);
                return newSingleThreadExecutor;
            default:
                return new bu3();
        }
    }

    @Override // defpackage.nD1
    public final Object X(String str, Provider provider) {
        switch (this.e) {
            case 23:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 24:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // defpackage.a25
    public final int Z() {
        return 32;
    }

    @Override // defpackage.a25
    public final byte[] c() {
        return iZL.H;
    }

    @Override // defpackage.nYE
    public final CharSequence e(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return ((Preference) listPreference).R.getString(R.string.not_set);
        }
        return null;
    }

    @Override // defpackage.a25
    public final void v() {
    }

    public n2G(int i) {
        this.e = i;
    }
}
