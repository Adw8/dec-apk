package defpackage;

import java.io.IOException;

/* renamed from: eOg  reason: default package */
/* loaded from: classes.dex */
public final class eOg extends k8G implements f_c {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3077R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eOg(int i, Object obj, Object obj2, boolean z) {
        super(0);
        this.X = i;
        this.R = obj;
        this.v = obj2;
        this.f3077R = z;
    }

    public final void R() {
        int i;
        long R;
        int i2;
        dj8[] dj8Arr;
        switch (this.X) {
            case 1:
                if (this.f3077R) {
                    ((bhK) this.R).f1769R.v((String) this.v);
                    return;
                }
                return;
            case 2:
                ((ebT) this.R).e((j5B) this.v);
                return;
            default:
                boolean z = this.f3077R;
                oWQ owq = (oWQ) this.v;
                nWW nww = new nWW();
                jr5 jr5 = ((oSI) this.R).f6829R;
                synchronized (jr5.f5032R) {
                    synchronized (jr5) {
                        oWQ owq2 = jr5.f5048v;
                        if (!z) {
                            oWQ owq3 = new oWQ();
                            int i3 = 0;
                            while (true) {
                                boolean z2 = true;
                                if (i3 < 10) {
                                    if (((1 << i3) & owq2.R) == 0) {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        owq3.v(i3, owq2.f6840R[i3]);
                                    }
                                    i3++;
                                } else {
                                    for (int i4 = 0; i4 < 10; i4++) {
                                        if (((1 << i4) & owq.R) != 0) {
                                            owq3.v(i4, owq.f6840R[i4]);
                                        }
                                    }
                                    owq = owq3;
                                }
                            }
                        }
                        nww.R = owq;
                        R = ((long) owq.R()) - ((long) owq2.R());
                        i2 = (R > 0 ? 1 : (R == 0 ? 0 : -1));
                        if (i2 != 0 && !jr5.f5037R.isEmpty()) {
                            Object[] array = jr5.f5037R.values().toArray(new dj8[0]);
                            if (array != null) {
                                dj8Arr = (dj8[]) array;
                                jr5.f5048v = (oWQ) nww.R;
                                hiT.c(jr5.f5044c, jr5.f5035R + " onSettings", new _c(jr5, 27, nww));
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                        }
                        dj8Arr = null;
                        jr5.f5048v = (oWQ) nww.R;
                        hiT.c(jr5.f5044c, jr5.f5035R + " onSettings", new _c(jr5, 27, nww));
                    }
                    try {
                        jr5.f5032R.R((oWQ) nww.R);
                    } catch (IOException e) {
                        jr5.c(e);
                    }
                }
                if (dj8Arr != null) {
                    for (dj8 dj8 : dj8Arr) {
                        synchronized (dj8) {
                            dj8.e += R;
                            if (i2 > 0) {
                                dj8.notifyAll();
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                dTl.P((kY5) this.R, (jzQ) this.v, !this.f3077R);
                return Boolean.TRUE;
            case 1:
                R();
                return o8s.R;
            case 2:
                R();
                return o8s.R;
            default:
                R();
                return o8s.R;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eOg(oSI osi, oWQ owq) {
        super(0);
        this.X = 3;
        this.R = osi;
        this.f3077R = false;
        this.v = owq;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eOg(boolean z, bhK bhk, String str) {
        super(0);
        this.X = 1;
        this.f3077R = z;
        this.R = bhk;
        this.v = str;
    }
}
