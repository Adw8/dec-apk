package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: mot  reason: default package */
/* loaded from: classes.dex */
public abstract class mot implements Closeable, Flushable {
    public String R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6167R;
    public int e = 0;

    /* renamed from: R  reason: collision with other field name */
    public int[] f6168R = new int[32];

    /* renamed from: R  reason: collision with other field name */
    public String[] f6169R = new String[32];
    public int[] v = new int[32];
    public int X = -1;

    public final int C() {
        int i = this.e;
        if (i != 0) {
            return this.f6168R[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract dfN H();

    public final String O() {
        return biy.N(this.e, this.f6168R, this.f6169R, this.v);
    }

    public abstract dfN R();

    public abstract dfN X();

    public abstract dfN Z(String str);

    public abstract dfN c();

    public abstract dfN d(String str);

    public abstract void j(String str);

    public abstract dfN o(Number number);

    public abstract dfN t(long j);
}
