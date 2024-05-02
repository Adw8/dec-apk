package defpackage;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: j9J  reason: default package */
/* loaded from: classes.dex */
public final class j9J implements Transition.TransitionListener {
    public final /* synthetic */ b8r R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4841R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ArrayList f4842R;
    public final /* synthetic */ Object c;

    /* renamed from: c  reason: collision with other field name */
    public final /* synthetic */ ArrayList f4843c;
    public final /* synthetic */ Object v = null;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ ArrayList f4844v = null;

    public j9J(b8r b8r, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.R = b8r;
        this.f4841R = obj;
        this.f4842R = arrayList;
        this.c = obj2;
        this.f4843c = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.f4841R;
        if (obj != null) {
            this.R.i(obj, this.f4842R, null);
        }
        Object obj2 = this.v;
        if (obj2 != null) {
            this.R.i(obj2, this.f4844v, null);
        }
        Object obj3 = this.c;
        if (obj3 != null) {
            this.R.i(obj3, this.f4843c, null);
        }
    }
}
