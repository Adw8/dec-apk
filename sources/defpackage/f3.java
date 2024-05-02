package defpackage;

import java.io.Serializable;

/* renamed from: f3  reason: default package */
/* loaded from: classes.dex */
public final class f3 extends k8G implements jkN {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(int i, Object obj) {
        super(5);
        this.X = i;
        this.R = obj;
    }

    public final void R(int i, jJj jjj, mdz mdz, int[] iArr, int[] iArr2) {
        switch (this.X) {
            case 0:
                ((C0) this.R).c(jjj, i, iArr, iArr2);
                return;
            default:
                ((h8) this.R).v(i, jjj, mdz, iArr, iArr2);
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
