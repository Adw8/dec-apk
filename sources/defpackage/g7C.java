package defpackage;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* renamed from: g7C  reason: default package */
/* loaded from: classes.dex */
public final class g7C implements ddq, owT, Runnable, Choreographer.FrameCallback {
    public static long c;
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final View f3678R;

    /* renamed from: R  reason: collision with other field name */
    public final f53 f3680R;

    /* renamed from: R  reason: collision with other field name */
    public final gL6 f3681R;

    /* renamed from: R  reason: collision with other field name */
    public final n67 f3682R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3683R;
    public long v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3684v;

    /* renamed from: R  reason: collision with other field name */
    public final biT f3679R = new biT(new b69[16]);

    /* renamed from: R  reason: collision with other field name */
    public final Choreographer f3677R = Choreographer.getInstance();

    public g7C(gL6 gl6, n67 n67, f53 f53, View view) {
        this.f3681R = gl6;
        this.f3682R = n67;
        this.f3680R = f53;
        this.f3678R = view;
        if (c == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            c = (long) (((float) 1000000000) / f);
        }
    }

    @Override // defpackage.ddq
    public final void R() {
        this.f3684v = false;
        ((h0T) this.f3681R.R).R(null);
        this.f3678R.removeCallbacks(this);
        this.f3677R.removeFrameCallback(this);
    }

    @Override // defpackage.ddq
    public final void c() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f3684v) {
            this.f3678R.post(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9, types: [pcj] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007f A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:25:0x006a, B:27:0x0074, B:33:0x007f, B:36:0x00a1, B:37:0x00a8), top: B:77:0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d0 A[Catch: all -> 0x011e, TryCatch #1 {all -> 0x011e, blocks: (B:44:0x00bb, B:46:0x00c5, B:52:0x00d0, B:54:0x00e0, B:58:0x00ed, B:59:0x00f8, B:62:0x0105, B:63:0x010c), top: B:79:0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7C.run():void");
    }

    @Override // defpackage.ddq
    public final void v() {
        ((h0T) this.f3681R.R).R(this);
        this.f3684v = true;
    }
}
