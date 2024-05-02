package defpackage;

/* renamed from: eUW  reason: default package */
/* loaded from: classes.dex */
public final class eUW extends k8G implements kg9 {
    public final /* synthetic */ float R;
    public final /* synthetic */ float v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eUW(float f, float f2) {
        super(1);
        this.R = f;
        this.v = f2;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return Float.valueOf(((Boolean) obj).booleanValue() ? this.R : this.v);
    }
}
