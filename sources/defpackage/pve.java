package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: pve  reason: default package */
/* loaded from: classes.dex */
public final class pve {
    public Map R;

    public pve(int i) {
        if (i == 1) {
            this.R = new HashMap();
        } else if (i != 2) {
            this.R = new LinkedHashMap();
        } else {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            i2m[] values = i2m.values();
            for (i2m i2m : values) {
                for (oRt ort : oRt.values()) {
                    concurrentHashMap.put(new q6(i2m.getReason(), ort.getCategory()), new AtomicLong(0));
                }
            }
            this.R = Collections.unmodifiableMap(concurrentHashMap);
        }
    }

    public final aAx R(pcs pcs, oaS oas) {
        boolean z;
        long j;
        long j2;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap(pcs.f7127R.size());
        List list = pcs.f7127R;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            cWa cwa = (cWa) list.get(i2);
            acL acl = (acL) this.R.get(new k8q(cwa.f2114R));
            if (acl == null) {
                j2 = cwa.v;
                j = cwa.e;
                z = false;
            } else {
                j2 = acl.R;
                z = acl.f936R;
                j = ((AndroidComposeView) oas).i(acl.v);
            }
            long j3 = cwa.f2114R;
            linkedHashMap.put(new k8q(j3), new phU(j3, cwa.v, cwa.e, cwa.f2116R, cwa.R, j2, j, z, cwa.f2113R, cwa.f2115R, cwa.X));
            boolean z2 = cwa.f2116R;
            if (z2) {
                i = i2;
                this.R.put(new k8q(cwa.f2114R), new acL(cwa.v, cwa.c, z2));
            } else {
                i = i2;
                this.R.remove(new k8q(cwa.f2114R));
            }
            i2 = i + 1;
        }
        return new aAx(linkedHashMap, pcs);
    }

    public final void v(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                this.R.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.R.put(str, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        Map map = this.R;
                        boolean[] zArr = (boolean[]) value;
                        String str2 = g2m.f3658R;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        map.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        Map map2 = this.R;
                        byte[] bArr = (byte[]) value;
                        String str3 = g2m.f3658R;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        Map map3 = this.R;
                        int[] iArr = (int[]) value;
                        String str4 = g2m.f3658R;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        map3.put(str, numArr);
                    } else if (cls == long[].class) {
                        Map map4 = this.R;
                        long[] jArr = (long[]) value;
                        String str5 = g2m.f3658R;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        map4.put(str, lArr);
                    } else if (cls == float[].class) {
                        Map map5 = this.R;
                        float[] fArr = (float[]) value;
                        String str6 = g2m.f3658R;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        map5.put(str, fArr2);
                    } else if (cls == double[].class) {
                        Map map6 = this.R;
                        double[] dArr = (double[]) value;
                        String str7 = g2m.f3658R;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        map6.put(str, dArr2);
                    } else {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                }
            }
        }
    }
}
