package defpackage;

import android.os.Bundle;
import androidx.activity.d;
import java.util.ArrayList;

/* renamed from: fy7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fy7 implements kod {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3643R;

    public /* synthetic */ fy7(int i, Object obj) {
        this.R = i;
        this.f3643R = obj;
    }

    @Override // defpackage.kod
    public final Bundle R() {
        switch (this.R) {
            case 0:
                d dVar = (d) this.f3643R;
                dVar.getClass();
                Bundle bundle = new Bundle();
                c31 c31 = dVar.f1014R;
                c31.getClass();
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(c31.v.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(c31.v.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(((androidx.activity.result.d) c31).f1024R));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) ((androidx.activity.result.d) c31).R.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", ((androidx.activity.result.d) c31).f1026R);
                return bundle;
            case 1:
                hm9 hm9 = (hm9) this.f3643R;
                int i = hm9.e;
                do {
                } while (hm9.t(((eAj) hm9.R.R).f3006R));
                hm9.c.X(alX.ON_STOP);
                return new Bundle();
            default:
                return ((hAW) this.f3643R).D();
        }
    }
}
