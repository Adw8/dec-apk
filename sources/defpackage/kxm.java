package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: kxm  reason: default package */
/* loaded from: classes.dex */
public abstract class kxm {
    public static pby[] R = new pby[0];

    public static final String R(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        return '\n' + stringWriter2;
    }

    public static final void v(String str, int i, String str2, Throwable th) {
        for (pby pby : R) {
            pby.R(str, i, str2, th);
        }
    }
}
