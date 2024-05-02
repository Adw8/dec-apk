package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: hro  reason: default package */
/* loaded from: classes.dex */
public final class hro {

    /* renamed from: R  reason: collision with other field name */
    public String f4404R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f4405R;
    public String X;
    public String e;

    /* renamed from: v  reason: collision with other field name */
    public ArrayList f4406v;
    public String v = "";
    public String c = "";
    public int R = -1;

    public hro() {
        ArrayList arrayList = new ArrayList();
        this.f4405R = arrayList;
        arrayList.add("");
    }

    public final void R(String str, String str2) {
        if (this.f4406v == null) {
            this.f4406v = new ArrayList();
        }
        this.f4406v.add(ppN.Z(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219));
        this.f4406v.add(str2 != null ? ppN.Z(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219) : null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:147:0x027a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:86)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final void X(defpackage.a7_ r25, java.lang.String r26) {
        /*
        // Method dump skipped, instructions count: 1145
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hro.X(a7_, java.lang.String):void");
    }

    public final int c() {
        int i;
        int i2 = this.R;
        if (i2 != -1) {
            return i2;
        }
        String str = this.f4404R;
        if (n3x.v(str, "http")) {
            i = 80;
        } else if (!n3x.v(str, "https")) {
            return -1;
        } else {
            i = 443;
        }
        return i;
    }

    public final void e(String str) {
        this.f4406v = str != null ? ppN.t(ppN.Z(str, 0, 0, " \"'<>#", true, false, true, false, null, 211)) : null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if ((r8.c.length() > 0) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        if (r1 != r3) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 281
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hro.toString():java.lang.String");
    }

    public final a7_ v() {
        ArrayList arrayList;
        String str = this.f4404R;
        if (str != null) {
            String g = ppN.g(this.v, 0, 0, false, 7);
            String g2 = ppN.g(this.c, 0, 0, false, 7);
            String str2 = this.e;
            if (str2 != null) {
                int c = c();
                ArrayList arrayList2 = this.f4405R;
                ArrayList arrayList3 = new ArrayList(a6.B(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(ppN.g((String) it.next(), 0, 0, false, 7));
                }
                ArrayList<String> arrayList4 = this.f4406v;
                String str3 = null;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(a6.B(arrayList4, 10));
                    for (String str4 : arrayList4) {
                        arrayList.add(str4 != null ? ppN.g(str4, 0, 0, true, 3) : null);
                    }
                } else {
                    arrayList = null;
                }
                String str5 = this.X;
                if (str5 != null) {
                    str3 = ppN.g(str5, 0, 0, false, 7);
                }
                return new a7_(str, g, g2, str2, c, arrayList3, arrayList, str3, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }
}
