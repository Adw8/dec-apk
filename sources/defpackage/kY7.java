package defpackage;

import java.nio.ByteBuffer;

/* renamed from: kY7  reason: default package */
/* loaded from: classes.dex */
public abstract class kY7 {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public ByteBuffer f5345R;
    public int c;
    public int v;

    public kY7() {
        if (dq.f2887e == null) {
            dq.f2887e = new dq();
        }
    }

    public final int R(int i) {
        if (i < this.c) {
            return this.f5345R.getShort(this.v + i);
        }
        return 0;
    }

    public final void v(int i, ByteBuffer byteBuffer) {
        this.f5345R = byteBuffer;
        if (byteBuffer != null) {
            this.R = i;
            int i2 = i - byteBuffer.getInt(i);
            this.v = i2;
            this.c = this.f5345R.getShort(i2);
            return;
        }
        this.R = 0;
        this.v = 0;
        this.c = 0;
    }
}
