package defpackage;

import java.io.Serializable;

/* renamed from: jT  reason: default package */
/* loaded from: classes.dex */
public final class jT extends k8G implements jkN {
    public static final jT R = new jT(0);
    public static final jT v = new jT(1);
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jT(int i) {
        super(5);
        this.X = i;
    }

    public final void R(int i, jJj jjj, mdz mdz, int[] iArr, int[] iArr2) {
        switch (this.X) {
            case 0:
                nA.f6330R.c(jjj, i, iArr, iArr2);
                return;
            default:
                nA.R.v(i, jjj, mdz, iArr, iArr2);
                return;
        }
    }

    @Override // defpackage.jkN
    public final /* bridge */ /* synthetic */ Object iE(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        switch (this.X) {
            case 0:
                jJj jjj = (jJj) obj4;
                R(((Number) obj).intValue(), jjj, (mdz) obj3, (int[]) obj2, (int[]) serializable);
                break;
            default:
                jJj jjj2 = (jJj) obj4;
                R(((Number) obj).intValue(), jjj2, (mdz) obj3, (int[]) obj2, (int[]) serializable);
                break;
        }
        return o8s.R;
    }
}
