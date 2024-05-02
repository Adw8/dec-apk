package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ma1  reason: default package */
/* loaded from: classes.dex */
public final class ma1 implements kj3, Closeable {
    public static final TreeMap R = new TreeMap();

    /* renamed from: R  reason: collision with other field name */
    public volatile String f6072R;

    /* renamed from: R  reason: collision with other field name */
    public final double[] f6073R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f6074R;

    /* renamed from: R  reason: collision with other field name */
    public final long[] f6075R;

    /* renamed from: R  reason: collision with other field name */
    public final String[] f6076R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[][] f6077R;
    public int X;
    public final int e;

    public ma1(int i) {
        this.e = i;
        int i2 = i + 1;
        this.f6074R = new int[i2];
        this.f6075R = new long[i2];
        this.f6073R = new double[i2];
        this.f6076R = new String[i2];
        this.f6077R = new byte[i2];
    }

    public static ma1 R(int i, String str) {
        TreeMap treeMap = R;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                ma1 ma1 = (ma1) ceilingEntry.getValue();
                ma1.f6072R = str;
                ma1.X = i;
                return ma1;
            }
            ma1 ma12 = new ma1(i);
            ma12.f6072R = str;
            ma12.X = i;
            return ma12;
        }
    }

    public final void C() {
        TreeMap treeMap = R;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.e), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    size--;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                }
            }
        }
    }

    public final void H(int i, String str) {
        this.f6074R[i] = 4;
        this.f6076R[i] = str;
    }

    public final void O(long j, int i) {
        this.f6074R[i] = 2;
        this.f6075R[i] = j;
    }

    @Override // defpackage.kj3
    public final void X(jeV jev) {
        for (int i = 1; i <= this.X; i++) {
            int i2 = this.f6074R[i];
            if (i2 == 1) {
                jev.O(i);
            } else if (i2 == 2) {
                jev.X(this.f6075R[i], i);
            } else if (i2 == 3) {
                jev.c(this.f6073R[i], i);
            } else if (i2 == 4) {
                jev.Z(i, this.f6076R[i]);
            } else if (i2 == 5) {
                jev.R(i, this.f6077R[i]);
            }
        }
    }

    public final void Z(int i) {
        this.f6074R[i] = 1;
    }

    @Override // defpackage.kj3
    public final String c() {
        return this.f6072R;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
