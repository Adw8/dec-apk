package defpackage;

import java.util.Objects;

/* renamed from: iYd  reason: default package */
/* loaded from: classes.dex */
public final class iYd extends RuntimeException {
    public /* synthetic */ iYd() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ iYd(defpackage.L2 r3, java.lang.String r4) {
        /*
            r2 = this;
            int r0 = r3.v
            java.lang.String r3 = r3.f269R
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = " ("
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = "): "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iYd.<init>(L2, java.lang.String):void");
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iYd(o3I o3i) {
        super("HTTP " + o3i.R.e + " " + o3i.R.f2540R);
        Objects.requireNonNull(o3i, "response == null");
        dEt det = o3i.R;
        int i = det.e;
        String str = det.f2540R;
    }

    public /* synthetic */ iYd(hw1 hw1, Thread thread, Throwable th, boolean z) {
        gvP.u(th, "Throwable is required.");
        gvP.u(thread, "Thread is required.");
    }
}
