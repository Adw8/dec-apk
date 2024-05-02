package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Cp  reason: default package */
/* loaded from: classes.dex */
public final class Cp extends k8G implements kg9 {
    public final /* synthetic */ List R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cp(int i, ArrayList arrayList) {
        super(1);
        this.X = i;
        this.R = arrayList;
    }

    public final void R(h57 h57) {
        switch (this.X) {
            case 0:
                List list = this.R;
                int size = list.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        h57.v(h57, (l0f) list.get(i), 0, 0);
                        if (i2 <= size) {
                            i = i2;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 1:
                List list2 = this.R;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    h57.X(h57, (l0f) list2.get(i3), 0, 0);
                }
                return;
            case 2:
                List list3 = this.R;
                int size3 = list3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    kSh ksh = (kSh) list3.get(i4);
                    long j = ((dU5) ksh.v).f2628R;
                    h57.getClass();
                    h57.c((l0f) ksh.R, j, 0.0f);
                }
                return;
            case 3:
                List list4 = this.R;
                int size4 = list4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    h57.v(h57, (l0f) list4.get(i5), 0, 0);
                }
                return;
            case 4:
                int i6 = pdD.i(this.R);
                if (i6 >= 0) {
                    int i7 = 0;
                    while (true) {
                        h57.X(h57, (l0f) this.R.get(i7), 0, 0);
                        if (i7 != i6) {
                            i7++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            default:
                int i8 = pdD.i(this.R);
                if (i8 >= 0) {
                    int i9 = 0;
                    while (true) {
                        h57.X(h57, (l0f) this.R.get(i9), 0, 0);
                        if (i9 != i8) {
                            i9++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 6:
                List list5 = this.R;
                int size5 = list5.size();
                for (int i10 = 0; i10 < size5; i10++) {
                    h57.O(h57, (l0f) list5.get(i10), 0, 0);
                }
                return;
            case 7:
                List list6 = this.R;
                int size6 = list6.size();
                for (int i11 = 0; i11 < size6; i11++) {
                    h57.X(h57, (l0f) list6.get(i11), 0, 0);
                }
                return;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                R((h57) obj);
                break;
            case 1:
                R((h57) obj);
                break;
            case 2:
                R((h57) obj);
                break;
            case 3:
                R((h57) obj);
                break;
            case 4:
                R((h57) obj);
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                List list = this.R;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((kg9) list.get(i)).x(obj);
                }
                return o8s.R;
            case 6:
                R((h57) obj);
                break;
            case 7:
                R((h57) obj);
                break;
            default:
                R((h57) obj);
                break;
        }
        return o8s.R;
    }
}
