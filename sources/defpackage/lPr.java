package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: lPr  reason: default package */
/* loaded from: classes.dex */
public final class lPr extends et7 {
    public static final PorterDuff.Mode R = PorterDuff.Mode.SRC_IN;

    /* renamed from: R  reason: collision with other field name */
    public ahF f5719R;

    /* renamed from: R  reason: collision with other field name */
    public ColorFilter f5720R;

    /* renamed from: R  reason: collision with other field name */
    public final Matrix f5721R;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuffColorFilter f5722R;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f5723R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5724R;

    /* renamed from: R  reason: collision with other field name */
    public final float[] f5725R;
    public boolean v;

    public lPr() {
        this.v = true;
        this.f5725R = new float[9];
        this.f5721R = new Matrix();
        this.f5723R = new Rect();
        this.f5719R = new ahF();
    }

    public final PorterDuffColorFilter R(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = ((et7) this).R;
        if (drawable == null) {
            return false;
        }
        cAO.v(drawable);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        if ((r15 == r8.getWidth() && r3 == r6.f968R.getHeight()) == false) goto L_0x00d5;
     */
    @Override // android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r18) {
        /*
        // Method dump skipped, instructions count: 404
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lPr.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? iep.R(drawable) : this.f5719R.f971R.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f5719R.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? cAO.c(drawable) : this.f5720R;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (((et7) this).R != null) {
            return new adW(((et7) this).R.getConstantState());
        }
        this.f5719R.R = getChangingConfigurations();
        return this.f5719R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5719R.f971R.f2686v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5719R.f971R.R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? iep.e(drawable) : this.f5719R.f972R;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            ahF ahf = this.f5719R;
            if (ahf != null) {
                db0 db0 = ahf.f971R;
                if (db0.f2683R == null) {
                    db0.f2683R = Boolean.valueOf(db0.f2685R.R());
                }
                if (db0.f2683R.booleanValue() || ((colorStateList = this.f5719R.f967R) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5724R && super.mutate() == this) {
            this.f5719R = new ahF(this.f5719R);
            this.f5724R = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        ahF ahf = this.f5719R;
        ColorStateList colorStateList = ahf.f967R;
        if (!(colorStateList == null || (mode = ahf.f970R) == null)) {
            this.f5722R = R(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        db0 db0 = ahf.f971R;
        if (db0.f2683R == null) {
            db0.f2683R = Boolean.valueOf(db0.f2685R.R());
        }
        if (db0.f2683R.booleanValue()) {
            boolean v = ahf.f971R.f2685R.v(iArr);
            ahf.c |= v;
            if (v) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5719R.f971R.getRootAlpha() != i) {
            this.f5719R.f971R.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            iep.X(drawable, z);
        } else {
            this.f5719R.f972R = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5720R = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            aH9.iE(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            cAO.Z(drawable, colorStateList);
            return;
        }
        ahF ahf = this.f5719R;
        if (ahf.f967R != colorStateList) {
            ahf.f967R = colorStateList;
            this.f5722R = R(colorStateList, ahf.f970R);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            cAO.m(drawable, mode);
            return;
        }
        ahF ahf = this.f5719R;
        if (ahf.f970R != mode) {
            ahf.f970R = mode;
            this.f5722R = R(ahf.f967R, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        Resources resources2;
        char c;
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            cAO.e(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        ahF ahf = this.f5719R;
        ahf.f971R = new db0();
        TypedArray n = hDC.n(resources, theme, attributeSet, hDC.R);
        ahF ahf2 = this.f5719R;
        db0 db0 = ahf2.f971R;
        int o = hDC.o(n, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i4 = 3;
        if (o == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (o != 5) {
            if (o != 9) {
                switch (o) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        ahf2.f970R = mode;
        ColorStateList t = hDC.t(n, xmlPullParser, theme);
        if (t != null) {
            ahf2.f967R = t;
        }
        boolean z = ahf2.f972R;
        if (hDC.I(xmlPullParser, "autoMirrored")) {
            z = n.getBoolean(5, z);
        }
        ahf2.f972R = z;
        db0.c = hDC.V(n, xmlPullParser, "viewportWidth", 7, db0.c);
        float V = hDC.V(n, xmlPullParser, "viewportHeight", 8, db0.e);
        db0.e = V;
        if (db0.c <= 0.0f) {
            throw new XmlPullParserException(n.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (V > 0.0f) {
            db0.R = n.getDimension(3, db0.R);
            int i5 = 2;
            float dimension = n.getDimension(2, db0.f2686v);
            db0.f2686v = dimension;
            if (db0.R <= 0.0f) {
                throw new XmlPullParserException(n.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                db0.setAlpha(hDC.V(n, xmlPullParser, "alpha", 4, db0.getAlpha()));
                String string = n.getString(0);
                if (string != null) {
                    db0.f2684R = string;
                    db0.f2678R.put(string, db0);
                }
                n.recycle();
                ahf.R = getChangingConfigurations();
                int i6 = 1;
                ahf.c = true;
                ahF ahf3 = this.f5719R;
                db0 db02 = ahf3.f971R;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(db02.f2685R);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                Resources resources3 = resources;
                boolean z2 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i4)) {
                    if (eventType == i5) {
                        String name = xmlPullParser.getName();
                        oc5 oc5 = (oc5) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            km2 km2 = new km2();
                            TypedArray n2 = hDC.n(resources3, theme, attributeSet, hDC.c);
                            if (hDC.I(xmlPullParser, "pathData")) {
                                String string2 = n2.getString(0);
                                if (string2 != null) {
                                    ((kcd) km2).f5368R = string2;
                                }
                                String string3 = n2.getString(2);
                                if (string3 != null) {
                                    ((kcd) km2).f5369R = gvP.g(string3);
                                }
                                km2.f5416v = hDC.i(n2, xmlPullParser, theme, "fillColor", 1);
                                km2.c = hDC.V(n2, xmlPullParser, "fillAlpha", 12, km2.c);
                                int o2 = hDC.o(n2, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = km2.f5413R;
                                if (o2 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (o2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (o2 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                km2.f5413R = cap;
                                int o3 = hDC.o(n2, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = km2.f5414R;
                                if (o3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (o3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (o3 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                km2.f5414R = join;
                                km2.L = hDC.V(n2, xmlPullParser, "strokeMiterLimit", 10, km2.L);
                                km2.f5415R = hDC.i(n2, xmlPullParser, theme, "strokeColor", 3);
                                km2.v = hDC.V(n2, xmlPullParser, "strokeAlpha", 11, km2.v);
                                km2.R = hDC.V(n2, xmlPullParser, "strokeWidth", 4, km2.R);
                                km2.X = hDC.V(n2, xmlPullParser, "trimPathEnd", 6, km2.X);
                                km2.O = hDC.V(n2, xmlPullParser, "trimPathOffset", 7, km2.O);
                                km2.e = hDC.V(n2, xmlPullParser, "trimPathStart", 5, km2.e);
                                ((kcd) km2).R = hDC.o(n2, xmlPullParser, "fillType", 13, ((kcd) km2).R);
                            }
                            n2.recycle();
                            oc5.f6857R.add(km2);
                            if (km2.getPathName() != null) {
                                db02.f2678R.put(km2.getPathName(), km2);
                            }
                            ahf3.R = ((kcd) km2).v | ahf3.R;
                            c = 4;
                            z2 = false;
                        } else {
                            if ("clip-path".equals(name)) {
                                ozF ozf = new ozF();
                                if (hDC.I(xmlPullParser, "pathData")) {
                                    TypedArray n3 = hDC.n(resources, theme, attributeSet, hDC.e);
                                    String string4 = n3.getString(0);
                                    if (string4 != null) {
                                        ((kcd) ozf).f5368R = string4;
                                    }
                                    String string5 = n3.getString(1);
                                    if (string5 != null) {
                                        ((kcd) ozf).f5369R = gvP.g(string5);
                                    }
                                    ((kcd) ozf).R = hDC.o(n3, xmlPullParser, "fillType", 2, 0);
                                    n3.recycle();
                                }
                                oc5.f6857R.add(ozf);
                                if (ozf.getPathName() != null) {
                                    db02.f2678R.put(ozf.getPathName(), ozf);
                                }
                                ahf3.R = ozf.v | ahf3.R;
                            } else if ("group".equals(name)) {
                                oc5 oc52 = new oc5();
                                TypedArray n4 = hDC.n(resources, theme, attributeSet, hDC.v);
                                oc52.R = hDC.V(n4, xmlPullParser, "rotation", 5, oc52.R);
                                oc52.v = n4.getFloat(1, oc52.v);
                                oc52.c = n4.getFloat(2, oc52.c);
                                oc52.e = hDC.V(n4, xmlPullParser, "scaleX", 3, oc52.e);
                                c = 4;
                                oc52.X = hDC.V(n4, xmlPullParser, "scaleY", 4, oc52.X);
                                oc52.O = hDC.V(n4, xmlPullParser, "translateX", 6, oc52.O);
                                oc52.L = hDC.V(n4, xmlPullParser, "translateY", 7, oc52.L);
                                String string6 = n4.getString(0);
                                if (string6 != null) {
                                    oc52.f6856R = string6;
                                }
                                oc52.c();
                                n4.recycle();
                                oc5.f6857R.add(oc52);
                                arrayDeque.push(oc52);
                                if (oc52.getGroupName() != null) {
                                    db02.f2678R.put(oc52.getGroupName(), oc52);
                                }
                                ahf3.R = oc52.f6854R | ahf3.R;
                            }
                            c = 4;
                        }
                        resources2 = resources;
                        i3 = 3;
                        i2 = 1;
                    } else {
                        i = depth;
                        resources2 = resources3;
                        i3 = i4;
                        i2 = 1;
                        if (eventType == i3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    resources3 = resources2;
                    i4 = i3;
                    i6 = i2;
                    depth = i;
                    i5 = 2;
                }
                if (!z2) {
                    this.f5722R = R(ahf.f967R, ahf.f970R);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(n.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(n.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public lPr(ahF ahf) {
        this.v = true;
        this.f5725R = new float[9];
        this.f5721R = new Matrix();
        this.f5723R = new Rect();
        this.f5719R = ahf;
        this.f5722R = R(ahf.f967R, ahf.f970R);
    }
}
