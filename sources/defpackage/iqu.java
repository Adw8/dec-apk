package defpackage;

import java.io.IOException;

/* renamed from: iqu  reason: default package */
/* loaded from: classes.dex */
public final class iqu extends k8G implements f_c {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jr5 f4746R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iqu(jr5 jr5, int i, long j) {
        super(0);
        this.f4746R = jr5;
        this.X = i;
        this.R = j;
    }

    @Override // defpackage.f_c
    public final Object g() {
        try {
            this.f4746R.f5032R.C(this.R, this.X);
        } catch (IOException e) {
            this.f4746R.c(e);
        }
        return o8s.R;
    }
}
