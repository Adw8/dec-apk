package defpackage;

/* renamed from: nvg  reason: default package */
/* loaded from: classes.dex */
public class nvg extends itk {
    @Override // defpackage.itk
    public final void R(Throwable th, Throwable th2) {
        Integer num = aOs.R;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.R(th, th2);
        }
    }
}
