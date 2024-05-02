package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: e5s  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e5s implements Comparator {
    public final /* synthetic */ int R;

    public /* synthetic */ e5s(int i) {
        this.R = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z = false;
        switch (this.R) {
            case 0:
                fue fue = (fue) obj;
                fue fue2 = (fue) obj2;
                float f = fue.f3590R;
                float f2 = fue2.f3590R;
                if (f == f2) {
                    z = true;
                }
                return z ? n3x.O(fue.L, fue2.L) : Float.compare(f, f2);
            case 1:
                kSh ksh = (kSh) obj;
                kSh ksh2 = (kSh) obj2;
                return (((Number) ksh.v).intValue() - ((Number) ksh.R).intValue()) - (((Number) ksh2.v).intValue() - ((Number) ksh2.R).intValue());
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                int i2 = dol.e;
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
