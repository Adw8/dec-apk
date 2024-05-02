package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aRL  reason: default package */
/* loaded from: classes.dex */
public final class aRL extends ViewGroup.MarginLayoutParams {
    public int L;
    public int O;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final Rect f878R;

    /* renamed from: R  reason: collision with other field name */
    public View f879R;

    /* renamed from: R  reason: collision with other field name */
    public knf f880R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f881R;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f882X;
    public int Z;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f883c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f884e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public View f885v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f886v;

    public aRL() {
        super(-2, -2);
        this.f881R = false;
        this.R = 0;
        this.v = 0;
        this.c = -1;
        this.e = -1;
        this.X = 0;
        this.O = 0;
        this.f878R = new Rect();
    }

    public final boolean R(int i) {
        if (i == 0) {
            return this.f883c;
        }
        if (i != 1) {
            return false;
        }
        return this.f884e;
    }

    public aRL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        knf knf;
        this.f881R = false;
        this.R = 0;
        this.v = 0;
        this.c = -1;
        this.e = -1;
        this.X = 0;
        this.O = 0;
        this.f878R = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lTs.O);
        this.R = obtainStyledAttributes.getInteger(0, 0);
        this.e = obtainStyledAttributes.getResourceId(1, -1);
        this.v = obtainStyledAttributes.getInteger(2, 0);
        this.c = obtainStyledAttributes.getInteger(6, -1);
        this.X = obtainStyledAttributes.getInt(5, 0);
        this.O = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f881R = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1258R;
            if (TextUtils.isEmpty(string)) {
                knf = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1258R;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1259R;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1261R);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    knf = (knf) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(opT.H("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f880R = knf;
        }
        obtainStyledAttributes.recycle();
        knf knf2 = this.f880R;
        if (knf2 != null) {
            knf2.c(this);
        }
    }

    public aRL(aRL arl) {
        super((ViewGroup.MarginLayoutParams) arl);
        this.f881R = false;
        this.R = 0;
        this.v = 0;
        this.c = -1;
        this.e = -1;
        this.X = 0;
        this.O = 0;
        this.f878R = new Rect();
    }

    public aRL(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f881R = false;
        this.R = 0;
        this.v = 0;
        this.c = -1;
        this.e = -1;
        this.X = 0;
        this.O = 0;
        this.f878R = new Rect();
    }

    public aRL(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f881R = false;
        this.R = 0;
        this.v = 0;
        this.c = -1;
        this.e = -1;
        this.X = 0;
        this.O = 0;
        this.f878R = new Rect();
    }
}
