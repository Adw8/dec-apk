package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: e9E  reason: default package */
/* loaded from: classes.dex */
public abstract class e9E {
    public static final /* synthetic */ int X = 0;

    /* renamed from: R  reason: collision with other field name */
    public f25 f2984R;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f2985R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2986R;
    public String c;
    public int e;
    public String v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2987R = new ArrayList();
    public final eSi R = new eSi();

    /* renamed from: R  reason: collision with other field name */
    public LinkedHashMap f2988R = new LinkedHashMap();

    static {
        new LinkedHashMap();
    }

    public e9E(jFk jfk) {
        LinkedHashMap linkedHashMap = hFh.v;
        this.f2986R = aYa.U(jfk.getClass());
    }

    public final Map C() {
        return mHQ.h(this.f2988R);
    }

    public final oKo H(int i) {
        oKo oko = this.R.m() == 0 ? null : (oKo) this.R.L(i, null);
        if (oko != null) {
            return oko;
        }
        f25 f25 = this.f2984R;
        if (f25 != null) {
            return f25.H(i);
        }
        return null;
    }

    public jzp P(CV cv) {
        Bundle bundle;
        int i;
        List list;
        int i2;
        List list2;
        List list3;
        int i3;
        List list4;
        boolean z;
        boolean z2;
        Matcher matcher;
        String str;
        String str2;
        Matcher matcher2 = null;
        if (this.f2987R.isEmpty()) {
            return null;
        }
        Iterator it = this.f2987R.iterator();
        jzp jzp = null;
        while (it.hasNext()) {
            duA dua = (duA) it.next();
            Uri uri = (Uri) cv.f59R;
            if (uri != null) {
                Map C = C();
                Pattern pattern = (Pattern) dua.f2908R.getValue();
                if (pattern != null) {
                    matcher2 = pattern.matcher(uri.toString());
                }
                if (matcher2 != null && matcher2.matches()) {
                    bundle = new Bundle();
                    int size = dua.f2910R.size();
                    int i4 = 0;
                    while (i4 < size) {
                        String str3 = (String) dua.f2910R.get(i4);
                        i4++;
                        String decode = Uri.decode(matcher2.group(i4));
                        aX4 ax4 = (aX4) C.get(str3);
                        if (ax4 != null) {
                            try {
                                iB8 ib8 = ax4.R;
                                ib8.e(bundle, str3, ib8.c(decode));
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            bundle.putString(str3, decode);
                        }
                    }
                    if (dua.f2912R) {
                        Iterator it2 = dua.f2911R.keySet().iterator();
                        while (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            pai pai = (pai) dua.f2911R.get(str4);
                            String queryParameter = uri.getQueryParameter(str4);
                            if (dua.f2915v) {
                                String uri2 = uri.toString();
                                String X4 = iH_.X4(uri2, '?');
                                if (!n3x.v(X4, uri2)) {
                                    queryParameter = X4;
                                }
                            }
                            if (queryParameter != null) {
                                matcher = Pattern.compile(pai.R, 32).matcher(queryParameter);
                                if (!matcher.matches()) {
                                    break;
                                }
                            } else {
                                matcher = null;
                            }
                            Bundle bundle2 = new Bundle();
                            try {
                                int size2 = pai.f7101R.size();
                                int i5 = 0;
                                while (i5 < size2) {
                                    if (matcher != null) {
                                        try {
                                            str = matcher.group(i5 + 1);
                                            if (str == null) {
                                                str = "";
                                            }
                                        } catch (IllegalArgumentException unused2) {
                                        }
                                    } else {
                                        str = null;
                                    }
                                    try {
                                        str2 = (String) pai.f7101R.get(i5);
                                        uri = uri;
                                    } catch (IllegalArgumentException unused3) {
                                        uri = uri;
                                    }
                                    try {
                                        aX4 ax42 = (aX4) C.get(str2);
                                        if (str != null) {
                                            it2 = it2;
                                            try {
                                                if (!n3x.v(str, '{' + str2 + '}')) {
                                                    if (ax42 != null) {
                                                        iB8 ib82 = ax42.R;
                                                        ib82.e(bundle2, str2, ib82.c(str));
                                                    } else {
                                                        bundle2.putString(str2, str);
                                                    }
                                                }
                                            } catch (IllegalArgumentException unused4) {
                                            }
                                        } else {
                                            it2 = it2;
                                        }
                                        i5++;
                                        uri = uri;
                                    } catch (IllegalArgumentException unused5) {
                                    }
                                }
                                uri = uri;
                                it2 = it2;
                                bundle.putAll(bundle2);
                            } catch (IllegalArgumentException unused6) {
                                uri = uri;
                            }
                        }
                    }
                    for (Map.Entry entry : C.entrySet()) {
                        String str5 = (String) entry.getKey();
                        aX4 ax43 = (aX4) entry.getValue();
                        if (!(ax43 != null && !ax43.f908R && !ax43.v) || bundle.containsKey(str5)) {
                        }
                    }
                }
                bundle = null;
            } else {
                bundle = null;
            }
            String str6 = (String) cv.v;
            boolean z3 = str6 != null && n3x.v(str6, dua.f2914v);
            String str7 = (String) cv.c;
            if (str7 == null || dua.c == null || !((Pattern) dua.v.getValue()).matcher(str7).matches()) {
                i = -1;
            } else {
                String str8 = dua.c;
                Pattern compile = Pattern.compile("/");
                iH_.F(0);
                Matcher matcher3 = compile.matcher(str8);
                if (!matcher3.find()) {
                    list = Collections.singletonList(str8.toString());
                } else {
                    ArrayList arrayList = new ArrayList(10);
                    int i6 = 0;
                    while (true) {
                        arrayList.add(str8.subSequence(i6, matcher3.start()).toString());
                        i6 = matcher3.end();
                        if (!matcher3.find()) {
                            break;
                        }
                    }
                    arrayList.add(str8.subSequence(i6, str8.length()).toString());
                    list = arrayList;
                }
                if (!list.isEmpty()) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() == 0) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (!z2) {
                            i2 = 1;
                            list2 = dF.vz(list, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                i2 = 1;
                list2 = fcD.R;
                String str9 = (String) list2.get(0);
                String str10 = (String) list2.get(i2);
                Pattern compile2 = Pattern.compile("/");
                iH_.F(0);
                Matcher matcher4 = compile2.matcher(str7);
                if (!matcher4.find()) {
                    list3 = Collections.singletonList(str7.toString());
                } else {
                    ArrayList arrayList2 = new ArrayList(10);
                    int i7 = 0;
                    do {
                        arrayList2.add(str7.subSequence(i7, matcher4.start()).toString());
                        i7 = matcher4.end();
                    } while (matcher4.find());
                    arrayList2.add(str7.subSequence(i7, str7.length()).toString());
                    list3 = arrayList2;
                }
                if (!list3.isEmpty()) {
                    ListIterator listIterator2 = list3.listIterator(list3.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            i3 = 1;
                            list4 = dF.vz(list3, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                i3 = 1;
                list4 = fcD.R;
                String str11 = (String) list4.get(i3);
                i = n3x.v(str9, (String) list4.get(0)) ? 2 : 0;
                if (n3x.v(str10, str11)) {
                    i++;
                }
            }
            if (bundle != null || z3 || i > -1) {
                jzp jzp2 = new jzp(this, bundle, dua.f2913c, z3, i);
                if (jzp == null || jzp2.compareTo(jzp) > 0) {
                    jzp = jzp2;
                }
            }
            matcher2 = null;
        }
        return jzp;
    }

    public final void R(duA dua) {
        Map C = C();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = C.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            aX4 ax4 = (aX4) entry.getValue();
            if (ax4.f908R || ax4.v) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            String str = (String) obj;
            ArrayList arrayList2 = dua.f2910R;
            Collection<pai> values = dua.f2911R.values();
            ArrayList arrayList3 = new ArrayList();
            for (pai pai : values) {
                s3.E(pai.f7101R, arrayList3);
            }
            if (!dF.cE(arrayList3, arrayList2).contains(str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f2987R.add(dua);
            return;
        }
        StringBuilder U = opT.U("Deep link ");
        U.append(dua.f2909R);
        U.append(" can't be used to open destination ");
        U.append(this);
        U.append(".\nFollowing required arguments are missing: ");
        U.append(arrayList);
        throw new IllegalArgumentException(U.toString().toString());
    }

    public final int[] c(e9E e9e) {
        il ilVar = new il();
        while (true) {
            f25 f25 = this.f2984R;
            if ((e9e != null ? e9e.f2984R : null) != null && e9e.f2984R.V(this.e, true) == this) {
                ilVar.addFirst(this);
                break;
            }
            if (f25 == null || f25.O != this.e) {
                ilVar.addFirst(this);
            }
            if (n3x.v(f25, e9e) || f25 == null) {
                break;
            }
            this = f25;
        }
        List<e9E> pG = dF.pG(ilVar);
        ArrayList arrayList = new ArrayList(a6.B(pG, 10));
        for (e9E e9e2 : pG) {
            arrayList.add(Integer.valueOf(e9e2.e));
        }
        return dF.mZ(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r10) {
        /*
        // Method dump skipped, instructions count: 399
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9E.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Set<String> keySet;
        int i = this.e * 31;
        String str = this.c;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = this.f2987R.iterator();
        while (it.hasNext()) {
            duA dua = (duA) it.next();
            int i2 = hashCode * 31;
            String str2 = dua.f2909R;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = dua.f2914v;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = dua.c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        o7s o7s = new o7s(0, this.R);
        while (o7s.hasNext()) {
            oKo oko = (oKo) o7s.next();
            int i3 = ((hashCode * 31) + oko.R) * 31;
            ixU ixu = oko.f6749R;
            hashCode = i3 + (ixu != null ? ixu.hashCode() : 0);
            Bundle bundle = oko.f6748R;
            if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
                for (String str5 : keySet) {
                    int i4 = hashCode * 31;
                    Object obj = oko.f6748R.get(str5);
                    hashCode = i4 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str6 : C().keySet()) {
            int O = opT.O(str6, hashCode * 31, 31);
            Object obj2 = C().get(str6);
            hashCode = O + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public void t(Context context, AttributeSet attributeSet) {
        Object obj;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, dgk.f2818L);
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.e = 0;
            this.v = null;
        } else if (!iH_.r(string)) {
            String x = aYa.x(string);
            this.e = x.hashCode();
            this.v = null;
            R(new duA(x, null, null));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        ArrayList arrayList = this.f2987R;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (n3x.v(((duA) obj).f2909R, aYa.x(this.c))) {
                break;
            }
        }
        gvP.X(arrayList);
        arrayList.remove(obj);
        this.c = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.e = resourceId;
            this.v = null;
            this.v = aYa.H(context, resourceId);
        }
        this.f2985R = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.v;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.e));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.c;
        if (!(str2 == null || iH_.r(str2))) {
            sb.append(" route=");
            sb.append(this.c);
        }
        if (this.f2985R != null) {
            sb.append(" label=");
            sb.append(this.f2985R);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle v(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 != 0) goto L_0x0016
            java.util.LinkedHashMap r2 = r7.f2988R
            if (r2 == 0) goto L_0x0011
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = r0
            goto L_0x0012
        L_0x0011:
            r2 = r1
        L_0x0012:
            if (r2 == 0) goto L_0x0016
            r7 = 0
            return r7
        L_0x0016:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.LinkedHashMap r3 = r7.f2988R
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0025:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            aX4 r4 = (defpackage.aX4) r4
            boolean r6 = r4.v
            if (r6 == 0) goto L_0x0025
            iB8 r6 = r4.R
            java.lang.Object r4 = r4.f907R
            r6.e(r2, r5, r4)
            goto L_0x0025
        L_0x0049:
            if (r8 == 0) goto L_0x00b0
            r2.putAll(r8)
            java.util.LinkedHashMap r7 = r7.f2988R
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0058:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b0
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r3 = r8.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r8 = r8.getValue()
            aX4 r8 = (defpackage.aX4) r8
            boolean r4 = r8.f908R
            if (r4 != 0) goto L_0x0081
            boolean r4 = r2.containsKey(r3)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r2.get(r3)
            if (r4 != 0) goto L_0x0081
            goto L_0x0088
        L_0x0081:
            iB8 r4 = r8.R     // Catch: ClassCastException -> 0x0088
            r4.R(r3, r2)     // Catch: ClassCastException -> 0x0088
            r4 = r1
            goto L_0x0089
        L_0x0088:
            r4 = r0
        L_0x0089:
            if (r4 == 0) goto L_0x008c
            goto L_0x0058
        L_0x008c:
            java.lang.String r7 = "Wrong argument type for '"
            java.lang.String r0 = "' in argument bundle. "
            java.lang.StringBuilder r7 = defpackage.jQ.i(r7, r3, r0)
            iB8 r8 = r8.R
            java.lang.String r8 = r8.v()
            r7.append(r8)
            java.lang.String r8 = " expected."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9E.v(android.os.Bundle):android.os.Bundle");
    }
}
