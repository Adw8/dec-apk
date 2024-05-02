package defpackage;

import java.util.LinkedHashMap;

/* renamed from: C7  reason: default package */
/* loaded from: classes.dex */
public final class C7 {
    public static final C7 C;
    public static final C7 H;
    public static final C7 L;
    public static final C7 N;
    public static final C7 O;
    public static final C7 P;
    public static final C7 R;

    /* renamed from: R  reason: collision with other field name */
    public static final gvk f49R = new gvk(13);

    /* renamed from: R  reason: collision with other field name */
    public static final LinkedHashMap f50R = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public static final ppN f51R;
    public static final C7 U;
    public static final C7 X;
    public static final C7 Z;
    public static final C7 c;
    public static final C7 e;
    public static final C7 j;
    public static final C7 m;
    public static final C7 v;
    public static final C7 x;

    /* renamed from: R  reason: collision with other field name */
    public final String f52R;

    static {
        ppN ppn = new ppN();
        f51R = ppn;
        ppN.L(ppn, "SSL_RSA_WITH_NULL_MD5");
        ppN.L(ppn, "SSL_RSA_WITH_NULL_SHA");
        ppN.L(ppn, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        ppN.L(ppn, "SSL_RSA_WITH_RC4_128_MD5");
        ppN.L(ppn, "SSL_RSA_WITH_RC4_128_SHA");
        ppN.L(ppn, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        ppN.L(ppn, "SSL_RSA_WITH_DES_CBC_SHA");
        R = ppN.L(ppn, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        ppN.L(ppn, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        ppN.L(ppn, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        ppN.L(ppn, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        ppN.L(ppn, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        ppN.L(ppn, "SSL_DH_anon_WITH_RC4_128_MD5");
        ppN.L(ppn, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        ppN.L(ppn, "SSL_DH_anon_WITH_DES_CBC_SHA");
        ppN.L(ppn, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "TLS_KRB5_WITH_DES_CBC_SHA");
        ppN.L(ppn, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "TLS_KRB5_WITH_RC4_128_SHA");
        ppN.L(ppn, "TLS_KRB5_WITH_DES_CBC_MD5");
        ppN.L(ppn, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        ppN.L(ppn, "TLS_KRB5_WITH_RC4_128_MD5");
        ppN.L(ppn, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        ppN.L(ppn, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        ppN.L(ppn, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        ppN.L(ppn, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        v = ppN.L(ppn, "TLS_RSA_WITH_AES_128_CBC_SHA");
        ppN.L(ppn, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        ppN.L(ppn, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        ppN.L(ppn, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        c = ppN.L(ppn, "TLS_RSA_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_RSA_WITH_NULL_SHA256");
        ppN.L(ppn, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        ppN.L(ppn, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        ppN.L(ppn, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        ppN.L(ppn, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        ppN.L(ppn, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        ppN.L(ppn, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        ppN.L(ppn, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        ppN.L(ppn, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        ppN.L(ppn, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        ppN.L(ppn, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        ppN.L(ppn, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        ppN.L(ppn, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        ppN.L(ppn, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        ppN.L(ppn, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        ppN.L(ppn, "TLS_PSK_WITH_RC4_128_SHA");
        ppN.L(ppn, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "TLS_PSK_WITH_AES_128_CBC_SHA");
        ppN.L(ppn, "TLS_PSK_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_RSA_WITH_SEED_CBC_SHA");
        e = ppN.L(ppn, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        X = ppN.L(ppn, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        ppN.L(ppn, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        ppN.L(ppn, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        ppN.L(ppn, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        ppN.L(ppn, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        ppN.L(ppn, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        ppN.L(ppn, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        ppN.L(ppn, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        ppN.L(ppn, "TLS_FALLBACK_SCSV");
        ppN.L(ppn, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        ppN.L(ppn, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        ppN.L(ppn, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        ppN.L(ppn, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_ECDH_RSA_WITH_NULL_SHA");
        ppN.L(ppn, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        ppN.L(ppn, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        ppN.L(ppn, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        ppN.L(ppn, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        ppN.L(ppn, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        O = ppN.L(ppn, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        L = ppN.L(ppn, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_ECDH_anon_WITH_NULL_SHA");
        ppN.L(ppn, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        ppN.L(ppn, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        ppN.L(ppn, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        ppN.L(ppn, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        ppN.L(ppn, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        ppN.L(ppn, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        ppN.L(ppn, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        ppN.L(ppn, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        ppN.L(ppn, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        ppN.L(ppn, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        Z = ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        m = ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        ppN.L(ppn, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        ppN.L(ppn, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        x = ppN.L(ppn, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        H = ppN.L(ppn, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        ppN.L(ppn, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        ppN.L(ppn, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        ppN.L(ppn, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        ppN.L(ppn, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        U = ppN.L(ppn, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        C = ppN.L(ppn, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        ppN.L(ppn, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        ppN.L(ppn, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        N = ppN.L(ppn, "TLS_AES_128_GCM_SHA256");
        P = ppN.L(ppn, "TLS_AES_256_GCM_SHA384");
        j = ppN.L(ppn, "TLS_CHACHA20_POLY1305_SHA256");
        ppN.L(ppn, "TLS_AES_128_CCM_SHA256");
        ppN.L(ppn, "TLS_AES_128_CCM_8_SHA256");
    }

    public C7(String str) {
        this.f52R = str;
    }

    public final String toString() {
        return this.f52R;
    }
}
