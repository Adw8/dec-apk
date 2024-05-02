package defpackage;

/* renamed from: nX1  reason: default package */
/* loaded from: classes.dex */
public enum nX1 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");
    

    /* renamed from: R  reason: collision with other field name */
    public final String f6424R;

    nX1(String str) {
        this.f6424R = str;
    }

    @Override // java.lang.Enum, java.lang.Object
    public final String toString() {
        return this.f6424R;
    }
}
