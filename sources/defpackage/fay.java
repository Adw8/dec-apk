package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: fay  reason: default package */
/* loaded from: classes.dex */
public final class fay {
    public static SparseIntArray R;

    /* renamed from: R  reason: collision with other field name */
    public int f3450R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f3453R;

    /* renamed from: c  reason: collision with other field name */
    public String f3458c;

    /* renamed from: v  reason: collision with other field name */
    public int f3462v;

    /* renamed from: v  reason: collision with other field name */
    public String f3463v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3452R = false;

    /* renamed from: c  reason: collision with other field name */
    public int f3457c = -1;

    /* renamed from: e  reason: collision with other field name */
    public int f3460e = -1;

    /* renamed from: R  reason: collision with other field name */
    public float f3449R = -1.0f;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3464v = true;

    /* renamed from: X  reason: collision with other field name */
    public int f3454X = -1;

    /* renamed from: O  reason: collision with other field name */
    public int f3448O = -1;

    /* renamed from: L  reason: collision with other field name */
    public int f3447L = -1;

    /* renamed from: Z  reason: collision with other field name */
    public int f3456Z = -1;
    public int m = -1;
    public int x = -1;
    public int H = -1;
    public int U = -1;
    public int C = -1;
    public int N = -1;
    public int P = -1;
    public int j = -1;
    public int g = -1;
    public int y = -1;
    public int t = -1;
    public float v = 0.5f;
    public float c = 0.5f;

    /* renamed from: R  reason: collision with other field name */
    public String f3451R = null;
    public int i = -1;
    public int V = 0;
    public float e = 0.0f;
    public int o = -1;
    public int K = -1;
    public int J = -1;
    public int Y = 0;
    public int h = 0;
    public int I = 0;
    public int u = 0;
    public int z = 0;
    public int n = 0;
    public int Q = 0;
    public int A = Integer.MIN_VALUE;
    public int S = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int W = Integer.MIN_VALUE;
    public int s = Integer.MIN_VALUE;
    public int T = Integer.MIN_VALUE;
    public int r = Integer.MIN_VALUE;
    public float X = -1.0f;
    public float O = -1.0f;
    public int k = 0;
    public int p = 0;
    public int G = 0;
    public int B = 0;
    public int l = 0;
    public int M = 0;
    public int E = 0;
    public int f = 0;
    public float L = 1.0f;
    public float Z = 1.0f;
    public int a = -1;
    public int F = 0;
    public int D = -1;

    /* renamed from: c  reason: collision with other field name */
    public boolean f3459c = false;

    /* renamed from: e  reason: collision with other field name */
    public boolean f3461e = false;

