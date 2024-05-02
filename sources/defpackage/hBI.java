package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hBI  reason: default package */
/* loaded from: classes.dex */
public final class hBI extends k8G implements lR3 {
    public final /* synthetic */ blo R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ List f4158R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hBI(blo blo, ArrayList arrayList, int i) {
        super(3);
        this.X = i;
        this.R = blo;
        this.f4158R = arrayList;
    }

    public final void R(Su su, mdh mdh, h1W h1w) {
        int i = 0;
        switch (this.X) {
            case 0:
                int i2 = this.R.e;
                if (i2 > 0) {
                    su = new gBs(su, i2);
                }
                List list = this.f4158R;
                int size = list.size();
                while (i < size) {
                    ((lR3) list.get(i)).y(su, mdh, h1w);
                    i++;
                }
                return;
            case 1:
                int i3 = this.R.e;
                List list2 = this.f4158R;
                int size2 = list2.size();
                while (i < size2) {
                    Object obj = list2.get(i);
                    int i4 = i3 + i;
                    su.v(i4, obj);
                    su.R(i4, obj);
                    i++;
                }
                return;
            default:
                int i5 = this.R.e;
                if (i5 > 0) {
                    su = new gBs(su, i5);
                }
                List list3 = this.f4158R;
                int size3 = list3.size();
                while (i < size3) {
                    ((lR3) list3.get(i)).y(su, mdh, h1w);
                    i++;
                }
                return;
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
            case 1:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
            default:
                R((Su) obj, (mdh) obj2, (h1W) obj3);
                break;
        }
        return o8s.R;
    }
}
