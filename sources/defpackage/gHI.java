package defpackage;

/* renamed from: gHI  reason: default package */
/* loaded from: classes.dex */
public final class gHI extends h57 {
    public static final boolean x(emQ emq) {
        boolean z = false;
        if (emq == null) {
            return false;
        }
        boolean z2 = emq.v;
        emQ iS = emq.iS();
        if (iS != null && iS.v) {
            z = true;
        }
        if (z) {
            emq.v = true;
        }
        pso pso = emq.zE().f3606R;
        if (!emq.v && !emq.R) {
            emq.MG();
        }
        return z2;
    }
}
