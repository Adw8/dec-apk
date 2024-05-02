package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: EH  reason: default package */
/* loaded from: classes.dex */
public final class EH extends et7 implements Animatable {

    /* renamed from: R  reason: collision with other field name */
    public Context f83R;

    /* renamed from: R  reason: collision with other field name */
    public dC f84R;

    /* renamed from: R  reason: collision with other field name */
    public final kB3 f86R;
    public XM R = null;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f85R = null;

    public EH(Context context) {
        kB3 kb3 = new kB3(this);
        this.f86R = kb3;
        this.f83R = context;
        this.f84R = new dC(kb3);
    }

    @Override // defpackage.et7, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            cAO.R(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            return cAO.v(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f84R.f2527R.draw(canvas);
        if (this.f84R.f2525R.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? iep.R(drawable) : this.f84R.f2527R.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f84R.getClass();
        return 0 | changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? cAO.c(drawable) : this.f84R.f2527R.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (((et7) this).R != null) {
            return new Er(((et7) this).R.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f84R.f2527R.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f84R.f2527R.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? drawable.getOpacity() : this.f84R.f2527R.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            cAO.e(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray n = hDC.n(resources, theme, attributeSet, hDC.X);
                    int resourceId = n.getResourceId(0, 0);
                    if (resourceId != 0) {
                        lPr lpr = new lPr();
                        ThreadLocal threadLocal = cu3.f2452R;
                        ((et7) lpr).R = fDQ.R(resources, resourceId, theme);
                        new adW(((et7) lpr).R.getConstantState());
                        lpr.v = false;
                        lpr.setCallback(this.f86R);
                        lPr lpr2 = this.f84R.f2527R;
                        if (lpr2 != null) {
                            lpr2.setCallback(null);
                        }
                        this.f84R.f2527R = lpr;
                    }
                    n.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, hDC.O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f83R;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(this.f84R.f2527R.f5719R.f971R.f2678R.getOrDefault(string, null));
                            dC dCVar = this.f84R;
                            if (dCVar.f2526R == null) {
                                dCVar.f2526R = new ArrayList();
                                this.f84R.R = new FK();
                            }
                            this.f84R.f2526R.add(loadAnimator);
                            this.f84R.R.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        dC dCVar2 = this.f84R;
        if (dCVar2.f2525R == null) {
            dCVar2.f2525R = new AnimatorSet();
        }
        dCVar2.f2525R.playTogether(dCVar2.f2526R);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? iep.e(drawable) : this.f84R.f2527R.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f84R.f2525R.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? drawable.isStateful() : this.f84R.f2527R.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f84R.f2527R.setBounds(rect);
        }
    }

    @Override // defpackage.et7, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? drawable.setLevel(i) : this.f84R.f2527R.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = ((et7) this).R;
        return drawable != null ? drawable.setState(iArr) : this.f84R.f2527R.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f84R.f2527R.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            iep.X(drawable, z);
        } else {
            this.f84R.f2527R.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f84R.f2527R.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            aH9.iE(drawable, i);
        } else {
            this.f84R.f2527R.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            aH9.xN(drawable, colorStateList);
        } else {
            this.f84R.f2527R.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            aH9.ZW(drawable, mode);
        } else {
            this.f84R.f2527R.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f84R.f2527R.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f84R.f2525R.isStarted()) {
            this.f84R.f2525R.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = ((et7) this).R;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f84R.f2525R.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
