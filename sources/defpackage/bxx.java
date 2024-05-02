package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: bxx  reason: default package */
/* loaded from: classes.dex */
public final class bxx implements b9a, mET {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f1876R;

    /* renamed from: R  reason: collision with other field name */
    public final iTT f1877R;

    /* renamed from: R  reason: collision with other field name */
    public final List f1878R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mET f1879R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f1880R;
    public final int c;
    public final int e;
    public final int v;

    public bxx(iTT itt, int i, boolean z, float f, mET met, List list, int i2, int i3, int i4) {
        this.f1877R = itt;
        this.f1876R = i;
        this.f1880R = z;
        this.R = f;
        this.f1878R = list;
        this.v = i2;
        this.c = i3;
        this.e = i4;
        this.f1879R = met;
    }

    @Override // defpackage.b9a
    public final List L() {
        return this.f1878R;
    }

    @Override // defpackage.b9a
    public final int O() {
        return this.c;
    }

    @Override // defpackage.mET
    public final Map R() {
        return this.f1879R.R();
    }

    @Override // defpackage.b9a
    public final int X() {
        return this.v;
    }

    @Override // defpackage.mET
    public final void Z() {
        this.f1879R.Z();
    }

    @Override // defpackage.mET
    public final int c() {
        return this.f1879R.c();
    }

    @Override // defpackage.mET
    public final int e() {
        return this.f1879R.e();
    }

    @Override // defpackage.b9a
    public final int v() {
        return this.e;
    }
}
