package defpackage;

import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: a2F  reason: default package */
/* loaded from: classes.dex */
public final class a2F extends k49 {
    public static final tm R = new tm(3);

    /* renamed from: R  reason: collision with other field name */
    public final k49 f720R;
    public final k49 v;

    public a2F(k_Z k_z, Type type, Type type2) {
        this.f720R = k_z.v(type);
        this.v = k_z.v(type2);
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        mot.c();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                int C = mot.C();
                if (C == 5 || C == 3) {
                    mot.f6167R = true;
                    this.f720R.O(mot, entry.getKey());
                    this.v.O(mot, entry.getValue());
                } else {
                    throw new IllegalStateException("Nesting problem.");
                }
            } else {
                StringBuilder U = opT.U("Map key is null at ");
                U.append(mot.O());
                throw new j8f(U.toString(), 0);
            }
        }
        mot.X();
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        kDn kdn = new kDn();
        csz.c();
        while (csz.H()) {
            b4j b4j = (b4j) csz;
            if (b4j.H()) {
                b4j.f1520R = b4j.zw();
                b4j.f1521X = 11;
            }
            Object R2 = this.f720R.R(csz);
            Object R3 = this.v.R(csz);
            Object put = kdn.put(R2, R3);
            if (put != null) {
                throw new j8f("Map key '" + R2 + "' has multiple values at path " + csz.Z() + ": " + put + " and " + R3, 0);
            }
        }
        csz.O();
        return kdn;
    }

    public final String toString() {
        StringBuilder U = opT.U("JsonAdapter(");
        U.append(this.f720R);
        U.append("=");
        U.append(this.v);
        U.append(")");
        return U.toString();
    }
}
