package defpackage;

import android.view.View;

/* renamed from: hMh  reason: default package */
/* loaded from: classes.dex */
public final class hMh extends k8G implements kg9 {
    public final /* synthetic */ Object O;
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4216R;
    public final /* synthetic */ int X = 0;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ Object f4217X;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hMh(h0T h0t, h0T h0t2, h0T h0t3, h0T h0t4, float[] fArr, h0T h0t5, p6 p6Var) {
        super(1);
        this.R = h0t;
        this.f4216R = h0t2;
        this.v = h0t3;
        this.c = h0t4;
        this.e = fArr;
        this.f4217X = h0t5;
        this.O = p6Var;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        Float f = null;
        boolean z = false;
        switch (this.X) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                float f2 = (float) 2;
                float max = Math.max(((Number) this.R.getValue()).floatValue() - (((Number) ((h0T) this.f4216R).getValue()).floatValue() / f2), 0.0f);
                float min = Math.min(((Number) ((h0T) this.f4216R).getValue()).floatValue() / f2, max);
                h0T h0t = (h0T) this.v;
                h0t.R(Float.valueOf(((Number) ((h0T) this.c).getValue()).floatValue() + ((Number) h0t.getValue()).floatValue() + floatValue));
                ((h0T) this.c).R(Float.valueOf(0.0f));
                float floatValue2 = ((Number) ((h0T) this.v).getValue()).floatValue();
                float[] fArr = (float[]) this.e;
                if (!(fArr.length == 0)) {
                    float f3 = fArr[0];
                    int length = fArr.length - 1;
                    if (length == 0) {
                        f = Float.valueOf(f3);
                    } else {
                        float abs = Math.abs(hDC.z(min, max, f3) - floatValue2);
                        jrc R = new heu(1, length).iterator();
                        while (R.R) {
                            float f4 = fArr[R.nextInt()];
                            float abs2 = Math.abs(hDC.z(min, max, f4) - floatValue2);
                            if (Float.compare(abs, abs2) > 0) {
                                f3 = f4;
                                abs = abs2;
                            }
                        }
                        f = Float.valueOf(f3);
                    }
                }
                if (f != null) {
                    floatValue2 = hDC.z(min, max, f.floatValue());
                }
                kg9 kg9 = (kg9) ((dH9) this.f4217X).getValue();
                p6 p6Var = (p6) this.O;
                float floatValue3 = ((Number) p6Var.v()).floatValue();
                float floatValue4 = ((Number) p6Var.R()).floatValue();
                float f5 = max - min;
                if (f5 == 0.0f) {
                    z = true;
                }
                kg9.x(Float.valueOf(hDC.z(floatValue3, floatValue4, caw.m(z ? 0.0f : (floatValue2 - min) / f5, 0.0f, 1.0f))));
                break;
            default:
                long j = ((aWo) obj).f906R;
                h0T h0t2 = this.R;
                float f6 = iqx.R;
                h0t2.R(new aWo(j));
                ((nWW) this.f4216R).R = l6.z((jy_) this.v, null, 0, new efA((View) this.c, (nhg) this.e, (ck3) this.f4217X, this.R, (mBH) this.O, null), 3);
                break;
        }
        return o8s.R;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hMh(nWW nww, jy_ jy_, h0T h0t, View view, nhg nhg, ck3 ck3, mBH mbh) {
        super(1);
        this.f4216R = nww;
        this.v = jy_;
        this.R = h0t;
        this.c = view;
        this.e = nhg;
        this.f4217X = ck3;
        this.O = mbh;
    }
}
