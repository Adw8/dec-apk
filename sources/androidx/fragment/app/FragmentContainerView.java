package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public View.OnApplyWindowInsetsListener R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f1314R = new ArrayList();
    public final ArrayList v = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public boolean f1315R = true;

    public FragmentContainerView(Context context) {
        super(context);
    }

    public final void R(View view) {
        if (this.v.contains(view)) {
            this.f1314R.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof pm2 ? (pm2) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.View, android.view.ViewGroup
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        gWM Z = gWM.Z(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.R;
        if (onApplyWindowInsetsListener != null) {
            Z = gWM.Z(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = of5.f6887R;
            WindowInsets L = Z.L();
            if (L != null) {
                WindowInsets v = fv7.v(this, L);
                if (!v.equals(L)) {
                    Z = gWM.Z(this, v);
                }
            }
        }
        if (!Z.f3779R.H()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = of5.f6887R;
                WindowInsets L2 = Z.L();
                if (L2 != null) {
                    WindowInsets R = fv7.R(childAt, L2);
                    if (!R.equals(L2)) {
                        gWM.Z(childAt, R);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void dispatchDraw(Canvas canvas) {
        if (this.f1315R) {
            Iterator it = this.f1314R.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.f1315R || !(!this.f1314R.isEmpty()) || !this.f1314R.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.v.remove(view);
        if (this.f1314R.remove(view)) {
            this.f1315R = true;
        }
        super.endViewTransition(view);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0002 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0002 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v11 */
    public final <F extends pm2> F getFragment() {
        pm2 pm2;
        hAW haw;
        hm9 hm9 = null;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            if (fragmentContainerView == 0) {
                pm2 = null;
                break;
            }
            Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
            pm2 = tag instanceof pm2 ? (pm2) tag : null;
            if (pm2 != null) {
                break;
            }
            ViewParent parent = fragmentContainerView.getParent();
            fragmentContainerView = parent instanceof View ? (View) parent : 0;
        }
        if (pm2 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof hm9) {
                    hm9 = (hm9) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (hm9 != null) {
                haw = ((eAj) hm9.R.R).f3006R;
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (pm2.j()) {
            haw = pm2.m();
        } else {
            throw new IllegalStateException("The Fragment " + pm2 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return (F) haw.z(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                R(getChildAt(childCount));
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        R(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        R(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        R(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            R(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            R(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f1315R = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.R = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.v.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1P.f6271v, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, hAW haw) {
        super(context, attributeSet);
        View view;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n1P.f6271v, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        pm2 z = haw.z(id);
        if (classAttribute != null && z == null) {
            if (id == -1) {
                throw new IllegalStateException(jQ.C("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? opT.H(" with tag ", string) : ""));
            }
            aLv A = haw.A();
            context.getClassLoader();
            pm2 R = A.R(classAttribute);
            R.z(context, attributeSet, null);
            KP kp = new KP(haw);
            kp.f255c = true;
            R.f7229R = this;
            kp.X(getId(), R, string, 1);
            if (!kp.f252R) {
                kp.f259v = false;
                kp.f248R.Y(kp, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = haw.f4127R.N().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            pm2 pm2 = dVar.f1318R;
            if (pm2.Z == getId() && (view = pm2.f7228R) != null && view.getParent() == null) {
                pm2.f7229R = this;
                dVar.v();
            }
        }
    }
}
