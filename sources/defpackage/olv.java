package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import java.util.WeakHashMap;

/* renamed from: olv  reason: default package */
/* loaded from: classes.dex */
public class olv implements gt5 {
    public int L;
    public int O;
    public J_ R;

    /* renamed from: R  reason: collision with other field name */
    public aYp f6917R;

    /* renamed from: R  reason: collision with other field name */
    public Context f6918R;

    /* renamed from: R  reason: collision with other field name */
    public final Handler f6920R;

    /* renamed from: R  reason: collision with other field name */
    public View f6921R;

    /* renamed from: R  reason: collision with other field name */
    public AdapterView.OnItemClickListener f6922R;

    /* renamed from: R  reason: collision with other field name */
    public AdapterView.OnItemSelectedListener f6923R;

    /* renamed from: R  reason: collision with other field name */
    public ListAdapter f6924R;

    /* renamed from: R  reason: collision with other field name */
    public lHB f6926R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6929R;
    public boolean c;

    /* renamed from: e  reason: collision with other field name */
    public boolean f6930e;
    public Rect v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6932v;
    public int e = -2;
    public int X = -2;
    public int Z = 1002;
    public int m = 0;
    public int x = Integer.MAX_VALUE;

    /* renamed from: R  reason: collision with other field name */
    public final eZc f6925R = new eZc(this, 2);

    /* renamed from: R  reason: collision with other field name */
    public final oUG f6927R = new oUG(this);

    /* renamed from: R  reason: collision with other field name */
    public final p1C f6928R = new p1C(this);

    /* renamed from: v  reason: collision with other field name */
    public final eZc f6931v = new eZc(this, 1);

    /* renamed from: R  reason: collision with other field name */
    public final Rect f6919R = new Rect();

