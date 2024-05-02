package defpackage;

/* renamed from: eo1  reason: default package */
/* loaded from: classes.dex */
public interface eo1 extends ncu {
    @Override // defpackage.ncu
    default Object O(Object obj, iv7 iv7) {
        return iv7.J(obj, this);
    }

    @Override // defpackage.ncu
    default boolean v(kg9 kg9) {
        return ((Boolean) kg9.x(this)).booleanValue();
    }
}
