package defpackage;

/* renamed from: _m  reason: default package */
/* loaded from: classes.dex */
public final class _m extends aFk implements lR3 {
    public int O;
    public /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ _m(int i, aOO aoo) {
        super(3, aoo);
        this.X = i;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        boolean z = true;
        switch (this.X) {
            case 0:
                bGR bgr = bGR.COROUTINE_SUSPENDED;
                int i = this.O;
                if (i == 0) {
                    jjU.o(obj);
                    nWQ nwq = (nWQ) this.v;
                    this.O = 1;
                    Object v = nwq.v((h2V) this.R, this);
                    if (v != bgr) {
                        v = o8s.R;
                    }
                    if (v == bgr) {
                        return bgr;
                    }
                } else if (i == 1) {
                    jjU.o(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return o8s.R;
            case 1:
                if (this.O == 0) {
                    jjU.o(obj);
                    return new kSh((Integer) this.R, (Integer) this.v);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            case 2:
                if (this.O == 0) {
                    jjU.o(obj);
                    kSh ksh = (kSh) this.R;
                    return new hGF((Integer) ksh.R, (Integer) ksh.v, (i3D) this.v);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            default:
                if (this.O == 0) {
                    jjU.o(obj);
                    hGF hgf = (hGF) this.R;
                    Integer num = (Integer) hgf.R;
                    Integer num2 = (Integer) hgf.v;
                    i3D i3d = (i3D) hgf.c;
                    cY cYVar = (cY) ((oMu) this.v).R;
                    boolean z2 = num != null;
                    if (num2 == null) {
                        z = false;
                    }
                    return new kgF(z2, z, cYVar, i3d);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                _m _mVar = new _m(0, (aOO) obj3);
                _mVar.R = (h2V) obj;
                _mVar.v = obj2;
                return _mVar.O(o8s.R);
            case 1:
                _m _mVar2 = new _m(1, (aOO) obj3);
                _mVar2.R = (Integer) obj;
                _mVar2.v = (Integer) obj2;
                return _mVar2.O(o8s.R);
            case 2:
                _m _mVar3 = new _m(2, (aOO) obj3);
                _mVar3.R = (kSh) obj;
                _mVar3.v = (i3D) obj2;
                return _mVar3.O(o8s.R);
            default:
                _m _mVar4 = new _m(3, (aOO) obj3);
                _mVar4.R = (hGF) obj;
                _mVar4.v = (oMu) obj2;
                return _mVar4.O(o8s.R);
        }
    }
}
