package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: kQy  reason: default package */
/* loaded from: classes.dex */
public final class kQy implements Callable {
    public final /* synthetic */ Jd R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Context f5289R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f5290R;
    public final /* synthetic */ int X;
    public final /* synthetic */ int e;

    public /* synthetic */ kQy(String str, Context context, Jd jd, int i, int i2) {
        this.e = i2;
        this.f5290R = str;
        this.f5289R = context;
        this.R = jd;
        this.X = i;
    }

    public final kFU R() {
        switch (this.e) {
            case 0:
                return o6_.R(this.f5290R, this.f5289R, this.R, this.X);
            default:
                try {
                    return o6_.R(this.f5290R, this.f5289R, this.R, this.X);
                } catch (Throwable unused) {
                    return new kFU(-3);
                }
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.e) {
            case 0:
                return R();
            default:
                return R();
        }
    }
}
