package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: aME  reason: default package */
/* loaded from: classes.dex */
public final class aME {
    public final Context R;

    /* renamed from: R  reason: collision with other field name */
    public final bLS f848R = pip.R(0, 0, null, 7);

    /* renamed from: R  reason: collision with other field name */
    public final doT f849R;

    /* renamed from: R  reason: collision with other field name */
    public final iHI f850R;

    /* renamed from: R  reason: collision with other field name */
    public final File f851R;

    /* renamed from: R  reason: collision with other field name */
    public final String f852R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f853R;

    /* renamed from: R  reason: collision with other field name */
    public final Map f854R;

    /* renamed from: R  reason: collision with other field name */
    public final k_Z f855R;

    /* renamed from: R  reason: collision with other field name */
    public final m5f f856R;
    public final String v;

    public aME(Context context, k_Z k_z, doT dot, iHI ihi, m5f m5f) {
        this.R = context;
        this.f855R = k_z;
        this.f849R = dot;
        this.f850R = ihi;
        this.f856R = m5f;
        this.f852R = opT.H(context.getApplicationInfo().nativeLibraryDir, "/liblxc.so");
        File filesDir = context.getFilesDir();
        this.v = filesDir + "/lxd.sock";
        this.f851R = context.getFilesDir();
        File filesDir2 = context.getFilesDir();
        this.f854R = mHQ.J(new kSh("LANG", "en_US.UTF-8"), new kSh("LXD_CONF", filesDir2 + "/lxd_client_conf"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C(defpackage.aOO r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cD5
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cD5 r0 = (defpackage.cD5) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            cD5 r0 = new cD5
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f2016R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.jjU.o(r6)
            goto L_0x005b
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            aME r5 = r0.R
            defpackage.jjU.o(r6)
            goto L_0x0048
        L_0x0038:
            defpackage.jjU.o(r6)
            iHI r6 = r5.f850R
            r0.R = r5
            r0.e = r4
            java.lang.Object r6 = r6.Z(r0)
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            lsf r6 = defpackage.iFn.f4518R
            cFz r2 = new cFz
            r4 = 0
            r2.<init>(r5, r4)
            r0.R = r4
            r0.e = r3
            java.lang.Object r5 = defpackage.l6.a(r6, r2, r0)
            if (r5 != r1) goto L_0x005b
            return r1
        L_0x005b:
            o8s r5 = defpackage.o8s.R
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.C(aOO):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:2|(2:4|(6:6|8|24|(1:(1:11)(2:12|13))(3:14|15|(1:17))|21|22))|7|8|24|(0)(0)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (defpackage.iH_.I(r7.R, "Error: The instance is already running") == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        throw r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object H(java.lang.String r8, defpackage.aOO r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.kBi
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kBi r0 = (defpackage.kBi) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            kBi r0 = new kBi
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f5207R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r6) goto L_0x002a
            defpackage.jjU.o(r9)     // Catch: feV -> 0x0046
            goto L_0x0051
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            defpackage.jjU.o(r9)
            java.lang.String[] r9 = new java.lang.String[r5]     // Catch: feV -> 0x0046
            java.lang.String r2 = "start"
            r9[r4] = r2     // Catch: feV -> 0x0046
            r9[r6] = r8     // Catch: feV -> 0x0046
            r0.e = r6     // Catch: feV -> 0x0046
            java.lang.Object r7 = r7.x(r9, r3, r0)     // Catch: feV -> 0x0046
            if (r7 != r1) goto L_0x0051
            return r1
        L_0x0046:
            r7 = move-exception
            java.lang.String r8 = r7.R
            java.lang.String r9 = "Error: The instance is already running"
            boolean r8 = defpackage.iH_.I(r8, r9)
            if (r8 == 0) goto L_0x0054
        L_0x0051:
            o8s r7 = defpackage.o8s.R
            return r7
        L_0x0054:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.H(java.lang.String, aOO):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:2|(2:4|(11:6|8|35|(1:(1:(1:(3:13|32|33)(2:14|15))(6:16|17|29|(1:31)|32|33))(1:18))(2:19|(1:21))|22|23|(1:25)|29|(0)|32|33))|7|8|35|(0)(0)|22|23|(0)|29|(0)|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        if (defpackage.iH_.I(r12.R, "Remote vchost exists") == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dc, code lost:
        throw r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(defpackage.aOO r12) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.L(aOO):java.lang.Object");
    }

    public final kSh O(String str, dM_ dm_, String str2) {
        String str3 = this.f852R;
        String str4 = dm_.c;
        String str5 = dm_.f2580R;
        String a = iH_.a(str2, "[lxc]", str3);
        String str6 = this.f852R;
        return new kSh(new String[]{"/system/bin/sh", "-c", n3x.o("\n        set -euo pipefail\n        trap 'sleep 3' EXIT\n        " + str3 + " launch \"" + str4 + ":" + str5 + "\" \"" + str + "\"\n        " + a + "\n        trap - EXIT\n        exec " + str6 + " shell \"" + str + "\"\n    ")}, str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:2|(2:4|(9:6|8|(1:(2:11|(4:42|13|38|39)(2:16|17))(4:18|48|19|20))(4:23|44|24|(1:26)(1:27))|31|46|32|(1:34)|38|39))|7|8|(0)(0)|31|46|32|(0)|38|39|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0157, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0156 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(java.lang.String r25, int r26, int r27, defpackage.aOO r28) {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.R(java.lang.String, int, int, aOO):java.lang.Object");
    }

    public final Process U(String[] strArr) {
        ProcessBuilder redirectErrorStream = new ProcessBuilder((String[]) Arrays.copyOf(strArr, strArr.length)).directory(this.f851R).redirectErrorStream(true);
        for (Map.Entry entry : this.f854R.entrySet()) {
            redirectErrorStream.environment().put((String) entry.getKey(), (String) entry.getValue());
        }
        return redirectErrorStream.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable X(defpackage.aOO r8) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.X(aOO):java.io.Serializable");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:2|(2:4|(12:6|8|(2:10|(1:(4:50|13|44|45)(2:16|17))(10:18|46|19|20|34|52|35|(1:37)|44|45))(11:23|48|24|(1:26)|27|34|52|35|(0)|44|45)|29|(8:31|(1:33)|34|52|35|(0)|44|45)|27|34|52|35|(0)|44|45))|7|8|(0)(0)|29|(0)|27|34|52|35|(0)|44|45|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0108, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0107 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z(java.lang.String r22, int r23, int r24, defpackage.aOO r25) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.Z(java.lang.String, int, int, aOO):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(2:4|(7:6|8|22|(1:(1:11)(2:12|13))(3:14|15|(1:17))|18|19|20))|7|8|22|(0)(0)|18|19|20) */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r6, defpackage.aOO r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.mH7
            if (r0 == 0) goto L_0x0013
            r0 = r7
            mH7 r0 = (defpackage.mH7) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            mH7 r0 = new mH7
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f6000R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            defpackage.jjU.o(r7)     // Catch: feV -> 0x004c
            goto L_0x004b
        L_0x0028:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0030:
            defpackage.jjU.o(r7)
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: feV -> 0x004c
            java.lang.String r2 = "image"
            r7[r3] = r2     // Catch: feV -> 0x004c
            java.lang.String r2 = "info"
            r7[r4] = r2     // Catch: feV -> 0x004c
            r2 = 2
            r7[r2] = r6     // Catch: feV -> 0x004c
            r0.e = r4     // Catch: feV -> 0x004c
            r6 = 0
            java.lang.Object r5 = r5.x(r7, r6, r0)     // Catch: feV -> 0x004c
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r3 = r4
        L_0x004c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.c(java.lang.String, aOO):java.lang.Object");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0021 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: aME */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:2|(2:4|(8:6|8|30|(1:(1:(3:12|27|28)(2:13|14))(2:15|16))(3:17|18|(1:20))|24|(1:26)|27|28))|7|8|30|(0)(0)|24|(0)|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (defpackage.n3x.v(r9.R, "Error: Container not found") == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.b1n r8, defpackage.aOO r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.kUU
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kUU r0 = (defpackage.kUU) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            kUU r0 = new kUU
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f5307R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            defpackage.jjU.o(r9)
            goto L_0x0075
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            b1n r8 = r0.f5306R
            aME r7 = r0.R
            defpackage.jjU.o(r9)     // Catch: feV -> 0x005b
            goto L_0x0066
        L_0x003b:
            defpackage.jjU.o(r9)
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: feV -> 0x005b
            r2 = 0
            java.lang.String r6 = "delete"
            r9[r2] = r6     // Catch: feV -> 0x005b
            java.lang.String r2 = "--force"
            r9[r5] = r2     // Catch: feV -> 0x005b
            java.lang.String r2 = r8.R     // Catch: feV -> 0x005b
            r9[r4] = r2     // Catch: feV -> 0x005b
            r0.R = r7     // Catch: feV -> 0x005b
            r0.f5306R = r8     // Catch: feV -> 0x005b
            r0.e = r5     // Catch: feV -> 0x005b
            java.lang.Object r9 = r7.x(r9, r3, r0)     // Catch: feV -> 0x005b
            if (r9 != r1) goto L_0x0066
            return r1
        L_0x005b:
            r9 = move-exception
            java.lang.String r2 = r9.R
            java.lang.String r5 = "Error: Container not found"
            boolean r2 = defpackage.n3x.v(r2, r5)
            if (r2 == 0) goto L_0x0078
        L_0x0066:
            bLS r7 = r7.f848R
            r0.R = r3
            r0.f5306R = r3
            r0.e = r4
            java.lang.Object r7 = r7.R(r8, r0)
            if (r7 != r1) goto L_0x0075
            return r1
        L_0x0075:
            o8s r7 = defpackage.o8s.R
            return r7
        L_0x0078:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.e(b1n, aOO):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(2:4|(6:6|8|(1:(1:(1:12)(2:13|14))(4:15|44|16|23))(1:19)|42|20|(1:22)(1:23)))|7|8|(0)(0)|42|20|(0)(0)|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (defpackage.iH_.I(r2.R, "Error: Get \"http://unix.socket/1.0\": read unix @->" + r13.v + ": read: connection reset by peer") == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (defpackage.iH_.I(r2.R, "Error: Get \"http://unix.socket/1.0\": http: server closed idle connection") == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        if (defpackage.iH_.I(r2.R, "Error: Get \"http://unix.socket/1.0\": write unix @->/data/user/0/dev.kdrag0n.virtcontainer/files/lxd.sock: write: broken pipe") == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (defpackage.iH_.I(r2.R, "Instance is busy running a \"start\" operation") == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        defpackage.kxm.v("virtc/lxd", 4, defpackage.jQ.C("Retrying LXD command... (", r2.getMessage(), ")"), null);
        r0.R = r13;
        r0.f6580R = r14;
        r0.e = r7;
        r0.X = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        if (defpackage.n3x.Z(200, r0) == r1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        r15 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065 A[PHI: r15 
      PHI: (r15v10 java.lang.Object) = (r15v4 java.lang.Object), (r15v1 java.lang.Object) binds: [B:21:0x0062, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(defpackage.kg9 r14, defpackage.aOO r15) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.m(kg9, aOO):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:2|(2:4|(9:6|8|(2:10|(1:(4:42|13|38|39)(2:16|17))(4:18|44|19|20))(4:23|46|24|(1:26)(1:27))|31|48|32|(1:34)|38|39))|7|8|(0)(0)|31|48|32|(0)|38|39|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0149, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0148 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(java.lang.String r25, java.lang.String r26, defpackage.aOO r27) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.v(java.lang.String, java.lang.String, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078 A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v4 java.lang.Object), (r10v1 java.lang.Object) binds: [B:22:0x0075, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(java.lang.String[] r8, defpackage.kg9 r9, defpackage.aOO r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.jdC
            if (r0 == 0) goto L_0x0013
            r0 = r10
            jdC r0 = (defpackage.jdC) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            jdC r0 = new jdC
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f4987R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.jjU.o(r10)
            goto L_0x0078
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            kg9 r9 = r0.f4988R
            java.lang.String[] r8 = r0.f4989R
            aME r7 = r0.R
            defpackage.jjU.o(r10)
            goto L_0x0063
        L_0x003c:
            defpackage.jjU.o(r10)
            doT r10 = r7.f849R
            hSq r2 = r10.O
            icv[] r5 = defpackage.doT.v
            r6 = 5
            r5 = r5[r6]
            java.lang.Object r10 = r2.v(r10, r5)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0063
            r0.R = r7
            r0.f4989R = r8
            r0.f4988R = r9
            r0.e = r4
            java.lang.Object r10 = r7.L(r0)
            if (r10 != r1) goto L_0x0063
            return r1
        L_0x0063:
            lfH r10 = new lfH
            r2 = 0
            r10.<init>(r7, r2, r9, r8)
            r0.R = r2
            r0.f4989R = r2
            r0.f4988R = r2
            r0.e = r3
            java.lang.Object r10 = r7.m(r10, r0)
            if (r10 != r1) goto L_0x0078
            return r1
        L_0x0078:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aME.x(java.lang.String[], kg9, aOO):java.lang.Object");
    }
}
