package defpackage;

/* renamed from: h1  reason: default package */
/* loaded from: classes.dex */
public final class h1 {
    public static final byte[] R = new byte[1792];

    /* renamed from: R  reason: collision with other field name */
    public char f4013R;

    /* renamed from: R  reason: collision with other field name */
    public final int f4014R;

    /* renamed from: R  reason: collision with other field name */
    public final CharSequence f4015R;
    public int v;

    static {
        for (int i = 0; i < 1792; i++) {
            R[i] = Character.getDirectionality(i);
        }
    }

    public h1(CharSequence charSequence) {
        this.f4015R = charSequence;
        this.f4014R = charSequence.length();
    }

    public final byte R() {
        char charAt = this.f4015R.charAt(this.v - 1);
        this.f4013R = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.f4015R, this.v);
            this.v -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.v--;
        char c = this.f4013R;
        return c < 1792 ? R[c] : Character.getDirectionality(c);
    }
}
