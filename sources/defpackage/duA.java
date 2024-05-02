package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: duA  reason: default package */
/* loaded from: classes.dex */
public final class duA {
    public static final Pattern R = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: R  reason: collision with other field name */
    public final String f2909R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2912R;
    public String X;
    public final String c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f2913c;
    public String e;

    /* renamed from: v  reason: collision with other field name */
    public final String f2914v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2915v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f2910R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f2911R = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public final bV5 f2908R = new bV5(new jJW(this, 1));
    public final bV5 v = new bV5(new jJW(this, 0));

    public duA(String str, String str2, String str3) {
        List list;
        int i;
        List list2;
        boolean z;
        this.f2909R = str;
        this.f2914v = str2;
        this.c = str3;
        boolean z2 = true;
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.f2912R = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!R.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f2912R) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    this.f2913c = R(str.substring(0, matcher.start()), sb, compile);
                }
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    if (queryParameter == null) {
                        this.f2915v = z2;
                        queryParameter = str4;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    pai pai = new pai();
                    int i2 = 0;
                    while (matcher2.find()) {
                        int i3 = z2 ? 1 : 0;
                        int i4 = z2 ? 1 : 0;
                        int i5 = z2 ? 1 : 0;
                        int i6 = z2 ? 1 : 0;
                        String group = matcher2.group(i3);
                        if (group != null) {
                            pai.f7101R.add(group);
                            sb2.append(Pattern.quote(queryParameter.substring(i2, matcher2.start())));
                            sb2.append("(.+?)?");
                            i2 = matcher2.end();
                            z2 = true;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i2 < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i2)));
                    }
                    pai.R = iH_.a(sb2.toString(), ".*", "\\E.*\\Q");
                    this.f2911R.put(str4, pai);
                    z2 = true;
                }
            } else {
                this.f2913c = R(str, sb, compile);
            }
            this.e = iH_.a(sb.toString(), ".*", "\\E.*\\Q");
        }
        if (this.c == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.c).matches()) {
            String str5 = this.c;
            Pattern compile2 = Pattern.compile("/");
            iH_.F(0);
            Matcher matcher3 = compile2.matcher(str5);
            if (!matcher3.find()) {
                list = Collections.singletonList(str5.toString());
            } else {
                ArrayList arrayList = new ArrayList(10);
                int i7 = 0;
                do {
                    arrayList.add(str5.subSequence(i7, matcher3.start()).toString());
                    i7 = matcher3.end();
                } while (matcher3.find());
                arrayList.add(str5.subSequence(i7, str5.length()).toString());
                list = arrayList;
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        i = 1;
                        list2 = dF.vz(list, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            i = 1;
            list2 = fcD.R;
            this.X = iH_.a("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(i)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
            return;
        }
        throw new IllegalArgumentException(jQ.g(opT.U("The given mimeType "), this.c, " does not match to required \"type/subtype\" format").toString());
    }

    public final boolean R(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !iH_.I(str, ".*");
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f2910R.add(group);
                sb.append(Pattern.quote(str.substring(i, matcher.start())));
                sb.append("([^/]+?)");
                i = matcher.end();
                z = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof duA)) {
            return false;
        }
        duA dua = (duA) obj;
        return n3x.v(this.f2909R, dua.f2909R) && n3x.v(this.f2914v, dua.f2914v) && n3x.v(this.c, dua.c);
    }

    public final int hashCode() {
        String str = this.f2909R;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f2914v;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }
}
