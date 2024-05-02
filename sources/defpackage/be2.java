package defpackage;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.ExecutionException;

/* renamed from: be2  reason: default package */
/* loaded from: classes.dex */
public final class be2 {
    public final imF R;

    public be2(imF imf) {
        this.R = imf;
    }

    public final ParcelFileDescriptor.AutoCloseInputStream R(int i, int i2, String str, String str2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) cUF.e(((aUC) ((kIP) this.R).R()).e(i, i2, str, str2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new bRU(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
        } catch (InterruptedException e) {
            throw new bRU("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new bRU(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e2, i);
        }
    }
}
