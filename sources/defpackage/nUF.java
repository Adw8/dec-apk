package defpackage;

import android.graphics.Paint;
import android.text.Layout;

/* renamed from: nUF  reason: default package */
/* loaded from: classes.dex */
public final class nUF {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f6397R;

    /* renamed from: R  reason: collision with other field name */
    public final Paint.FontMetricsInt f6398R;

    /* renamed from: R  reason: collision with other field name */
    public final Layout f6399R;

    /* renamed from: R  reason: collision with other field name */
    public final cwX f6400R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6402R;

    /* renamed from: R  reason: collision with other field name */
    public final aN6[] f6403R;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final boolean f6404c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public final boolean f6405e;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final int f6406v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f6407v = true;

    /* renamed from: R  reason: collision with other field name */
    public final lAN f6401R = new lAN();

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r6v7, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f7 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nUF(java.lang.CharSequence r44, float r45, defpackage.Vw r46, int r47, android.text.TextUtils.TruncateAt r48, int r49, boolean r50, int r51, int r52, int r53, int r54, int r55, int r56, defpackage.lht r57) {
        /*
        // Method dump skipped, instructions count: 843
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nUF.<init>(java.lang.CharSequence, float, Vw, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, lht):void");
    }

    public final float L(int i, boolean z) {
        return (e(i) == this.f6397R + -1 ? this.R + this.v : 0.0f) + ((hky) this.f6400R.getValue()).R(i, false, z);
    }

    public final float O(int i, boolean z) {
        return (e(i) == this.f6397R + -1 ? this.R + this.v : 0.0f) + ((hky) this.f6400R.getValue()).R(i, true, z);
    }

    public final int R() {
        return (this.f6404c ? this.f6399R.getLineBottom(this.f6397R - 1) : this.f6399R.getHeight()) + this.f6406v + this.c + this.e;
    }

    public final float X(int i) {
        return ((float) this.f6399R.getLineTop(i)) + ((float) (i == 0 ? 0 : this.f6406v));
    }

    public final CharSequence Z() {
        return this.f6399R.getText();
    }

    public final float c(int i) {
        if (i == this.f6397R - 1 && this.f6398R != null) {
            return ((float) this.f6399R.getLineBottom(i - 1)) + ((float) this.f6398R.bottom);
        }
        return ((float) this.f6406v) + ((float) this.f6399R.getLineBottom(i)) + ((float) (i == this.f6397R + -1 ? this.c : 0));
    }

    public final int e(int i) {
        return this.f6399R.getLineForOffset(i);
    }

    public final float v(int i) {
        return ((float) this.f6406v) + ((i != this.f6397R + -1 || this.f6398R == null) ? (float) this.f6399R.getLineBaseline(i) : X(i) - ((float) this.f6398R.ascent));
    }
}
