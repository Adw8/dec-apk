package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: fd9  reason: default package */
/* loaded from: classes.dex */
public final class fd9 {
    public boolean R;

    /* renamed from: R  reason: collision with other field name */
    public String[] f3472R;
    public boolean v;

    /* renamed from: v  reason: collision with other field name */
    public String[] f3473v;

    public fd9() {
        this.R = true;
    }

    public final void O(String... strArr) {
        if (this.R) {
            if (!(strArr.length == 0)) {
                this.f3473v = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public final mMB R() {
        return new mMB(this.R, this.v, this.f3472R, this.f3473v);
    }

    public final void X(bcS... bcsArr) {
        if (this.R) {
            ArrayList arrayList = new ArrayList(bcsArr.length);
            for (bcS bcs : bcsArr) {
                arrayList.add(bcs.f1759R);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                O((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public final void c(String... strArr) {
        if (this.R) {
            if (!(strArr.length == 0)) {
                this.f3472R = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public final void e() {
        if (this.R) {
            this.v = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public final void v(C7... c7Arr) {
        if (this.R) {
            ArrayList arrayList = new ArrayList(c7Arr.length);
            for (C7 c7 : c7Arr) {
                arrayList.add(c7.f52R);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                c((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public fd9(mMB mmb) {
        this.R = mmb.f6009R;
        this.f3472R = mmb.f6010R;
        this.f3473v = mmb.f6012v;
        this.v = mmb.f6011v;
    }
}
