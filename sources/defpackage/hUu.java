package defpackage;

import java.util.Set;

/* renamed from: hUu  reason: default package */
/* loaded from: classes.dex */
public final class hUu extends aFk implements iv7 {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public gIB f4284R;

    /* renamed from: R  reason: collision with other field name */
    public gn f4285R;

    /* renamed from: R  reason: collision with other field name */
    public Object f4286R;

    /* renamed from: R  reason: collision with other field name */
    public Set f4287R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f4288R;
    public int X;
    public /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hUu(f_c f_c, aOO aoo) {
        super(2, aoo);
        this.R = f_c;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((hUu) X((h2V) obj, (aOO) obj2)).O(o8s.R);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b8 A[Catch: all -> 0x014b, TryCatch #3 {all -> 0x014b, blocks: (B:10:0x0029, B:13:0x003e, B:23:0x009d, B:26:0x00b2, B:28:0x00b8, B:30:0x00c2, B:33:0x00c9, B:34:0x00cd, B:36:0x00d3, B:39:0x00de, B:42:0x00e5, B:43:0x00e9, B:45:0x00ef, B:53:0x0102, B:57:0x010c, B:60:0x0112, B:64:0x012a, B:66:0x0133, B:61:0x011f, B:63:0x0127, B:73:0x0151, B:74:0x0154), top: B:83:0x000a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0112 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #3 {all -> 0x014b, blocks: (B:10:0x0029, B:13:0x003e, B:23:0x009d, B:26:0x00b2, B:28:0x00b8, B:30:0x00c2, B:33:0x00c9, B:34:0x00cd, B:36:0x00d3, B:39:0x00de, B:42:0x00e5, B:43:0x00e9, B:45:0x00ef, B:53:0x0102, B:57:0x010c, B:60:0x0112, B:64:0x012a, B:66:0x0133, B:61:0x011f, B:63:0x0127, B:73:0x0151, B:74:0x0154), top: B:83:0x000a }] */
    @Override // defpackage.C2
    public final java.lang.Object O(java.lang.Object r19) {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hUu.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        hUu huu = new hUu(this.R, aoo);
        huu.v = obj;
        return huu;
    }
}
