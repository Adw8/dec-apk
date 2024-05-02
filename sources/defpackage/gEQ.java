package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gEQ  reason: default package */
/* loaded from: classes.dex */
public final class gEQ extends k8G implements iv7 {
    public final /* synthetic */ iv7 R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gEQ(iv7 iv7) {
        super(2);
        this.R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        dWm dwm = (dWm) obj;
        List list = (List) this.R.J(dwm, obj2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj3 = list.get(i);
            if (obj3 != null && !dwm.R.v(obj3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        if (!list.isEmpty()) {
            return new ArrayList(list);
        }
        return null;
    }
}
