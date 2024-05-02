package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import dev.kdrag0n.virtcontainer.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: aYp  reason: default package */
/* loaded from: classes.dex */
public class aYp extends ListView {

    /* renamed from: R  reason: collision with other field name */
    public cHE f920R;

    /* renamed from: R  reason: collision with other field name */
    public flU f921R;

    /* renamed from: R  reason: collision with other field name */
    public Field f922R;

    /* renamed from: R  reason: collision with other field name */
    public k0f f923R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f924R;
    public int Z;
    public boolean c;
    public boolean v;
    public final Rect R = new Rect();
    public int e = 0;
    public int X = 0;
    public int O = 0;
    public int L = 0;

    public aYp(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.v = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f922R = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public final int R(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.R.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.R);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f923R == null) {
            super.drawableStateChanged();
            cHE che = this.f920R;
            if (che != null) {
                che.f2057R = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.c && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.v || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.v || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.v || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.v && this.f924R) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View, android.widget.AdapterView
    public final void onDetachedFromWindow() {
        this.f923R = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f923R == null) {
            k0f k0f = new k0f(2, this);
            this.f923R = k0f;
            post(k0f);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (h9F.f4095R) {
                        try {
                            h9F.R.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            h9F.v.invoke(this, Integer.valueOf(pointToPosition));
                            h9F.c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.c && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.Z = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        k0f k0f = this.f923R;
        if (k0f != null) {
            aYp ayp = (aYp) k0f.R;
            ayp.f923R = null;
            ayp.removeCallbacks(k0f);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f924R = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        cHE che = drawable != null ? new cHE(drawable) : null;
        this.f920R = che;
        super.setSelector(che);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.e = rect.left;
        this.X = rect.top;
        this.O = rect.right;
        this.L = rect.bottom;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x012b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(android.view.MotionEvent r17, int r18) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aYp.v(android.view.MotionEvent, int):boolean");
    }
}
