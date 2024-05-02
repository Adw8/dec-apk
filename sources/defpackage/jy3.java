package defpackage;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: jy3  reason: default package */
/* loaded from: classes.dex */
public abstract class jy3 {
    public static final /* synthetic */ int R = 0;

    public static void c(View view) {
        try {
            if (!pzb.e) {
                pzb.e = true;
                pzb.f7334R = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                pzb.R = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                Method method = pzb.f7334R;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = pzb.R;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = pzb.R;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = pzb.f7334R;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            pzb.X = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:25:0x0068, B:27:0x0076, B:28:0x0093), top: B:36:0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:25:0x0068, B:27:0x0076, B:28:0x0093), top: B:36:0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void v(defpackage.Gp r12, defpackage.iRR r13) {
        /*
            long r0 = r13.f4589R
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            float r3 = (float) r3
            pm5 r4 = r13.f4592R
            float r5 = r4.R
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r3 >= 0) goto L_0x0014
            r3 = r6
            goto L_0x0015
        L_0x0014:
            r3 = r5
        L_0x0015:
            if (r3 != 0) goto L_0x0031
            boolean r3 = r4.f7259R
            if (r3 != 0) goto L_0x002b
            int r0 = defpackage.ltH.v(r0)
            float r0 = (float) r0
            pm5 r1 = r13.f4592R
            float r1 = r1.v
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = r5
            goto L_0x002c
        L_0x002b:
            r0 = r6
        L_0x002c:
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = r5
            goto L_0x0032
        L_0x0031:
            r0 = r6
        L_0x0032:
            if (r0 == 0) goto L_0x0041
            hFN r0 = r13.f4590R
            int r0 = r0.v
            r1 = 3
            if (r0 != r1) goto L_0x003d
            r0 = r6
            goto L_0x003e
        L_0x003d:
            r0 = r5
        L_0x003e:
            if (r0 != 0) goto L_0x0041
            r5 = r6
        L_0x0041:
            if (r5 == 0) goto L_0x0068
            long r0 = r13.f4589R
            long r2 = r0 >> r2
            int r2 = (int) r2
            float r2 = (float) r2
            int r0 = defpackage.ltH.v(r0)
            float r0 = (float) r0
            long r3 = defpackage.aWo.v
            long r0 = defpackage.n1P.e(r2, r0)
            gIA r0 = defpackage.msU.e(r3, r0)
            r12.y()
            r11 = 1
            float r7 = r0.f3720R
            float r8 = r0.v
            float r9 = r0.c
            float r10 = r0.e
            r6 = r12
            r6.Z(r7, r8, r9, r10, r11)
        L_0x0068:
            hFN r0 = r13.f4590R     // Catch: all -> 0x00b1
            kMk r0 = r0.f4169R     // Catch: all -> 0x00b1
            eBF r0 = r0.f5283R     // Catch: all -> 0x00b1
            o3t r0 = r0.f3019R     // Catch: all -> 0x00b1
            a1 r8 = r0.R()     // Catch: all -> 0x00b1
            if (r8 == 0) goto L_0x0093
            pm5 r6 = r13.f4592R     // Catch: all -> 0x00b1
            hFN r0 = r13.f4590R     // Catch: all -> 0x00b1
            kMk r0 = r0.f4169R     // Catch: all -> 0x00b1
            eBF r0 = r0.f5283R     // Catch: all -> 0x00b1
            o3t r0 = r0.f3019R     // Catch: all -> 0x00b1
            float r9 = r0.v()     // Catch: all -> 0x00b1
            hFN r13 = r13.f4590R     // Catch: all -> 0x00b1
            kMk r13 = r13.f4169R     // Catch: all -> 0x00b1
            eBF r13 = r13.f5283R     // Catch: all -> 0x00b1
            hpO r10 = r13.f3014R     // Catch: all -> 0x00b1
            ari r11 = r13.f3009R     // Catch: all -> 0x00b1
            r7 = r12
            r6.R(r7, r8, r9, r10, r11)     // Catch: all -> 0x00b1
            goto L_0x00ab
        L_0x0093:
            pm5 r6 = r13.f4592R     // Catch: all -> 0x00b1
            hFN r0 = r13.f4590R     // Catch: all -> 0x00b1
            kMk r0 = r0.f4169R     // Catch: all -> 0x00b1
            long r8 = r0.v()     // Catch: all -> 0x00b1
            hFN r13 = r13.f4590R     // Catch: all -> 0x00b1
            kMk r13 = r13.f4169R     // Catch: all -> 0x00b1
            eBF r13 = r13.f5283R     // Catch: all -> 0x00b1
            hpO r10 = r13.f3014R     // Catch: all -> 0x00b1
            ari r11 = r13.f3009R     // Catch: all -> 0x00b1
            r7 = r12
            r6.v(r7, r8, r10, r11)     // Catch: all -> 0x00b1
        L_0x00ab:
            if (r5 == 0) goto L_0x00b0
            r12.j()
        L_0x00b0:
            return
        L_0x00b1:
            r13 = move-exception
            if (r5 == 0) goto L_0x00b7
            r12.j()
        L_0x00b7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy3.v(Gp, iRR):void");
    }

    public abstract void R(float f, float f2, okT okt);
}
