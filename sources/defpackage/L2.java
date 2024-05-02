package defpackage;

/* renamed from: L2  reason: default package */
/* loaded from: classes.dex */
public final class L2 {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public String f269R;
    public int v;

    public L2() {
        this.R = 1;
    }

    public static L2 v() {
        return new L2(0);
    }

    public final L2 R() {
        L2 l2 = new L2();
        l2.v = this.v;
        l2.f269R = this.f269R;
        return l2;
    }

    public final String c() {
        int i = this.v;
        if (i == -1) {
            return null;
        }
        int indexOf = this.f269R.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.f269R.substring(this.v);
            this.v = -1;
            return substring;
        }
        String substring2 = this.f269R.substring(this.v, indexOf);
        this.v = indexOf + 1;
        return substring2;
    }

    public final String toString() {
        switch (this.R) {
            case 1:
                int i = this.v;
                int i2 = fgm.R;
                fjX fjx = ej7.f3185R;
                Integer valueOf = Integer.valueOf(i);
                String obj = (!fjx.containsKey(valueOf) ? ej7.R : (ej7) fjx.get(valueOf)).toString();
                String str = this.f269R;
                return "Response Code: " + obj + ", Debug Message: " + str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ L2(int i) {
        this.R = 0;
        this.f269R = "";
    }

    public L2(String str) {
        this.R = 2;
        this.f269R = str;
        this.v = 0;
    }
}
