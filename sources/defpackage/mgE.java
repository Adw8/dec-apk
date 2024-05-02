package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.activity.c;

/* renamed from: mgE  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mgE implements geB {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f6125R;

    public /* synthetic */ mgE(int i, Object obj) {
        this.R = i;
        this.f6125R = obj;
    }

    @Override // defpackage.geB
    public final void accept(Object obj) {
        switch (this.R) {
            case 0:
                Configuration configuration = (Configuration) obj;
                ((hm9) this.f6125R).R.H();
                return;
            case 1:
                Intent intent = (Intent) obj;
                ((hm9) this.f6125R).R.H();
                return;
            default:
                Boolean bool = (Boolean) obj;
                ((c) this.f6125R).c();
                return;
        }
    }
}
