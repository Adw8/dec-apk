package defpackage;

import android.content.ServiceConnection;
import com.android.vending.licensing.ILicensingService;
import java.security.SecureRandom;

/* renamed from: f7N  reason: default package */
/* loaded from: classes.dex */
public abstract class f7N implements ServiceConnection {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public ILicensingService f3324R;

    static {
        new SecureRandom();
    }

    public abstract void R(gvP gvp);

    public abstract void v();
}
