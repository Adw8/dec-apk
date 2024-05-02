package defpackage;

/* renamed from: o2c  reason: default package */
/* loaded from: classes.dex */
public class o2c implements hv5 {
    public static o2c R;

    @Override // defpackage.hv5
    public kvj R(Class cls) {
        try {
            return (kvj) cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        }
    }
}
