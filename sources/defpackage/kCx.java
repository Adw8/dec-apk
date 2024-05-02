package defpackage;

import dev.kdrag0n.virtcontainer.ui.main.MainActivity;
import java.time.Instant;

/* renamed from: kCx  reason: default package */
/* loaded from: classes.dex */
public final class kCx extends plU {
    public MainActivity R;

    /* renamed from: R  reason: collision with other field name */
    public Object f5209R;

    /* renamed from: R  reason: collision with other field name */
    public Instant f5210R;
    public final /* synthetic */ MainActivity c;
    public int e;
    public MainActivity v;

    /* renamed from: v  reason: collision with other field name */
    public /* synthetic */ Object f5211v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kCx(MainActivity mainActivity, aOO aoo) {
        super(aoo);
        this.c = mainActivity;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f5211v = obj;
        this.e |= Integer.MIN_VALUE;
        MainActivity mainActivity = this.c;
        int i = MainActivity.X;
        return mainActivity.Y(null, 0, this);
    }
}
