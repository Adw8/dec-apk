package defpackage;

import java.io.IOException;

/* renamed from: k49  reason: default package */
/* loaded from: classes.dex */
public abstract class k49 {
    public abstract void O(mot mot, Object obj);

    public abstract Object R(csz csz);

    public final String X(Object obj) {
        ME me = new ME();
        try {
            O(new dfN(me), obj);
            return me.G();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public boolean c() {
        return false;
    }

    public final k49 e() {
        return this instanceof gvX ? this : new gvX(this);
    }

    public final Object v(String str) {
        ME me = new ME();
        me.vr(str);
        b4j b4j = new b4j(me);
        Object R = R(b4j);
        if (c() || b4j.W() == 10) {
            return R;
        }
        throw new j8f("JSON document was not fully consumed.", 0);
    }
}
