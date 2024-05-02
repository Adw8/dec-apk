package defpackage;

import android.os.ServiceManager;

/* renamed from: GR  reason: default package */
/* loaded from: classes.dex */
public final class GR extends k8G implements f_c {
    public static final GR R = new GR(0);
    public static final GR v = new GR(1);
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GR(int i) {
        super(0);
        this.X = i;
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                return cC_.O(ServiceManager.waitForService(gvP.V(-3881552919678936979L)));
            default:
                return ServiceManager.waitForService("android.system.virtualizationservice");
        }
    }
}
