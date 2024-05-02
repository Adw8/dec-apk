package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: UW  reason: default package */
/* loaded from: classes.dex */
public abstract class UW {
    public Drawable R;

    /* renamed from: R  reason: collision with other field name */
    public final String f566R;
    public CharSequence c;

    /* renamed from: e  reason: collision with other field name */
    public CharSequence f568e;
    public CharSequence v;
    public int e = -1;

    /* renamed from: R  reason: collision with other field name */
    public CharSequence f565R = "";
    public int X = -1;
    public int O = -1;
    public int L = -1;
    public int Z = -1;

    /* renamed from: R  reason: collision with other field name */
    public boolean f567R = true;

    public UW(String str) {
        this.f566R = str;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (n3x.v(getClass(), obj.getClass()) && n3x.v(this.f566R, ((UW) obj).f566R)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f566R.hashCode();
    }
}
