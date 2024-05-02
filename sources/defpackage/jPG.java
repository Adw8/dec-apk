package defpackage;

import android.text.StaticLayout;

/* renamed from: jPG  reason: default package */
/* loaded from: classes.dex */
public final class jPG implements mk4 {
    @Override // defpackage.mk4
    public StaticLayout R(lNr lnr) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(lnr.f5687R, lnr.f5682R, lnr.f5690v, lnr.f5685R, lnr.c);
        obtain.setTextDirection(lnr.f5684R);
        obtain.setAlignment(lnr.f5683R);
        obtain.setMaxLines(lnr.e);
        obtain.setEllipsize(lnr.f5686R);
        obtain.setEllipsizedWidth(lnr.X);
        obtain.setLineSpacing(lnr.v, lnr.R);
        obtain.setIncludePad(lnr.f5688R);
        obtain.setBreakStrategy(lnr.L);
        obtain.setHyphenationFrequency(lnr.x);
        obtain.setIndents(lnr.f5689R, lnr.f5692v);
        d1Y.R(obtain, lnr.O);
        o7a.R(obtain, lnr.f5691v);
        lgJ.v(obtain, lnr.Z, lnr.m);
        return obtain.build();
    }
}
