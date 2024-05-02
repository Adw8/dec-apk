package defpackage;

/* renamed from: KM  reason: default package */
/* loaded from: classes.dex */
public final class KM {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final bV5 f246R = new bV5(new q4(27, this));

    /* renamed from: R  reason: collision with other field name */
    public final String f247R;
    public final String v;

    public KM(String str, int i, String str2) {
        this.f247R = str;
        this.v = str2;
        this.R = i;
    }

    public final String toString() {
        int i = this.R;
        return "Shell response (" + i + "):\n" + ((String) this.f246R.getValue());
    }
}
