package defpackage;

import android.view.View;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: o4w  reason: default package */
/* loaded from: classes.dex */
public final class o4w extends aFk implements iv7 {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fLL f6666R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public o4w(fLL fll, View view, aOO aoo) {
        super(2, aoo);
        this.f6666R = fll;
        this.R = view;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((o4w) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                fLL fll = this.f6666R;
                this.X = 1;
                Object Y = l6.Y(fll.f3383R, new afG(null), this);
                if (Y != obj2) {
                    Y = o8s.R;
                }
                if (Y == obj2) {
                    return obj2;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return o8s.R;
        } finally {
            if (kNb.v(this.R) == this.f6666R) {
                this.R.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new o4w(this.f6666R, this.R, aoo);
    }
}
