package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: gCW  reason: default package */
/* loaded from: classes.dex */
public abstract class gCW {

    /* renamed from: R  reason: collision with other field name */
    public static final Logger f3692R = Logger.getLogger(gCW.class.getName());
    public static final AtomicBoolean R = new AtomicBoolean(false);

    public static boolean R() {
        return R.get();
    }
}