    /* renamed from: X  reason: collision with other field name */
    public boolean f3455X = true;
    public int b = 0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        R = sparseIntArray;
        sparseIntArray.append(43, 24);
        R.append(44, 25);
        R.append(46, 28);
        R.append(47, 29);
        R.append(52, 35);
        R.append(51, 34);
        R.append(24, 4);
        R.append(23, 3);
        R.append(19, 1);
        R.append(61, 6);
        R.append(62, 7);
        R.append(31, 17);
        R.append(32, 18);
        R.append(33, 19);
        R.append(15, 90);
        R.append(0, 26);
        R.append(48, 31);
        R.append(49, 32);
        R.append(30, 10);
        R.append(29, 9);
        R.append(66, 13);
        R.append(69, 16);
        R.append(67, 14);
        R.append(64, 11);
        R.append(68, 15);
        R.append(65, 12);
        R.append(55, 38);
        R.append(41, 37);
        R.append(40, 39);
        R.append(54, 40);
        R.append(39, 20);
        R.append(53, 36);
        R.append(28, 5);
        R.append(42, 91);
        R.append(50, 91);
        R.append(45, 91);
        R.append(22, 91);
        R.append(18, 91);
        R.append(3, 23);
        R.append(5, 27);
        R.append(7, 30);
        R.append(8, 8);
        R.append(4, 33);
        R.append(6, 2);
        R.append(1, 22);
        R.append(2, 21);
        R.append(56, 41);
        R.append(34, 42);
        R.append(17, 41);
        R.append(16, 42);
        R.append(71, 76);
        R.append(25, 61);
        R.append(27, 62);
        R.append(26, 63);
        R.append(60, 69);
        R.append(38, 70);
        R.append(12, 71);
        R.append(10, 72);
        R.append(11, 73);
        R.append(13, 74);
        R.append(9, 75);
    }

    public final void R(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gvP.X);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = R.get(index);
            switch (i2) {
                case 1:
                    this.C = nsw.O(obtainStyledAttributes, index, this.C);
                    break;
                case 2:
                    this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                    break;
                case 3:
                    this.U = nsw.O(obtainStyledAttributes, index, this.U);
                    break;
                case 4:
                    this.H = nsw.O(obtainStyledAttributes, index, this.H);
                    break;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    this.f3451R = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.o = obtainStyledAttributes.getDimensionPixelOffset(index, this.o);
                    break;
                case 7:
                    this.K = obtainStyledAttributes.getDimensionPixelOffset(index, this.K);
                    break;
                case VmNativeCallback.$stable:
                    this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                    break;
                case 9:
                    this.t = nsw.O(obtainStyledAttributes, index, this.t);
                    break;
                case 10:
                    this.y = nsw.O(obtainStyledAttributes, index, this.y);
                    break;
                case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                    break;
                case 12:
                    this.s = obtainStyledAttributes.getDimensionPixelSize(index, this.s);
                    break;
                case 13:
                    this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                    break;
                case 14:
                    this.d = obtainStyledAttributes.getDimensionPixelSize(index, this.d);
                    break;
                case 15:
                    this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                    break;
                case 16:
                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                    break;
                case 17:
                    this.f3457c = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3457c);
                    break;
                case 18:
                    this.f3460e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3460e);
                    break;
                case 19:
                    this.f3449R = obtainStyledAttributes.getFloat(index, this.f3449R);
                    break;
                case 20:
                    this.v = obtainStyledAttributes.getFloat(index, this.v);
                    break;
                case 21:
                    this.f3462v = obtainStyledAttributes.getLayoutDimension(index, this.f3462v);
                    break;
                case 22:
                    this.f3450R = obtainStyledAttributes.getLayoutDimension(index, this.f3450R);
                    break;
                case 23:
                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                    break;
                case 24:
                    this.f3454X = nsw.O(obtainStyledAttributes, index, this.f3454X);
                    break;
                case 25:
                    this.f3448O = nsw.O(obtainStyledAttributes, index, this.f3448O);
                    break;
                case 26:
                    this.J = obtainStyledAttributes.getInt(index, this.J);
                    break;
                case 27:
                    this.h = obtainStyledAttributes.getDimensionPixelSize(index, this.h);
                    break;
                case 28:
                    this.f3447L = nsw.O(obtainStyledAttributes, index, this.f3447L);
                    break;
                case 29:
                    this.f3456Z = nsw.O(obtainStyledAttributes, index, this.f3456Z);
                    break;
                case 30:
                    this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                    break;
                case 31:
                    this.j = nsw.O(obtainStyledAttributes, index, this.j);
                    break;
                case 32:
                    this.g = nsw.O(obtainStyledAttributes, index, this.g);
                    break;
                case 33:
                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case 34:
                    this.x = nsw.O(obtainStyledAttributes, index, this.x);
                    break;
                case 35:
                    this.m = nsw.O(obtainStyledAttributes, index, this.m);
                    break;
                case 36:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 37:
                    this.O = obtainStyledAttributes.getFloat(index, this.O);
                    break;
                case 38:
                    this.X = obtainStyledAttributes.getFloat(index, this.X);
                    break;
                case 39:
                    this.k = obtainStyledAttributes.getInt(index, this.k);
                    break;
                case 40:
                    this.p = obtainStyledAttributes.getInt(index, this.p);
                    break;
                case 41:
                    nsw.L(this, obtainStyledAttributes, index, 0);
                    break;
                case 42:
                    nsw.L(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case 61:
                            this.i = nsw.O(obtainStyledAttributes, index, this.i);
                            continue;
                        case 62:
                            this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                            continue;
                        case 63:
                            this.e = obtainStyledAttributes.getFloat(index, this.e);
                            continue;
                        default:
                            switch (i2) {
                                case 69:
                                    this.L = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                    continue;
                                case 70:
                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    this.a = obtainStyledAttributes.getInt(index, this.a);
                                    continue;
                                case 73:
                                    this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                                    continue;
                                case 74:
                                    this.f3463v = obtainStyledAttributes.getString(index);
                                    continue;
                                case 75:
                                    this.f3455X = obtainStyledAttributes.getBoolean(index, this.f3455X);
                                    continue;
                                case 76:
                                    this.b = obtainStyledAttributes.getInt(index, this.b);
                                    continue;
                                case 77:
                                    this.N = nsw.O(obtainStyledAttributes, index, this.N);
                                    continue;
                                case 78:
                                    this.P = nsw.O(obtainStyledAttributes, index, this.P);
                                    continue;
                                case 79:
                                    this.r = obtainStyledAttributes.getDimensionPixelSize(index, this.r);
                                    continue;
                                case 80:
                                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                                    continue;
                                case 81:
                                    this.G = obtainStyledAttributes.getInt(index, this.G);
                                    continue;
                                case 82:
                                    this.B = obtainStyledAttributes.getInt(index, this.B);
                                    continue;
                                case 83:
                                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                    continue;
                                case 84:
                                    this.l = obtainStyledAttributes.getDimensionPixelSize(index, this.l);
                                    continue;
                                case 85:
                                    this.f = obtainStyledAttributes.getDimensionPixelSize(index, this.f);
                                    continue;
                                case 86:
                                    this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                                    continue;
                                case 87:
                                    this.f3459c = obtainStyledAttributes.getBoolean(index, this.f3459c);
                                    continue;
                                case 88:
                                    this.f3461e = obtainStyledAttributes.getBoolean(index, this.f3461e);
                                    continue;
                                case 89:
                                    this.f3458c = obtainStyledAttributes.getString(index);
                                    continue;
                                case 90:
                                    this.f3464v = obtainStyledAttributes.getBoolean(index, this.f3464v);
                                    continue;
                                case 91:
                                    StringBuilder U = opT.U("unused attribute 0x");
                                    U.append(Integer.toHexString(index));
                                    U.append("   ");
                                    U.append(R.get(index));
                                    Log.w("ConstraintSet", U.toString());
                                    continue;
                                default:
                                    StringBuilder U2 = opT.U("Unknown attribute 0x");
                                    U2.append(Integer.toHexString(index));
                                    U2.append("   ");
                                    U2.append(R.get(index));
                                    Log.w("ConstraintSet", U2.toString());
                                    continue;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
