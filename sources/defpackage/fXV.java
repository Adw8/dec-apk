package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

/* renamed from: fXV  reason: default package */
/* loaded from: classes.dex */
public final class fXV extends t implements J {
    public O R;

    public fXV(O o) {
        if ((o instanceof CQ) || (o instanceof s)) {
            this.R = o;
            return;
        }
        throw new IllegalArgumentException("unknown object passed to Time");
    }

    public fXV(Date date, Locale locale) {
        SimpleTimeZone simpleTimeZone = new SimpleTimeZone(0, "Z");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", locale);
        simpleDateFormat.setTimeZone(simpleTimeZone);
        String str = simpleDateFormat.format(date) + "Z";
        int parseInt = Integer.parseInt(str.substring(0, 4));
        this.R = (parseInt < 1950 || parseInt > 2049) ? new fI8(str) : new lgm(str.substring(2));
    }

    public static fXV o(b bVar) {
        if (bVar == null || (bVar instanceof fXV)) {
            return (fXV) bVar;
        }
        if (bVar instanceof CQ) {
            return new fXV((CQ) bVar);
        }
        if (bVar instanceof s) {
            return new fXV((s) bVar);
        }
        StringBuilder U = opT.U("unknown object in factory: ");
        U.append(bVar.getClass().getName());
        throw new IllegalArgumentException(U.toString());
    }

    public final String toString() {
        String str;
        StringBuilder sb;
        O o = this.R;
        if (!(o instanceof CQ)) {
            return ((s) o).S();
        }
        String n = ((CQ) o).n();
        if (n.charAt(0) < '5') {
            sb = new StringBuilder();
            str = "20";
        } else {
            sb = new StringBuilder();
            str = "19";
        }
        return jQ.g(sb, str, n);
    }

    @Override // defpackage.t, defpackage.b
    public final O v() {
        return this.R;
    }
}
