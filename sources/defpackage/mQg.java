package defpackage;

import java.util.Map;

/* renamed from: mQg  reason: default package */
/* loaded from: classes.dex */
public abstract class mQg {
    public static final kPU R = l6.y(fzi.x);

    public static final boolean R(dgv dgv, long j) {
        Map e;
        if (dgv == null || (e = dgv.e()) == null) {
            return false;
        }
        return e.containsKey(Long.valueOf(j));
    }
}
