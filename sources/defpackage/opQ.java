package defpackage;

import java.io.IOException;

/* renamed from: opQ  reason: default package */
/* loaded from: classes.dex */
public final class opQ extends ffu {
    public final /* synthetic */ hug R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public opQ(hug hug, Jl jl) {
        super(jl);
        this.R = hug;
    }

    @Override // defpackage.fGn
    public final long Y(ME me, long j) {
        try {
            return super.R.Y(me, j);
        } catch (IOException e) {
            this.R.f4414R = e;
            throw e;
        }
    }
}
