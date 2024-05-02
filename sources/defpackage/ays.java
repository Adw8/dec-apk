package defpackage;

/* renamed from: ays  reason: default package */
/* loaded from: classes.dex */
public final class ays extends d7H {
    public final Class v;

    public ays(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.v = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    /* renamed from: O */
    public final Enum c(String str) {
        Enum r3;
        Object[] enumConstants = this.v.getEnumConstants();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r3 = null;
                break;
            }
            r3 = enumConstants[i];
            if (iH_.Q(((Enum) r3).name(), str)) {
                break;
            }
            i++;
        }
        Enum r32 = r3;
        if (r32 != null) {
            return r32;
        }
        StringBuilder i2 = jQ.i("Enum value ", str, " not found for type ");
        i2.append(this.v.getName());
        i2.append('.');
        throw new IllegalArgumentException(i2.toString());
    }

    @Override // defpackage.d7H, defpackage.iB8
    public final String v() {
        return this.v.getName();
    }
}
