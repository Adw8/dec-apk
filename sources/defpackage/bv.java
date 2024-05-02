package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bv  reason: default package */
/* loaded from: classes.dex */
public final class bv {
    public static final bv R = new bv(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public final boolean L;
    public final boolean O;

    /* renamed from: R  reason: collision with other field name */
    public final int f1851R;

    /* renamed from: R  reason: collision with other field name */
    public String f1852R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1853R;
    public final boolean X;
    public final boolean Z;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final boolean f1854c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public final boolean f1855e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f1856v;

    static {
        TimeUnit.valueOf(kbq.SECONDS.name()).toSeconds((long) Integer.MAX_VALUE);
    }

    public bv(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f1853R = z;
        this.f1856v = z2;
        this.f1851R = i;
        this.v = i2;
        this.f1854c = z3;
        this.f1855e = z4;
        this.X = z5;
        this.c = i3;
        this.e = i4;
        this.O = z6;
        this.L = z7;
        this.Z = z8;
        this.f1852R = str;
    }

    public final String toString() {
        String str = this.f1852R;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f1853R) {
                sb.append("no-cache, ");
            }
            if (this.f1856v) {
                sb.append("no-store, ");
            }
            if (this.f1851R != -1) {
                sb.append("max-age=");
                sb.append(this.f1851R);
                sb.append(", ");
            }
            if (this.v != -1) {
                sb.append("s-maxage=");
                sb.append(this.v);
                sb.append(", ");
            }
            if (this.f1854c) {
                sb.append("private, ");
            }
            if (this.f1855e) {
                sb.append("public, ");
            }
            if (this.X) {
                sb.append("must-revalidate, ");
            }
            if (this.c != -1) {
                sb.append("max-stale=");
                sb.append(this.c);
                sb.append(", ");
            }
            if (this.e != -1) {
                sb.append("min-fresh=");
                sb.append(this.e);
                sb.append(", ");
            }
            if (this.O) {
                sb.append("only-if-cached, ");
            }
            if (this.L) {
                sb.append("no-transform, ");
            }
            if (this.Z) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            str = sb.toString();
            this.f1852R = str;
        }
        return str;
    }
}
