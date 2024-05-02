package defpackage;

import java.lang.reflect.Type;

/* renamed from: kXV  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kXV extends nZL implements kg9 {
    public static final kXV R = new kXV();

    public kXV() {
        super(1, gQc.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return gQc.U((Type) obj);
    }
}
