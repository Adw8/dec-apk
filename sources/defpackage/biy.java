package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: biy  reason: default package */
/* loaded from: classes.dex */
public abstract class biy implements lxb {
    public static atb R;

    /* renamed from: R  reason: collision with other field name */
    public static nUO f1774R;

    /* renamed from: R  reason: collision with other field name */
    public static boolean f1775R;

    /* renamed from: R  reason: collision with other field name */
    public static final k4H[] f1777R = new k4H[1];

    /* renamed from: R  reason: collision with other field name */
    public static final Type[] f1776R = new Type[0];

    public static Type C(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder C = opT.C("Index ", i, " not in range [0,");
            C.append(actualTypeArguments.length);
            C.append(") for ");
            C.append(parameterizedType);
            throw new IllegalArgumentException(C.toString());
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    public static final nUO H() {
        nUO nuo = f1774R;
        if (nuo != null) {
            return nuo;
        }
        f0G f0g = new f0G("Filled.Add");
        int i = jnb.R;
        oSW osw = new oSW(n3.v);
        jGl jgl = new jGl();
        jgl.Z(19.0f, 13.0f);
        jgl.X(-6.0f);
        jgl.H(6.0f);
        jgl.X(-2.0f);
        jgl.H(-6.0f);
        jgl.e(5.0f);
        jgl.H(-2.0f);
        jgl.X(6.0f);
        jgl.x(5.0f);
        jgl.X(2.0f);
        jgl.H(6.0f);
        jgl.X(6.0f);
        jgl.H(2.0f);
        jgl.R();
        f0G.c(f0g, jgl.R, osw);
        nUO e = f0g.e();
        f1774R = e;
        return e;
    }

    public static String I(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public static void J(Context context, Uri uri, View view) {
        j0 j0Var = new j0(context);
        j0Var.O = null;
        ArrayList arrayList = new ArrayList();
        j0Var.O = arrayList;
        arrayList.add(uri);
        ((Intent) j0Var.v).setType("application/octet-stream");
        ArrayList arrayList2 = (ArrayList) j0Var.c;
        if (arrayList2 != null) {
            j0Var.e("android.intent.extra.EMAIL", arrayList2);
            j0Var.c = null;
        }
        ArrayList arrayList3 = (ArrayList) j0Var.e;
        if (arrayList3 != null) {
            j0Var.e("android.intent.extra.CC", arrayList3);
            j0Var.e = null;
        }
        ArrayList arrayList4 = (ArrayList) j0Var.X;
        if (arrayList4 != null) {
            j0Var.e("android.intent.extra.BCC", arrayList4);
            j0Var.X = null;
        }
        ArrayList arrayList5 = (ArrayList) j0Var.O;
        if (!(arrayList5 != null && arrayList5.size() > 1)) {
            ((Intent) j0Var.v).setAction("android.intent.action.SEND");
            ArrayList arrayList6 = (ArrayList) j0Var.O;
            if (arrayList6 == null || arrayList6.isEmpty()) {
                ((Intent) j0Var.v).removeExtra("android.intent.extra.STREAM");
                gt8.c((Intent) j0Var.v);
            } else {
                ((Intent) j0Var.v).putExtra("android.intent.extra.STREAM", (Parcelable) ((ArrayList) j0Var.O).get(0));
                gt8.v((Intent) j0Var.v, (ArrayList) j0Var.O);
            }
        } else {
            ((Intent) j0Var.v).setAction("android.intent.action.SEND_MULTIPLE");
            ((Intent) j0Var.v).putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList) j0Var.O);
            gt8.v((Intent) j0Var.v, (ArrayList) j0Var.O);
        }
        Intent intent = (Intent) j0Var.v;
        intent.addFlags(1);
        intent.setDataAndType(uri, "application/octet-stream");
        view.post(new hAh(context, 5, intent));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0043 A[LOOP:0: B:2:0x0000->B:23:0x0043, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0042 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type K(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biy.K(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void L(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static String N(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static final boolean O(h0T h0t) {
        return ((Boolean) h0t.getValue()).booleanValue();
    }

    public static Class P(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(P(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return P(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0126 A[LOOP:0: B:81:0x0124->B:82:0x0126, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.kun r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27, defpackage.kg9 r28, defpackage.m88 r29, int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biy.R(kun, java.lang.String, java.lang.String, java.lang.String, boolean, kg9, m88, int, int):void");
    }

    public static Type U(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return U(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return U(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static IllegalArgumentException V(Method method, Exception exc, int i, String str, Object... objArr) {
        StringBuilder t = jQ.t(str, " (parameter #");
        t.append(i + 1);
        t.append(")");
        return t(method, exc, t.toString(), objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void X(defpackage.kun r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, int r28, int r29, int r30, defpackage.kg9 r31, defpackage.kg9 r32, defpackage.m88 r33, int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 512
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biy.X(kun, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, kg9, kg9, m88, int, int):void");
    }

    public static void Y(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void Z(bEu beu) {
        while (beu.available() != 0) {
            try {
                beu.skip((long) beu.available());
            } catch (IOException unused) {
                return;
            }
        }
    }

    public static final void c(SharedPreferences sharedPreferences, ncu ncu, lR3 lr3, m88 m88, int i, int i2) {
        jr_ jr_ = (jr_) m88;
        jr_.q(1422083654);
        if ((i2 & 2) != 0) {
            ncu = aff.R;
        }
        ncu mL = aH9.mL(adU.X(ncu), (float) 16);
        xt L = nA.L((float) 32);
        jr_.w(-483455358);
        bF9 R2 = VA.R(L, dq.f2881R, jr_);
        jr_.w(-1323940314);
        jJj jjj = (jJj) jr_.x(lnF.X);
        mdz mdz = (mdz) jr_.x(lnF.H);
        bUo buo = (bUo) jr_.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(mL);
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            l6.p(jr_, R2, igT.c);
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -1163856341);
            _n _nVar = _n.R;
            jr_.w(1157296644);
            boolean O = jr_.O(sharedPreferences);
            Object I = jr_.I();
            if (O || I == ppN.R) {
                I = new kun(_nVar, sharedPreferences);
                jr_.ZW(I);
            }
            jr_.g(false);
            lr3.y((kun) I, jr_, Integer.valueOf((i >> 3) & 112));
            jr_.g(false);
            jr_.g(false);
            jr_.g(true);
            jr_.g(false);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new iW6(sharedPreferences, ncu, lr3, i, i2, 5);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(defpackage.kun r41, java.lang.String r42, defpackage.lR3 r43, defpackage.lR3 r44, defpackage.m88 r45, int r46, int r47) {
        /*
        // Method dump skipped, instructions count: 705
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biy.e(kun, java.lang.String, lR3, lR3, m88, int, int):void");
    }

    public static boolean g(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (g(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return g(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    public static String h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static IllegalArgumentException i(Method method, int i, String str, Object... objArr) {
        StringBuilder t = jQ.t(str, " (parameter #");
        t.append(i + 1);
        t.append(")");
        return t(method, null, t.toString(), objArr);
    }

    public static Type j(Type type, Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return K(type, cls, U(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static final h0T m(hUt hut, m88 m88) {
        jr_ jr_ = (jr_) m88;
        jr_.w(381983785);
        aIH aih = aIH.R;
        Object value = hut.getValue();
        jr_.w(-1430839546);
        nu_ nu_ = (nu_) jr_.x(ur.c);
        jr_.w(511388516);
        boolean O = jr_.O(hut) | jr_.O(nu_);
        Object I = jr_.I();
        if (O || I == ppN.R) {
            iy iyVar = new iy(new o1m(nu_.O(), iMP.STARTED, hut, null), aih, -2, h9.SUSPEND);
            jr_.ZW(iyVar);
            I = iyVar;
        }
        jr_.g(false);
        nWQ nwq = (nWQ) I;
        jr_.w(-606625098);
        a4M a4m = new a4M(aih, nwq, null);
        Object x = jQ.x(jr_, -1703169085, -492369756);
        if (x == ppN.R) {
            x = l6.n(value);
            jr_.ZW(x);
        }
        jr_.g(false);
        h0T h0t = (h0T) x;
        caw.X(nwq, aih, new nO2(a4m, h0t, null), jr_);
        jr_.g(false);
        jr_.g(false);
        jr_.g(false);
        jr_.g(false);
        return h0t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object o(defpackage.j1V r6, defpackage.aOO r7) {
        /*
            boolean r0 = r7 instanceof defpackage.mPD
            if (r0 == 0) goto L_0x0013
            r0 = r7
            mPD r0 = (defpackage.mPD) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            mPD r0 = new mPD
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.jjU.o(r7)
            goto L_0x007a
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            defpackage.jjU.o(r7)
            gWQ r6 = r6.f4790R
            zI r7 = defpackage.gWQ.R
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = r6.f3781R
            r5 = 0
            r2[r5] = r4
            java.lang.String r4 = "requestInAppReview (%s)"
            r7.m(r4, r2)
            dUW r2 = r6.f3780R
            if (r2 != 0) goto L_0x005c
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r2 = "Play Store app is either not installed or not the official version"
            r7.L(r2, r6)
            oZ r6 = new oZ
            r7 = -1
            r6.<init>(r7, r3)
            b1t r7 = new b1t
            r7.<init>()
            r7.Z(r6)
            goto L_0x006e
        L_0x005c:
            cqI r7 = new cqI
            r7.<init>()
            dUW r2 = r6.f3780R
            cGu r4 = new cGu
            r5 = 3
            r4.<init>(r6, r7, r7, r5)
            r2.v(r4, r7)
            b1t r7 = r7.R
        L_0x006e:
            r0.getClass()
            r0.e = r3
            java.lang.Object r7 = defpackage.cpc.r(r7, r0)
            if (r7 != r1) goto L_0x007a
            return r1
        L_0x007a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biy.o(j1V, aOO):java.lang.Object");
    }

    public static IllegalArgumentException t(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder t = jQ.t(String.format(str, objArr), "\n    for method ");
        t.append(method.getDeclaringClass().getSimpleName());
        t.append(".");
        t.append(method.getName());
        return new IllegalArgumentException(t.toString(), exc);
    }

    public static void u(PackageManager packageManager, ComponentName componentName) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 516);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i = 0;
                    loop0: while (true) {
                        if (i >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                componentInfo = componentInfoArr2[i2];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(defpackage.kun r41, java.lang.String r42, defpackage.ncu r43, java.lang.String r44, defpackage.iv7 r45, defpackage.iv7 r46, defpackage.iv7 r47, defpackage.f_c r48, defpackage.m88 r49, int r50, int r51) {
        /*
        // Method dump skipped, instructions count: 1190
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biy.v(kun, java.lang.String, ncu, java.lang.String, iv7, iv7, iv7, f_c, m88, int, int):void");
    }

    public static boolean x(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return x(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static boolean y(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static String z(String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(str3).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        return sb.toString();
    }
}
