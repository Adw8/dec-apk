package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: p1  reason: default package */
/* loaded from: classes.dex */
public abstract class p1 {
    public static final ThreadLocal R = new ThreadLocal();

    public static ColorStateList R(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return v(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:152:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:166:0x0283 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:154:0x0020 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList v(android.content.res.Resources r35, android.content.res.XmlResourceParser r36, android.util.AttributeSet r37, android.content.res.Resources.Theme r38) {
        /*
        // Method dump skipped, instructions count: 869
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1.v(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
