package defpackage;

import java.nio.ByteBuffer;

/* renamed from: w1  reason: default package */
/* loaded from: classes.dex */
public final class w1 implements AutoCloseable {
    public final int O;
    public final oDA R = new oDA(new qh(this));

    /* renamed from: R  reason: collision with other field name */
    public final or f7445R;

    /* renamed from: R  reason: collision with other field name */
    public final wJ f7446R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7447R;
    public final int X;
    public final int e;

    public w1(or orVar, wJ wJVar, int i, int i2, int i3) {
        this.f7445R = orVar;
        this.f7446R = wJVar;
        this.e = i;
        this.X = i2;
        this.O = i3;
        ByteBuffer.allocate(this.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f7447R) {
            this.f7447R = true;
            this.f7446R.R(1163086915, this.X, this.O, null, 0);
            or orVar = this.f7445R;
            int i = this.X;
            orVar.R.remove(Integer.valueOf(i));
            orVar.f6971R.remove(Integer.valueOf(i));
        }
    }
}
