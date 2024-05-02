package defpackage;

import java.util.ArrayList;

/* renamed from: oCX  reason: default package */
/* loaded from: classes.dex */
public final class oCX implements geB {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f6702R;

    public /* synthetic */ oCX(int i, Object obj) {
        this.R = i;
        this.f6702R = obj;
    }

    public final void R(kFU kfu) {
        switch (this.R) {
            case 0:
                if (kfu == null) {
                    kfu = new kFU(-3);
                }
                ((h5) this.f6702R).t(kfu);
                return;
            default:
                synchronized (o6_.f6670R) {
                    cE0 ce0 = o6_.R;
                    ArrayList arrayList = (ArrayList) ce0.getOrDefault((String) this.f6702R, null);
                    if (arrayList != null) {
                        ce0.remove((String) this.f6702R);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((geB) arrayList.get(i)).accept(kfu);
                        }
                        return;
                    }
                    return;
                }
        }
    }

    @Override // defpackage.geB
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.R) {
            case 0:
                R((kFU) obj);
                return;
            default:
                R((kFU) obj);
                return;
        }
    }
}
