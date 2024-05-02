package defpackage;

import java.util.Map;

/* renamed from: sJ  reason: default package */
/* loaded from: classes.dex */
public final class sJ extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ bz R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Map f7408R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kMk f7409R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f7410R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f7411R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f7412R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int Z;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public sJ(bz bzVar, ncu ncu, kMk kmk, kg9 kg9, int i, boolean z, int i2, Map map, int i3, int i4) {
        super(2);
        this.R = bzVar;
        this.f7411R = ncu;
        this.f7409R = kmk;
        this.f7410R = kg9;
        this.X = i;
        this.f7412R = z;
        this.O = i2;
        this.f7408R = map;
        this.L = i3;
        this.Z = i4;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        aH9.R(this.R, this.f7411R, this.f7409R, this.f7410R, this.X, this.f7412R, this.O, this.f7408R, (m88) obj, this.L | 1, this.Z);
        return o8s.R;
    }
}
