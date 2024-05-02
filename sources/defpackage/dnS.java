package defpackage;

/* renamed from: dnS  reason: default package */
/* loaded from: classes.dex */
public final class dnS extends o02 {
    public final hPF R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2863R;

    public dnS(String str, hPF hpf) {
        this.f2863R = str;
        this.R = hpf;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f2863R;
        int ordinal = this.R.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
