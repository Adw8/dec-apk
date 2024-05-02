package defpackage;

import java.security.PrivilegedAction;
import java.security.Security;

/* renamed from: kqe  reason: default package */
/* loaded from: classes.dex */
public final class kqe implements PrivilegedAction {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f5446R;

    public /* synthetic */ kqe(String str, int i) {
        this.R = i;
        this.f5446R = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.R) {
            case 0:
                return Security.getProperty(this.f5446R);
            default:
                return System.getProperty(this.f5446R);
        }
    }
}
