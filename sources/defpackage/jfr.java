package defpackage;

import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: jfr  reason: default package */
/* loaded from: classes.dex */
public final class jfr {
    public static final String R;

    /* renamed from: R  reason: collision with other field name */
    public static final byte[] f4997R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4998R;

    /* renamed from: R  reason: collision with other field name */
    public final nAJ f4999R;

    static {
        String uuid = UUID.randomUUID().toString();
        R = uuid;
        f4997R = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", uuid).getBytes(StandardCharsets.UTF_8);
    }

    public jfr(ArrayList arrayList, nAJ naj) {
        this.f4998R = arrayList;
        this.f4999R = naj;
    }

    public final void R(chG chg, bEu beu, bEu beu2) {
        Future submit = gQ7.R.submit(new hW8(beu, this.f4999R.f6334R, 1));
        Future submit2 = gQ7.R.submit(new hW8(beu2, this.f4999R.f6335v, 0));
        for (cAh cah : this.f4998R) {
            for (String str : cah.R) {
                chg.write(str.getBytes(StandardCharsets.UTF_8));
                chg.write(10);
            }
        }
        chg.write(f4997R);
        chg.flush();
        try {
            nAJ naj = this.f4999R;
            ((Integer) submit.get()).intValue();
            naj.getClass();
            submit2.get();
        } catch (InterruptedException | ExecutionException e) {
            throw ((InterruptedIOException) new InterruptedIOException().initCause(e));
        }
    }
}
