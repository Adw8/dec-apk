package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: okT  reason: default package */
/* loaded from: classes.dex */
public final class okT {
    public float O;
    public float R;
    public float X;
    public float c;
    public float e;
    public float v;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f6900R = new ArrayList();

    /* renamed from: v  reason: collision with other field name */
    public final ArrayList f6901v = new ArrayList();

    public okT() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void R(float f) {
        float f2 = this.X;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.c;
                float f5 = this.e;
                lRf lrf = new lRf(f4, f5, f4, f5);
                lrf.X = this.X;
                lrf.O = f3;
                this.f6901v.add(new haJ(lrf));
                this.X = f;
            }
        }
    }

    public final void c(float f, float f2) {
        foZ foz = new foZ();
        foz.R = f;
        foz.v = f2;
        this.f6900R.add(foz);
        lc6 lc6 = new lc6(foz, this.c, this.e);
        R(lc6.v() + 270.0f);
        this.f6901v.add(lc6);
        this.X = lc6.v() + 270.0f;
        this.c = f;
        this.e = f2;
    }

    public final void e(float f, float f2, float f3, float f4) {
        this.R = f;
        this.v = f2;
        this.c = f;
        this.e = f2;
        this.X = f3;
        this.O = (f3 + f4) % 360.0f;
        this.f6900R.clear();
        this.f6901v.clear();
    }

    public final void v(Matrix matrix, Path path) {
        int size = this.f6900R.size();
        for (int i = 0; i < size; i++) {
            ((aW_) this.f6900R.get(i)).R(matrix, path);
        }
    }
}
