package defpackage;

import java.util.Iterator;

/* renamed from: kT5  reason: default package */
/* loaded from: classes.dex */
public final class kT5 extends nXZ {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pm2 f5300R;

    public /* synthetic */ kT5(int i, pm2 pm2) {
        this.R = i;
        this.f5300R = pm2;
    }

    @Override // defpackage.nXZ
    public final void R(Object obj) {
        switch (this.R) {
            case 0:
                int i = ajY.g;
                ((ajY) this.f5300R).q();
                ajY ajy = (ajY) this.f5300R;
                ajy.f984R.setEnabled(ajy.a().x());
                return;
            default:
                Iterator it = ((l6q) ((pwG) this.f5300R)).R.iterator();
                while (it.hasNext()) {
                    ((nXZ) it.next()).R(obj);
                }
                return;
        }
    }
}
