package defpackage;

import android.system.ErrnoException;
import dev.kdrag0n.app.core.NativeCommonLib;

/* renamed from: aCf  reason: default package */
/* loaded from: classes.dex */
public final class aCf extends aFk implements iv7 {
    public final /* synthetic */ jiM R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ k0 f787R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f788R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean[] f789R;
    public final /* synthetic */ int X;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aCf(boolean z, boolean z2, int i, boolean[] zArr, jiM jim, k0 k0Var, aOO aoo) {
        super(2, aoo);
        this.f788R = z;
        this.v = z2;
        this.X = i;
        this.f789R = zArr;
        this.R = jim;
        this.f787R = k0Var;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        o8s o8s = o8s.R;
        ((aCf) X((jy_) obj, (aOO) obj2)).O(o8s);
        return o8s;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        int a = NativeCommonLib.a(this.f788R, this.v, this.X, this.f789R, this.R);
        if (a == 0) {
            this.f787R.Y(o8s.R);
        } else {
            this.f787R.Y(new bvw(new ErrnoException("mdns", -a)));
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new aCf(this.f788R, this.v, this.X, this.f789R, this.R, this.f787R, aoo);
    }
}
