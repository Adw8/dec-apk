package defpackage;

/* renamed from: lcp  reason: default package */
/* loaded from: classes.dex */
public final class lcp extends k49 {
    public final /* synthetic */ int R;

    public /* synthetic */ lcp(int i) {
        this.R = i;
    }

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        switch (this.R) {
            case 0:
                mot.d((String) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                dfN dfn = (dfN) mot;
                if (!((mot) dfn).f6167R) {
                    dfn.M();
                    dfn.W();
                    dfn.R.w(booleanValue ? "true" : "false");
                    int[] iArr = ((mot) dfn).v;
                    int i = dfn.e - 1;
                    iArr[i] = iArr[i] + 1;
                    return;
                }
                StringBuilder U = opT.U("Boolean cannot be used as a map key in JSON at path ");
                U.append(dfn.O());
                throw new IllegalStateException(U.toString());
            case 2:
                mot.t((long) (((Byte) obj).intValue() & 255));
                return;
            case 3:
                mot.d(((Character) obj).toString());
                return;
            case 4:
                double doubleValue = ((Double) obj).doubleValue();
                dfN dfn2 = (dfN) mot;
                dfn2.getClass();
                if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
                } else if (((mot) dfn2).f6167R) {
                    ((mot) dfn2).f6167R = false;
                    dfn2.Z(Double.toString(doubleValue));
                    return;
                } else {
                    dfn2.M();
                    dfn2.W();
                    dfn2.R.w(Double.toString(doubleValue));
                    int[] iArr2 = ((mot) dfn2).v;
                    int i2 = dfn2.e - 1;
                    iArr2[i2] = iArr2[i2] + 1;
                    return;
                }
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                Float f = (Float) obj;
                f.getClass();
                mot.o(f);
                return;
            case 6:
                mot.t((long) ((Integer) obj).intValue());
                return;
            case 7:
                mot.t(((Long) obj).longValue());
                return;
            default:
                mot.t((long) ((Short) obj).intValue());
                return;
        }
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        boolean z = false;
        switch (this.R) {
            case 0:
                return csz.d();
            case 1:
                b4j b4j = (b4j) csz;
                int i = b4j.f1521X;
                if (i == 0) {
                    i = b4j.a();
                }
                if (i == 5) {
                    b4j.f1521X = 0;
                    int[] iArr = b4j.v;
                    int i2 = b4j.e - 1;
                    iArr[i2] = iArr[i2] + 1;
                    z = true;
                } else if (i == 6) {
                    b4j.f1521X = 0;
                    int[] iArr2 = b4j.v;
                    int i3 = b4j.e - 1;
                    iArr2[i3] = iArr2[i3] + 1;
                } else {
                    StringBuilder U = opT.U("Expected a boolean but was ");
                    U.append(jQ.Q(b4j.W()));
                    U.append(" at path ");
                    U.append(b4j.Z());
                    throw new j8f(U.toString(), 0);
                }
                return Boolean.valueOf(z);
            case 2:
                return Byte.valueOf((byte) pdD.d(csz, "a byte", -128, 255));
            case 3:
                String d = csz.d();
                if (d.length() <= 1) {
                    return Character.valueOf(d.charAt(0));
                }
                throw new j8f(String.format("Expected %s but was %s at path %s", "a char", '\"' + d + '\"', csz.Z()), 0);
            case 4:
                return Double.valueOf(csz.C());
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                float C = (float) csz.C();
                csz.getClass();
                if (!Float.isInfinite(C)) {
                    return Float.valueOf(C);
                }
                throw new j8f("JSON forbids NaN and infinities: " + C + " at path " + csz.Z(), 0);
            case 6:
                return Integer.valueOf(csz.j());
            case 7:
                return Long.valueOf(csz.t());
            default:
                return Short.valueOf((short) pdD.d(csz, "a short", -32768, 32767));
        }
    }

    public final String toString() {
        switch (this.R) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
