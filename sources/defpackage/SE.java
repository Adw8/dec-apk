package defpackage;

/* renamed from: SE  reason: default package */
/* loaded from: classes.dex */
public final class SE implements dH9 {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public Pc f506R;

    /* renamed from: R  reason: collision with other field name */
    public final oHg f507R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f508R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f509R;
    public long v;

    public /* synthetic */ SE(oHg ohg, Object obj, Pc pc, int i) {
        this(ohg, obj, (i & 4) != 0 ? null : pc, (i & 8) != 0 ? Long.MIN_VALUE : 0, (i & 16) != 0 ? Long.MIN_VALUE : 0, false);
    }

    @Override // defpackage.dH9
    public final Object getValue() {
        return this.f508R.getValue();
    }

    public SE(oHg ohg, Object obj, Pc pc, long j, long j2, boolean z) {
        Pc pc2;
        this.f507R = ohg;
        this.f508R = l6.n(obj);
        if (pc == null) {
            pc2 = null;
        } else {
            pc2 = o02.x(pc);
        }
        this.f506R = pc2 == null ? ((Pc) ohg.R.x(obj)).c() : pc2;
        this.R = j;
        this.v = j2;
        this.f509R = z;
    }
}
