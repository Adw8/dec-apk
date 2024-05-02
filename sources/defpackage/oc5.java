package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: oc5  reason: default package */
/* loaded from: classes.dex */
public final class oc5 extends njT {
    public float L;
    public float O;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f6854R;

    /* renamed from: R  reason: collision with other field name */
    public final Matrix f6855R;

    /* renamed from: R  reason: collision with other field name */
    public String f6856R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f6857R;
    public float X;
    public float c;
    public float e;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public final Matrix f6858v;

    public oc5(oc5 oc5, FK fk) {
        kcd kcd;
        this.f6855R = new Matrix();
        this.f6857R = new ArrayList();
        this.R = 0.0f;
        this.v = 0.0f;
        this.c = 0.0f;
        this.e = 1.0f;
        this.X = 1.0f;
        this.O = 0.0f;
        this.L = 0.0f;
        Matrix matrix = new Matrix();
        this.f6858v = matrix;
        this.f6856R = null;
        this.R = oc5.R;
        this.v = oc5.v;
        this.c = oc5.c;
        this.e = oc5.e;
        this.X = oc5.X;
        this.O = oc5.O;
        this.L = oc5.L;
        String str = oc5.f6856R;
        this.f6856R = str;
        this.f6854R = oc5.f6854R;
        if (str != null) {
            fk.put(str, this);
        }
        matrix.set(oc5.f6858v);
        ArrayList arrayList = oc5.f6857R;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof oc5) {
                this.f6857R.add(new oc5((oc5) obj, fk));
            } else {
                if (obj instanceof km2) {
                    kcd = new km2((km2) obj);
                } else if (obj instanceof ozF) {
                    kcd = new ozF((ozF) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f6857R.add(kcd);
                Object obj2 = kcd.f5368R;
                if (obj2 != null) {
                    fk.put(obj2, kcd);
                }
            }
        }
    }

    @Override // defpackage.njT
    public final boolean R() {
        for (int i = 0; i < this.f6857R.size(); i++) {
            if (((njT) this.f6857R.get(i)).R()) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        this.f6858v.reset();
        this.f6858v.postTranslate(-this.v, -this.c);
        this.f6858v.postScale(this.e, this.X);
        this.f6858v.postRotate(this.R, 0.0f, 0.0f);
        this.f6858v.postTranslate(this.O + this.v, this.L + this.c);
    }

    public String getGroupName() {
        return this.f6856R;
    }

    public Matrix getLocalMatrix() {
        return this.f6858v;
    }

    public float getPivotX() {
        return this.v;
    }

    public float getPivotY() {
        return this.c;
    }

    public float getRotation() {
        return this.R;
    }

    public float getScaleX() {
        return this.e;
    }

    public float getScaleY() {
        return this.X;
    }

    public float getTranslateX() {
        return this.O;
    }

    public float getTranslateY() {
        return this.L;
    }

    public void setPivotX(float f) {
        if (f != this.v) {
            this.v = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.R) {
            this.R = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.X) {
            this.X = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.O) {
            this.O = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.L) {
            this.L = f;
            c();
        }
    }

    @Override // defpackage.njT
    public final boolean v(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.f6857R.size(); i++) {
            z |= ((njT) this.f6857R.get(i)).v(iArr);
        }
        return z;
    }

    public oc5() {
        this.f6855R = new Matrix();
        this.f6857R = new ArrayList();
        this.R = 0.0f;
        this.v = 0.0f;
        this.c = 0.0f;
        this.e = 1.0f;
        this.X = 1.0f;
        this.O = 0.0f;
        this.L = 0.0f;
        this.f6858v = new Matrix();
        this.f6856R = null;
    }
}
