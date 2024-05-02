package defpackage;

import android.os.Build;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: jjU  reason: default package */
/* loaded from: classes.dex */
public abstract class jjU {
    public static final g_J R = new g_J(0.2f, 0.0f);
    public static final g_J v = new g_J(0.0f, 1.0f);

    /* renamed from: R  reason: collision with other field name */
    public static final n2G f5010R = new n2G(14, null);

    public static int C() {
        return Build.VERSION.SDK_INT;
    }

    public static final String H(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final Object L(iv7 iv7, aOO aoo) {
        lZe lze = new lZe(aoo, aoo.v());
        return n3x.t(lze, lze, iv7);
    }

    public static /* synthetic */ jZi N(pd2 pd2, boolean z, pbU pbu, int i) {
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return pd2.q(z, z2, pbu);
    }

    public static void O(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static final boolean P(jy_ jy_) {
        nbD C = jy_.C();
        int i = pd2.v;
        pd2 pd2 = (pd2) C.O(hw1.O);
        if (pd2 != null) {
            return pd2.X();
        }
        return true;
    }

    public static nJ R(int i, h9 h9Var, int i2) {
        h9 h9Var2 = h9.SUSPEND;
        boolean z = false;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            h9Var = h9Var2;
        }
        int i3 = 1;
        if (i == -2) {
            if (h9Var == h9Var2) {
                gn.R.getClass();
                i3 = rE.R;
            }
            return new m2(i3, h9Var, null);
        } else if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? (i == 1 && h9Var == h9.DROP_OLDEST) ? new diT(null) : new m2(i, h9Var, null) : new lX1(0, null) : h9Var == h9Var2 ? new lX1(1, null) : new m2(1, h9Var, null);
        } else {
            if (h9Var == h9Var2) {
                z = true;
            }
            if (z) {
                return new diT(null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
    }

    public static /* synthetic */ nWQ U(cjB cjb, lsf lsf, int i, h9 h9Var, int i2) {
        aIH aih = lsf;
        if ((i2 & 1) != 0) {
            aih = aIH.R;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            h9Var = h9.SUSPEND;
        }
        return cjb.X(aih, i, h9Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object V(java.lang.Exception r5, defpackage.aOO r6) {
        /*
            boolean r0 = r6 instanceof defpackage.lKk
            if (r0 == 0) goto L_0x0013
            r0 = r6
            lKk r0 = (defpackage.lKk) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            lKk r0 = new lKk
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            o(r6)
            o8s r5 = defpackage.o8s.R
            return r5
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            o(r6)
            r0.getClass()
            r0.e = r3
            h8R r6 = defpackage.iFn.R
            nbD r2 = r0.R
            bx r3 = new bx
            r4 = 22
            r3.<init>(r0, r5, r4)
            r6.mL(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjU.V(java.lang.Exception, aOO):java.lang.Object");
    }

    public static final void X(int i) {
        if (!(2 <= i && i <= new heu(2, 36).X)) {
            StringBuilder C = opT.C("radix ", i, " was not in valid range ");
            C.append(new heu(2, 36));
            throw new IllegalArgumentException(C.toString());
        }
    }

    public static ipU Z(Object obj) {
        ipU ipu = new ipU();
        ipu.R(obj, "sentry:typeCheckHint");
        return ipu;
    }

    public static final void c(Logger logger, mGS mgs, hiT hit, String str) {
        logger.fine(hit.f4349R + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + mgs.f5991R);
    }

    public static void e(jy_ jy_) {
        pd2 pd2 = (pd2) jy_.C().O(hw1.O);
        if (pd2 != null) {
            pd2.c(null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + jy_).toString());
    }

    public static final boolean g(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static boolean i(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [h2V, boolean], vars: [r6v0 ??, r6v2 ??, r6v7 ??, r6v6 ??, r6v11 ??, r8v12 ??, r6v13 ??, r8v3 ??, r8v0 ??, r6v1 ??, r6v5 ??, r6v3 ??, r6v10 ??, r8v6 ??, r8v5 ??, r8v13 ??, r8v14 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public static final java.lang.Object m(
/*
[156] Method generation error in method: jjU.m(h2V, aZq, boolean, aOO):java.lang.Object, file: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:195)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:151)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:344)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:302)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:271)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    
*/

    public static final void o(Object obj) {
        if (obj instanceof bvw) {
            throw ((bvw) obj).R;
        }
    }

    public static nbD t(nbD nbd, nbD nbd2) {
        return nbd2 == aIH.R ? nbd : (nbD) nbd2.o(nbd, go2.P);
    }

    public static final m3D v(nbD nbd) {
        if (nbd.O(hw1.O) == null) {
            nbd = nbd.M(new peS(null));
        }
        return new m3D(nbd);
    }

    public static final boolean x(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final int y(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public abstract Boolean j();
}
