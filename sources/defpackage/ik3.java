package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: ik3  reason: default package */
/* loaded from: classes.dex */
public final class ik3 extends Transition.EpicenterCallback {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Rect f4708R;

    public /* synthetic */ ik3(Rect rect, int i) {
        this.R = i;
        this.f4708R = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.R) {
            case 0:
                return this.f4708R;
            default:
                Rect rect = this.f4708R;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return this.f4708R;
        }
    }
}
