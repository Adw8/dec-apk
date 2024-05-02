package defpackage;

/* renamed from: bLD  reason: default package */
/* loaded from: classes.dex */
public final class bLD extends k8G implements iv7 {
    public static final bLD R = new bLD();

    public bLD() {
        super(2);
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        cF5 cf5 = (cF5) obj;
        float floatValue = ((Number) obj2).floatValue();
        if (!(cf5.X == floatValue)) {
            cf5.X = floatValue;
            cf5.f2030c = true;
            cf5.c();
        }
        return o8s.R;
    }
}
