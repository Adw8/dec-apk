package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: b31  reason: default package */
/* loaded from: classes.dex */
public abstract class b31 {
    public static final List R = pdD.Y(new UUID(-1301668207276963122L, -6645017420763422227L), new UUID(-2129748144642739255L, 8654423357094679310L), new UUID(-7348484286925749626L, -6083546864340672619L), new UUID(1186680826959645954L, -5988876978535335093L));

    /* renamed from: R  reason: collision with other field name */
    public static final byte[] f1514R = caw.P(afN.R(-42425713808268L));

    /* renamed from: R  reason: collision with other field name */
    public static final lG0 f1513R = new lG0(Pattern.compile(afN.R(-42618987336588L), 8));

    /* JADX INFO: finally extract failed */
    public static final String R() {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File(afN.R(-42339814462348L))), O1.R);
        try {
            String N = mLz.N(inputStreamReader);
            dTl.V(inputStreamReader, null);
            return iOY.E(new pn(5, new k0v(iOY.a(new g_R(dF.a(iH_.w(N, new String[]{afN.R(-42399944004492L)})), true, g5M.N), g5M.P), g5M.K, 0)), afN.R(-42412828906380L));
        } finally {
            try {
                throw th;
            } catch (Throwable th) {
            }
        }
    }
}
