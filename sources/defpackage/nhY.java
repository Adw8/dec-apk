package defpackage;

import java.util.HashSet;

/* renamed from: nhY  reason: default package */
/* loaded from: classes.dex */
public final class nhY {
    public static final HashSet R;

    /* renamed from: R  reason: collision with other field name */
    public cPk f6512R = new cPk(new kgV(21));

    /* renamed from: R  reason: collision with other field name */
    public final String f6513R = "SHA256withRSA";

    /* renamed from: R  reason: collision with other field name */
    public wa f6514R;

    static {
        HashSet hashSet = new HashSet();
        R = hashSet;
        hashSet.add("DILITHIUM");
        hashSet.add("SPHINCS+");
        hashSet.add("SPHINCSPlus");
    }
}