    public olv(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f6918R = context;
        this.f6920R = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iTI.P, i, i2);
        this.O = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.L = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6929R = true;
        }
        obtainStyledAttributes.recycle();
        J_ j_ = new J_(context, attributeSet, i, i2);
        this.R = j_;
        j_.setInputMethodMode(1);
    }

    @Override // defpackage.G6
    public void L(ListAdapter listAdapter) {
        lHB lhb = this.f6926R;
        if (lhb == null) {
            this.f6926R = new lHB(0, this);
        } else {
            ListAdapter listAdapter2 = this.f6924R;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(lhb);
            }
        }
        this.f6924R = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6926R);
        }
        aYp ayp = this.f6917R;
        if (ayp != null) {
            ayp.setAdapter(this.f6924R);
        }
    }

    public final int N() {
        if (!this.f6929R) {
            return 0;
        }
        return this.L;
    }

    public final int O() {
        return this.O;
    }

    public final void P(Drawable drawable) {
        this.R.setBackgroundDrawable(drawable);
    }

    public aYp R(Context context, boolean z) {
        return new aYp(context, z);
    }

    @Override // defpackage.gt5
    public final void Z() {
        int i;
        int i2;
        aYp ayp;
        int i3;
        int i4 = 0;
        if (this.f6917R == null) {
            aYp R = R(this.f6918R, !this.f6930e);
            this.f6917R = R;
            R.setAdapter(this.f6924R);
            this.f6917R.setOnItemClickListener(this.f6922R);
            this.f6917R.setFocusable(true);
            this.f6917R.setFocusableInTouchMode(true);
            this.f6917R.setOnItemSelectedListener(new hJU(0, this));
            this.f6917R.setOnScrollListener(this.f6928R);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f6923R;
            if (onItemSelectedListener != null) {
                this.f6917R.setOnItemSelectedListener(onItemSelectedListener);
            }
            this.R.setContentView(this.f6917R);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.R.getContentView();
        }
        Drawable background = this.R.getBackground();
        if (background != null) {
            background.getPadding(this.f6919R);
            Rect rect = this.f6919R;
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f6929R) {
                this.L = -i5;
            }
        } else {
            this.f6919R.setEmpty();
            i = 0;
        }
        int R2 = itm.R(this.R, this.f6921R, this.L, this.R.getInputMethodMode() == 2);
        if (this.e == -1) {
            i2 = R2 + i;
        } else {
            int i6 = this.X;
            if (i6 == -2) {
                int i7 = this.f6918R.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.f6919R;
                i3 = View.MeasureSpec.makeMeasureSpec(i7 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i6 != -1) {
                i3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else {
                int i8 = this.f6918R.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f6919R;
                i3 = View.MeasureSpec.makeMeasureSpec(i8 - (rect3.left + rect3.right), 1073741824);
            }
            int R3 = this.f6917R.R(i3, R2 + 0);
            i2 = R3 + (R3 > 0 ? this.f6917R.getPaddingBottom() + this.f6917R.getPaddingTop() + i + 0 : 0);
        }
        boolean z = this.R.getInputMethodMode() == 2;
        m44.e(this.R, this.Z);
        if (this.R.isShowing()) {
            View view = this.f6921R;
            WeakHashMap weakHashMap = of5.f6887R;
            if (d6y.v(view)) {
                int i9 = this.X;
                if (i9 == -1) {
                    i9 = -1;
                } else if (i9 == -2) {
                    i9 = this.f6921R.getWidth();
                }
                int i10 = this.e;
                if (i10 == -1) {
                    if (!z) {
                        i2 = -1;
                    }
                    if (z) {
                        this.R.setWidth(this.X == -1 ? -1 : 0);
                        this.R.setHeight(0);
                    } else {
                        J_ j_ = this.R;
                        if (this.X == -1) {
                            i4 = -1;
                        }
                        j_.setWidth(i4);
                        this.R.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    i2 = i10;
                }
                this.R.setOutsideTouchable(true);
                this.R.update(this.f6921R, this.O, this.L, i9 < 0 ? -1 : i9, i2 < 0 ? -1 : i2);
                return;
            }
            return;
        }
        int i11 = this.X;
        if (i11 == -1) {
            i11 = -1;
        } else if (i11 == -2) {
            i11 = this.f6921R.getWidth();
        }
        int i12 = this.e;
        if (i12 == -1) {
            i2 = -1;
        } else if (i12 != -2) {
            i2 = i12;
        }
        this.R.setWidth(i11);
        this.R.setHeight(i2);
        bDd.v(this.R, true);
        this.R.setOutsideTouchable(true);
        this.R.setTouchInterceptor(this.f6927R);
        if (this.c) {
            m44.c(this.R, this.f6932v);
        }
        bDd.R(this.R, this.v);
        o_G.R(this.R, this.f6921R, this.O, this.L, this.m);
        this.f6917R.setSelection(-1);
        if ((!this.f6930e || this.f6917R.isInTouchMode()) && (ayp = this.f6917R) != null) {
            ayp.setListSelectionHidden(true);
            ayp.requestLayout();
        }
        if (!this.f6930e) {
            this.f6920R.post(this.f6931v);
        }
    }

    public final void c(int i) {
        this.O = i;
    }

    @Override // defpackage.gt5
    public final void dismiss() {
        this.R.dismiss();
        this.R.setContentView(null);
        this.f6917R = null;
        this.f6920R.removeCallbacks(this.f6925R);
    }

    @Override // defpackage.gt5
    public final aYp e() {
        return this.f6917R;
    }

    public final void j(int i) {
        this.L = i;
        this.f6929R = true;
    }

    @Override // defpackage.gt5
    public final boolean v() {
        return this.R.isShowing();
    }

    public final Drawable x() {
        return this.R.getBackground();
    }

    public final void y(int i) {
        Drawable background = this.R.getBackground();
        if (background != null) {
            background.getPadding(this.f6919R);
            Rect rect = this.f6919R;
            this.X = rect.left + rect.right + i;
            return;
        }
        this.X = i;
    }
}
