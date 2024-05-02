package defpackage;

import java.util.Iterator;

/* renamed from: aHy  reason: default package */
/* loaded from: classes.dex */
public final class aHy extends mGS {
    public final /* synthetic */ int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f821R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aHy(l_c l_c, String str) {
        super(str, true);
        this.f821R = l_c;
    }

    @Override // defpackage.mGS
    public final long R() {
        switch (this.R) {
            case 0:
                ((f_c) this.f821R).g();
                return -1;
            case 1:
                return ((Number) ((f_c) this.f821R).g()).longValue();
            default:
                l_c l_c = (l_c) this.f821R;
                long nanoTime = System.nanoTime();
                Iterator it = l_c.f5783R.iterator();
                int i = 0;
                ot7 ot7 = null;
                long j = Long.MIN_VALUE;
                int i2 = 0;
                while (it.hasNext()) {
                    ot7 ot72 = (ot7) it.next();
                    synchronized (ot72) {
                        if (l_c.R(ot72, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - ot72.f6996R;
                            if (j2 > j) {
                                ot7 = ot72;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = l_c.f5780R;
                if (j >= j3 || i > l_c.R) {
                    synchronized (ot7) {
                        if (!(!ot7.f7002R.isEmpty())) {
                            if (ot7.f6996R + j == nanoTime) {
                                ot7.f7006R = true;
                                l_c.f5783R.remove(ot7);
                                khE.v(ot7.f7007v);
                                if (l_c.f5783R.isEmpty()) {
                                    l_c.f5782R.R();
                                }
                            }
                        }
                    }
                    return 0;
                } else if (i > 0) {
                    return j3 - j;
                } else {
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1;
                }
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aHy(String str, ejV ejv) {
        super(str, true);
        this.f821R = ejv;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aHy(String str, boolean z, f_c f_c) {
        super(str, z);
        this.f821R = f_c;
    }
}
