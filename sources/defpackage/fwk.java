package defpackage;

import java.util.HashSet;

/* renamed from: fwk  reason: default package */
/* loaded from: classes.dex */
public abstract class fwk {
    public static final HashSet R;

    /* renamed from: R  reason: collision with other field name */
    public static boolean f3631R;
    public static final HashSet v;

    /* renamed from: v  reason: collision with other field name */
    public static boolean f3632v;

    static {
        String[] strArr = {afN.R(-9741012685708L), afN.R(-9929991246732L)};
        HashSet hashSet = new HashSet(jjU.y(2));
        for (int i = 0; i < 2; i++) {
            hashSet.add(strArr[i]);
        }
        R = hashSet;
        String[] strArr2 = {afN.R(-10110379873164L), afN.R(-10269293663116L), afN.R(-10449682289548L)};
        HashSet hashSet2 = new HashSet(jjU.y(3));
        for (int i2 = 0; i2 < 3; i2++) {
            hashSet2.add(strArr2[i2]);
        }
        v = hashSet2;
    }
}
