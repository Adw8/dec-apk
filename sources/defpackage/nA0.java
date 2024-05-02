package defpackage;

import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;

/* renamed from: nA0  reason: default package */
/* loaded from: classes.dex */
public final class nA0 extends plU {
    public CreateViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6333R;
    public int e;
    public final /* synthetic */ CreateViewModel v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nA0(CreateViewModel createViewModel, aOO aoo) {
        super(aoo);
        this.v = createViewModel;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f6333R = obj;
        this.e |= Integer.MIN_VALUE;
        return CreateViewModel.e(this.v, this);
    }
}
