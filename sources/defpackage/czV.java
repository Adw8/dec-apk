package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import java.util.WeakHashMap;

/* renamed from: czV  reason: default package */
/* loaded from: classes.dex */
public final class czV implements View.OnAttachStateChangeListener {
    public final /* synthetic */ d R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f2468R;
    public final /* synthetic */ int e = 1;

    public czV(p5g p5g, d dVar) {
        this.f2468R = p5g;
        this.R = dVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.e) {
            case 0:
                d dVar = this.R;
                pm2 pm2 = dVar.f1318R;
                dVar.H();
                owe.O((ViewGroup) pm2.f7228R.getParent(), ((p5g) this.f2468R).R.S()).X();
                return;
            default:
                ((View) this.f2468R).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = of5.f6887R;
                fv7.c((View) this.f2468R);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public czV(d dVar, View view) {
        this.R = dVar;
        this.f2468R = view;
    }
}
