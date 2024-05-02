package defpackage;

/* renamed from: an2  reason: default package */
/* loaded from: classes.dex */
public abstract class an2 extends iH_ {
    public static final String cr(int i, String str) {
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        throw new IllegalArgumentException(opT.m("Requested character count ", i, " is less than zero.").toString());
    }
}
