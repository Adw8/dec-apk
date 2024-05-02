package defpackage;

import java.util.LinkedHashMap;

/* renamed from: hFh  reason: default package */
/* loaded from: classes.dex */
public final class hFh {
    public static final LinkedHashMap v = new LinkedHashMap();
    public final LinkedHashMap R = new LinkedHashMap();

    public final void R(jFk jfk) {
        String U = aYa.U(jfk.getClass());
        if (aYa.C(U)) {
            jFk jfk2 = (jFk) this.R.get(U);
            if (!n3x.v(jfk2, jfk)) {
                boolean z = false;
                if (jfk2 != null && jfk2.f4894R) {
                    z = true;
                }
                if (!(!z)) {
                    throw new IllegalStateException(("Navigator " + jfk + " is replacing an already attached " + jfk2).toString());
                } else if (!jfk.f4894R) {
                    jFk jfk3 = (jFk) this.R.put(U, jfk);
                } else {
                    throw new IllegalStateException(("Navigator " + jfk + " is already attached to another NavController").toString());
                }
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
    }

    public final jFk v(String str) {
        if (aYa.C(str)) {
            jFk jfk = (jFk) this.R.get(str);
            if (jfk != null) {
                return jfk;
            }
            throw new IllegalStateException(jQ.C("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }
}
