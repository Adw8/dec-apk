package defpackage;

import android.os.Bundle;
import androidx.activity.d;
import java.util.ArrayList;
import java.util.Random;

/* renamed from: mGt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mGt implements oOW {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ d f5996R;

    public /* synthetic */ mGt(hm9 hm9, int i) {
        this.R = i;
        this.f5996R = hm9;
    }

    @Override // defpackage.oOW
    public final void R() {
        switch (this.R) {
            case 0:
                d dVar = this.f5996R;
                Bundle R = dVar.f1015R.f4264R.R("android:support:activity-result");
                if (R != null) {
                    c31 c31 = dVar.f1014R;
                    c31.getClass();
                    ArrayList<Integer> integerArrayList = R.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = R.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (!(stringArrayList == null || integerArrayList == null)) {
                        ((androidx.activity.result.d) c31).f1024R = R.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        ((androidx.activity.result.d) c31).f1026R = (Random) R.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        ((androidx.activity.result.d) c31).R.putAll(R.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            if (c31.v.containsKey(str)) {
                                Integer num = (Integer) c31.v.remove(str);
                                if (!((androidx.activity.result.d) c31).R.containsKey(str)) {
                                    ((androidx.activity.result.d) c31).f1025R.remove(num);
                                }
                            }
                            int intValue = integerArrayList.get(i).intValue();
                            String str2 = stringArrayList.get(i);
                            ((androidx.activity.result.d) c31).f1025R.put(Integer.valueOf(intValue), str2);
                            c31.v.put(str2, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                eAj eaj = (eAj) ((hm9) this.f5996R).R.R;
                eaj.f3006R.v(eaj, eaj, null);
                return;
        }
    }
}
