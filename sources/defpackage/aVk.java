package defpackage;

/* renamed from: aVk  reason: default package */
/* loaded from: classes.dex */
public final class aVk implements l9F {
    public static final F6 R = kgV.c("EFBBBF");

    /* renamed from: R  reason: collision with other field name */
    public final k49 f900R;

    static {
        F6 f6 = F6.R;
    }

    public aVk(k49 k49) {
        this.f900R = k49;
    }

    @Override // defpackage.l9F
    public final Object X(Object obj) {
        arx arx = (arx) obj;
        Jl O = arx.O();
        try {
            F6 f6 = R;
            if (O.U(f6)) {
                O.J((long) f6.f115R.length);
            }
            b4j b4j = new b4j(O);
            Object R2 = this.f900R.R(b4j);
            if (b4j.W() == 10) {
                return R2;
            }
            throw new j8f("JSON document was not fully consumed.", 0);
        } finally {
            arx.close();
        }
    }
}
