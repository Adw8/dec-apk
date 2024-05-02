package defpackage;

/* renamed from: ipB  reason: default package */
/* loaded from: classes.dex */
public final class ipB {
    public final iwX R;

    /* renamed from: R  reason: collision with other field name */
    public final Integer f4732R;

    /* renamed from: R  reason: collision with other field name */
    public final Long f4733R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4734R;
    public final iwX v;

    /* renamed from: v  reason: collision with other field name */
    public final Integer f4735v;

    /* renamed from: v  reason: collision with other field name */
    public final String f4736v;

    public ipB(iwX iwx, iwX iwx2, String str, String str2, Long l, Integer num, Integer num2) {
        this.R = iwx;
        this.v = iwx2;
        this.f4734R = str;
        this.f4736v = str2;
        this.f4733R = l;
        this.f4732R = num;
        this.f4735v = num2;
    }

    public /* synthetic */ ipB(iwX iwx, String str, String str2, Long l, Integer num, Integer num2, int i) {
        this(iwx, (iwX) null, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2);
    }
}
