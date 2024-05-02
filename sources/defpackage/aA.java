package defpackage;

import java.util.ArrayList;

/* renamed from: aA  reason: default package */
/* loaded from: classes.dex */
public final class aA implements l9J {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Vw f768R;

    /* renamed from: R  reason: collision with other field name */
    public final gP7 f769R;

    /* renamed from: R  reason: collision with other field name */
    public final CharSequence f770R;

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f771R = new ArrayList();

    /* renamed from: R  reason: collision with other field name */
    public final kMk f772R;

    /* renamed from: R  reason: collision with other field name */
    public final lht f773R;

    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        if (r3 == 1) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0634 A[LOOP:6: B:302:0x0632->B:303:0x0634, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aA(defpackage.kMk r56, defpackage.gP7 r57, defpackage.jJj r58, java.lang.String r59, java.util.List r60, java.util.List r61) {
        /*
        // Method dump skipped, instructions count: 1664
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aA.<init>(kMk, gP7, jJj, java.lang.String, java.util.List, java.util.List):void");
    }

    @Override // defpackage.l9J
    public final float R() {
        return ((Number) this.f773R.c.getValue()).floatValue();
    }

    @Override // defpackage.l9J
    public final boolean c() {
        ArrayList arrayList = this.f771R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bJ8 bj8 = (bJ8) arrayList.get(i);
            if (bj8.R.getValue() != bj8.f1588R) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.l9J
    public final float v() {
        return ((Number) this.f773R.v.getValue()).floatValue();
    }
}
