package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: nt9  reason: default package */
/* loaded from: classes.dex */
public final class nt9 {
    public static final ThreadLocal R = new ThreadLocal();

    /* renamed from: R  reason: collision with other field name */
    public final Context f6622R;

    /* renamed from: R  reason: collision with other field name */
    public final hFh f6623R;

    public nt9(Context context, hFh hfh) {
        this.f6622R = context;
        this.f6623R = hfh;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x00c6 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [iB8] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [fqU] */
    /* JADX WARN: Type inference failed for: r8v12, types: [fqU] */
    /* JADX WARN: Type inference failed for: r8v13, types: [fqU] */
    /* JADX WARN: Type inference failed for: r8v14, types: [fqU] */
    /* JADX WARN: Type inference failed for: r8v15, types: [fqU] */
    /* JADX WARN: Type inference failed for: r8v16, types: [fqU] */
    /* JADX WARN: Type inference failed for: r8v17, types: [fqU] */
    /* JADX WARN: Type inference failed for: r8v28, types: [d7H] */
    /* JADX WARN: Type inference failed for: r8v29, types: [ays] */
    /* JADX WARN: Type inference failed for: r8v30, types: [buR] */
    /* JADX WARN: Type inference failed for: r8v37, types: [hmV] */
    /* JADX WARN: Type inference failed for: r8v38, types: [api] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aX4 c(android.content.res.TypedArray r12, android.content.res.Resources r13, int r14) {
        /*
        // Method dump skipped, instructions count: 947
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt9.c(android.content.res.TypedArray, android.content.res.Resources, int):aX4");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023c, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.e9E R(android.content.res.Resources r27, android.content.res.XmlResourceParser r28, android.util.AttributeSet r29, int r30) {
        /*
        // Method dump skipped, instructions count: 573
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt9.R(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):e9E");
    }

    public final f25 v(int i) {
        int next;
        Resources resources = this.f6622R.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            e9E R2 = R(resources, xml, asAttributeSet, i);
            if (R2 instanceof f25) {
                return (f25) R2;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
