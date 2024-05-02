package defpackage;

import java.util.List;

/* renamed from: ev5  reason: default package */
/* loaded from: classes.dex */
public final class ev5 extends plU {
    public eJw R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3238R;

    /* renamed from: R  reason: collision with other field name */
    public List f3239R;
    public int e;
    public final /* synthetic */ eJw v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ev5(eJw ejw, aOO aoo) {
        super(aoo);
        this.v = ejw;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f3238R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
