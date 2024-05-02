package defpackage;

/* renamed from: TO  reason: default package */
/* loaded from: classes.dex */
public final class TO extends pp5 implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pU f533R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public TO(pU pUVar, aOO aoo) {
        super(aoo);
        this.f533R = pUVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((TO) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a7 A[SYNTHETIC] */
    @Override // defpackage.C2
    public final java.lang.Object O(java.lang.Object r15) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TO.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        TO to = new TO(this.f533R, aoo);
        to.R = obj;
        return to;
    }
}
