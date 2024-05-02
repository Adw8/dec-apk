package defpackage;

/* renamed from: hrD  reason: default package */
/* loaded from: classes.dex */
public final class hrD extends k8G implements iv7 {
    public static final hrD R = new hrD();

    public hrD() {
        super(2);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        cF5 cf5 = (cF5) obj;
        float floatValue = ((Number) obj2).floatValue();
        if (!(cf5.L == floatValue)) {
            cf5.L = floatValue;
            cf5.f2030c = true;
            cf5.c();
        }
        return o8s.R;
    }
}
