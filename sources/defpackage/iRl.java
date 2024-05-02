package defpackage;

import java.util.ArrayList;

/* renamed from: iRl  reason: default package */
/* loaded from: classes.dex */
public final class iRl implements us {
    public final ArrayList R;

    public /* synthetic */ iRl() {
        this.R = new ArrayList(20);
    }

    @Override // defpackage.us
    public lDA R(int i) {
        return (ab1) this.R.get(i);
    }

    public void c(String str) {
        int i = 0;
        while (i < this.R.size()) {
            if (iH_.Q(str, (String) this.R.get(i))) {
                this.R.remove(i);
                this.R.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public void e(String str, String str2) {
        dTl.n(str);
        dTl.Q(str2, str);
        c(str);
        dTl.o(this, str, str2);
    }

    public bd4 v() {
        Object[] array = this.R.toArray(new String[0]);
        if (array != null) {
            return new bd4((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public /* synthetic */ iRl(float f, float f2, Pc pc) {
        heu V = caw.V(0, pc.v());
        ArrayList arrayList = new ArrayList(a6.B(V, 10));
        jrc R = V.iterator();
        while (R.R) {
            arrayList.add(new ab1(f, f2, pc.R(R.nextInt())));
        }
        this.R = arrayList;
    }
}
