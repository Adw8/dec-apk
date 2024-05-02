package defpackage;

/* renamed from: hQF  reason: default package */
/* loaded from: classes.dex */
public final class hQF {
    public char R;

    /* renamed from: R  reason: collision with other field name */
    public String f4236R;

    /* renamed from: R  reason: collision with other field name */
    public StringBuffer f4237R = new StringBuffer();

    /* renamed from: R  reason: collision with other field name */
    public int f4235R = -1;

    public hQF(String str, char c) {
        this.f4236R = str;
        this.R = c;
    }

    public final boolean R() {
        return this.f4235R != this.f4236R.length();
    }

    public final String v() {
        if (this.f4235R == this.f4236R.length()) {
            return null;
        }
        int i = this.f4235R + 1;
        this.f4237R.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i != this.f4236R.length()) {
            char charAt = this.f4236R.charAt(i);
            if (charAt == '\"') {
                if (!z) {
                    z2 = !z2;
                }
            } else if (!z && !z2) {
                if (charAt == '\\') {
                    this.f4237R.append(charAt);
                    z = true;
                } else if (charAt == this.R) {
                    break;
                } else {
                    this.f4237R.append(charAt);
                }
                i++;
            }
            this.f4237R.append(charAt);
            z = false;
            i++;
        }
        this.f4235R = i;
        return this.f4237R.toString();
    }
}
