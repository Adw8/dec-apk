package defpackage;

/* renamed from: Gl  reason: default package */
/* loaded from: classes.dex */
public final class Gl extends Dd {
    public final /* synthetic */ int R;
    public final /* synthetic */ Object e;

    public /* synthetic */ Gl(int i, Object obj) {
        this.R = i;
        this.e = obj;
    }

    @Override // defpackage.Dd
    public final Object C(int i, Object obj) {
        switch (this.R) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((cE0) ((FK) this.e)).f2018R;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // defpackage.Dd
    public final void H(Object obj, Object obj2) {
        switch (this.R) {
            case 0:
                ((FK) this.e).put(obj, obj2);
                return;
            default:
                ((L5) this.e).add(obj);
                return;
        }
    }

    @Override // defpackage.Dd
    public final FK L() {
        switch (this.R) {
            case 0:
                return (FK) this.e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // defpackage.Dd
    public final Object O(int i, int i2) {
        switch (this.R) {
            case 0:
                return ((cE0) ((FK) this.e)).f2018R[(i << 1) + i2];
            default:
                return ((L5) this.e).f272R[i];
        }
    }

    @Override // defpackage.Dd
    public final void U(int i) {
        switch (this.R) {
            case 0:
                ((FK) this.e).m(i);
                return;
            default:
                ((L5) this.e).C(i);
                return;
        }
    }

    @Override // defpackage.Dd
    public final void X() {
        switch (this.R) {
            case 0:
                ((FK) this.e).clear();
                return;
            default:
                ((L5) this.e).clear();
                return;
        }
    }

    @Override // defpackage.Dd
    public final int Z() {
        switch (this.R) {
            case 0:
                return ((FK) this.e).e;
            default:
                return ((L5) this.e).f273e;
        }
    }

    @Override // defpackage.Dd
    public final int m(Object obj) {
        switch (this.R) {
            case 0:
                return ((FK) this.e).X(obj);
            default:
                return ((L5) this.e).indexOf(obj);
        }
    }

    @Override // defpackage.Dd
    public final int x(Object obj) {
        switch (this.R) {
            case 0:
                return ((FK) this.e).L(obj);
            default:
                return ((L5) this.e).indexOf(obj);
        }
    }
}
