package defpackage;

import java.util.Iterator;

/* renamed from: jPr  reason: default package */
/* loaded from: classes.dex */
public final class jPr extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public Iterator f4924R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ k2z f4925R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jPr(k2z k2z, aOO aoo) {
        super(aoo);
        this.f4925R = k2z;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return k2z.R(this.f4925R, this);
    }
}
