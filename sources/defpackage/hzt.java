package defpackage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hzt  reason: default package */
/* loaded from: classes.dex */
public abstract class hzt implements Callable {
    public final InputStream R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4433R;

    public hzt(bEu beu, List list) {
        this.R = beu;
        this.f4433R = list;
    }

    public final String R(boolean z) {
        boolean z2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.R, StandardCharsets.UTF_8));
        do {
            String readLine = bufferedReader.readLine();
            z2 = false;
            if (readLine != null) {
                int length = readLine.length();
                int i = length - 36;
                boolean startsWith = readLine.startsWith(jfr.R, i);
                if (startsWith) {
                    if (length == 36) {
                        continue;
                    } else {
                        readLine = readLine.substring(0, i);
                    }
                }
                List list = this.f4433R;
                if (list != null) {
                    list.add(readLine);
                }
                z2 = !startsWith;
                continue;
            }
        } while (z2);
        if (z) {
            return bufferedReader.readLine();
        }
        return null;
    }
}
