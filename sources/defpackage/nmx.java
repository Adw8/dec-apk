package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: nmx  reason: default package */
/* loaded from: classes.dex */
public final class nmx {
    public static final Class[] R = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: R  reason: collision with other field name */
    public final bix f6584R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f6585R;
    public final LinkedHashMap c;
    public final LinkedHashMap e;
    public final LinkedHashMap v;

    public nmx(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6585R = linkedHashMap;
        this.v = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f6584R = new bix(this, 0);
        linkedHashMap.putAll(hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle R(defpackage.nmx r9) {
        /*
            java.util.LinkedHashMap r0 = r9.v
            java.util.Map r0 = defpackage.mHQ.h(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r1 = r1.getValue()
            kod r1 = (defpackage.kod) r1
            android.os.Bundle r1 = r1.R()
            if (r1 != 0) goto L_0x002f
            goto L_0x003e
        L_0x002f:
            java.lang.Class[] r5 = defpackage.nmx.R
            r6 = 29
            r7 = r2
        L_0x0034:
            if (r7 >= r6) goto L_0x0043
            r8 = r5[r7]
            boolean r8 = r8.isInstance(r1)
            if (r8 == 0) goto L_0x0040
        L_0x003e:
            r2 = r3
            goto L_0x0043
        L_0x0040:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0043:
            if (r2 == 0) goto L_0x006d
            java.util.LinkedHashMap r2 = r9.c
            java.lang.Object r2 = r2.get(r4)
            boolean r3 = r2 instanceof androidx.lifecycle.Y
            if (r3 == 0) goto L_0x0052
            androidx.lifecycle.Y r2 = (androidx.lifecycle.Y) r2
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            if (r2 == 0) goto L_0x0059
            r2.X(r1)
            goto L_0x005e
        L_0x0059:
            java.util.LinkedHashMap r2 = r9.f6585R
            r2.put(r4, r1)
        L_0x005e:
            java.util.LinkedHashMap r2 = r9.e
            java.lang.Object r2 = r2.get(r4)
            ivW r2 = (defpackage.ivW) r2
            if (r2 != 0) goto L_0x0069
            goto L_0x000e
        L_0x0069:
            r2.H(r1)
            goto L_0x000e
        L_0x006d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Can't put value with type "
            java.lang.StringBuilder r0 = defpackage.opT.U(r0)
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " into saved state"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0089:
            java.util.LinkedHashMap r0 = r9.f6585R
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r0.size()
            r1.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r1.size()
            r4.<init>(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x00a5:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x00be
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            r1.add(r5)
            java.util.LinkedHashMap r6 = r9.f6585R
            java.lang.Object r5 = r6.get(r5)
            r4.add(r5)
            goto L_0x00a5
        L_0x00be:
            r9 = 2
            kSh[] r9 = new defpackage.kSh[r9]
            kSh r0 = new kSh
            java.lang.String r5 = "keys"
            r0.<init>(r5, r1)
            r9[r2] = r0
            kSh r0 = new kSh
            java.lang.String r1 = "values"
            r0.<init>(r1, r4)
            r9[r3] = r0
            android.os.Bundle r9 = defpackage.hDC.X(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmx.R(nmx):android.os.Bundle");
    }

    public nmx() {
        this.f6585R = new LinkedHashMap();
        this.v = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f6584R = new bix(this, 1);
    }
}
