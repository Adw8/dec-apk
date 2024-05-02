package defpackage;

import java.util.regex.Pattern;

/* renamed from: jJW  reason: default package */
/* loaded from: classes.dex */
public final class jJW extends k8G implements f_c {
    public final /* synthetic */ duA R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jJW(duA dua, int i) {
        super(0);
        this.X = i;
        this.R = dua;
    }

    public final Pattern R() {
        switch (this.X) {
            case 0:
                String str = this.R.X;
                if (str != null) {
                    return Pattern.compile(str);
                }
                return null;
            default:
                String str2 = this.R.e;
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                return R();
            default:
                return R();
        }
    }
}
