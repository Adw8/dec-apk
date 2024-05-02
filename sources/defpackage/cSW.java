package defpackage;

/* renamed from: cSW  reason: default package */
/* loaded from: classes.dex */
public final class cSW {
    public final biT R = new biT(new fue[16]);

    public static void R(fue fue) {
        pso pso = fue.f3606R;
        if (pso.R == 5 && !pso.f7300v && !pso.f7299R && fue.f3608X) {
            Object obj = fue.f3600R.e;
            if ((((j28) obj).X & 256) != 0) {
                for (j28 j28 = (j28) obj; j28 != null; j28 = j28.c) {
                    if ((j28.e & 256) != 0 && (j28 instanceof lqm)) {
                        lqm lqm = (lqm) j28;
                        ((cIc) ((e7) lqm).R).F(msU.ZW(lqm, 256));
                    }
                    if ((j28.X & 256) == 0) {
                        break;
                    }
                }
            }
        }
        int i = 0;
        fue.f3609Z = false;
        biT j = fue.j();
        int i2 = j.e;
        if (i2 > 0) {
            Object[] objArr = j.f1772R;
            do {
                R((fue) objArr[i]);
                i++;
            } while (i < i2);
        }
    }
}
