package defpackage;

import java.lang.reflect.Type;

/* renamed from: kSP  reason: default package */
/* loaded from: classes.dex */
public final class kSP extends k49 {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5295R;

    /* renamed from: R  reason: collision with other field name */
    public final Type f5296R;

    /* renamed from: R  reason: collision with other field name */
    public k49 f5297R;

    public kSP(Type type, String str, Object obj) {
        this.f5296R = type;
        this.f5295R = str;
        this.R = obj;
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        k49 k49 = this.f5297R;
        if (k49 != null) {
            k49.O(mot, obj);
            return;
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        k49 k49 = this.f5297R;
        if (k49 != null) {
            return k49.R(csz);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    public final String toString() {
        k49 k49 = this.f5297R;
        return k49 != null ? k49.toString() : super.toString();
    }
}
