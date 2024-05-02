package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: UB  reason: default package */
/* loaded from: classes.dex */
public final class UB extends vC {
    public static final u L;
    public static final u O;

    /* renamed from: R  reason: collision with other field name */
    public static final u f551R;
    public static final u X;
    public static final Hashtable c;

    /* renamed from: c  reason: collision with other field name */
    public static final u f552c;
    public static final Hashtable e;

    /* renamed from: e  reason: collision with other field name */
    public static final u f553e;

    /* renamed from: R  reason: collision with other field name */
    public final Hashtable f554R;

    /* renamed from: v  reason: collision with other field name */
    public final Hashtable f555v;
    public static final u v = jQ.O("2.5.4.5");
    public static final UB R = new UB();

    static {
        u O2 = jQ.O("2.5.4.6");
        f551R = O2;
        u O3 = jQ.O("2.5.4.10");
        u O4 = jQ.O("2.5.4.11");
        u O5 = jQ.O("2.5.4.12");
        u O6 = jQ.O("2.5.4.3");
        u O7 = jQ.O("2.5.4.9");
        u O8 = jQ.O("2.5.4.5");
        u O9 = jQ.O("2.5.4.7");
        u O10 = jQ.O("2.5.4.8");
        u O11 = jQ.O("2.5.4.4");
        u O12 = jQ.O("2.5.4.42");
        u O13 = jQ.O("2.5.4.43");
        u O14 = jQ.O("2.5.4.44");
        u O15 = jQ.O("2.5.4.45");
        u O16 = jQ.O("2.5.4.13");
        u O17 = jQ.O("2.5.4.15");
        u O18 = jQ.O("2.5.4.17");
        u O19 = jQ.O("2.5.4.46");
        f552c = O19;
        u O20 = jQ.O("2.5.4.65");
        u O21 = jQ.O("2.5.4.72");
        u O22 = jQ.O("1.3.6.1.5.5.7.9.1");
        f553e = O22;
        u O23 = jQ.O("1.3.6.1.5.5.7.9.2");
        u O24 = jQ.O("1.3.6.1.5.5.7.9.3");
        u O25 = jQ.O("1.3.6.1.5.5.7.9.4");
        u O26 = jQ.O("1.3.6.1.5.5.7.9.5");
        u O27 = jQ.O("1.3.36.8.3.14");
        u O28 = jQ.O("2.5.4.16");
        new u("2.5.4.54").S();
        u uVar = k1H.R;
        X = uVar;
        u uVar2 = k1H.v;
        u uVar3 = k1H.c;
        u uVar4 = lpk.t;
        O = uVar4;
        u uVar5 = lpk.i;
        u uVar6 = lpk.V;
        u uVar7 = new u("0.9.2342.19200300.100.1.25");
        L = uVar7;
        u uVar8 = new u("0.9.2342.19200300.100.1.1");
        Hashtable hashtable = new Hashtable();
        c = hashtable;
        Hashtable hashtable2 = new Hashtable();
        e = hashtable2;
        hashtable.put(O2, "C");
        hashtable.put(O3, "O");
        hashtable.put(O5, "T");
        hashtable.put(O4, "OU");
        hashtable.put(O6, "CN");
        hashtable.put(O9, "L");
        hashtable.put(O10, "ST");
        hashtable.put(O8, "SERIALNUMBER");
        hashtable.put(uVar4, "E");
        hashtable.put(uVar7, "DC");
        hashtable.put(uVar8, "UID");
        hashtable.put(O7, "STREET");
        hashtable.put(O11, "SURNAME");
        hashtable.put(O12, "GIVENNAME");
        hashtable.put(O13, "INITIALS");
        hashtable.put(O14, "GENERATION");
        hashtable.put(O16, "DESCRIPTION");
        hashtable.put(O21, "ROLE");
        hashtable.put(uVar6, "unstructuredAddress");
        hashtable.put(uVar5, "unstructuredName");
        hashtable.put(O15, "UniqueIdentifier");
        hashtable.put(O19, "DN");
        hashtable.put(O20, "Pseudonym");
        hashtable.put(O28, "PostalAddress");
        hashtable.put(O27, "NameAtBirth");
        hashtable.put(O25, "CountryOfCitizenship");
        hashtable.put(O26, "CountryOfResidence");
        hashtable.put(O24, "Gender");
        hashtable.put(O23, "PlaceOfBirth");
        hashtable.put(O22, "DateOfBirth");
        hashtable.put(O18, "PostalCode");
        hashtable.put(O17, "BusinessCategory");
        hashtable.put(uVar, "TelephoneNumber");
        hashtable.put(uVar2, "Name");
        hashtable.put(uVar3, "organizationIdentifier");
        hashtable2.put("c", O2);
        hashtable2.put("o", O3);
        hashtable2.put("t", O5);
        hashtable2.put("ou", O4);
        hashtable2.put("cn", O6);
        hashtable2.put("l", O9);
        hashtable2.put("st", O10);
        hashtable2.put("sn", O11);
        hashtable2.put("serialnumber", O8);
        hashtable2.put("street", O7);
        hashtable2.put("emailaddress", uVar4);
        hashtable2.put("dc", uVar7);
        hashtable2.put("e", uVar4);
        hashtable2.put("uid", uVar8);
        hashtable2.put("surname", O11);
        hashtable2.put("givenname", O12);
        hashtable2.put("initials", O13);
        hashtable2.put("generation", O14);
        hashtable2.put("description", O16);
        hashtable2.put("role", O21);
        hashtable2.put("unstructuredaddress", uVar6);
        hashtable2.put("unstructuredname", uVar5);
        hashtable2.put("uniqueidentifier", O15);
        hashtable2.put("dn", O19);
        hashtable2.put("pseudonym", O20);
        hashtable2.put("postaladdress", O28);
        hashtable2.put("nameatbirth", O27);
        hashtable2.put("countryofcitizenship", O25);
        hashtable2.put("countryofresidence", O26);
        hashtable2.put("gender", O24);
        hashtable2.put("placeofbirth", O23);
        hashtable2.put("dateofbirth", O22);
        hashtable2.put("postalcode", O18);
        hashtable2.put("businesscategory", O17);
        hashtable2.put("telephonenumber", uVar);
        hashtable2.put("name", uVar2);
        hashtable2.put("organizationidentifier", uVar3);
    }

    public UB() {
        Hashtable hashtable = c;
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        this.f555v = hashtable2;
        Hashtable hashtable3 = e;
        Hashtable hashtable4 = new Hashtable();
        Enumeration keys2 = hashtable3.keys();
        while (keys2.hasMoreElements()) {
            Object nextElement2 = keys2.nextElement();
            hashtable4.put(nextElement2, hashtable3.get(nextElement2));
        }
        this.f554R = hashtable4;
    }

    public final u H(String str) {
        Hashtable hashtable = this.f554R;
        if (aPR.X(str).startsWith("OID.")) {
            return new u(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new u(str);
        }
        u uVar = (u) hashtable.get(aPR.c(str));
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalArgumentException(jQ.C("Unknown object id - ", str, " - passed to distinguished name"));
    }
}
