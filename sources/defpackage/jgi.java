package defpackage;

/* renamed from: jgi  reason: default package */
/* loaded from: classes.dex */
public final class jgi extends k8G implements iv7 {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5000R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgi(Object obj, boolean z, int i) {
        super(2);
        this.X = i;
        this.R = obj;
        this.f5000R = z;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return R(((Number) obj2).intValue(), (CharSequence) obj);
            case 1:
                return R(((Number) obj2).intValue(), (CharSequence) obj);
            default:
                return ((nbD) obj).M((hdJ) obj2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.kSh R(int r13, java.lang.CharSequence r14) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgi.R(int, java.lang.CharSequence):kSh");
    }
}
