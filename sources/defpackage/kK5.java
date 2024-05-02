package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: kK5  reason: default package */
/* loaded from: classes.dex */
public final class kK5 {

    /* renamed from: R  reason: collision with other field name */
    public final a7_ f5257R;

    /* renamed from: R  reason: collision with other field name */
    public final fmL f5258R = new fmL();

    /* renamed from: R  reason: collision with other field name */
    public h7U f5259R;

    /* renamed from: R  reason: collision with other field name */
    public hro f5260R;

    /* renamed from: R  reason: collision with other field name */
    public iM2 f5261R;

    /* renamed from: R  reason: collision with other field name */
    public final iRl f5262R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5263R;

    /* renamed from: R  reason: collision with other field name */
    public oFB f5264R;

    /* renamed from: R  reason: collision with other field name */
    public pls f5265R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5266R;
    public String v;

    /* renamed from: R  reason: collision with other field name */
    public static final char[] f5256R = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern R = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    public kK5(String str, a7_ a7_, String str2, bd4 bd4, oFB ofb, boolean z, boolean z2, boolean z3) {
        this.f5263R = str;
        this.f5257R = a7_;
        this.v = str2;
        this.f5264R = ofb;
        this.f5266R = z;
        if (bd4 != null) {
            this.f5262R = bd4.c();
        } else {
            this.f5262R = new iRl();
        }
        if (z2) {
            this.f5261R = new iM2();
        } else if (z3) {
            pls pls = new pls();
            this.f5265R = pls;
            oFB ofb2 = kxs.c;
            if (n3x.v(ofb2.v, "multipart")) {
                pls.f7223R = ofb2;
                return;
            }
            throw new IllegalArgumentException(("multipart != " + ofb2).toString());
        }
    }

    public final void R(String str, String str2, boolean z) {
        if (z) {
            iM2 im2 = this.f5261R;
            im2.R.add(ppN.Z(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, null, 83));
            im2.v.add(ppN.Z(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, null, 83));
            return;
        }
        iM2 im22 = this.f5261R;
        im22.R.add(ppN.Z(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, null, 91));
        im22.v.add(ppN.Z(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, null, 91));
    }

    public final void c(bd4 bd4, h7U h7u) {
        pls pls = this.f5265R;
        pls.getClass();
        String str = null;
        boolean z = true;
        if ((bd4 != null ? bd4.R("Content-Type") : null) == null) {
            if (bd4 != null) {
                str = bd4.R("Content-Length");
            }
            if (str != null) {
                z = false;
            }
            if (z) {
                pls.f7222R.add(new fJd(bd4, h7u));
                return;
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }

    public final void e(String str, String str2, boolean z) {
        hro hro;
        String str3 = this.v;
        String str4 = null;
        if (str3 != null) {
            a7_ a7_ = this.f5257R;
            a7_.getClass();
            try {
                hro = new hro();
                hro.X(a7_, str3);
            } catch (IllegalArgumentException unused) {
                hro = null;
            }
            this.f5260R = hro;
            if (hro != null) {
                this.v = null;
            } else {
                StringBuilder U = opT.U("Malformed URL. Base: ");
                U.append(this.f5257R);
                U.append(", Relative: ");
                U.append(this.v);
                throw new IllegalArgumentException(U.toString());
            }
        }
        if (z) {
            hro hro2 = this.f5260R;
            if (hro2.f4406v == null) {
                hro2.f4406v = new ArrayList();
            }
            hro2.f4406v.add(ppN.Z(str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211));
            ArrayList arrayList = hro2.f4406v;
            if (str2 != null) {
                str4 = ppN.Z(str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211);
            }
            arrayList.add(str4);
            return;
        }
        this.f5260R.R(str, str2);
    }

    public final void v(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f5264R = bRg.R(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(opT.H("Malformed content type: ", str2), e);
            }
        } else {
            iRl irl = this.f5262R;
            irl.getClass();
            dTl.n(str);
            dTl.Q(str2, str);
            dTl.o(irl, str, str2);
        }
    }
}
