package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* renamed from: arh  reason: default package */
/* loaded from: classes.dex */
public final class arh extends aFk implements iv7 {
    public final /* synthetic */ ContentResolver R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Context f1472R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Uri f1473R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fJ4 f1474R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gn f1475R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1476R;

    /* renamed from: R  reason: collision with other field name */
    public zM f1477R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public arh(ContentResolver contentResolver, Uri uri, fJ4 fj4, gn gnVar, Context context, aOO aoo) {
        super(2, aoo);
        this.R = contentResolver;
        this.f1473R = uri;
        this.f1474R = fj4;
        this.f1475R = gnVar;
        this.f1472R = context;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((arh) X((h2V) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0012, B:12:0x0025, B:14:0x003a, B:15:0x0040, B:19:0x0050, B:21:0x0058), top: B:29:0x0006 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r9) {
        /*
            r8 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0029
            if (r1 == r2) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            zM r1 = r8.f1477R
            java.lang.Object r4 = r8.f1476R
            h2V r4 = (defpackage.h2V) r4
            defpackage.jjU.o(r9)     // Catch: all -> 0x0085
        L_0x0015:
            r9 = r4
            goto L_0x0040
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001f:
            zM r1 = r8.f1477R
            java.lang.Object r4 = r8.f1476R
            h2V r4 = (defpackage.h2V) r4
            defpackage.jjU.o(r9)     // Catch: all -> 0x0085
            goto L_0x0050
        L_0x0029:
            defpackage.jjU.o(r9)
            java.lang.Object r9 = r8.f1476R
            h2V r9 = (defpackage.h2V) r9
            android.content.ContentResolver r1 = r8.R
            android.net.Uri r4 = r8.f1473R
            r5 = 0
            fJ4 r6 = r8.f1474R
            r1.registerContentObserver(r4, r5, r6)
            gn r1 = r8.f1475R     // Catch: all -> 0x0085
            zM r1 = r1.x()     // Catch: all -> 0x0085
        L_0x0040:
            r8.f1476R = r9     // Catch: all -> 0x0085
            r8.f1477R = r1     // Catch: all -> 0x0085
            r8.X = r2     // Catch: all -> 0x0085
            java.lang.Object r4 = r1.R(r8)     // Catch: all -> 0x0085
            if (r4 != r0) goto L_0x004d
            return r0
        L_0x004d:
            r7 = r4
            r4 = r9
            r9 = r7
        L_0x0050:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: all -> 0x0085
            boolean r9 = r9.booleanValue()     // Catch: all -> 0x0085
            if (r9 == 0) goto L_0x007b
            r1.v()     // Catch: all -> 0x0085
            android.content.Context r9 = r8.f1472R     // Catch: all -> 0x0085
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: all -> 0x0085
            java.lang.String r5 = "animator_duration_scale"
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: all -> 0x0085
            java.lang.Float r5 = new java.lang.Float     // Catch: all -> 0x0085
            r5.<init>(r9)     // Catch: all -> 0x0085
            r8.f1476R = r4     // Catch: all -> 0x0085
            r8.f1477R = r1     // Catch: all -> 0x0085
            r8.X = r3     // Catch: all -> 0x0085
            java.lang.Object r9 = r4.R(r5, r8)     // Catch: all -> 0x0085
            if (r9 != r0) goto L_0x0015
            return r0
        L_0x007b:
            android.content.ContentResolver r9 = r8.R
            fJ4 r8 = r8.f1474R
            r9.unregisterContentObserver(r8)
            o8s r8 = defpackage.o8s.R
            return r8
        L_0x0085:
            r9 = move-exception
            android.content.ContentResolver r0 = r8.R
            fJ4 r8 = r8.f1474R
            r0.unregisterContentObserver(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arh.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        arh arh = new arh(this.R, this.f1473R, this.f1474R, this.f1475R, this.f1472R, aoo);
        arh.f1476R = obj;
        return arh;
    }
}
