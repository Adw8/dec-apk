package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Gz  reason: default package */
/* loaded from: classes.dex */
public abstract class Gz {
    public static final ArrayList R;

    /* renamed from: R  reason: collision with other field name */
    public static final List f164R;

    static {
        List Y = pdD.Y("android.permission.MANAGE_VIRTUAL_MACHINE", "android.permission.USE_CUSTOM_VIRTUAL_MACHINE", "android.permission.WRITE_SECURE_SETTINGS");
        f164R = Y;
        ArrayList arrayList = new ArrayList(a6.B(Y, 10));
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            arrayList.add("pm grant dev.kdrag0n.virtcontainer " + ((String) it.next()));
        }
        R = arrayList;
    }
}
