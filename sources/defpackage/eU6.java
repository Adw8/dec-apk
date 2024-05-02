package defpackage;

import java.util.HashMap;

/* renamed from: eU6  reason: default package */
/* loaded from: classes.dex */
public abstract class eU6 {
    public static final HashMap R;
    public static final HashMap v;

    static {
        HashMap hashMap = new HashMap();
        R = hashMap;
        HashMap hashMap2 = new HashMap();
        v = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
    }
}
