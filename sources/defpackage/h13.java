package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: h13  reason: default package */
/* loaded from: classes.dex */
public abstract class h13 {
    public static final Map R;

    /* renamed from: R  reason: collision with other field name */
    public static final h8A[] f4021R;

    static {
        h8A h8a = new h8A("", h8A.Z);
        F6 f6 = h8A.X;
        F6 f62 = h8A.O;
        F6 f63 = h8A.L;
        F6 f64 = h8A.e;
        f4021R = new h8A[]{h8a, new h8A("GET", f6), new h8A("POST", f6), new h8A("/", f62), new h8A("/index.html", f62), new h8A("http", f63), new h8A("https", f63), new h8A("200", f64), new h8A("204", f64), new h8A("206", f64), new h8A("304", f64), new h8A("400", f64), new h8A("404", f64), new h8A("500", f64), new h8A("accept-charset", ""), new h8A("accept-encoding", "gzip, deflate"), new h8A("accept-language", ""), new h8A("accept-ranges", ""), new h8A("accept", ""), new h8A("access-control-allow-origin", ""), new h8A("age", ""), new h8A("allow", ""), new h8A("authorization", ""), new h8A("cache-control", ""), new h8A("content-disposition", ""), new h8A("content-encoding", ""), new h8A("content-language", ""), new h8A("content-length", ""), new h8A("content-location", ""), new h8A("content-range", ""), new h8A("content-type", ""), new h8A("cookie", ""), new h8A("date", ""), new h8A("etag", ""), new h8A("expect", ""), new h8A("expires", ""), new h8A("from", ""), new h8A("host", ""), new h8A("if-match", ""), new h8A("if-modified-since", ""), new h8A("if-none-match", ""), new h8A("if-range", ""), new h8A("if-unmodified-since", ""), new h8A("last-modified", ""), new h8A("link", ""), new h8A("location", ""), new h8A("max-forwards", ""), new h8A("proxy-authenticate", ""), new h8A("proxy-authorization", ""), new h8A("range", ""), new h8A("referer", ""), new h8A("refresh", ""), new h8A("retry-after", ""), new h8A("server", ""), new h8A("set-cookie", ""), new h8A("strict-transport-security", ""), new h8A("transfer-encoding", ""), new h8A("user-agent", ""), new h8A("vary", ""), new h8A("via", ""), new h8A("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            h8A[] h8aArr = f4021R;
            if (!linkedHashMap.containsKey(h8aArr[i].f4088R)) {
                linkedHashMap.put(h8aArr[i].f4088R, Integer.valueOf(i));
            }
        }
        R = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void R(F6 f6) {
        int v = f6.v();
        for (int i = 0; i < v; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte X = f6.X(i);
            if (b <= X && X <= b2) {
                StringBuilder U = opT.U("PROTOCOL_ERROR response malformed: mixed case name: ");
                U.append(f6.m());
                throw new IOException(U.toString());
            }
        }
    }
}
