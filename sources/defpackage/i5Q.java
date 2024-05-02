package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: i5Q  reason: default package */
/* loaded from: classes.dex */
public final class i5Q extends k_M implements Iterable, dsi {
    public final float L;
    public final float O;
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4455R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4456R;
    public final float X;
    public final float c;
    public final float e;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final List f4457v;

    public i5Q(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        this.f4455R = str;
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.X = f5;
        this.O = f6;
        this.L = f7;
        this.f4456R = list;
        this.f4457v = list2;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i5Q)) {
            return false;
        }
        i5Q i5q = (i5Q) obj;
        if (!n3x.v(this.f4455R, i5q.f4455R)) {
            return false;
        }
        if (!(this.R == i5q.R)) {
            return false;
        }
        if (!(this.v == i5q.v)) {
            return false;
        }
        if (!(this.c == i5q.c)) {
            return false;
        }
        if (!(this.e == i5q.e)) {
            return false;
        }
        if (!(this.X == i5q.X)) {
            return false;
        }
        if (!(this.O == i5q.O)) {
            return false;
        }
        return ((this.L > i5q.L ? 1 : (this.L == i5q.L ? 0 : -1)) == 0) && n3x.v(this.f4456R, i5q.f4456R) && n3x.v(this.f4457v, i5q.f4457v);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int c = jQ.c(this.L, jQ.c(this.O, jQ.c(this.X, jQ.c(this.e, jQ.c(this.c, jQ.c(this.v, jQ.c(this.R, this.f4455R.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        return this.f4457v.hashCode() + ((this.f4456R.hashCode() + c) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dZs(this);
    }
}
