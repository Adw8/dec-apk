package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: fen  reason: default package */
/* loaded from: classes.dex */
public final class fen {
    public static final mWA R = new mWA(0);

    /* renamed from: R  reason: collision with other field name */
    public float f3477R;

    /* renamed from: R  reason: collision with other field name */
    public int f3478R;

    /* renamed from: R  reason: collision with other field name */
    public VelocityTracker f3479R;

    /* renamed from: R  reason: collision with other field name */
    public View f3480R;

    /* renamed from: R  reason: collision with other field name */
    public final ViewGroup f3481R;

    /* renamed from: R  reason: collision with other field name */
    public OverScroller f3482R;

    /* renamed from: R  reason: collision with other field name */
    public final dxh f3483R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3485R;

    /* renamed from: R  reason: collision with other field name */
    public float[] f3486R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f3487R;
    public int X;

    /* renamed from: c  reason: collision with other field name */
    public float[] f3488c;

    /* renamed from: c  reason: collision with other field name */
    public int[] f3489c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public float[] f3490e;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public int f3491v;

    /* renamed from: v  reason: collision with other field name */
    public float[] f3492v;

    /* renamed from: v  reason: collision with other field name */
    public int[] f3493v;
    public int c = -1;

    /* renamed from: R  reason: collision with other field name */
    public final k0f f3484R = new k0f(6, this);

