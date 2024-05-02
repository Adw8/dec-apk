package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: hHo  reason: default package */
/* loaded from: classes.dex */
public final class hHo {
    public final View R;

    /* renamed from: R  reason: collision with other field name */
    public ViewParent f4200R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4201R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f4202R;
    public ViewParent v;

    public hHo(View view) {
        this.R = view;
    }

    public final boolean L(int i, int i2) {
        boolean z;
        if (O(i2) != null) {
            return true;
        }
        if (this.f4201R) {
            View view = this.R;
            for (ViewParent parent = this.R.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.R;
                boolean z2 = parent instanceof eRL;
                if (z2) {
                    z = ((eRL) parent).O(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z = gvd.O(parent, view, view2, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f4200R = parent;
                    } else if (i2 == 1) {
                        this.v = parent;
                    }
                    View view3 = this.R;
                    if (z2) {
                        ((eRL) parent).X(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            gvd.X(parent, view, view3, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final ViewParent O(int i) {
        if (i == 0) {
            return this.f4200R;
        }
        if (i != 1) {
            return null;
        }
        return this.v;
    }

    public final boolean R(float f, float f2, boolean z) {
        ViewParent O;
        if (!this.f4201R || (O = O(0)) == null) {
            return false;
        }
        try {
            return gvd.R(O, this.R, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + O + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public final boolean X(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent O;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f4201R || (O = O(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.R.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.f4202R == null) {
                this.f4202R = new int[2];
            }
            int[] iArr4 = this.f4202R;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.R;
        if (O instanceof b1z) {
            ((b1z) O).e(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (O instanceof eRL) {
                ((eRL) O).R(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    gvd.e(O, view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + O + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            this.R.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    public final void Z(int i) {
        ViewParent O = O(i);
        if (O != null) {
            View view = this.R;
            if (O instanceof eRL) {
                ((eRL) O).c(view, i);
            } else if (i == 0) {
                try {
                    gvd.L(O, view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + O + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f4200R = null;
            } else if (i == 1) {
                this.v = null;
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent O;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f4201R || (O = O(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.R.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.f4202R == null) {
                    this.f4202R = new int[2];
                }
                iArr3 = this.f4202R;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.R;
            if (O instanceof eRL) {
                ((eRL) O).v(view, i, i2, iArr3, i3);
            } else if (i3 == 0) {
                try {
                    gvd.c(O, view, i, i2, iArr3);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + O + " does not implement interface method onNestedPreScroll", e);
                }
            }
            if (iArr2 != null) {
                this.R.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public final void e(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        X(i, i2, i3, i4, null, i5, iArr);
    }

    public final boolean v(float f, float f2) {
        ViewParent O;
        if (!this.f4201R || (O = O(0)) == null) {
            return false;
        }
        try {
            return gvd.v(O, this.R, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + O + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }
}
