package defpackage;

/* renamed from: ivW  reason: default package */
/* loaded from: classes.dex */
public final class ivW extends lo implements nWQ, cjB, hUt, nhg {
    public int O;
    private volatile /* synthetic */ Object _state;

    public ivW(Object obj) {
        this._state = obj;
    }

    public final void H(Object obj) {
        if (obj == null) {
            obj = aJV.f827R;
        }
        U(null, obj);
    }

    @Override // defpackage.lo
    public final rS L() {
        return new lyr();
    }

    @Override // defpackage.nhg, defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        H(obj);
        return o8s.R;
    }

    public final boolean U(Object obj, Object obj2) {
        int i;
        lmI lmi;
        synchronized (this) {
            Object obj3 = this._state;
            if (!(obj == null || n3x.v(obj3, obj))) {
                return false;
            }
            if (n3x.v(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.O;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.O = i3;
                rS[] rSVarArr = ((lo) this).f5834R;
                while (true) {
                    lyr[] lyrArr = (lyr[]) rSVarArr;
                    if (lyrArr != null) {
                        for (lyr lyr : lyrArr) {
                            if (lyr != null) {
                                while (true) {
                                    Object obj4 = lyr._state;
                                    if (obj4 != null && obj4 != (lmi = g4x.v)) {
                                        lmI lmi2 = g4x.f3669R;
                                        if (obj4 == lmi2) {
                                            if (lyr.R.compareAndSet(lyr, obj4, lmi)) {
                                                break;
                                            }
                                        } else if (lyr.R.compareAndSet(lyr, obj4, lmi2)) {
                                            ((xx) obj4).Y(o8s.R);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.O;
                        if (i == i3) {
                            this.O = i3 + 1;
                            return true;
                        }
                        rSVarArr = ((lo) this).f5834R;
                    }
                    i3 = i;
                }
            } else {
                this.O = i2 + 2;
                return true;
            }
        }
    }

    @Override // defpackage.cjB
    public final nWQ X(nbD nbd, int i, h9 h9Var) {
        return (((i >= 0 && i < 2) || i == -2) && h9Var == h9.DROP_OLDEST) ? this : ((i == 0 || i == -3) && h9Var == h9.SUSPEND) ? this : new a7(i, nbd, h9Var, this);
    }

    @Override // defpackage.lo
    public final rS[] Z() {
        return new lyr[2];
    }

    @Override // defpackage.nhg
    public final boolean c(Object obj) {
        H(obj);
        return true;
    }

    @Override // defpackage.nhg
    public final void e() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.hUt
    public final Object getValue() {
        lmI lmi = aJV.f827R;
        Object obj = this._state;
        if (obj == lmi) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x00be */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x0022 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:? */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [lyr] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v12, types: [lyr] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (defpackage.n3x.v(r13, r9) != false) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:14:0x0034, B:19:0x004b, B:26:0x0076, B:28:0x007a, B:31:0x0081, B:32:0x0085, B:36:0x008b, B:38:0x0091, B:42:0x0098, B:46:0x00ac, B:51:0x00c0, B:53:0x00de, B:54:0x00e3, B:57:0x00ea), top: B:64:0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c0 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:14:0x0034, B:19:0x004b, B:26:0x0076, B:28:0x007a, B:31:0x0081, B:32:0x0085, B:36:0x008b, B:38:0x0091, B:42:0x0098, B:46:0x00ac, B:51:0x00c0, B:53:0x00de, B:54:0x00e3, B:57:0x00ea), top: B:64:0x0022 }] */
    @Override // defpackage.nWQ
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(defpackage.h2V r14, defpackage.aOO r15) {
        /*
        // Method dump skipped, instructions count: 247
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ivW.v(h2V, aOO):java.lang.Object");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:4:0x0004 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: g1k */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x(Object obj, g1k g1k) {
        if (obj == null) {
            obj = aJV.f827R;
        }
        if (g1k == 0) {
            g1k = aJV.f827R;
        }
        return U(obj, g1k);
    }
}