    public fen(Context context, ViewGroup viewGroup, dxh dxh) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (dxh != null) {
            this.f3481R = viewGroup;
            this.f3483R = dxh;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.X = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3491v = viewConfiguration.getScaledTouchSlop();
            this.f3477R = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.v = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3482R = new OverScroller(context, R);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    public final void C(float f, float f2, int i) {
        boolean c = c(f, f2, i, 1);
        if (c(f2, f, i, 4)) {
            c |= true;
        }
        if (c(f, f2, i, 2)) {
            c |= true;
        }
        if (c(f2, f, i, 8)) {
            c |= true;
        }
        if (c) {
            int[] iArr = this.f3493v;
            iArr[i] = iArr[i] | c;
            this.f3483R.getClass();
        }
    }

    public final void H(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            R();
        }
        if (this.f3479R == null) {
            this.f3479R = VelocityTracker.obtain();
        }
        this.f3479R.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View Z = Z((int) x, (int) y);
            N(x, y, pointerId);
            t(Z, pointerId);
            if ((this.f3487R[pointerId] & 0) != 0) {
                this.f3483R.getClass();
            }
        } else if (actionMasked == 1) {
            if (this.f3478R == 1) {
                U();
            }
            R();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3478R == 1) {
                    this.f3485R = true;
                    this.f3483R.x(this.f3480R, 0.0f, 0.0f);
                    this.f3485R = false;
                    if (this.f3478R == 1) {
                        j(0);
                    }
                }
                R();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                N(x2, y2, pointerId2);
                if (this.f3478R == 0) {
                    t(Z((int) x2, (int) y2), pointerId2);
                    if ((this.f3487R[pointerId2] & 0) != 0) {
                        this.f3483R.getClass();
                        return;
                    }
                    return;
                }
                int i3 = (int) x2;
                int i4 = (int) y2;
                View view = this.f3480R;
                if (view != null && i3 >= view.getLeft() && i3 < view.getRight() && i4 >= view.getTop() && i4 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    t(this.f3480R, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f3478R == 1 && pointerId3 == this.c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.c) {
                            View Z2 = Z((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view2 = this.f3480R;
                            if (Z2 == view2 && t(view2, pointerId4)) {
                                i = this.c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        U();
                    }
                }
                X(pointerId3);
            }
        } else if (this.f3478R != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (x(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f3486R[pointerId5];
                    float f2 = y3 - this.f3492v[pointerId5];
                    C(f, f2, pointerId5);
                    if (this.f3478R != 1) {
                        View Z3 = Z((int) x3, (int) y3);
                        if (e(Z3, f, f2) && t(Z3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            P(motionEvent);
        } else if (x(this.c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f3488c;
            int i5 = this.c;
            int i6 = (int) (x4 - fArr[i5]);
            int i7 = (int) (y4 - this.f3490e[i5]);
            int left = this.f3480R.getLeft() + i6;
            int top = this.f3480R.getTop() + i7;
            int left2 = this.f3480R.getLeft();
            int top2 = this.f3480R.getTop();
            if (i6 != 0) {
                left = this.f3483R.R(this.f3480R, left);
                WeakHashMap weakHashMap = of5.f6887R;
                this.f3480R.offsetLeftAndRight(left - left2);
            }
            if (i7 != 0) {
                top = this.f3483R.v(this.f3480R, top);
                WeakHashMap weakHashMap2 = of5.f6887R;
                this.f3480R.offsetTopAndBottom(top - top2);
            }
            if (!(i6 == 0 && i7 == 0)) {
                this.f3483R.m(this.f3480R, left, top);
            }
            P(motionEvent);
        }
    }

    public final boolean L() {
        if (this.f3478R == 2) {
            boolean computeScrollOffset = this.f3482R.computeScrollOffset();
            int currX = this.f3482R.getCurrX();
            int currY = this.f3482R.getCurrY();
            int left = currX - this.f3480R.getLeft();
            int top = currY - this.f3480R.getTop();
            if (left != 0) {
                View view = this.f3480R;
                WeakHashMap weakHashMap = of5.f6887R;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3480R;
                WeakHashMap weakHashMap2 = of5.f6887R;
                view2.offsetTopAndBottom(top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3483R.m(this.f3480R, currX, currY);
            }
            if (computeScrollOffset && currX == this.f3482R.getFinalX() && currY == this.f3482R.getFinalY()) {
                this.f3482R.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3481R.post(this.f3484R);
            }
        }
        return this.f3478R == 2;
    }

    public final void N(float f, float f2, int i) {
        float[] fArr = this.f3486R;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3492v;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3488c;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3490e;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3487R;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3493v;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3489c;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3486R = fArr2;
            this.f3492v = fArr3;
            this.f3488c = fArr4;
            this.f3490e = fArr5;
            this.f3487R = iArr;
            this.f3493v = iArr2;
            this.f3489c = iArr3;
        }
        float[] fArr9 = this.f3486R;
        this.f3488c[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f3492v;
        this.f3490e[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f3487R;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.f3481R.getLeft() + this.X) {
            i2 = 1;
        }
        if (i5 < this.f3481R.getTop() + this.X) {
            i2 |= 4;
        }
        if (i4 > this.f3481R.getRight() - this.X) {
            i2 |= 2;
        }
        if (i5 > this.f3481R.getBottom() - this.X) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.e |= 1 << i;
    }

    public final int O(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f3481R.getWidth();
        float f = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i)) / ((float) width)) - 0.5f) * 0.47123894f))) * f) + f;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    public final void P(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3488c[pointerId] = x;
                this.f3490e[pointerId] = y;
            }
        }
    }

    public final void R() {
        this.c = -1;
        float[] fArr = this.f3486R;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3492v, 0.0f);
            Arrays.fill(this.f3488c, 0.0f);
            Arrays.fill(this.f3490e, 0.0f);
            Arrays.fill(this.f3487R, 0);
            Arrays.fill(this.f3493v, 0);
            Arrays.fill(this.f3489c, 0);
            this.e = 0;
        }
        VelocityTracker velocityTracker = this.f3479R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3479R = null;
        }
    }

    public final void U() {
        this.f3479R.computeCurrentVelocity(1000, this.f3477R);
        float xVelocity = this.f3479R.getXVelocity(this.c);
        float f = this.v;
        float f2 = this.f3477R;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        f3 = this.f3479R.getYVelocity(this.c);
        float f4 = this.v;
        float f5 = this.f3477R;
        float abs2 = Math.abs(f3);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (f3 > 0.0f) {
                    f3 = f5;
                } else {
                    f3 = -f5;
                }
            }
        }
        this.f3485R = true;
        this.f3483R.x(this.f3480R, xVelocity, f3);
        this.f3485R = false;
        if (this.f3478R == 1) {
            j(0);
        }
    }

    public final void X(int i) {
        float[] fArr = this.f3486R;
        if (fArr != null) {
            int i2 = this.e;
            boolean z = true;
            int i3 = 1 << i;
            if ((i2 & i3) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.f3492v[i] = 0.0f;
                this.f3488c[i] = 0.0f;
                this.f3490e[i] = 0.0f;
                this.f3487R[i] = 0;
                this.f3493v[i] = 0;
                this.f3489c[i] = 0;
                this.e = (~i3) & i2;
            }
        }
    }

    public final View Z(int i, int i2) {
        for (int childCount = this.f3481R.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f3481R;
            this.f3483R.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3487R[i] & i2) != i2 || (0 & i2) == 0 || (this.f3489c[i] & i2) == i2 || (this.f3493v[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f3491v;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f3483R.getClass();
        }
        return (this.f3493v[i] & i2) == 0 && abs > ((float) this.f3491v);
    }

    public final boolean e(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3483R.e(view) > 0;
        boolean z2 = this.f3483R.X() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f3491v) : z2 && Math.abs(f2) > ((float) this.f3491v);
        }
        float f3 = f2 * f2;
        int i = this.f3491v;
        return f3 + (f * f) > ((float) (i * i));
    }

    public final boolean g(int i, int i2) {
        if (this.f3485R) {
            return m(i, i2, (int) this.f3479R.getXVelocity(this.c), (int) this.f3479R.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final void j(int i) {
        this.f3481R.removeCallbacks(this.f3484R);
        if (this.f3478R != i) {
            this.f3478R = i;
            this.f3483R.Z(i);
            if (this.f3478R == 0) {
                this.f3480R = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            android.view.View r0 = r9.f3480R
            int r2 = r0.getLeft()
            android.view.View r0 = r9.f3480R
            int r3 = r0.getTop()
            int r4 = r10 - r2
            int r5 = r11 - r3
            r10 = 0
            if (r4 != 0) goto L_0x001e
            if (r5 != 0) goto L_0x001e
            android.widget.OverScroller r11 = r9.f3482R
            r11.abortAnimation()
            r9.j(r10)
            return r10
        L_0x001e:
            android.view.View r11 = r9.f3480R
            float r0 = r9.v
            int r0 = (int) r0
            float r1 = r9.f3477R
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r12)
            if (r6 >= r0) goto L_0x002e
            r12 = r10
            goto L_0x0035
        L_0x002e:
            if (r6 <= r1) goto L_0x0035
            if (r12 <= 0) goto L_0x0034
            r12 = r1
            goto L_0x0035
        L_0x0034:
            int r12 = -r1
        L_0x0035:
            float r0 = r9.v
            int r0 = (int) r0
            float r1 = r9.f3477R
            int r1 = (int) r1
            int r6 = java.lang.Math.abs(r13)
            if (r6 >= r0) goto L_0x0042
            goto L_0x0049
        L_0x0042:
            if (r6 <= r1) goto L_0x004a
            if (r13 <= 0) goto L_0x0048
            r13 = r1
            goto L_0x004a
        L_0x0048:
            int r10 = -r1
        L_0x0049:
            r13 = r10
        L_0x004a:
            int r10 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r1 = java.lang.Math.abs(r12)
            int r6 = java.lang.Math.abs(r13)
            int r7 = r1 + r6
            int r8 = r10 + r0
            if (r12 == 0) goto L_0x0063
            float r10 = (float) r1
            float r1 = (float) r7
            goto L_0x0065
        L_0x0063:
            float r10 = (float) r10
            float r1 = (float) r8
        L_0x0065:
            float r10 = r10 / r1
            if (r13 == 0) goto L_0x006b
            float r0 = (float) r6
            float r1 = (float) r7
            goto L_0x006d
        L_0x006b:
            float r0 = (float) r0
            float r1 = (float) r8
        L_0x006d:
            float r0 = r0 / r1
            dxh r1 = r9.f3483R
            int r11 = r1.e(r11)
            int r11 = r9.O(r4, r12, r11)
            dxh r12 = r9.f3483R
            int r12 = r12.X()
            int r12 = r9.O(r5, r13, r12)
            float r11 = (float) r11
            float r11 = r11 * r10
            float r10 = (float) r12
            float r10 = r10 * r0
            float r10 = r10 + r11
            int r6 = (int) r10
            android.widget.OverScroller r1 = r9.f3482R
            r1.startScroll(r2, r3, r4, r5, r6)
            r10 = 2
            r9.j(r10)
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fen.m(int, int, int, int):boolean");
    }

    public final boolean t(View view, int i) {
        if (view == this.f3480R && this.c == i) {
            return true;
        }
        if (view == null || !this.f3483R.U(view, i)) {
            return false;
        }
        this.c = i;
        v(view, i);
        return true;
    }

    public final void v(View view, int i) {
        if (view.getParent() == this.f3481R) {
            this.f3480R = view;
            this.c = i;
            this.f3483R.L(view, i);
            j(1);
            return;
        }
        StringBuilder U = opT.U("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        U.append(this.f3481R);
        U.append(")");
        throw new IllegalArgumentException(U.toString());
    }

    public final boolean x(int i) {
        if ((this.e & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00db, code lost:
        if (r12 != r11) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fen.y(android.view.MotionEvent):boolean");
    }
}
