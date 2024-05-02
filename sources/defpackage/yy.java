package defpackage;

import java.util.List;

/* renamed from: yy  reason: default package */
/* loaded from: classes.dex */
public final class yy extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ bz R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ List f7492R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy(bz bzVar, List list, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = bzVar;
        this.f7492R = list;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                bqa.R(this.R, this.f7492R, m88, (this.O & 14) | 64);
                return;
            default:
                bqa.R(this.R, this.f7492R, m88, this.O | 1);
                return;
        }
    }
}
