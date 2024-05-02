package defpackage;

/* renamed from: hBj  reason: default package */
/* loaded from: classes.dex */
public final class hBj extends s8 {
    public hBj(jnu jnu) {
        super(jnu);
    }

    public static jnu x(i2h i2h) {
        if (i2h instanceof jnu) {
            return (jnu) i2h;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // defpackage.Su
    public final void L(int i, int i2, int i3) {
        jnu x = x((i2h) this.v);
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                x.f5020R.remove(i);
                x.f5020R.add(i2, (i2h) x.f5020R.get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                x.f5020R.remove(i);
                x.f5020R.add(i2 - 1, (i2h) x.f5020R.get(i));
                i4++;
            }
        }
        x.c();
    }

    @Override // defpackage.Su
    public final void R(int i, Object obj) {
        i2h i2h = (i2h) obj;
        jnu x = x((i2h) this.v);
        if (i < x.f5020R.size()) {
            x.f5020R.set(i, i2h);
        } else {
            x.f5020R.add(i2h);
        }
        i2h.e(x.f5025v);
        x.c();
    }

    @Override // defpackage.Su
    public final void Z(int i, int i2) {
        x((i2h) this.v).X(i, i2);
    }

    @Override // defpackage.s8
    public final void m() {
        jnu x = x((i2h) ((s8) this).R);
        x.X(0, x.f5020R.size());
    }

    @Override // defpackage.Su
    public final /* bridge */ /* synthetic */ void v(int i, Object obj) {
        i2h i2h = (i2h) obj;
    }
}
