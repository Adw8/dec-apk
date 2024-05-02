package defpackage;

/* renamed from: iUt  reason: default package */
/* loaded from: classes.dex */
public final class iUt implements kN5 {
    public final dH9 R;
    public final dH9 c;
    public final dH9 v;

    public iUt(h0T h0t, h0T h0t2, h0T h0t3) {
        this.R = h0t;
        this.v = h0t2;
        this.c = h0t3;
    }

    @Override // defpackage.kN5
    public final void O(ohT oht) {
        jDh jdh = (jDh) oht;
        jdh.v();
        if (((Boolean) this.R.getValue()).booleanValue()) {
            fiv.H(oht, n3.v(n3.v, 0.3f), 0, jdh.c(), 122);
        } else if (((Boolean) this.v.getValue()).booleanValue() || ((Boolean) this.c.getValue()).booleanValue()) {
            fiv.H(oht, n3.v(n3.v, 0.1f), 0, jdh.c(), 122);
        }
    }
}
