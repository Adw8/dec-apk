package defpackage;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* renamed from: eRv  reason: default package */
/* loaded from: classes.dex */
public final class eRv {
    public static final zI R = new zI("VerifySliceTaskHandler", 0);

    /* renamed from: R  reason: collision with other field name */
    public final dRx f3092R;

    public eRv(dRx drx) {
        this.f3092R = drx;
    }

    public final void R(hrc hrc) {
        File H = this.f3092R.H((String) ((oC1) hrc).f6699R, hrc.v, hrc.R, hrc.f4402R);
        if (H.exists()) {
            try {
                dRx drx = this.f3092R;
                int i = hrc.v;
                long j = hrc.R;
                String str = hrc.f4402R;
                drx.getClass();
                File file = new File(new File(new File(drx.c(i, j, (String) ((oC1) hrc).f6699R), "_slices"), "_metadata"), str);
                if (file.exists()) {
                    try {
                        if (mxC.n(eOC.R(H, file)).equals(hrc.f4403v)) {
                            R.m("Verification of slice %s of pack %s successful.", hrc.f4402R, (String) ((oC1) hrc).f6699R);
                            File U = this.f3092R.U((String) ((oC1) hrc).f6699R, hrc.v, hrc.R, hrc.f4402R);
                            if (!U.exists()) {
                                U.mkdirs();
                            }
                            if (!H.renameTo(U)) {
                                throw new bRU(String.format("Failed to move slice %s after verification.", hrc.f4402R), ((oC1) hrc).R);
                            }
                            return;
                        }
                        throw new bRU(String.format("Verification failed for slice %s.", hrc.f4402R), ((oC1) hrc).R);
                    } catch (IOException e) {
                        throw new bRU(String.format("Could not digest file during verification for slice %s.", hrc.f4402R), e, ((oC1) hrc).R);
                    } catch (NoSuchAlgorithmException e2) {
                        throw new bRU("SHA256 algorithm not supported.", e2, ((oC1) hrc).R);
                    }
                } else {
                    throw new bRU(String.format("Cannot find metadata files for slice %s.", hrc.f4402R), ((oC1) hrc).R);
                }
            } catch (IOException e3) {
                throw new bRU(String.format("Could not reconstruct slice archive during verification for slice %s.", hrc.f4402R), e3, ((oC1) hrc).R);
            }
        } else {
            throw new bRU(String.format("Cannot find unverified files for slice %s.", hrc.f4402R), ((oC1) hrc).R);
        }
    }
}
