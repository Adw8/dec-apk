package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: IK  reason: default package */
/* loaded from: classes.dex */
public final class IK implements kod {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f183R;

    public /* synthetic */ IK(int i, Object obj) {
        this.R = i;
        this.f183R = obj;
    }

    @Override // defpackage.kod
    public final Bundle R() {
        switch (this.R) {
            case 0:
                Bundle bundle = new Bundle();
                ((pJ) this.f183R).i().getClass();
                return bundle;
            case 1:
                Map c = ((e9w) this.f183R).c();
                Class[] clsArr = bfz.R;
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : c.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                Bundle bundle3 = new Bundle();
                bundle3.putStringArrayList("classes_to_restore", new ArrayList<>((Set) this.f183R));
                return bundle3;
        }
    }

    public IK(bhK bhk) {
        this.R = 2;
        this.f183R = new LinkedHashSet();
        bhk.c("androidx.savedstate.Restarter", this);
    }
}
