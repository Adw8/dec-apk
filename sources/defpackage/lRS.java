package defpackage;

import dev.kdrag0n.virtcontainer.R;

/* renamed from: lRS  reason: default package */
/* loaded from: classes.dex */
public final class lRS extends k8G implements kg9 {
    public final /* synthetic */ String R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5741R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lRS(int i, String str, boolean z) {
        super(1);
        this.X = i;
        this.f5741R = z;
        this.R = str;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                bNL bnl = (bNL) obj;
                if (this.f5741R) {
                    String str = this.R;
                    icv[] icvArr = onS.f6950R;
                    ((kEW) bnl).c(dwC.h, str);
                }
                return o8s.R;
            default:
                cpc.i((TC) obj, this.f5741R ? R.string.drm_license_invalid_desc_oldversion : R.string.drm_license_invalid_desc, this.R);
                return o8s.R;
        }
    }
}
