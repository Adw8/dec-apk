package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: kUC  reason: default package */
/* loaded from: classes.dex */
public final class kUC {
    public final HashSet R;

    /* renamed from: R  reason: collision with other field name */
    public final nZz f5305R;

    public kUC(nZz nzz) {
        this.f5305R = nzz;
        List<String> Y = pdD.Y(afN.R(-68088143401868L), afN.R(-68131093074828L), afN.R(-68174042747788L), afN.R(-68208402486156L), afN.R(-68221287388044L));
        ArrayList arrayList = new ArrayList(a6.B(Y, 10));
        for (String str : Y) {
            arrayList.add(InetAddress.getByName(str));
        }
        this.R = dF.Kl(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: hro */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Throwable, a7_] */
    /* JADX WARN: Type inference failed for: r12v6, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0140 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #0 {all -> 0x0152, blocks: (B:43:0x0139, B:45:0x0140, B:48:0x014a, B:49:0x0151), top: B:59:0x0139 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014a A[Catch: all -> 0x0152, TRY_ENTER, TryCatch #0 {all -> 0x0152, blocks: (B:43:0x0139, B:45:0x0140, B:48:0x014a, B:49:0x0151), top: B:59:0x0139 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable R(int r13, byte[] r14, defpackage.aOO r15) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kUC.R(int, byte[], aOO):java.io.Serializable");
    }

    public final kSh v(String str) {
        InetAddress[] allByName = InetAddress.getAllByName(str);
        ArrayList arrayList = new ArrayList();
        for (InetAddress inetAddress : allByName) {
            if (this.R.contains(inetAddress) || inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isMulticastAddress()) {
                arrayList.add(inetAddress);
            }
        }
        return arrayList.isEmpty() ? new kSh(Boolean.TRUE, null) : new kSh(Boolean.FALSE, dF.X4(arrayList, afN.R(-68350136406924L), null, null, null, 62));
    }
}
