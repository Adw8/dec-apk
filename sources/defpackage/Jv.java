package defpackage;

/* renamed from: Jv  reason: default package */
/* loaded from: classes.dex */
public final class Jv implements geu {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f213R;

    public /* synthetic */ Jv(String str, int i) {
        this.R = i;
        this.f213R = str;
    }

    @Override // defpackage.geu
    public final Object R(Object obj, icv icv) {
        switch (this.R) {
            case 0:
                p1w p1w = (p1w) obj;
                String str = this.f213R;
                if (str == null) {
                    str = ((Z5) icv).f661R;
                }
                return new n1(str, 0);
            case 1:
                p1w p1w2 = (p1w) obj;
                String str2 = this.f213R;
                if (str2 == null) {
                    str2 = ((Z5) icv).f661R;
                }
                return new n1(str2, 1);
            case 2:
                p1w p1w3 = (p1w) obj;
                String str3 = this.f213R;
                if (str3 == null) {
                    str3 = ((Z5) icv).f661R;
                }
                return new n1(str3, 2);
            case 3:
                p1w p1w4 = (p1w) obj;
                String str4 = this.f213R;
                if (str4 == null) {
                    str4 = ((Z5) icv).f661R;
                }
                return new n1(str4, 3);
            case 4:
                p1w p1w5 = (p1w) obj;
                String str5 = this.f213R;
                if (str5 == null) {
                    str5 = ((Z5) icv).f661R;
                }
                return new n1(str5, 4);
            default:
                p1w p1w6 = (p1w) obj;
                String str6 = this.f213R;
                if (str6 == null) {
                    str6 = ((Z5) icv).f661R;
                }
                return new n1(str6, 5);
        }
    }
}
