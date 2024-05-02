package defpackage;

/* renamed from: ija  reason: default package */
/* loaded from: classes.dex */
public final class ija implements dH9 {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public hgI f4699R;

    /* renamed from: R  reason: collision with other field name */
    public jM f4700R;

    /* renamed from: R  reason: collision with other field name */
    public Object f4701R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kVD f4702R;

    /* renamed from: R  reason: collision with other field name */
    public final oHg f4703R;

    /* renamed from: R  reason: collision with other field name */
    public final oST f4704R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4705R;
    public Object v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f4706v;

    public ija(kVD kvd, Number number, Number number2, oHg ohg, jM jMVar) {
        this.f4702R = kvd;
        this.f4701R = number;
        this.v = number2;
        this.f4703R = ohg;
        this.f4700R = jMVar;
        this.f4704R = l6.n(number);
        this.f4699R = new hgI(this.f4700R, ohg, this.f4701R, this.v);
    }

    @Override // defpackage.dH9
    public final Object getValue() {
        return this.f4704R.getValue();
    }
}
