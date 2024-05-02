package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: aDq  reason: default package */
/* loaded from: classes.dex */
public final class aDq {
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public final cof f802R;

    /* renamed from: R  reason: collision with other field name */
    public final gL6 f803R;

    /* renamed from: R  reason: collision with other field name */
    public final String f804R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f805R;
    public final boolean v;

    public aDq(Context context, String str, cof cof, gL6 gl6, ArrayList arrayList, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.f802R = cof;
        this.R = context;
        this.f804R = str;
        this.f803R = gl6;
        this.f805R = z2;
        this.v = z3;
    }

    public final boolean R(int i, int i2) {
        return (!(i > i2) || !this.v) && this.f805R;
    }
}
