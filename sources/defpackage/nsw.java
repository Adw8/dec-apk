package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: nsw  reason: default package */
/* loaded from: classes.dex */
public final class nsw {

    /* renamed from: R  reason: collision with other field name */
    public HashMap f6614R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public boolean f6615R = true;

    /* renamed from: v  reason: collision with other field name */
    public HashMap f6616v = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f6613R = {0, 4, 8};
    public static SparseIntArray R = new SparseIntArray();
    public static SparseIntArray v = new SparseIntArray();

    static {
        R.append(82, 25);
        R.append(83, 26);
        R.append(85, 29);
        R.append(86, 30);
        R.append(92, 36);
        R.append(91, 35);
        R.append(63, 4);
        R.append(62, 3);
        R.append(58, 1);
        R.append(60, 91);
        R.append(59, 92);
        R.append(101, 6);
        R.append(102, 7);
        R.append(70, 17);
        R.append(71, 18);
        R.append(72, 19);
        R.append(54, 99);
        R.append(0, 27);
        R.append(87, 32);
        R.append(88, 33);
        R.append(69, 10);
        R.append(68, 9);
        R.append(106, 13);
        R.append(109, 16);
        R.append(107, 14);
        R.append(104, 11);
        R.append(108, 15);
        R.append(105, 12);
        R.append(95, 40);
        R.append(80, 39);
        R.append(79, 41);
        R.append(94, 42);
        R.append(78, 20);
        R.append(93, 37);
        R.append(67, 5);
        R.append(81, 87);
        R.append(90, 87);
        R.append(84, 87);
        R.append(61, 87);
        R.append(57, 87);
        R.append(5, 24);
        R.append(7, 28);
        R.append(23, 31);
        R.append(24, 8);
        R.append(6, 34);
        R.append(8, 2);
        R.append(3, 23);
        R.append(4, 21);
        R.append(96, 95);
        R.append(73, 96);
        R.append(2, 22);
        R.append(13, 43);
        R.append(26, 44);
        R.append(21, 45);
        R.append(22, 46);
        R.append(20, 60);
        R.append(18, 47);
        R.append(19, 48);
        R.append(14, 49);
        R.append(15, 50);
        R.append(16, 51);
        R.append(17, 52);
        R.append(25, 53);
        R.append(97, 54);
        R.append(74, 55);
        R.append(98, 56);
        R.append(75, 57);
        R.append(99, 58);
        R.append(76, 59);
        R.append(64, 61);
        R.append(66, 62);
        R.append(65, 63);
        R.append(28, 64);
        R.append(121, 65);
        R.append(35, 66);
        R.append(122, 67);
        R.append(113, 79);
        R.append(1, 38);
        R.append(112, 68);
        R.append(100, 69);
        R.append(77, 70);
        R.append(111, 97);
        R.append(32, 71);
        R.append(30, 72);
        R.append(31, 73);
        R.append(33, 74);
        R.append(29, 75);
        R.append(114, 76);
        R.append(89, 77);
        R.append(123, 78);
        R.append(56, 80);
        R.append(55, 81);
        R.append(116, 82);
        R.append(120, 83);
        R.append(119, 84);
        R.append(118, 85);
        R.append(117, 86);
        v.append(85, 6);
        v.append(85, 7);
        v.append(0, 27);
        v.append(89, 13);
        v.append(92, 16);
        v.append(90, 14);
        v.append(87, 11);
        v.append(91, 15);
        v.append(88, 12);
        v.append(78, 40);
        v.append(71, 39);
        v.append(70, 41);
        v.append(77, 42);
        v.append(69, 20);
        v.append(76, 37);
        v.append(60, 5);
        v.append(72, 87);
        v.append(75, 87);
        v.append(73, 87);
        v.append(57, 87);
        v.append(56, 87);
        v.append(5, 24);
        v.append(7, 28);
        v.append(23, 31);
        v.append(24, 8);
        v.append(6, 34);
        v.append(8, 2);
        v.append(3, 23);
        v.append(4, 21);
        v.append(79, 95);
        v.append(64, 96);
        v.append(2, 22);
        v.append(13, 43);
        v.append(26, 44);
        v.append(21, 45);
        v.append(22, 46);
        v.append(20, 60);
        v.append(18, 47);
        v.append(19, 48);
        v.append(14, 49);
        v.append(15, 50);
        v.append(16, 51);
        v.append(17, 52);
        v.append(25, 53);
        v.append(80, 54);
        v.append(65, 55);
        v.append(81, 56);
        v.append(66, 57);
        v.append(82, 58);
        v.append(67, 59);
        v.append(59, 62);
        v.append(58, 63);
        v.append(28, 64);
        v.append(105, 65);
        v.append(34, 66);
        v.append(106, 67);
        v.append(96, 79);
        v.append(1, 38);
        v.append(97, 98);
        v.append(95, 68);
        v.append(83, 69);
        v.append(68, 70);
        v.append(32, 71);
        v.append(30, 72);
        v.append(31, 73);
        v.append(33, 74);
        v.append(29, 75);
        v.append(98, 76);
        v.append(74, 77);
        v.append(107, 78);
        v.append(55, 80);
        v.append(54, 81);
        v.append(100, 82);
        v.append(104, 83);
        v.append(103, 84);
        v.append(102, 85);
        v.append(101, 86);
        v.append(94, 97);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void L(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 374
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsw.L(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static int O(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public static void Z(nki nki, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        nki.f6543R = str;
    }

    public static int[] c(Barrier barrier, String str) {
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        for (String str2 : split) {
            String trim = str2.trim();
            Object obj = null;
            try {
                i = n1P.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1252R) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f1252R.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            i2++;
            iArr[i2] = i;
        }
        return i2 != split.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static djn e(Context context, AttributeSet attributeSet, boolean z) {
        djn djn = new djn();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? gvP.c : gvP.R);
        int i = 3;
        int i2 = 1;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            mAn man = new mAn();
            djn.f2851R.getClass();
            djn.f2847R.getClass();
            djn.f2850R.getClass();
            djn.f2848R.getClass();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i3);
                switch (v.get(index)) {
                    case 2:
                        man.v(2, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.u));
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder U = opT.U("Unknown attribute 0x");
                        U.append(Integer.toHexString(index));
                        U.append("   ");
                        U.append(R.get(index));
                        Log.w("ConstraintSet", U.toString());
                        break;
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                        man.c(5, obtainStyledAttributes.getString(index));
                        break;
                    case 6:
                        man.v(6, obtainStyledAttributes.getDimensionPixelOffset(index, djn.f2847R.o));
                        break;
                    case 7:
                        man.v(7, obtainStyledAttributes.getDimensionPixelOffset(index, djn.f2847R.K));
                        break;
                    case VmNativeCallback.$stable:
                        man.v(8, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.z));
                        break;
                    case lVo.HKDF_SALT_FIELD_NUMBER:
                        man.v(11, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.W));
                        break;
                    case 12:
                        man.v(12, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.s));
                        break;
                    case 13:
                        man.v(13, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.A));
                        break;
                    case 14:
                        man.v(14, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.d));
                        break;
                    case 15:
                        man.v(15, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.T));
                        break;
                    case 16:
                        man.v(16, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.S));
                        break;
                    case 17:
                        man.v(17, obtainStyledAttributes.getDimensionPixelOffset(index, djn.f2847R.f3457c));
                        break;
                    case 18:
                        man.v(18, obtainStyledAttributes.getDimensionPixelOffset(index, djn.f2847R.f3460e));
                        break;
                    case 19:
                        man.R(19, obtainStyledAttributes.getFloat(index, djn.f2847R.f3449R));
                        break;
                    case 20:
                        man.R(20, obtainStyledAttributes.getFloat(index, djn.f2847R.v));
                        break;
                    case 21:
                        man.v(21, obtainStyledAttributes.getLayoutDimension(index, djn.f2847R.f3462v));
                        break;
                    case 22:
                        man.v(22, f6613R[obtainStyledAttributes.getInt(index, djn.f2850R.f6141R)]);
                        break;
                    case 23:
                        man.v(23, obtainStyledAttributes.getLayoutDimension(index, djn.f2847R.f3450R));
                        break;
                    case 24:
                        man.v(24, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.Y));
                        break;
                    case 27:
                        man.v(27, obtainStyledAttributes.getInt(index, djn.f2847R.J));
                        break;
                    case 28:
                        man.v(28, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.h));
                        break;
                    case 31:
                        man.v(31, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.n));
                        break;
                    case 34:
                        man.v(34, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.I));
                        break;
                    case 37:
                        man.R(37, obtainStyledAttributes.getFloat(index, djn.f2847R.c));
                        break;
                    case 38:
                        int resourceId = obtainStyledAttributes.getResourceId(index, djn.R);
                        djn.R = resourceId;
                        man.v(38, resourceId);
                        break;
                    case 39:
                        man.R(39, obtainStyledAttributes.getFloat(index, djn.f2847R.O));
                        break;
                    case 40:
                        man.R(40, obtainStyledAttributes.getFloat(index, djn.f2847R.X));
                        break;
                    case 41:
                        man.v(41, obtainStyledAttributes.getInt(index, djn.f2847R.k));
                        break;
                    case 42:
                        man.v(42, obtainStyledAttributes.getInt(index, djn.f2847R.p));
                        break;
                    case 43:
                        man.R(43, obtainStyledAttributes.getFloat(index, djn.f2850R.R));
                        break;
                    case 44:
                        man.e(44, true);
                        man.R(44, obtainStyledAttributes.getDimension(index, djn.f2848R.H));
                        break;
                    case 45:
                        man.R(45, obtainStyledAttributes.getFloat(index, djn.f2848R.v));
                        break;
                    case 46:
                        man.R(46, obtainStyledAttributes.getFloat(index, djn.f2848R.c));
                        break;
                    case 47:
                        man.R(47, obtainStyledAttributes.getFloat(index, djn.f2848R.e));
                        break;
                    case 48:
                        man.R(48, obtainStyledAttributes.getFloat(index, djn.f2848R.X));
                        break;
                    case 49:
                        man.R(49, obtainStyledAttributes.getDimension(index, djn.f2848R.O));
                        break;
                    case 50:
                        man.R(50, obtainStyledAttributes.getDimension(index, djn.f2848R.L));
                        break;
                    case 51:
                        man.R(51, obtainStyledAttributes.getDimension(index, djn.f2848R.Z));
                        break;
                    case 52:
                        man.R(52, obtainStyledAttributes.getDimension(index, djn.f2848R.m));
                        break;
                    case 53:
                        man.R(53, obtainStyledAttributes.getDimension(index, djn.f2848R.x));
                        break;
                    case 54:
                        man.v(54, obtainStyledAttributes.getInt(index, djn.f2847R.G));
                        break;
                    case 55:
                        man.v(55, obtainStyledAttributes.getInt(index, djn.f2847R.B));
                        break;
                    case 56:
                        man.v(56, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.l));
                        break;
                    case 57:
                        man.v(57, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.M));
                        break;
                    case 58:
                        man.v(58, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.E));
                        break;
                    case 59:
                        man.v(59, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.f));
                        break;
                    case 60:
                        man.R(60, obtainStyledAttributes.getFloat(index, djn.f2848R.f4203R));
                        break;
                    case 62:
                        man.v(62, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.V));
                        break;
                    case 63:
                        man.R(63, obtainStyledAttributes.getFloat(index, djn.f2847R.e));
                        break;
                    case 64:
                        man.v(64, O(obtainStyledAttributes, index, djn.f2851R.f6866R));
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            man.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            man.c(65, l1r.f5542R[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        man.v(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        man.R(67, obtainStyledAttributes.getFloat(index, djn.f2851R.v));
                        break;
                    case 68:
                        man.R(68, obtainStyledAttributes.getFloat(index, djn.f2850R.v));
                        break;
                    case 69:
                        man.R(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        man.R(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        man.v(72, obtainStyledAttributes.getInt(index, djn.f2847R.a));
                        break;
                    case 73:
                        man.v(73, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.F));
                        break;
                    case 74:
                        man.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        man.e(75, obtainStyledAttributes.getBoolean(index, djn.f2847R.f3455X));
                        break;
                    case 76:
                        man.v(76, obtainStyledAttributes.getInt(index, djn.f2851R.f6868c));
                        break;
                    case 77:
                        man.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        man.v(78, obtainStyledAttributes.getInt(index, djn.f2850R.f6142v));
                        break;
                    case 79:
                        man.R(79, obtainStyledAttributes.getFloat(index, djn.f2851R.f6865R));
                        break;
                    case 80:
                        man.e(80, obtainStyledAttributes.getBoolean(index, djn.f2847R.f3459c));
                        break;
                    case 81:
                        man.e(81, obtainStyledAttributes.getBoolean(index, djn.f2847R.f3461e));
                        break;
                    case 82:
                        man.v(82, obtainStyledAttributes.getInteger(index, djn.f2851R.f6869v));
                        break;
                    case 83:
                        man.v(83, O(obtainStyledAttributes, index, djn.f2848R.f4204R));
                        break;
                    case 84:
                        man.v(84, obtainStyledAttributes.getInteger(index, djn.f2851R.e));
                        break;
                    case 85:
                        man.R(85, obtainStyledAttributes.getFloat(index, djn.f2851R.c));
                        break;
                    case 86:
                        int i4 = obtainStyledAttributes.peekValue(index).type;
                        if (i4 != i2) {
                            if (i4 == 3) {
                                djn.f2851R.f6867R = obtainStyledAttributes.getString(index);
                                man.c(90, djn.f2851R.f6867R);
                                if (djn.f2851R.f6867R.indexOf("/") > 0) {
                                    djn.f2851R.O = obtainStyledAttributes.getResourceId(index, -1);
                                    man.v(89, djn.f2851R.O);
                                    djn.f2851R.X = -2;
                                    man.v(88, -2);
                                    break;
                                } else {
                                    djn.f2851R.X = -1;
                                    man.v(88, -1);
                                    break;
                                }
                            } else {
                                oeZ oez = djn.f2851R;
                                oez.X = obtainStyledAttributes.getInteger(index, oez.O);
                                man.v(88, djn.f2851R.X);
                                break;
                            }
                        } else {
                            djn.f2851R.O = obtainStyledAttributes.getResourceId(index, -1);
                            man.v(89, djn.f2851R.O);
                            oeZ oez2 = djn.f2851R;
                            if (oez2.O != -1) {
                                oez2.X = -2;
                                man.v(88, -2);
                                break;
                            } else {
                                break;
                            }
                        }
                    case 87:
                        StringBuilder U2 = opT.U("unused attribute 0x");
                        U2.append(Integer.toHexString(index));
                        U2.append("   ");
                        U2.append(R.get(index));
                        Log.w("ConstraintSet", U2.toString());
                        break;
                    case 93:
                        man.v(93, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.Q));
                        break;
                    case 94:
                        man.v(94, obtainStyledAttributes.getDimensionPixelSize(index, djn.f2847R.r));
                        break;
                    case 95:
                        L(man, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        L(man, obtainStyledAttributes, index, i2);
                        break;
                    case 97:
                        man.v(97, obtainStyledAttributes.getInt(index, djn.f2847R.b));
                        break;
                    case 98:
                        int i5 = ng2.x;
                        if (obtainStyledAttributes.peekValue(index).type == i) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            djn.R = obtainStyledAttributes.getResourceId(index, djn.R);
                            break;
                        }
                    case 99:
                        man.e(99, obtainStyledAttributes.getBoolean(index, djn.f2847R.f3464v));
                        break;
                }
                i3++;
                i = 3;
                i2 = 1;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount2; i6++) {
                int index2 = obtainStyledAttributes.getIndex(i6);
                if (!(index2 == 1 || 23 == index2 || 24 == index2)) {
                    djn.f2851R.getClass();
                    djn.f2847R.getClass();
                    djn.f2850R.getClass();
                    djn.f2848R.getClass();
                }
                switch (R.get(index2)) {
                    case 1:
                        fay fay = djn.f2847R;
                        fay.C = O(obtainStyledAttributes, index2, fay.C);
                        break;
                    case 2:
                        fay fay2 = djn.f2847R;
                        fay2.u = obtainStyledAttributes.getDimensionPixelSize(index2, fay2.u);
                        break;
                    case 3:
                        fay fay3 = djn.f2847R;
                        fay3.U = O(obtainStyledAttributes, index2, fay3.U);
                        break;
                    case 4:
                        fay fay4 = djn.f2847R;
                        fay4.H = O(obtainStyledAttributes, index2, fay4.H);
                        break;
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                        djn.f2847R.f3451R = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        fay fay5 = djn.f2847R;
                        fay5.o = obtainStyledAttributes.getDimensionPixelOffset(index2, fay5.o);
                        break;
                    case 7:
                        fay fay6 = djn.f2847R;
                        fay6.K = obtainStyledAttributes.getDimensionPixelOffset(index2, fay6.K);
                        break;
                    case VmNativeCallback.$stable:
                        fay fay7 = djn.f2847R;
                        fay7.z = obtainStyledAttributes.getDimensionPixelSize(index2, fay7.z);
                        break;
                    case 9:
                        fay fay8 = djn.f2847R;
                        fay8.t = O(obtainStyledAttributes, index2, fay8.t);
                        break;
                    case 10:
                        fay fay9 = djn.f2847R;
                        fay9.y = O(obtainStyledAttributes, index2, fay9.y);
                        break;
                    case lVo.HKDF_SALT_FIELD_NUMBER:
                        fay fay10 = djn.f2847R;
                        fay10.W = obtainStyledAttributes.getDimensionPixelSize(index2, fay10.W);
                        break;
                    case 12:
                        fay fay11 = djn.f2847R;
                        fay11.s = obtainStyledAttributes.getDimensionPixelSize(index2, fay11.s);
                        break;
                    case 13:
                        fay fay12 = djn.f2847R;
                        fay12.A = obtainStyledAttributes.getDimensionPixelSize(index2, fay12.A);
                        break;
                    case 14:
                        fay fay13 = djn.f2847R;
                        fay13.d = obtainStyledAttributes.getDimensionPixelSize(index2, fay13.d);
                        break;
                    case 15:
                        fay fay14 = djn.f2847R;
                        fay14.T = obtainStyledAttributes.getDimensionPixelSize(index2, fay14.T);
                        break;
                    case 16:
                        fay fay15 = djn.f2847R;
                        fay15.S = obtainStyledAttributes.getDimensionPixelSize(index2, fay15.S);
                        break;
                    case 17:
                        fay fay16 = djn.f2847R;
                        fay16.f3457c = obtainStyledAttributes.getDimensionPixelOffset(index2, fay16.f3457c);
                        break;
                    case 18:
                        fay fay17 = djn.f2847R;
                        fay17.f3460e = obtainStyledAttributes.getDimensionPixelOffset(index2, fay17.f3460e);
                        break;
                    case 19:
                        fay fay18 = djn.f2847R;
                        fay18.f3449R = obtainStyledAttributes.getFloat(index2, fay18.f3449R);
                        break;
                    case 20:
                        fay fay19 = djn.f2847R;
                        fay19.v = obtainStyledAttributes.getFloat(index2, fay19.v);
                        break;
                    case 21:
                        fay fay20 = djn.f2847R;
                        fay20.f3462v = obtainStyledAttributes.getLayoutDimension(index2, fay20.f3462v);
                        break;
                    case 22:
                        mk3 mk3 = djn.f2850R;
                        mk3.f6141R = obtainStyledAttributes.getInt(index2, mk3.f6141R);
                        mk3 mk32 = djn.f2850R;
                        mk32.f6141R = f6613R[mk32.f6141R];
                        break;
                    case 23:
                        fay fay21 = djn.f2847R;
                        fay21.f3450R = obtainStyledAttributes.getLayoutDimension(index2, fay21.f3450R);
                        break;
                    case 24:
                        fay fay22 = djn.f2847R;
                        fay22.Y = obtainStyledAttributes.getDimensionPixelSize(index2, fay22.Y);
                        break;
                    case 25:
                        fay fay23 = djn.f2847R;
                        fay23.f3454X = O(obtainStyledAttributes, index2, fay23.f3454X);
                        break;
                    case 26:
                        fay fay24 = djn.f2847R;
                        fay24.f3448O = O(obtainStyledAttributes, index2, fay24.f3448O);
                        break;
                    case 27:
                        fay fay25 = djn.f2847R;
                        fay25.J = obtainStyledAttributes.getInt(index2, fay25.J);
                        break;
                    case 28:
                        fay fay26 = djn.f2847R;
                        fay26.h = obtainStyledAttributes.getDimensionPixelSize(index2, fay26.h);
                        break;
                    case 29:
                        fay fay27 = djn.f2847R;
                        fay27.f3447L = O(obtainStyledAttributes, index2, fay27.f3447L);
                        break;
                    case 30:
                        fay fay28 = djn.f2847R;
                        fay28.f3456Z = O(obtainStyledAttributes, index2, fay28.f3456Z);
                        break;
                    case 31:
                        fay fay29 = djn.f2847R;
                        fay29.n = obtainStyledAttributes.getDimensionPixelSize(index2, fay29.n);
                        break;
                    case 32:
                        fay fay30 = djn.f2847R;
                        fay30.j = O(obtainStyledAttributes, index2, fay30.j);
                        break;
                    case 33:
                        fay fay31 = djn.f2847R;
                        fay31.g = O(obtainStyledAttributes, index2, fay31.g);
                        break;
                    case 34:
                        fay fay32 = djn.f2847R;
                        fay32.I = obtainStyledAttributes.getDimensionPixelSize(index2, fay32.I);
                        break;
                    case 35:
                        fay fay33 = djn.f2847R;
                        fay33.x = O(obtainStyledAttributes, index2, fay33.x);
                        break;
                    case 36:
                        fay fay34 = djn.f2847R;
                        fay34.m = O(obtainStyledAttributes, index2, fay34.m);
                        break;
                    case 37:
                        fay fay35 = djn.f2847R;
                        fay35.c = obtainStyledAttributes.getFloat(index2, fay35.c);
                        break;
                    case 38:
                        djn.R = obtainStyledAttributes.getResourceId(index2, djn.R);
                        break;
                    case 39:
                        fay fay36 = djn.f2847R;
                        fay36.O = obtainStyledAttributes.getFloat(index2, fay36.O);
                        break;
                    case 40:
                        fay fay37 = djn.f2847R;
                        fay37.X = obtainStyledAttributes.getFloat(index2, fay37.X);
                        break;
                    case 41:
                        fay fay38 = djn.f2847R;
                        fay38.k = obtainStyledAttributes.getInt(index2, fay38.k);
                        break;
                    case 42:
                        fay fay39 = djn.f2847R;
                        fay39.p = obtainStyledAttributes.getInt(index2, fay39.p);
                        break;
                    case 43:
                        mk3 mk33 = djn.f2850R;
                        mk33.R = obtainStyledAttributes.getFloat(index2, mk33.R);
                        break;
                    case 44:
                        hHu hhu = djn.f2848R;
                        hhu.f4205R = true;
                        hhu.H = obtainStyledAttributes.getDimension(index2, hhu.H);
                        break;
                    case 45:
                        hHu hhu2 = djn.f2848R;
                        hhu2.v = obtainStyledAttributes.getFloat(index2, hhu2.v);
                        break;
                    case 46:
                        hHu hhu3 = djn.f2848R;
                        hhu3.c = obtainStyledAttributes.getFloat(index2, hhu3.c);
                        break;
                    case 47:
                        hHu hhu4 = djn.f2848R;
                        hhu4.e = obtainStyledAttributes.getFloat(index2, hhu4.e);
                        break;
                    case 48:
                        hHu hhu5 = djn.f2848R;
                        hhu5.X = obtainStyledAttributes.getFloat(index2, hhu5.X);
                        break;
                    case 49:
                        hHu hhu6 = djn.f2848R;
                        hhu6.O = obtainStyledAttributes.getDimension(index2, hhu6.O);
                        break;
                    case 50:
                        hHu hhu7 = djn.f2848R;
                        hhu7.L = obtainStyledAttributes.getDimension(index2, hhu7.L);
                        break;
                    case 51:
                        hHu hhu8 = djn.f2848R;
                        hhu8.Z = obtainStyledAttributes.getDimension(index2, hhu8.Z);
                        break;
                    case 52:
                        hHu hhu9 = djn.f2848R;
                        hhu9.m = obtainStyledAttributes.getDimension(index2, hhu9.m);
                        break;
                    case 53:
                        hHu hhu10 = djn.f2848R;
                        hhu10.x = obtainStyledAttributes.getDimension(index2, hhu10.x);
                        break;
                    case 54:
                        fay fay40 = djn.f2847R;
                        fay40.G = obtainStyledAttributes.getInt(index2, fay40.G);
                        break;
                    case 55:
                        fay fay41 = djn.f2847R;
                        fay41.B = obtainStyledAttributes.getInt(index2, fay41.B);
                        break;
                    case 56:
                        fay fay42 = djn.f2847R;
                        fay42.l = obtainStyledAttributes.getDimensionPixelSize(index2, fay42.l);
                        break;
                    case 57:
                        fay fay43 = djn.f2847R;
                        fay43.M = obtainStyledAttributes.getDimensionPixelSize(index2, fay43.M);
                        break;
                    case 58:
                        fay fay44 = djn.f2847R;
                        fay44.E = obtainStyledAttributes.getDimensionPixelSize(index2, fay44.E);
                        break;
                    case 59:
                        fay fay45 = djn.f2847R;
                        fay45.f = obtainStyledAttributes.getDimensionPixelSize(index2, fay45.f);
                        break;
                    case 60:
                        hHu hhu11 = djn.f2848R;
                        hhu11.f4203R = obtainStyledAttributes.getFloat(index2, hhu11.f4203R);
                        break;
                    case 61:
                        fay fay46 = djn.f2847R;
                        fay46.i = O(obtainStyledAttributes, index2, fay46.i);
                        break;
                    case 62:
                        fay fay47 = djn.f2847R;
                        fay47.V = obtainStyledAttributes.getDimensionPixelSize(index2, fay47.V);
                        break;
                    case 63:
                        fay fay48 = djn.f2847R;
                        fay48.e = obtainStyledAttributes.getFloat(index2, fay48.e);
                        break;
                    case 64:
                        oeZ oez3 = djn.f2851R;
                        oez3.f6866R = O(obtainStyledAttributes, index2, oez3.f6866R);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            oeZ oez4 = djn.f2851R;
                            obtainStyledAttributes.getString(index2);
                            oez4.getClass();
                            break;
                        } else {
                            oeZ oez5 = djn.f2851R;
                            String str = l1r.f5542R[obtainStyledAttributes.getInteger(index2, 0)];
                            oez5.getClass();
                            break;
                        }
                    case 66:
                        oeZ oez6 = djn.f2851R;
                        obtainStyledAttributes.getInt(index2, 0);
                        oez6.getClass();
                        break;
                    case 67:
                        oeZ oez7 = djn.f2851R;
                        oez7.v = obtainStyledAttributes.getFloat(index2, oez7.v);
                        break;
                    case 68:
                        mk3 mk34 = djn.f2850R;
                        mk34.v = obtainStyledAttributes.getFloat(index2, mk34.v);
                        break;
                    case 69:
                        djn.f2847R.L = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        djn.f2847R.Z = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        fay fay49 = djn.f2847R;
                        fay49.a = obtainStyledAttributes.getInt(index2, fay49.a);
                        break;
                    case 73:
                        fay fay50 = djn.f2847R;
                        fay50.F = obtainStyledAttributes.getDimensionPixelSize(index2, fay50.F);
                        break;
                    case 74:
                        djn.f2847R.f3463v = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        fay fay51 = djn.f2847R;
                        fay51.f3455X = obtainStyledAttributes.getBoolean(index2, fay51.f3455X);
                        break;
                    case 76:
                        oeZ oez8 = djn.f2851R;
                        oez8.f6868c = obtainStyledAttributes.getInt(index2, oez8.f6868c);
                        break;
                    case 77:
                        djn.f2847R.f3458c = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        mk3 mk35 = djn.f2850R;
                        mk35.f6142v = obtainStyledAttributes.getInt(index2, mk35.f6142v);
                        break;
                    case 79:
                        oeZ oez9 = djn.f2851R;
                        oez9.f6865R = obtainStyledAttributes.getFloat(index2, oez9.f6865R);
                        break;
                    case 80:
                        fay fay52 = djn.f2847R;
                        fay52.f3459c = obtainStyledAttributes.getBoolean(index2, fay52.f3459c);
                        break;
                    case 81:
                        fay fay53 = djn.f2847R;
                        fay53.f3461e = obtainStyledAttributes.getBoolean(index2, fay53.f3461e);
                        break;
                    case 82:
                        oeZ oez10 = djn.f2851R;
                        oez10.f6869v = obtainStyledAttributes.getInteger(index2, oez10.f6869v);
                        break;
                    case 83:
                        hHu hhu12 = djn.f2848R;
                        hhu12.f4204R = O(obtainStyledAttributes, index2, hhu12.f4204R);
                        break;
                    case 84:
                        oeZ oez11 = djn.f2851R;
                        oez11.e = obtainStyledAttributes.getInteger(index2, oez11.e);
                        break;
                    case 85:
                        oeZ oez12 = djn.f2851R;
                        oez12.c = obtainStyledAttributes.getFloat(index2, oez12.c);
                        break;
                    case 86:
                        int i7 = obtainStyledAttributes.peekValue(index2).type;
                        if (i7 != 1) {
                            if (i7 == 3) {
                                djn.f2851R.f6867R = obtainStyledAttributes.getString(index2);
                                if (djn.f2851R.f6867R.indexOf("/") > 0) {
                                    djn.f2851R.O = obtainStyledAttributes.getResourceId(index2, -1);
                                    djn.f2851R.X = -2;
                                    break;
                                } else {
                                    djn.f2851R.X = -1;
                                    break;
                                }
                            } else {
                                oeZ oez13 = djn.f2851R;
                                oez13.X = obtainStyledAttributes.getInteger(index2, oez13.O);
                                break;
                            }
                        } else {
                            djn.f2851R.O = obtainStyledAttributes.getResourceId(index2, -1);
                            oeZ oez14 = djn.f2851R;
                            if (oez14.O != -1) {
                                oez14.X = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 87:
                        StringBuilder U3 = opT.U("unused attribute 0x");
                        U3.append(Integer.toHexString(index2));
                        U3.append("   ");
                        U3.append(R.get(index2));
                        Log.w("ConstraintSet", U3.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder U4 = opT.U("Unknown attribute 0x");
                        U4.append(Integer.toHexString(index2));
                        U4.append("   ");
                        U4.append(R.get(index2));
                        Log.w("ConstraintSet", U4.toString());
                        break;
                    case 91:
                        fay fay54 = djn.f2847R;
                        fay54.N = O(obtainStyledAttributes, index2, fay54.N);
                        break;
                    case 92:
                        fay fay55 = djn.f2847R;
                        fay55.P = O(obtainStyledAttributes, index2, fay55.P);
                        break;
                    case 93:
                        fay fay56 = djn.f2847R;
                        fay56.Q = obtainStyledAttributes.getDimensionPixelSize(index2, fay56.Q);
                        break;
                    case 94:
                        fay fay57 = djn.f2847R;
                        fay57.r = obtainStyledAttributes.getDimensionPixelSize(index2, fay57.r);
                        break;
                    case 95:
                        L(djn.f2847R, obtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        L(djn.f2847R, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        fay fay58 = djn.f2847R;
                        fay58.b = obtainStyledAttributes.getInt(index2, fay58.b);
                        break;
                }
            }
            fay fay59 = djn.f2847R;
            if (fay59.f3463v != null) {
                fay59.f3453R = null;
            }
        }
        obtainStyledAttributes.recycle();
        return djn;
    }

    public final void R(ConstraintLayout constraintLayout) {
        String str;
        NoSuchMethodException e;
        IllegalAccessException e2;
        InvocationTargetException e3;
        String str2;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f6616v.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f6616v.containsKey(Integer.valueOf(id))) {
                StringBuilder U = opT.U("id unknown ");
                try {
                    str2 = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str2 = "UNKNOWN";
                }
                U.append(str2);
                Log.w("ConstraintSet", U.toString());
            } else if (this.f6615R && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f6616v.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    djn djn = (djn) this.f6616v.get(Integer.valueOf(id));
                    if (djn != null) {
                        if (childAt instanceof Barrier) {
                            djn.f2847R.D = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(djn.f2847R.a);
                            barrier.setMargin(djn.f2847R.F);
                            barrier.setAllowsGoneWidget(djn.f2847R.f3455X);
                            fay fay = djn.f2847R;
                            int[] iArr = fay.f3453R;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str3 = fay.f3463v;
                                if (str3 != null) {
                                    fay.f3453R = c(barrier, str3);
                                    barrier.setReferencedIds(djn.f2847R.f3453R);
                                }
                            }
                        }
                        nki nki = (nki) childAt.getLayoutParams();
                        nki.R();
                        djn.R(nki);
                        HashMap hashMap = djn.f2849R;
                        Class<?> cls = childAt.getClass();
                        Iterator it = hashMap.keySet().iterator();
                        while (it.hasNext()) {
                            String str4 = (String) it.next();
                            n8l n8l = (n8l) hashMap.get(str4);
                            if (!n8l.f6320R) {
                                str = opT.H("set", str4);
                                it = it;
                            } else {
                                it = it;
                                str = str4;
                            }
                            try {
                                switch (jQ.I(n8l.f6318R)) {
                                    case 0:
                                        childCount = childCount;
                                        cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(n8l.v));
                                        break;
                                    case 1:
                                        childCount = childCount;
                                        cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(n8l.R));
                                        break;
                                    case 2:
                                        childCount = childCount;
                                        cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(n8l.c));
                                        break;
                                    case 3:
                                        childCount = childCount;
                                        Method method = cls.getMethod(str, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(n8l.c);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        childCount = childCount;
                                        cls.getMethod(str, CharSequence.class).invoke(childAt, n8l.f6319R);
                                        break;
                                    case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                                        childCount = childCount;
                                        cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(n8l.f6321v));
                                        break;
                                    case 6:
                                        childCount = childCount;
                                        cls.getMethod(str, Float.TYPE).invoke(childAt, Float.valueOf(n8l.R));
                                        break;
                                    case 7:
                                        childCount = childCount;
                                        try {
                                            cls.getMethod(str, Integer.TYPE).invoke(childAt, Integer.valueOf(n8l.v));
                                        } catch (IllegalAccessException e4) {
                                            e2 = e4;
                                            StringBuilder i2 = jQ.i(" Custom Attribute \"", str4, "\" not found on ");
                                            i2.append(cls.getName());
                                            Log.e("TransitionLayout", i2.toString());
                                            e2.printStackTrace();
                                            hashMap = hashMap;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(cls.getName());
                                            sb.append(" must have a method ");
                                            sb.append(str);
                                            Log.e("TransitionLayout", sb.toString());
                                            hashMap = hashMap;
                                        } catch (InvocationTargetException e6) {
                                            e3 = e6;
                                            StringBuilder i3 = jQ.i(" Custom Attribute \"", str4, "\" not found on ");
                                            i3.append(cls.getName());
                                            Log.e("TransitionLayout", i3.toString());
                                            e3.printStackTrace();
                                            hashMap = hashMap;
                                        }
                                    default:
                                        childCount = childCount;
                                        break;
                                }
                            } catch (IllegalAccessException e7) {
                                e2 = e7;
                                childCount = childCount;
                            } catch (NoSuchMethodException e8) {
                                e = e8;
                                childCount = childCount;
                            } catch (InvocationTargetException e9) {
                                e3 = e9;
                                childCount = childCount;
                            }
                            hashMap = hashMap;
                        }
                        childCount = childCount;
                        childAt.setLayoutParams(nki);
                        mk3 mk3 = djn.f2850R;
                        if (mk3.f6142v == 0) {
                            childAt.setVisibility(mk3.f6141R);
                        }
                        childAt.setAlpha(djn.f2850R.R);
                        childAt.setRotation(djn.f2848R.f4203R);
                        childAt.setRotationX(djn.f2848R.v);
                        childAt.setRotationY(djn.f2848R.c);
                        childAt.setScaleX(djn.f2848R.e);
                        childAt.setScaleY(djn.f2848R.X);
                        hHu hhu = djn.f2848R;
                        if (hhu.f4204R != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(djn.f2848R.f4204R);
                            if (findViewById != null) {
                                float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                                float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - ((float) childAt.getLeft()));
                                    childAt.setPivotY(bottom - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(hhu.O)) {
                                childAt.setPivotX(djn.f2848R.O);
                            }
                            if (!Float.isNaN(djn.f2848R.L)) {
                                childAt.setPivotY(djn.f2848R.L);
                            }
                        }
                        childAt.setTranslationX(djn.f2848R.Z);
                        childAt.setTranslationY(djn.f2848R.m);
                        childAt.setTranslationZ(djn.f2848R.x);
                        hHu hhu2 = djn.f2848R;
                        if (hhu2.f4205R) {
                            childAt.setElevation(hhu2.H);
                        }
                    }
                } else {
                    childCount = childCount;
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
            childCount = childCount;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            djn djn2 = (djn) this.f6616v.get(num);
            if (djn2 != null) {
                if (djn2.f2847R.D == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    fay fay2 = djn2.f2847R;
                    int[] iArr2 = fay2.f3453R;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str5 = fay2.f3463v;
                        if (str5 != null) {
                            fay2.f3453R = c(barrier2, str5);
                            barrier2.setReferencedIds(djn2.f2847R.f3453R);
                        }
                    }
                    barrier2.setType(djn2.f2847R.a);
                    barrier2.setMargin(djn2.f2847R.F);
                    glG glg = ConstraintLayout.R;
                    nki nki2 = new nki();
                    barrier2.O();
                    djn2.R(nki2);
                    constraintLayout.addView(barrier2, nki2);
                }
                if (djn2.f2847R.f3452R) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    glG glg2 = ConstraintLayout.R;
                    nki nki3 = new nki();
                    djn2.R(nki3);
                    constraintLayout.addView(guideline, nki3);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof nYC) {
                ((nYC) childAt2).getClass();
            }
        }
    }

    public final void X(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    djn e = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e.f2847R.f3452R = true;
                    }
                    this.f6616v.put(Integer.valueOf(e.R), e);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public final void v(ConstraintLayout constraintLayout) {
        NoSuchMethodException e;
        IllegalAccessException e2;
        InvocationTargetException e3;
        nsw nsw = this;
        int childCount = constraintLayout.getChildCount();
        nsw.f6616v.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            nki nki = (nki) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!nsw.f6615R || id != -1) {
                if (!nsw.f6616v.containsKey(Integer.valueOf(id))) {
                    nsw.f6616v.put(Integer.valueOf(id), new djn());
                }
                djn djn = (djn) nsw.f6616v.get(Integer.valueOf(id));
                if (djn != null) {
                    HashMap hashMap = nsw.f6614R;
                    HashMap hashMap2 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap.keySet()) {
                        n8l n8l = (n8l) hashMap.get(str);
                        try {
                        } catch (IllegalAccessException e4) {
                            e2 = e4;
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                        } catch (InvocationTargetException e6) {
                            e3 = e6;
                        }
                        if (str.equals("BackgroundColor")) {
                            hashMap2.put(str, new n8l(n8l, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            try {
                                hashMap2.put(str, new n8l(n8l, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e7) {
                                e2 = e7;
                                e2.printStackTrace();
                            } catch (NoSuchMethodException e8) {
                                e = e8;
                                e.printStackTrace();
                            } catch (InvocationTargetException e9) {
                                e3 = e9;
                                e3.printStackTrace();
                            }
                        }
                    }
                    djn.f2849R = hashMap2;
                    djn.R = id;
                    fay fay = djn.f2847R;
                    fay.f3454X = nki.f6550c;
                    fay.f3448O = nki.f6552e;
                    fay.f3447L = nki.f6546X;
                    fay.f3456Z = nki.f6540O;
                    fay.m = nki.f6538L;
                    fay.x = nki.f6548Z;
                    fay.H = nki.f6554m;
                    fay.U = nki.f6558x;
                    fay.C = nki.H;
                    fay.N = nki.U;
                    fay.P = nki.C;
                    fay.j = nki.j;
                    fay.g = nki.g;
                    fay.y = nki.y;
                    fay.t = nki.t;
                    fay.v = nki.c;
                    fay.c = nki.e;
                    fay.f3451R = nki.f6543R;
                    fay.i = nki.N;
                    fay.V = nki.P;
                    fay.e = nki.v;
                    fay.o = nki.s;
                    fay.K = nki.T;
                    fay.J = nki.r;
                    fay.f3449R = nki.R;
                    fay.f3457c = nki.f6542R;
                    fay.f3460e = nki.f6555v;
                    fay.f3450R = ((ViewGroup.MarginLayoutParams) nki).width;
                    fay.f3462v = ((ViewGroup.MarginLayoutParams) nki).height;
                    fay.Y = ((ViewGroup.MarginLayoutParams) nki).leftMargin;
                    fay.h = ((ViewGroup.MarginLayoutParams) nki).rightMargin;
                    fay.I = ((ViewGroup.MarginLayoutParams) nki).topMargin;
                    fay.u = ((ViewGroup.MarginLayoutParams) nki).bottomMargin;
                    fay.Q = nki.I;
                    fay.X = nki.O;
                    fay.O = nki.X;
                    fay.p = nki.z;
                    fay.k = nki.u;
                    fay.f3459c = nki.f6557v;
                    fay.f3461e = nki.f6551c;
                    fay.G = nki.n;
                    fay.B = nki.Q;
                    fay.l = nki.d;
                    fay.M = nki.W;
                    fay.E = nki.A;
                    fay.f = nki.S;
                    fay.L = nki.L;
                    fay.Z = nki.Z;
                    fay.f3458c = nki.f6556v;
                    fay.S = nki.V;
                    fay.W = nki.K;
                    fay.A = nki.i;
                    fay.d = nki.o;
                    fay.T = nki.J;
                    fay.s = nki.Y;
                    fay.r = nki.h;
                    fay.b = nki.k;
                    fay.z = nki.getMarginEnd();
                    djn.f2847R.n = nki.getMarginStart();
                    djn.f2850R.f6141R = childAt.getVisibility();
                    djn.f2850R.R = childAt.getAlpha();
                    djn.f2848R.f4203R = childAt.getRotation();
                    djn.f2848R.v = childAt.getRotationX();
                    djn.f2848R.c = childAt.getRotationY();
                    djn.f2848R.e = childAt.getScaleX();
                    djn.f2848R.X = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        hHu hhu = djn.f2848R;
                        hhu.O = pivotX;
                        hhu.L = pivotY;
                    }
                    djn.f2848R.Z = childAt.getTranslationX();
                    djn.f2848R.m = childAt.getTranslationY();
                    djn.f2848R.x = childAt.getTranslationZ();
                    hHu hhu2 = djn.f2848R;
                    if (hhu2.f4205R) {
                        hhu2.H = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        djn.f2847R.f3455X = barrier.getAllowsGoneWidget();
                        djn.f2847R.f3453R = barrier.getReferencedIds();
                        djn.f2847R.a = barrier.getType();
                        djn.f2847R.F = barrier.getMargin();
                    }
                }
                i++;
                nsw = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }
}
