package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: lG0  reason: default package */
/* loaded from: classes.dex */
public final class lG0 implements Serializable {
    public final Pattern R;

    public lG0(Pattern pattern) {
        this.R = pattern;
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.R.toString();
    }

    public lG0(String str) {
        this(Pattern.compile(str));
    }
}
