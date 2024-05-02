package defpackage;

import android.os.ParcelFileDescriptor;

/* renamed from: bzu  reason: default package */
/* loaded from: classes.dex */
public final class bzu extends aFk implements iv7 {
    public final /* synthetic */ ParcelFileDescriptor R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f1903R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f1904R;
    public final /* synthetic */ String v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bzu(lR3 lr3, ParcelFileDescriptor parcelFileDescriptor, String str, String str2, aOO aoo) {
        super(2, aoo);
        this.f1904R = lr3;
        this.R = parcelFileDescriptor;
        this.f1903R = str;
        this.v = str2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((bzu) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        jjU.o(obj);
        return this.f1904R.y(this.R, this.f1903R, this.v);
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new bzu(this.f1904R, this.R, this.f1903R, this.v, aoo);
    }
}
