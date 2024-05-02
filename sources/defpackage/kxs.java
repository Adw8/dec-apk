package defpackage;

import java.util.List;

/* renamed from: kxs  reason: default package */
/* loaded from: classes.dex */
public final class kxs extends h7U {

    /* renamed from: c  reason: collision with other field name */
    public static final byte[] f5526c;

    /* renamed from: R  reason: collision with other field name */
    public long f5528R = -1;

    /* renamed from: R  reason: collision with other field name */
    public final F6 f5529R;

    /* renamed from: R  reason: collision with other field name */
    public final List f5530R;

    /* renamed from: R  reason: collision with other field name */
    public final oFB f5531R;
    public static final oFB v = bRg.R("multipart/mixed");
    public static final oFB c = bRg.R("multipart/form-data");
    public static final byte[] R = {(byte) 58, (byte) 32};

    /* renamed from: v  reason: collision with other field name */
    public static final byte[] f5527v = {(byte) 13, (byte) 10};

    static {
        bRg.R("multipart/alternative");
        bRg.R("multipart/digest");
        bRg.R("multipart/parallel");
        byte b = (byte) 45;
        f5526c = new byte[]{b, b};
    }

    public kxs(F6 f6, oFB ofb, List list) {
        this.f5529R = f6;
        this.f5530R = list;
        this.f5531R = bRg.R(ofb + "; boundary=" + f6.m());
    }

    @Override // defpackage.h7U
    public final long R() {
        long j = this.f5528R;
        if (j != -1) {
            return j;
        }
        long e = e(null, true);
        this.f5528R = e;
        return e;
    }

    @Override // defpackage.h7U
    public final void c(NV nv) {
        e(nv, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: ME */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: ME */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: ME */
    /* JADX WARN: Multi-variable type inference failed */
    public final long e(NV nv, boolean z) {
        ME me;
        if (z) {
            nv = new ME();
            me = nv;
        } else {
            me = 0;
        }
        int size = this.f5530R.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            fJd fjd = (fJd) this.f5530R.get(i);
            bd4 bd4 = fjd.R;
            h7U h7u = fjd.f3379R;
            nv.i(f5526c);
            nv.y(this.f5529R);
            nv.i(f5527v);
            if (bd4 != null) {
                int length = bd4.R.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    nv.w(bd4.v(i2)).i(R).w(bd4.H(i2)).i(f5527v);
                }
            }
            oFB v2 = h7u.v();
            if (v2 != null) {
                nv.w("Content-Type: ").w(v2.R).i(f5527v);
            }
            long R2 = h7u.R();
            if (R2 != -1 || !z) {
                byte[] bArr = f5527v;
                nv.i(bArr);
                if (z) {
                    j += R2;
                } else {
                    h7u.c(nv);
                }
                nv.i(bArr);
            } else {
                me.X();
                return -1;
            }
        }
        byte[] bArr2 = f5526c;
        nv.i(bArr2);
        nv.y(this.f5529R);
        nv.i(bArr2);
        nv.i(f5527v);
        if (!z) {
            return j;
        }
        long j2 = j + me.R;
        me.X();
        return j2;
    }

    @Override // defpackage.h7U
    public final oFB v() {
        return this.f5531R;
    }
}
