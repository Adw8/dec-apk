package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.Window;

/* renamed from: kTg  reason: default package */
/* loaded from: classes.dex */
public final class kTg extends aFk implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Activity f5302R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ View f5303R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kTg(long j, Activity activity, View view, aOO aoo) {
        super(2, aoo);
        this.R = j;
        this.f5302R = activity;
        this.f5303R = view;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kTg) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        float Z = n3.Z(n3.R(this.R, K6.f229R));
        Window window = this.f5302R.getWindow();
        if (window == null) {
            return o8s.R;
        }
        gL6 gl6 = new gL6(window);
        boolean z = Z > 50.0f;
        ((hw1) gl6.R).K(z);
        ((hw1) gl6.R).o(z);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new kTg(this.R, this.f5302R, this.f5303R, aoo);
    }
}
