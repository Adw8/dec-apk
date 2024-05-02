package defpackage;

import dev.kdrag0n.app.data.SettingsUpdateWorker;

/* renamed from: l4l  reason: default package */
/* loaded from: classes.dex */
public final class l4l extends plU {
    public final /* synthetic */ SettingsUpdateWorker R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5578R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public l4l(SettingsUpdateWorker settingsUpdateWorker, aOO aoo) {
        super(aoo);
        this.R = settingsUpdateWorker;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f5578R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.L(this);
    }
}
