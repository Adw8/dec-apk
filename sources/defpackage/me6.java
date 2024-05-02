package defpackage;

import dev.kdrag0n.virtcontainer.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* renamed from: me6  reason: default package */
/* loaded from: classes.dex */
public abstract class me6 {

    /* renamed from: R  reason: collision with other field name */
    public static final lmI f6098R = new lmI("NO_DECISION");
    public static final g_J R = new g_J(0.4f, 0.2f);
    public static final g_J v = new g_J(0.0f, 0.2f);
    public static final g_J c = new g_J(0.4f, 1.0f);

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f6100R = {16843247, 16843248, 16843249, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn};

    /* renamed from: v  reason: collision with other field name */
    public static final int[] f6102v = {16843250, 16843251, 16843252, 16843253, 16843254, 16843255, R.attr.dialogIcon, R.attr.dialogLayout, R.attr.dialogMessage, R.attr.dialogTitle, R.attr.negativeButtonText, R.attr.positiveButtonText};

    /* renamed from: c  reason: collision with other field name */
    public static final int[] f6101c = {R.attr.useSimpleSummaryProvider};
    public static final int[] e = {16842930, 16843256, R.attr.entries, R.attr.entryValues, R.attr.useSimpleSummaryProvider};
    public static final int[] X = {16842930, 16843256, R.attr.entries, R.attr.entryValues};
    public static final int[] O = {16842754, 16842765, 16842766, 16842994, 16843233, 16843238, 16843240, 16843241, 16843242, 16843243, 16843244, 16843245, 16843246, 16843491, 16844124, 16844129, R.attr.allowDividerAbove, R.attr.allowDividerBelow, R.attr.defaultValue, R.attr.dependency, R.attr.enableCopying, R.attr.enabled, R.attr.fragment, R.attr.icon, R.attr.iconSpaceReserved, R.attr.isPreferenceVisible, R.attr.key, R.attr.layout, R.attr.order, R.attr.persistent, R.attr.selectable, R.attr.shouldDisableView, R.attr.singleLineTitle, R.attr.summary, R.attr.title, R.attr.widgetLayout};
    public static final int[] L = {16843239, R.attr.initialExpandedChildrenCount, R.attr.orderingFromXml};
    public static final int[] Z = {16843039, 16843040, R.attr.maxHeight, R.attr.maxWidth};
    public static final int[] m = {16842994, 16843062, R.attr.adjustable, R.attr.min, R.attr.seekBarIncrement, R.attr.showSeekBarValue, R.attr.updatesContinuously};
    public static final int[] x = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};
    public static final int[] H = {16843247, 16843248, 16843249, 16843627, 16843628, R.attr.disableDependentsState, R.attr.summaryOff, R.attr.summaryOn, R.attr.switchTextOff, R.attr.switchTextOn};

    /* renamed from: R  reason: collision with other field name */
    public static final char[] f6099R = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int R(char c2) {
        boolean z = true;
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (!('a' <= c2 && c2 < 'g')) {
            c3 = 'A';
            if ('A' > c2 || c2 >= 'G') {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    public static lzo c(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        gL6 gl6 = new gL6(duplicate);
        gl6.y(4);
        int i = ((ByteBuffer) gl6.R).getShort() & 65535;
        if (i <= 100) {
            gl6.y(6);
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    j = -1;
                    break;
                }
                int i3 = ((ByteBuffer) gl6.R).getInt();
                gl6.y(4);
                j = gl6.j();
                gl6.y(4);
                if (1835365473 == i3) {
                    break;
                }
                i2++;
            }
            if (j != -1) {
                gl6.y((int) (j - ((long) ((ByteBuffer) gl6.R).position())));
                gl6.y(12);
                long j2 = gl6.j();
                for (int i4 = 0; ((long) i4) < j2; i4++) {
                    int i5 = ((ByteBuffer) gl6.R).getInt();
                    long j3 = gl6.j();
                    gl6.j();
                    if (1164798569 == i5 || 1701669481 == i5) {
                        duplicate.position((int) (j3 + j));
                        lzo lzo = new lzo();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        lzo.v(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return lzo;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.hYY v(android.content.Context r7) {
        /*
            h89 r0 = new h89
            r1 = 0
            r0.<init>(r1)
            android.content.pm.PackageManager r2 = r7.getPackageManager()
            java.lang.String r3 = "Package manager required to locate emoji font provider"
            defpackage.gvP.U(r2, r3)
            java.lang.Object r3 = r0.R
            dq r3 = (defpackage.dq) r3
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "androidx.content.action.LOAD_EMOJI_FONT"
            r4.<init>(r5)
            java.util.List r3 = r3.h(r2, r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x0022:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r3.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            java.lang.Object r5 = r0.R
            dq r5 = (defpackage.dq) r5
            android.content.pm.ProviderInfo r4 = r5.V(r4)
            r5 = 1
            if (r4 == 0) goto L_0x0043
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L_0x0043
            int r6 = r6.flags
            r6 = r6 & r5
            if (r6 != r5) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 == 0) goto L_0x0022
            goto L_0x0048
        L_0x0047:
            r4 = r1
        L_0x0048:
            if (r4 != 0) goto L_0x004b
            goto L_0x0056
        L_0x004b:
            Jd r0 = r0.H(r4, r2)     // Catch: NameNotFoundException -> 0x0050
            goto L_0x0057
        L_0x0050:
            r0 = move-exception
            java.lang.String r2 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r2, r0)
        L_0x0056:
            r0 = r1
        L_0x0057:
            if (r0 != 0) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            hYY r1 = new hYY
            r1.<init>(r7, r0)
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me6.v(android.content.Context):hYY");
    }
}
