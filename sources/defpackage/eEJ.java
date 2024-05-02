package defpackage;

import java.nio.charset.Charset;

/* renamed from: eEJ  reason: default package */
/* loaded from: classes.dex */
public final class eEJ {
    public static final oVM R = new oVM();

    /* renamed from: R  reason: collision with other field name */
    public final gBU f3039R;

    public eEJ() {
        gBU gbu;
        gBU[] gbuArr = new gBU[2];
        gbuArr[0] = ikX.R;
        try {
            gbu = (gBU) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            gbu = R;
        }
        gbuArr[1] = gbu;
        cqt cqt = new cqt(gbuArr);
        Charset charset = ibk.R;
        this.f3039R = cqt;
    }
}
