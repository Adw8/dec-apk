package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: pd  reason: default package */
/* loaded from: classes.dex */
public final class pd {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final TextView f7130R;
    public boolean c;

    /* renamed from: R  reason: collision with other field name */
    public ColorStateList f7128R = null;

    /* renamed from: R  reason: collision with other field name */
    public PorterDuff.Mode f7129R = null;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7131R = false;
    public boolean v = false;

    public /* synthetic */ pd(TextView textView, int i) {
        this.R = i;
        this.f7130R = textView;
    }

    public final void R() {
        Drawable R = kwz.R((CompoundButton) this.f7130R);
        if (R == null) {
            return;
        }
        if (this.f7131R || this.v) {
            Drawable mutate = R.mutate();
            if (this.f7131R) {
                cAO.Z(mutate, this.f7128R);
            }
            if (this.v) {
                cAO.m(mutate, this.f7129R);
            }
            if (mutate.isStateful()) {
                mutate.setState(((CompoundButton) this.f7130R).getDrawableState());
            }
            ((CompoundButton) this.f7130R).setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d A[Catch: all -> 0x00a1, TryCatch #1 {all -> 0x00a1, blocks: (B:5:0x0037, B:7:0x003d, B:9:0x0043, B:12:0x0059, B:14:0x005f, B:16:0x0065, B:17:0x0077, B:19:0x007d, B:20:0x0088, B:22:0x008e), top: B:56:0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #1 {all -> 0x00a1, blocks: (B:5:0x0037, B:7:0x003d, B:9:0x0043, B:12:0x0059, B:14:0x005f, B:16:0x0065, B:17:0x0077, B:19:0x007d, B:20:0x0088, B:22:0x008e), top: B:56:0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110 A[Catch: all -> 0x0134, TryCatch #2 {all -> 0x0134, blocks: (B:29:0x00ca, B:31:0x00d0, B:33:0x00d6, B:36:0x00ec, B:38:0x00f2, B:40:0x00f8, B:41:0x010a, B:43:0x0110, B:44:0x011b, B:46:0x0121), top: B:58:0x00ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121 A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #2 {all -> 0x0134, blocks: (B:29:0x00ca, B:31:0x00d0, B:33:0x00d6, B:36:0x00ec, B:38:0x00f2, B:40:0x00f8, B:41:0x010a, B:43:0x0110, B:44:0x011b, B:46:0x0121), top: B:58:0x00ca }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.util.AttributeSet r17, int r18) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd.c(android.util.AttributeSet, int):void");
    }

    public final void v() {
        Drawable checkMarkDrawable = ((CheckedTextView) this.f7130R).getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f7131R || this.v) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.f7131R) {
                cAO.Z(mutate, this.f7128R);
            }
            if (this.v) {
                cAO.m(mutate, this.f7129R);
            }
            if (mutate.isStateful()) {
                mutate.setState(((CheckedTextView) this.f7130R).getDrawableState());
            }
            ((CheckedTextView) this.f7130R).setCheckMarkDrawable(mutate);
        }
    }
}
