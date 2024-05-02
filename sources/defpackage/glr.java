package defpackage;

import java.util.Iterator;

/* renamed from: glr  reason: default package */
/* loaded from: classes.dex */
public final class glr extends plU {
    public gkP R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ hki f3924R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3925R;

    /* renamed from: R  reason: collision with other field name */
    public Iterator f3926R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public glr(hki hki, aOO aoo) {
        super(aoo);
        this.f3924R = hki;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f3925R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f3924R.X(null, this);
    }
}
