package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ddM  reason: default package */
/* loaded from: classes.dex */
public final class ddM {
    public float L;
    public float O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public String f2689R;

    /* renamed from: R  reason: collision with other field name */
    public List f2690R;
    public float X;
    public float c;
    public float e;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public List f2691v;

    public ddM(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & 256) != 0) {
            int i2 = jnb.R;
            list = fcD.R;
        }
        ArrayList arrayList = (i & 512) != 0 ? new ArrayList() : null;
        this.f2689R = str;
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.X = f5;
        this.O = f6;
        this.L = f7;
        this.f2690R = list;
        this.f2691v = arrayList;
    }
}
