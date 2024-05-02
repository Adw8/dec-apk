package defpackage;

/* renamed from: nJf  reason: default package */
/* loaded from: classes.dex */
public final class nJf implements l9F {
    public static final oFB R = bRg.R("application/json; charset=UTF-8");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f6361R;

    public nJf(k49 k49) {
        this.f6361R = k49;
    }

    @Override // defpackage.l9F
    public final Object X(Object obj) {
        ME me = new ME();
        this.f6361R.O(new dfN(me), obj);
        return new dId(R, me.h());
    }
}
