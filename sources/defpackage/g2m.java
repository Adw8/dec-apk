package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: g2m  reason: default package */
/* loaded from: classes.dex */
public final class g2m {
    public static final g2m R;

    /* renamed from: R  reason: collision with other field name */
    public static final String f3658R = kfk.P("Data");

    /* renamed from: R  reason: collision with other field name */
    public HashMap f3659R;

    static {
        g2m g2m = new g2m(new pve(1).R);
        v(g2m);
        R = g2m;
    }

    public g2m(g2m g2m) {
        this.f3659R = new HashMap(g2m.f3659R);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0007 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0064 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.io.ByteArrayInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.g2m R(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x007c
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: IOException | ClassNotFoundException -> 0x003f, all -> 0x003b
            r3.<init>(r2)     // Catch: IOException | ClassNotFoundException -> 0x003f, all -> 0x003b
            int r7 = r3.readInt()     // Catch: IOException | ClassNotFoundException -> 0x0039, all -> 0x0064
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch: IOException | ClassNotFoundException -> 0x0039, all -> 0x0064
            java.lang.Object r5 = r3.readObject()     // Catch: IOException | ClassNotFoundException -> 0x0039, all -> 0x0064
            r1.put(r4, r5)     // Catch: IOException | ClassNotFoundException -> 0x0039, all -> 0x0064
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch: IOException -> 0x002f
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = defpackage.g2m.f3658R
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch: IOException -> 0x0058
            goto L_0x005e
        L_0x0039:
            r7 = move-exception
            goto L_0x0043
        L_0x003b:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L_0x0065
        L_0x003f:
            r3 = move-exception
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0043:
            java.lang.String r4 = defpackage.g2m.f3658R     // Catch: all -> 0x0064
            android.util.Log.e(r4, r0, r7)     // Catch: all -> 0x0064
            if (r3 == 0) goto L_0x0054
            r3.close()     // Catch: IOException -> 0x004e
            goto L_0x0054
        L_0x004e:
            r7 = move-exception
            java.lang.String r3 = defpackage.g2m.f3658R
            android.util.Log.e(r3, r0, r7)
        L_0x0054:
            r2.close()     // Catch: IOException -> 0x0058
            goto L_0x005e
        L_0x0058:
            r7 = move-exception
            java.lang.String r2 = defpackage.g2m.f3658R
            android.util.Log.e(r2, r0, r7)
        L_0x005e:
            g2m r7 = new g2m
            r7.<init>(r1)
            return r7
        L_0x0064:
            r7 = move-exception
        L_0x0065:
            if (r3 == 0) goto L_0x0071
            r3.close()     // Catch: IOException -> 0x006b
            goto L_0x0071
        L_0x006b:
            r1 = move-exception
            java.lang.String r3 = defpackage.g2m.f3658R
            android.util.Log.e(r3, r0, r1)
        L_0x0071:
            r2.close()     // Catch: IOException -> 0x0075
            goto L_0x007b
        L_0x0075:
            r1 = move-exception
            java.lang.String r2 = defpackage.g2m.f3658R
            android.util.Log.e(r2, r0, r1)
        L_0x007b:
            throw r7
        L_0x007c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2m.R(byte[]):g2m");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 2, insn: 0x008e: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:34:0x008e
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public static byte[] v(
/*
[166] Method generation error in method: g2m.v(g2m):byte[], file: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
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

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || g2m.class != obj.getClass()) {
            return false;
        }
        g2m g2m = (g2m) obj;
        Set<String> keySet = this.f3659R.keySet();
        if (!keySet.equals(g2m.f3659R.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f3659R.get(str);
            Object obj3 = g2m.f3659R.get(str);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f3659R.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f3659R.isEmpty()) {
            for (String str : this.f3659R.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f3659R.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public g2m(Map map) {
        this.f3659R = new HashMap(map);
    }
}
