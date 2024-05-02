package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: nki  reason: default package */
/* loaded from: classes.dex */
public final class nki extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int E;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public float L;

    /* renamed from: L  reason: collision with other field name */
    public int f6538L;

    /* renamed from: L  reason: collision with other field name */
    public boolean f6539L;
    public int M;
    public int N;
    public float O;

    /* renamed from: O  reason: collision with other field name */
    public int f6540O;

    /* renamed from: O  reason: collision with other field name */
    public boolean f6541O;
    public int P;
    public int Q;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f6542R;

    /* renamed from: R  reason: collision with other field name */
    public String f6543R;

    /* renamed from: R  reason: collision with other field name */
    public kwo f6544R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6545R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public float X;

    /* renamed from: X  reason: collision with other field name */
    public int f6546X;

    /* renamed from: X  reason: collision with other field name */
    public boolean f6547X;
    public int Y;
    public float Z;

    /* renamed from: Z  reason: collision with other field name */
    public int f6548Z;

    /* renamed from: Z  reason: collision with other field name */
    public boolean f6549Z;
    public int a;
    public float c;

    /* renamed from: c  reason: collision with other field name */
    public int f6550c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f6551c;
    public int d;
    public float e;

    /* renamed from: e  reason: collision with other field name */
    public int f6552e;

    /* renamed from: e  reason: collision with other field name */
    public boolean f6553e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public float m;

    /* renamed from: m  reason: collision with other field name */
    public int f6554m;
    public int n;
    public int o;
    public int p;
    public int r;
    public int s;
    public int t;
    public int u;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public int f6555v;

    /* renamed from: v  reason: collision with other field name */
    public String f6556v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6557v;
    public float x;

    /* renamed from: x  reason: collision with other field name */
    public int f6558x;
    public int y;
    public int z;

    public nki(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6542R = -1;
        this.f6555v = -1;
        this.R = -1.0f;
        this.f6545R = true;
        this.f6550c = -1;
        this.f6552e = -1;
        this.f6546X = -1;
        this.f6540O = -1;
        this.f6538L = -1;
        this.f6548Z = -1;
        this.f6554m = -1;
        this.f6558x = -1;
        this.H = -1;
        this.U = -1;
        this.C = -1;
        this.N = -1;
        this.P = 0;
        this.v = 0.0f;
        this.j = -1;
        this.g = -1;
        this.y = -1;
        this.t = -1;
        this.i = Integer.MIN_VALUE;
        this.V = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.K = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
        this.Y = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.I = 0;
        this.c = 0.5f;
        this.e = 0.5f;
        this.f6543R = null;
        this.X = -1.0f;
        this.O = -1.0f;
        this.u = 0;
        this.z = 0;
        this.n = 0;
        this.Q = 0;
        this.A = 0;
        this.S = 0;
        this.d = 0;
        this.W = 0;
        this.L = 1.0f;
        this.Z = 1.0f;
        this.s = -1;
        this.T = -1;
        this.r = -1;
        this.f6557v = false;
        this.f6551c = false;
        this.f6556v = null;
        this.k = 0;
        this.f6553e = true;
        this.f6547X = true;
        this.f6541O = false;
        this.f6539L = false;
        this.f6549Z = false;
        this.p = -1;
        this.G = -1;
        this.B = -1;
        this.l = -1;
        this.M = Integer.MIN_VALUE;
        this.E = Integer.MIN_VALUE;
        this.m = 0.5f;
        this.f6544R = new kwo();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gvP.v);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = lEu.R.get(index);
            switch (i2) {
                case 1:
                    this.r = obtainStyledAttributes.getInt(index, this.r);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.N);
                    this.N = resourceId;
                    if (resourceId == -1) {
                        this.N = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, this.v) % 360.0f;
                    this.v = f;
                    if (f < 0.0f) {
                        this.v = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                    this.f6542R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f6542R);
                    break;
                case 6:
                    this.f6555v = obtainStyledAttributes.getDimensionPixelOffset(index, this.f6555v);
                    break;
                case 7:
                    this.R = obtainStyledAttributes.getFloat(index, this.R);
                    break;
                case VmNativeCallback.$stable:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f6550c);
                    this.f6550c = resourceId2;
                    if (resourceId2 == -1) {
                        this.f6550c = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f6552e);
                    this.f6552e = resourceId3;
                    if (resourceId3 == -1) {
                        this.f6552e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f6546X);
                    this.f6546X = resourceId4;
                    if (resourceId4 == -1) {
                        this.f6546X = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case lVo.HKDF_SALT_FIELD_NUMBER:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f6540O);
                    this.f6540O = resourceId5;
                    if (resourceId5 == -1) {
                        this.f6540O = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f6538L);
                    this.f6538L = resourceId6;
                    if (resourceId6 == -1) {
                        this.f6538L = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f6548Z);
                    this.f6548Z = resourceId7;
                    if (resourceId7 == -1) {
                        this.f6548Z = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f6554m);
                    this.f6554m = resourceId8;
                    if (resourceId8 == -1) {
                        this.f6554m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f6558x);
                    this.f6558x = resourceId9;
                    if (resourceId9 == -1) {
                        this.f6558x = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, this.H);
                    this.H = resourceId10;
                    if (resourceId10 == -1) {
                        this.H = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId11;
                    if (resourceId11 == -1) {
                        this.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, this.g);
                    this.g = resourceId12;
                    if (resourceId12 == -1) {
                        this.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, this.y);
                    this.y = resourceId13;
                    if (resourceId13 == -1) {
                        this.y = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, this.t);
                    this.t = resourceId14;
                    if (resourceId14 == -1) {
                        this.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    this.i = obtainStyledAttributes.getDimensionPixelSize(index, this.i);
                    break;
                case 22:
                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                    break;
                case 23:
                    this.o = obtainStyledAttributes.getDimensionPixelSize(index, this.o);
                    break;
                case 24:
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 25:
                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 26:
                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                    break;
                case 27:
                    this.f6557v = obtainStyledAttributes.getBoolean(index, this.f6557v);
                    break;
                case 28:
                    this.f6551c = obtainStyledAttributes.getBoolean(index, this.f6551c);
                    break;
                case 29:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 30:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    this.n = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    this.Q = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, this.A) == -2) {
                            this.A = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        this.d = obtainStyledAttributes.getDimensionPixelSize(index, this.d);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, this.d) == -2) {
                            this.d = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    this.L = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.L));
                    this.n = 2;
                    break;
                case 36:
                    try {
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                            this.S = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, this.W) == -2) {
                            this.W = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    this.Z = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.Z));
                    this.Q = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            nsw.Z(this, obtainStyledAttributes.getString(index));
                            continue;
                        case 45:
                            this.X = obtainStyledAttributes.getFloat(index, this.X);
                            continue;
                        case 46:
                            this.O = obtainStyledAttributes.getFloat(index, this.O);
                            continue;
                        case 47:
                            this.u = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 48:
                            this.z = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 49:
                            this.s = obtainStyledAttributes.getDimensionPixelOffset(index, this.s);
                            continue;
                        case 50:
                            this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                            continue;
                        case 51:
                            this.f6556v = obtainStyledAttributes.getString(index);
                            continue;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, this.U);
                            this.U = resourceId15;
                            if (resourceId15 == -1) {
                                this.U = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, this.C);
                            this.C = resourceId16;
                            if (resourceId16 == -1) {
                                this.C = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 54:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            continue;
                        case 55:
                            this.h = obtainStyledAttributes.getDimensionPixelSize(index, this.h);
                            continue;
                        default:
                            switch (i2) {
                                case 64:
                                    nsw.L(this, obtainStyledAttributes, index, 0);
                                    continue;
                                    continue;
                                case 65:
                                    nsw.L(this, obtainStyledAttributes, index, 1);
                                    continue;
                                case 66:
                                    this.k = obtainStyledAttributes.getInt(index, this.k);
                                    continue;
                                case 67:
                                    this.f6545R = obtainStyledAttributes.getBoolean(index, this.f6545R);
                                    continue;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        R();
    }

    public final void R() {
        this.f6539L = false;
        this.f6553e = true;
        this.f6547X = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f6557v) {
            this.f6553e = false;
            if (this.n == 0) {
                this.n = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f6551c) {
            this.f6547X = false;
            if (this.Q == 0) {
                this.Q = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f6553e = false;
            if (i == 0 && this.n == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f6557v = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f6547X = false;
            if (i2 == 0 && this.Q == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f6551c = true;
            }
        }
        if (this.R != -1.0f || this.f6542R != -1 || this.f6555v != -1) {
            this.f6539L = true;
            this.f6553e = true;
            this.f6547X = true;
            if (!(this.f6544R instanceof gOm)) {
                this.f6544R = new gOm();
            }
            ((gOm) this.f6544R).G(this.r);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resolveLayoutDirection(int r11) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nki.resolveLayoutDirection(int):void");
    }

    public nki() {
        super(-2, -2);
        this.f6542R = -1;
        this.f6555v = -1;
        this.R = -1.0f;
        this.f6545R = true;
        this.f6550c = -1;
        this.f6552e = -1;
        this.f6546X = -1;
        this.f6540O = -1;
        this.f6538L = -1;
        this.f6548Z = -1;
        this.f6554m = -1;
        this.f6558x = -1;
        this.H = -1;
        this.U = -1;
        this.C = -1;
        this.N = -1;
        this.P = 0;
        this.v = 0.0f;
        this.j = -1;
        this.g = -1;
        this.y = -1;
        this.t = -1;
        this.i = Integer.MIN_VALUE;
        this.V = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.K = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
        this.Y = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.I = 0;
        this.c = 0.5f;
        this.e = 0.5f;
        this.f6543R = null;
        this.X = -1.0f;
        this.O = -1.0f;
        this.u = 0;
        this.z = 0;
        this.n = 0;
        this.Q = 0;
        this.A = 0;
        this.S = 0;
        this.d = 0;
        this.W = 0;
        this.L = 1.0f;
        this.Z = 1.0f;
        this.s = -1;
        this.T = -1;
        this.r = -1;
        this.f6557v = false;
        this.f6551c = false;
        this.f6556v = null;
        this.k = 0;
        this.f6553e = true;
        this.f6547X = true;
        this.f6541O = false;
        this.f6539L = false;
        this.f6549Z = false;
        this.p = -1;
        this.G = -1;
        this.B = -1;
        this.l = -1;
        this.M = Integer.MIN_VALUE;
        this.E = Integer.MIN_VALUE;
        this.m = 0.5f;
        this.f6544R = new kwo();
    }

    public nki(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6542R = -1;
        this.f6555v = -1;
        this.R = -1.0f;
        this.f6545R = true;
        this.f6550c = -1;
        this.f6552e = -1;
        this.f6546X = -1;
        this.f6540O = -1;
        this.f6538L = -1;
        this.f6548Z = -1;
        this.f6554m = -1;
        this.f6558x = -1;
        this.H = -1;
        this.U = -1;
        this.C = -1;
        this.N = -1;
        this.P = 0;
        this.v = 0.0f;
        this.j = -1;
        this.g = -1;
        this.y = -1;
        this.t = -1;
        this.i = Integer.MIN_VALUE;
        this.V = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.K = Integer.MIN_VALUE;
        this.J = Integer.MIN_VALUE;
        this.Y = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.I = 0;
        this.c = 0.5f;
        this.e = 0.5f;
        this.f6543R = null;
        this.X = -1.0f;
        this.O = -1.0f;
        this.u = 0;
        this.z = 0;
        this.n = 0;
        this.Q = 0;
        this.A = 0;
        this.S = 0;
        this.d = 0;
        this.W = 0;
        this.L = 1.0f;
        this.Z = 1.0f;
        this.s = -1;
        this.T = -1;
        this.r = -1;
        this.f6557v = false;
        this.f6551c = false;
        this.f6556v = null;
        this.k = 0;
        this.f6553e = true;
        this.f6547X = true;
        this.f6541O = false;
        this.f6539L = false;
        this.f6549Z = false;
        this.p = -1;
        this.G = -1;
        this.B = -1;
        this.l = -1;
        this.M = Integer.MIN_VALUE;
        this.E = Integer.MIN_VALUE;
        this.m = 0.5f;
        this.f6544R = new kwo();
    }
}
